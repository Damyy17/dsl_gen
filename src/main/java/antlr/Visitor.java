package antlr;

import antlr.DSLDataType.*;
import antlr.DSLExceptions.*;
import antlr.Strategy.EvaluationBoolStrategy;
import antlr.Strategy.EvaluationNumbersStrategy;
import antlr.Strategy.EvaluationStrategy;
import antlr.Strategy.EvaluationStringStrategy;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, IDataType> variables = new HashMap<>();
    InputInfo inputInfo;
    static final String[] keywords = {"genes", "parents", "generation", "set", "dom", "phenotype", "codominance", "location",
    "label", "genotype", "frequency", "square", "find", "cross", "pred", "estimate", "if", "then", "from", "family","gen", "for",
    "else", "end", "while", "do", "print"};
    static final String[] types = {"genes", "parents", "generation", "number", "boolean", "string", "family"};
    static boolean parentAssignedFlag = false;

    @Override
    public T visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    public T visitProgram(GeneticsGrammarParser.ProgramContext ctx){
        Map<String, IDataType> variables = new HashMap<>();
        parentAssignedFlag = false;
        inputInfo = new InputInfo();
        visitChildren(ctx);
        return (T) inputInfo.getAllOutput();
    }

    @Override public T visitStatements(GeneticsGrammarParser.StatementsContext ctx) {
        return visitChildren(ctx);}

    @Override
    public T visitDeclaration(GeneticsGrammarParser.DeclarationContext ctx) throws ReservedKeywordException, NonexistentTypeException {
        IDataType value = null;
        List<String> child = new ArrayList<String>();

        for (ParseTree e : ctx.children) {
            if (!Objects.equals(e.getText(), ",") && !Objects.equals(e.getText(), ";"))
                child.add(e.getText());
        }

        if (!Arrays.asList(types).contains(child.get(0)))
            throw new NonexistentTypeException("Nonexistent Type Exception is occurred! " + ctx.getText() + ". " + child.get(0));
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
                        throw new ReservedKeywordException("Reserved Keyword Exception is occurred! " + ctx.getText() + ". " + s);
                }
            }
        }

//        throw child);
//        throw variables);
        return super.visitDeclaration(ctx);
    }

    @Override
    public T visitExpresion(GeneticsGrammarParser.ExpresionContext ctx) {
        return super.visitExpresion(ctx);
    }

    @Override
    public T visitAssigments(GeneticsGrammarParser.AssigmentsContext ctx) throws SemanticExceptions {
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
                    if (parentAssignedFlag) throw new SemanticExceptions("Illegal Gene Modification. Parent Assignment started. " + ctx.getText() + ". ");
                    //Gets the object attached to the variable
                    IDataType temp = variables.get(children.get(2).toLowerCase());
                    try {
                        //Sets the notations for dominant and recessive gene
                        temp.setValue("dom", children.get(2));
                        temp.setValue("rec", children.get(4));
                    } catch (SemanticExceptions e) {
                        throw e;
                    }
                }else{
                    throw new UndeclaredVariableException("Undeclared Variable Exception. " + ctx.getText() + ". " + children.get(2) + "hasn't been declared.");
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
                        if (parentAssignedFlag) throw new SemanticExceptions("Illegal Gene Modification Exception. Parent assignment started. " + ctx.getText() + ". ");
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
                            Generation gen1 = (Generation) temp;
                            Generation nextg = (Generation) visitArray(ctx.expresion().array(), "parent");
                            variables.put(children.get(2).toLowerCase(), nextg);
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
                    else if (temp.getType().equals("number") || temp.getType().equals("string")|| temp.getType().equals("bool")){
                        temp.setValue(children.get(1), children.get(4));
                    }
                } else {
                    throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " + children.get(2) + " hasn't been declared.");
                }
            }
       }
        else{
            if (variables.containsKey(children.get(2).toLowerCase())){
                visitComputations(ctx.computations(), children.get(2), children.get(1));
            }else{
                throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " + children.get(2)+ " hasn't been declared.");
            }
        }

