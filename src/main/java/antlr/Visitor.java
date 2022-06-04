package antlr;

import antlr.DSLDataType.*;
import antlr.DSLExceptions.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, IDataType> variables = new HashMap<>();
    static final String[] keywords = {"genes", "parents", "generation", "set", "dom", "phenotype", "codominance", "location",
    "label", "genotype", "frequency", "square", "find", "cross", "pred", "estimate", "if", "then", "from", "family","gen", "for",
    "else", "end", "while", "do", "print"};
    static final String[] types = {"genes", "parents", "generation", "number", "boolean", "string", "family"};
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
                        case "family":
                            value = new Family();
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
                    if (parentAssignedFlag) System.out.println(new SemanticExceptions("Illegal Gene Modification. Parent Assignment started").getMessage());
                    //Gets the object attached to the variable
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    try {
                        //Sets the notations for dominant and recessive gene
                        temp.setValue("dom", children.get(2));
                        temp.setValue("rec", children.get(4));
                    } catch (SemanticExceptions e) {
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
                        } catch (SemanticExceptions e) {
                            e.printStackTrace();
                        }

                    }
                    //If its standard set for gene
                    else if (temp.getType().equals("gene"))  {
                        //Checks if gene assignment isnt locked
                        if (parentAssignedFlag) System.out.println(new SemanticExceptions("Illegal Gene Modification Exception. Parent assignment started.").getMessage());
                        //If the field set is label, sends both the label and the Allele as a value to setValye
                        if (Objects.equals(children.get(1), "label")) {
                            try {
                                temp.setValue(children.get(1), children.get(2) + " " + children.get(4));
                            } catch (SemanticExceptions e) {
                                e.printStackTrace();
                            }
                        }
                        //If it's something else just sends the field and the value
                        else{
                            try {
                                temp.setValue(children.get(1), children.get(4));
                            } catch (SemanticExceptions e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    else if(temp.getType().equals("generation")){
                        try {
                            temp = (Generation) visitArray(ctx.expresion().array(), "parent");
                        } catch (SemanticExceptions e) {
                            e.printStackTrace();
                        }
                    }
                    else if (temp.getType().equals("family"))  {
                        Family fam1 = (Family) temp;
                        try {
                            fam1.setValue(children.get(1), (List<Generation>) visitArray(ctx.expresion().array(), "generation"));
                        } catch (SemanticExceptions e) {
                            e.printStackTrace();
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

//        System.out.println(children);
        return super.visitAssigments(ctx);
    }
    public void visitComputations(GeneticsGrammarParser.ComputationsContext ctx, String var, String field) {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        switch (children.get(0)){
            case "cross":
                if (!variables.containsKey(children.get(1).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(1)).getMessage());
                if (!variables.containsKey(children.get(3).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(3)).getMessage());

                if(!variables.get(var.toLowerCase()).getType().equals( "generation")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + var + " is not of type Generation").getMessage());
                if(!variables.get(children.get(1).toLowerCase()).getType().equals("parent")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + children.get(1) + " is not of type Parent").getMessage());
                if(!variables.get(children.get(3).toLowerCase()).getType().equals("parent")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + children.get(3) + " is not of type Parent").getMessage());

                Generation tmp = (Generation) variables.get(var.toLowerCase());
                Parent[] p = {(Parent) variables.get(children.get(1).toLowerCase()), (Parent) variables.get(children.get(3).toLowerCase())};
                try {
                    tmp.setValue("parents", p);
                    tmp.setValue(field, "");
                } catch (SemanticExceptions e) {
                    e.printStackTrace();
                }
                break;
            case "estimate":

                if (!variables.containsKey(children.get(2).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(2)).getMessage());
                if(!variables.get(var.toLowerCase()).getType().equals( "number")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + var + " is not of type Number").getMessage());
                if(!variables.get(children.get(2).toLowerCase()).getType().equals("generation")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + children.get(2) + " is not of type Generation").getMessage());

                StringBuilder alpha = new StringBuilder();
                //Finds all the strings that dont contain a number
                int i = 4;
                for (; i < children.size(); i++)
                    try{
                        Integer.parseInt(children.get(i));
                        break;

                    }catch(Exception e){alpha.append(children.get(i));}
                //Deletes the third chracter until no more alphas left
                for (int j = 4; j<= i; j++){
                    children.remove(3);
                }
                //Adds alpha to the end
                children.add(3, alpha.toString());
                Generation generation = (Generation) variables.get(children.get(2).toLowerCase());
                DSLNumber temp = (DSLNumber) variables.get(var.toLowerCase());
                try {
                        if (children.size() == 5){
                            temp.setValue(field, String.valueOf(generation.estimateFreq(children.get(3), Integer.parseInt(children.get(4)))));
                        } else {
                            temp.setValue(field, String.valueOf(generation.estimateFreq(children.get(3))));
                        }
                        break;
                } catch (SemanticExceptions e) {
                    e.printStackTrace();
                }
                break;
            case "find":
                if(!variables.get(var.toLowerCase()).getType().equals( "generation")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + var + " is not of type Generation").getMessage());
                if (!children.get(1).equals("genotype")) System.out.println(new InaccessibleFieldException("Inaccessible Field Exception is occured. " +var + " is not a field used for this operation").getMessage());
                Generation generation1 = (Generation) variables.get(var.toLowerCase());
                StringBuilder alpha1 = new StringBuilder();
                for (int j = 2; j < children.size(); j++) {
                    alpha1.append(children.get(j));
                }
                Map<String, Gene> tmpgene = new HashMap<>();
                for (String tmpvar : variables.keySet()){
                    if (variables.get(tmpvar).getType().equals("gene")) tmpgene.put(tmpvar, (Gene) variables.get(tmpvar));
                }
                try {
                    generation1.find(alpha1.toString(), tmpgene);
                } catch (SemanticExceptions e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "pred":
                if(!variables.get(var.toLowerCase()).getType().equals( "family")) System.out.println(new IncompatibleTypeException("Incompatible Type Exception. " + var + " is not of type Generation").getMessage());
                if (!field.equals("gen")) System.out.println(new InaccessibleFieldException("Inaccessible Field Exception is occured. ").getMessage());
                if(ctx.id().size() != 0) {
                Family fam2 = (Family) variables.get(var.toLowerCase());
                Generation tmpgen = (Generation) variables.get(children.get(1).toLowerCase());
                    try {
                        fam2.pred(tmpgen.getChildren());
                    } catch (SemanticExceptions e) {
                        e.printStackTrace();
                    }
                } else{
                    Family fam2 = (Family) variables.get(var.toLowerCase());
                    //visitArray(ctx.array(), "generation");
                    try {
                        Generation tmpgen = (Generation) visitArray(ctx.array(), "parent");
                        try {
                            fam2.pred(tmpgen.getChildren());
                        } catch (SemanticExceptions e) {
                            e.printStackTrace();
                        }
                    } catch (SemanticExceptions e) {
                        e.printStackTrace();
                    }

                }
                break;
        }

        super.visitComputations(ctx);
    }
    @Override
    public T visitComputations(GeneticsGrammarParser.ComputationsContext ctx) {
        return super.visitComputations(ctx);
    }

    public T visitArray(GeneticsGrammarParser.ArrayContext ctx, String type) throws SemanticExceptions {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        children = Arrays.asList(children.get(1).split(","));

        if (type.equals("parent")){
            List<Parent> genotype = new ArrayList<>();
            for (String var: children) {
                if (variables.containsKey(var.toLowerCase())) genotype.add((Parent) variables.get(var.toLowerCase()));
                else {
                    Parent tmp = new Parent();
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
                    }
                    tmp.setValue("genotype", var);
                    genotype.add(tmp);
                }
            }
            Generation x = new Generation();
            x.setValue("children", genotype);
            return (T) x;
        }
        else if (type.equals("generation")) {
            List<Generation> genotype = new ArrayList<>();
            for (String var : children) {
                if (variables.containsKey(var.toLowerCase()))
                    genotype.add((Generation) variables.get(var.toLowerCase()));
                else {
                    throw new IncompatibleTypeException("Incompatible Type Error is occured. " + var + " is not of type Generation.");
                }
            }
            return (T)genotype;

        }

       return super.visitArray(ctx);

    }

    @Override
    public T visitIo(GeneticsGrammarParser.IoContext ctx) {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        if (!variables.containsKey(children.get(1).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(1)).getMessage());
        //
        if (children.size() <= 3){
            IDataType temp = variables.get(children.get(1).toLowerCase());
            //in dependence of data type print the value of variable
            switch (temp.getType()){
                case "gene":
                case "generation":
                case "parent":
                case "number":
                case "string":
                case "family":
                case "boolean":
                    temp.print();
                    break;
                default:
                    System.out.println(new NonexistentTypeException("Nonexistent Type Exception is occurred").getMessage());
            }
        } else if (children.size() <= 4){
            IDataType temp = variables.get(children.get(1).toLowerCase());
            switch (temp.getType()){
                case "gene":
                    Gene gene = (Gene) variables.get(children.get(1).toLowerCase());
                    gene.print(children.get(2));
                    break;
                case "generation":
                    Generation generation = (Generation) variables.get(children.get(1).toLowerCase());
                    generation.print(children.get(2));
                    break;
                case "parent":
                    Parent parent = (Parent) variables.get(children.get(1).toLowerCase());
                    parent.print(children.get(2));
                    break;
                case "number":
                case "string":
                case "boolean":
                    temp.print();
                    break;
                default:
                    System.out.println(new NonexistentTypeException("Nonexistent Type Exception is occurred!").getMessage());
            }
        } else {
            IDataType temp = variables.get(children.get(1).toLowerCase());
            StringBuilder alpha = new StringBuilder();
            for (int i = 3; i < children.size() - 1; i++)
                alpha.append(children.get(i));
            if ("generation".equals(temp.getType())) {
                Generation generation = (Generation) variables.get(children.get(1).toLowerCase());
                generation.print(children.get(2), alpha.toString());
            } else {
                System.out.println(new IncompatibleTypeException("Incompatible Type Exception is occurred!").getMessage());
            }
        }
       // System.out.println(children);
        return super.visitIo(ctx);
    }
    @Override public T visitFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx) {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        System.out.println(children);
        switch(children.get(0)){
            case "if":
                int trueStatement = children.indexOf("else") - children.indexOf("then");
                DSLBoolean evalExpr = (DSLBoolean) visitCondition(ctx.condition());
                if (evalExpr.getValue()) {
                    for (int i = 0; i < trueStatement - 1; i++) {
                        visitStatements(ctx.statements(i));
                    }
                }else {
                    for (int i = trueStatement - 1; i < ctx.statements().size(); i++) {
                        visitStatements(ctx.statements(i));
                    }
                }
                break;
            case "for":
                if (!variables.containsKey(children.get(1).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(1)).getMessage());
                if (!variables.containsKey(children.get(3).toLowerCase())) System.out.println(new UndeclaredVariableException("Undeclared variable exception. " + children.get(3)).getMessage());
                if (variables.get(children.get(1).toLowerCase()).getType().equals("parent") && variables.get(children.get(3).toLowerCase()).getType().equals("generation")){
                    Generation g1 = (Generation) variables.get(children.get(3).toLowerCase());
                    for (Parent p: g1.getChildren()) {
                        variables.put(children.get(1).toLowerCase(), p);
                        for (int i = 0; i < ctx.statements().size(); i++) {
                            visitStatements(ctx.statements(i));
                        }
                    }
                }
                else if (variables.get(children.get(1).toLowerCase()).getType().equals("generation") && variables.get(children.get(3).toLowerCase()).getType().equals("family")){
                    Family f1 = (Family) variables.get(children.get(3).toLowerCase());
                    for (Generation g: f1.getGen()) {
                        variables.put(children.get(1).toLowerCase(), g);
                        for (int i = 0; i < ctx.statements().size(); i++) {
                            visitStatements(ctx.statements(i));
                        }
                    }
                }
                else System.out.println(new IncompatibleTypeException("Incompatible Type Exception is occured! " + children.get(1) + " or " + children.get(3) + " are of incompatible type for a for loop.").getMessage());

                break;
        }
        return null;
    }

    @Override public T visitCondition(GeneticsGrammarParser.ConditionContext ctx) {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        try {
            return evaluateExpression(children);
        } catch (SemanticExceptions e) {
            e.printStackTrace();
        }
        return null;
    }

    public T evaluateExpression(List<String> children) throws SemanticExceptions {
        DSLBoolean a = new DSLBoolean();
        if (children.size() == 3){

        }




        a.setValue("value", "false");
        return (T) a;
    }
}
