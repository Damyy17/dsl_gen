package antlr;

import antlr.DSLDataType.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.*;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, Object> variables = new HashMap<>();
    static final String[] keywords = {"genes", "parents", "generation", "set", "dom", "phenotype", "codominance", "location",
    "label", "genotype", "frequency", "square", "find", "cross", "pred", "estimate", "if", "then",
    "else", "end", "while", "do", "print", ",", ";"};
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
            child.add(e.getText());
        }

        for (String ch : child){
            if (isType(ch)){
                switch (ch){
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
            }
            if (!isKeyword(ch)){
                variables.put(ch, value);
            }
        }

        System.out.println(child);
        return super.visitDeclaration(ctx);
    }

    public static boolean isType(String type) {
        boolean temp = false;
        for (String t : types) {
            if (Objects.equals(t, type)) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public static boolean isKeyword (String keyword){
        boolean temp = false;
        for (String k : keywords){
            if (Objects.equals(k, keyword)){
                temp = true;
                break;
            }
        }
        return temp;
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