//        throw children);
        return super.visitAssigments(ctx);
    }
    public void visitComputations(GeneticsGrammarParser.ComputationsContext ctx, String var, String field) throws UndeclaredVariableException, IncompatibleTypeException, InaccessibleFieldException, IncorrectGenotypeFormatException {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        switch (children.get(0)){
            case "cross":
                if (!variables.containsKey(children.get(1).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. "  + ctx.getText() + ". " + children.get(1)+ " hasn't been declared.");
                if (!variables.containsKey(children.get(3).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " + children.get(3)+ " hasn't been declared.");

                if(!variables.get(var.toLowerCase()).getType().equals( "generation")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " + var + " is not of type Generation");
                if(!variables.get(children.get(1).toLowerCase()).getType().equals("parent")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " + children.get(1) + " is not of type Parent");
                if(!variables.get(children.get(3).toLowerCase()).getType().equals("parent")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " + children.get(3) + " is not of type Parent");

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

                if (!variables.containsKey(children.get(2).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " +children.get(2)+ " hasn't been declared.");
                if(!variables.get(var.toLowerCase()).getType().equals( "number")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " +var + " is not of type Number");
                if(!variables.get(children.get(2).toLowerCase()).getType().equals("generation")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " +children.get(2) + " is not of type Generation");

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
                if(!variables.get(var.toLowerCase()).getType().equals( "generation")) throw new IncompatibleTypeException("Incompatible Type Exception. "  +  ctx.getText() + ". " + var + " is not of type Generation");
                if (!children.get(1).equals("genotype")) throw new InaccessibleFieldException("Inaccessible Field Exception is occured. " + ctx.getText() + ". " +var + " is not a field used for this operation");
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
                    throw e;
                }
                break;
            case "pred":
                if(!variables.get(var.toLowerCase()).getType().equals( "family")) throw new IncompatibleTypeException("Incompatible Type Exception. " + ctx.getText() + ". " + var + " is not of type Generation");
                if (!field.equals("gen")) throw new InaccessibleFieldException("Inaccessible Field Exception is occured. " + ctx.getText() + ". " );
                if(ctx.id().size() != 0) {
                Family fam2 = (Family) variables.get(var.toLowerCase());
                    System.out.println(children.get(1));
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
                if (variables.containsKey(var.toLowerCase())) {genotype.add((Parent) variables.get(var.toLowerCase()));
                    }
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
                    throw new IncompatibleTypeException("Incompatible Type Error is occured. "  + ctx.getText() + ". " + var + " is not of type Generation.");
                }
            }
            return (T)genotype;

        }

       return super.visitArray(ctx);

    }

    @Override
    public T visitIo(GeneticsGrammarParser.IoContext ctx) throws UndeclaredVariableException, NonexistentTypeException, IncompatibleTypeException, NonexistentFieldException {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
        if (!variables.containsKey(children.get(1).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " + children.get(1)+ " hasn't been declared.");
        //
        if (children.size() <= 3){
            IDataType temp = variables.get(children.get(1).toLowerCase());
            //in dependence of data type print the value of variable
            switch (temp.getType()){
                case "gene":
                case "parent":
                case "number":
                case "string":
                case "boolean":
                    inputInfo.addToOutput(temp.print());
                    break;
                case "generation":
                    Generation gtmp = (Generation) temp;
                    inputInfo.addToPunnet(gtmp.printSquare());
                    break;
                case "family":
                    Family ftmp = (Family) temp;
                    List<List<List<String>>> squarelist =  ftmp.printSquares();
                    for (List<List<String>> square: squarelist) {
                        inputInfo.addToPunnet(square);
                    }
                    break;

                default:
                    throw new NonexistentTypeException("Nonexistent Type Exception is occurred. " + ctx.getText() + ". " );
            }
        } else if (children.size() <= 4){
            IDataType temp = variables.get(children.get(1).toLowerCase());
            switch (temp.getType()){
                case "gene":
                    Gene gene = (Gene) variables.get(children.get(1).toLowerCase());
                    inputInfo.addToOutput(gene.print(children.get(2)));
                    break;
                case "generation":
                    Generation generation = (Generation) variables.get(children.get(1).toLowerCase());
                    if (children.get(2).equals("square")) inputInfo.addToPunnet(generation.printSquare());
                    else inputInfo.addToOutput(generation.print(children.get(2)));
                    break;
                case "parent":
                    Parent parent = (Parent) variables.get(children.get(1).toLowerCase());
                    inputInfo.addToOutput(parent.print(children.get(2)));
                    break;
                case "family":
                    Family family = (Family) variables.get(children.get(1).toLowerCase());
                    if (children.get(2).equals("square")){
                        List<List<List<String>>> squarelist =  family.printSquares();
                        for (List<List<String>> square: squarelist) {
                            inputInfo.addToPunnet(square);
                        }
                    } else {
                        inputInfo.addToOutput(family.print(children.get(2)));
                    }
                    break;
                case "number":
                case "string":
                case "boolean":
                    inputInfo.addToOutput(temp.print());
                    break;
                default:
                    throw new NonexistentTypeException("Nonexistent Type Exception is occurred!" + ctx.getText() + ". ");
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
                throw new IncompatibleTypeException("Incompatible Type Exception is occurred! " +ctx.getText() + ". " );
            }
        }
       // throw children);
        return super.visitIo(ctx);
    }
    @Override public T visitFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx) throws UndeclaredVariableException, IncompatibleTypeException {
        List<String> children = new ArrayList<>();
        for (ParseTree e : ctx.children ){
            children.add(e.getText());
        }
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
                if (!variables.containsKey(children.get(1).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " +children.get(1)+ " hasn't been declared.");
                if (!variables.containsKey(children.get(3).toLowerCase())) throw new UndeclaredVariableException("Undeclared variable exception. " + ctx.getText() + ". " + children.get(3)+ " hasn't been declared.");
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
                else throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + ctx.getText() + ". " + children.get(1) + " or " + children.get(3) + " are of incompatible type for a for loop.");

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
        EvaluationStrategy strateg;
        if (children.size() == 3){
            if (variables.containsKey(children.get(0).toLowerCase())){
                switch (variables.get(children.get(0).toLowerCase()).getType()){
                    case "number":
                        strateg = new EvaluationNumbersStrategy();
                        DSLNumber firstn = (DSLNumber) variables.get(children.get(0).toLowerCase());
                        if (variables.containsKey(children.get(2).toLowerCase()) &&
                                variables.get(children.get(2).toLowerCase()).getType().equals("number")){
                            DSLNumber secondn = (DSLNumber) variables.get(children.get(0).toLowerCase());
                            a.setValue("value",strateg.eval(firstn.getValue(), secondn.getValue(), children.get(1)));
                        } else
                            try {
                                a.setValue("value", strateg.eval(firstn.getValue(), Double.parseDouble(children.get(2)), children.get(1)));
                            } catch (Exception e) {
                                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " +  children.get(2) + " is not comparable to " + children.get(0));
                            }
                            break;
                    case "boolean":
                        strateg = new EvaluationBoolStrategy();
                        DSLBoolean firstb = (DSLBoolean) variables.get(children.get(0).toLowerCase());
                        if (variables.containsKey(children.get(2).toLowerCase()) &&
                                variables.get(children.get(2).toLowerCase()).getType().equals("boolean")){
                            DSLBoolean secondb = (DSLBoolean) variables.get(children.get(0).toLowerCase());
                            a.setValue("value", strateg.eval(firstb.getValue(), secondb.getValue(), children.get(1)));
                        } else
                            try {
                                a.setValue("value", strateg.eval(firstb.getValue(), Boolean.parseBoolean(children.get(2)), children.get(1)));
                            } catch (Exception e) {
                                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + children.get(2) + " is not comparable to " + children.get(0));
                            }
                            break;
                    case "string":
                        strateg = new EvaluationStringStrategy();
                        DSLString firsts = (DSLString) variables.get(children.get(0).toLowerCase());
                        if (variables.containsKey(children.get(2).toLowerCase()) &&
                                variables.get(children.get(2).toLowerCase()).getType().equals("string")){
                            DSLString seconds = (DSLString) variables.get(children.get(0).toLowerCase());
                            a.setValue("value", strateg.eval(firsts.getValue(), seconds.getValue(), children.get(1)));
                        } else
                            try {
                                a.setValue("value", strateg.eval(firsts.getValue(), children.get(2), children.get(1)));
                            } catch (Exception e) {
                                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + children.get(2) + " is not comparable to " + children.get(0));
                            }
                        break;
                    case "parent":
                        strateg = new EvaluationNumbersStrategy();
                        Parent firstp = (Parent) variables.get(children.get(0).toLowerCase());
                        if (variables.containsKey(children.get(2).toLowerCase()) &&
                                variables.get(children.get(2).toLowerCase()).getType().equals("parent")){
                            Parent secondp = (Parent) variables.get(children.get(0).toLowerCase());
                            a.setValue("value", strateg.eval(firstp.getGenotype(), secondp.getGenotype(), children.get(1)));
                        } else
                            try {
                                a.setValue("value", strateg.eval(firstp.getGenotype(), children.get(2), children.get(1)));
                            } catch (Exception e) {
                                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + children.get(2) + " is not comparable to " + children.get(0));
                            }
                        break;
                }
            }
        } else {
            List<String> child = new ArrayList<>();
            child.add(children.get(0));
            child.add(children.get(1));
            children.remove(1);
            children.remove(0);
            DSLBoolean tmp = (DSLBoolean) evaluateExpression(children);
            if (tmp.getValue()) child.add("true");
            else child.add("false");
            return evaluateExpression(child);
        }

        return (T) a;
    }
}
