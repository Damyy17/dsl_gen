package antlr;

import org.antlr.v4.runtime.tree.RuleNode;

import java.util.HashMap;
import java.util.Map;

public class Visitor<T> extends GeneticsGrammarBaseVisitor<T>{
    Map<String, Object> variables = new HashMap<>();

    @Override
    public T visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public T visitDeclaration(GeneticsGrammarParser.DeclarationContext ctx) {
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
