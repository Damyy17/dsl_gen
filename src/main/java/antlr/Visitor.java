package antlr;

import antlr.DSLDataType.*;
import antlr.DSLExceptions.ReservedKeywordException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    ArrayList<String> noDuplicateVariables = new ArrayList<>();
    Map<String, Object> variables = new HashMap<>();
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
        Object value = null;
        List<String> child = new ArrayList<String>();

        for (ParseTree e : ctx.children) {
            if (!Objects.equals(e.getText(), ",") && !Objects.equals(e.getText(), ";"))
                child.add(e.getText());
        }

        for (String s : child) {
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
                    variables.put(s, value);
                else throw new ReservedKeywordException("Reserved Keyword Exception is occurred!");
            }
        }

        System.out.println(child);
        System.out.println(variables);
        return super.visitDeclaration(ctx);
    }

    @Override
    public T visitExpresion(GeneticsGrammarParser.ExpresionContext ctx) {
        return super.visitExpresion(ctx);
    }

    @Override
    public T visitAssigments(GeneticsGrammarParser.AssigmentsContext ctx) {
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
