package antlr;

import antlr.DSLDataType.*;
import antlr.DSLExceptions.GrammarExceptions;
import antlr.DSLExceptions.NonexistentTypeException;
import antlr.DSLExceptions.ReservedKeywordException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, IDataType> variables = new HashMap<>();
    static final String[] keywords = {"genes", "parents", "generation", "set", "dom", "phenotype", "codominance", "location",
    "label", "genotype", "frequency", "square", "find", "cross", "pred", "estimate", "if", "then",
    "else", "end", "while", "do", "print"};
    static final String[] types = {"genes", "parents", "generation", "number", "boolean", "string"};

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

        for (String child : children){
            if (Objects.equals(children.get(0), "dom")){
                if (variables.containsKey(children.get(2).toLowerCase())){
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    try {
                        temp.setValue("dom", children.get(2));
                        temp.setValue("rec", children.get(4));
                    } catch (GrammarExceptions e) {
                        e.printStackTrace();
                    }
                }
            } else if(Objects.equals(children.get(0), "set")){
                if (variables.containsKey(children.get(2).toLowerCase())){
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    try {
                        temp.setValue(children.get(1), children.get(4).substring(1, children.get(4).length()-1));
                    } catch (GrammarExceptions e) {
                        e.printStackTrace();
                    }
                }
            }
        }

//        System.out.println(children);
        return super.visitAssigments(ctx);
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
