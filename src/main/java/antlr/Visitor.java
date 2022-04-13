package antlr;

import antlr.DSLDataType.*;
import antlr.DSLExceptions.GrammarExceptions;
import antlr.DSLExceptions.NonexistentTypeException;
import antlr.DSLExceptions.ReservedKeywordException;
import antlr.DSLExceptions.UndeclaredVariableException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import javax.swing.*;
import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, IDataType> variables = new HashMap<>();
    static final String[] keywords = {"genes", "parents", "generation", "set", "dom", "phenotype", "codominance", "location",
    "label", "genotype", "frequency", "square", "find", "cross", "pred", "estimate", "if", "then",
    "else", "end", "while", "do", "print"};
    static final String[] types = {"genes", "parents", "generation", "number", "boolean", "string"};
    static boolean parentAssignedFlag = false;

    @Override
    public T visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public T visitDeclaration(GeneticsGrammarParser.DeclarationContext ctx) {
        IDataType value = null;
        List<String> child = new ArrayList<String>();

        for (ParseTree e : ctx.children) {
            if (!Objects.equals(e.getText(), ",") && !Objects.equals(e.getText(), ";"))
                child.add(e.getText());
        }

        if (!Arrays.asList(types).contains(child.get(0)))
            System.out.println(new NonexistentTypeException("Nonexistent Type Exception is occurred!" + child.get(0)).getMessage());
        else {
            for (String s : child.subList(1, child.size())) {
                if (Arrays.asList(types).contains(child.get(0))) {
                    switch (child.get(0)) {
                        case "genes":
                            value = new Gene();
                            break;
                        case "parents":
                            value = new Parent();
                            break;
                        case "generation":
                            value = new Generation();
                            break;
                        case "number":
                            value = new DSLNumber();
                            break;
                        case "boolean":
                            value = new DSLBoolean();
                            break;
                        case "string":
                            value = new DSLString();
                            break;
                    }
                    if (!Arrays.asList(keywords).contains(s))
                        variables.put(s.toLowerCase(), value);
                    else
                        System.out.println(new ReservedKeywordException("Reserved Keyword Exception is occurred! " + s).getMessage());
                }
            }
        }

//        System.out.println(child);
//        System.out.println(variables);
        return super.visitDeclaration(ctx);
    }

    @Override
    public T visitExpresion(GeneticsGrammarParser.ExpresionContext ctx) {
        return super.visitExpresion(ctx);
    }

    @Override
    public T visitAssigments(GeneticsGrammarParser.AssigmentsContext ctx) {
        List<String> children = new ArrayList<String>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }

        if (ctx.computations() == null){
        //If it's syntactic sugar that sets dominance
            if (Objects.equals(children.get(0), "dom")){
                //Checks if variable is declared
                if (variables.containsKey(children.get(2).toLowerCase())){
                    //Checks if its not trying to change gene after parent is assigned
                    if (parentAssignedFlag) System.out.println(new GrammarExceptions("Illegal Gene Modification. Parent Assignment started").getMessage());
                    //Gets the object attached to the variable
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    try {
                        //Sets the notations for dominant and recessive gene
                        temp.setValue("dom", children.get(2));
                        temp.setValue("rec", children.get(4));
                    } catch (GrammarExceptions e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println(new UndeclaredVariableException("Undeclared Variable Exception. " + children.get(2)).getMessage());
                }
                //If its standard variable assignment
            } else if(Objects.equals(children.get(0), "set")){
                if (variables.containsKey(children.get(2).toLowerCase())){
                    //Gets the variable
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    //If its a parent assignment
                    if (temp.getType().equals("parent")){
                        //tmp and temp will point to the same object that will be cast as Parent
                        Parent tmp = (Parent) temp;
                        //If the genes havent been linked to the parent, links them
                            if (tmp.getGenes() == null) {
                                //Gets all available information about declared Genes
                                List<Gene> g = new ArrayList<>();
                                for (String k : variables.keySet()) {
                                    if (variables.get(k).getType().equals("gene")) g.add((Gene) variables.get(k));
                                }
                                Gene[] gen = new Gene[g.size()];
                                //Notifies the parent about the genes that will be used
                                tmp.setGenes(g.toArray(gen));
                                //Locks the possibility of changing the genes
                                parentAssignedFlag = true;
                            }
                        //Sets the values for the needed field
                        try {
                            temp.setValue(children.get(1), children.get(4));
                        } catch (GrammarExceptions e) {
                            e.printStackTrace();
                        }

                    }
                    //If its standard set for gene
                    else if (temp.getType().equals("gene"))  {
                        //Checks if gene assignment isnt locked
                        if (parentAssignedFlag) System.out.println(new GrammarExceptions("Illegal Gene Modification Exception. Parent assignment started.").getMessage());
                        //If the field set is label, sends both the label and the Allele as a value to setValye
                        if (Objects.equals(children.get(1), "label")) {
                            try {
                                temp.setValue(children.get(1), children.get(2) + " " + children.get(4));
                            } catch (GrammarExceptions e) {
                                e.printStackTrace();
                            }
                        }
                        //If it's something else just sends the field and the value
                        else{
                            try {
                                temp.setValue(children.get(1), children.get(4));
                            } catch (GrammarExceptions e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else {
                    System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(2)).getMessage());
                }
            }
       }
        else{
            if (variables.containsKey(children.get(2).toLowerCase())){
                visitComputations(ctx.computations(), children.get(2), children.get(1));
            }else{
                System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(2)).getMessage());
            }
        }

        System.out.println(children);
        return super.visitAssigments(ctx);
    }
    public void visitComputations(GeneticsGrammarParser.ComputationsContext ctx, String var, String field) {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        switch (children.get(0)){
            case "cross":
                System.out.println(var);
                Generation tmp = (Generation) variables.get(var.toLowerCase());
                Parent[] p = {(Parent) variables.get(children.get(1)), (Parent) variables.get(children.get(3))};
                try {
                    tmp.setValue("parents", p);
                    tmp.setValue(field, "");
                } catch (GrammarExceptions e) {
                    e.printStackTrace();
                }
                break;
        }

        super.visitComputations(ctx);
    }
    @Override
    public T visitComputations(GeneticsGrammarParser.ComputationsContext ctx) {
        return super.visitComputations(ctx);
    }

    @Override
    public T visitIo(GeneticsGrammarParser.IoContext ctx) {
        return super.visitIo(ctx);
    }

}
