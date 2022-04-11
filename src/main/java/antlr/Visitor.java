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
    public T visitProgram(GeneticsGrammarParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public T visitStatements(GeneticsGrammarParser.StatementsContext ctx) {
        return super.visitStatements(ctx);
    }

    @Override
    public T visitId(GeneticsGrammarParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public T visitDeclaration(GeneticsGrammarParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public T visitType(GeneticsGrammarParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public T visitBool(GeneticsGrammarParser.BoolContext ctx) {
        return super.visitBool(ctx);
    }

    @Override
    public T visitString(GeneticsGrammarParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public T visitNumber(GeneticsGrammarParser.NumberContext ctx) {
        return super.visitNumber(ctx);
    }

    @Override
    public T visitAlpha(GeneticsGrammarParser.AlphaContext ctx) {
        return super.visitAlpha(ctx);
    }

    @Override
    public T visitAlpanum(GeneticsGrammarParser.AlpanumContext ctx) {
        return super.visitAlpanum(ctx);
    }

    @Override
    public T visitOperator(GeneticsGrammarParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
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
    public T visitField(GeneticsGrammarParser.FieldContext ctx) {
        return super.visitField(ctx);
    }

    @Override
    public T visitComputations(GeneticsGrammarParser.ComputationsContext ctx) {
        return super.visitComputations(ctx);
    }

    @Override
    public T visitFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx) {
        return super.visitFlow_structure(ctx);
    }

    @Override
    public T visitCondition(GeneticsGrammarParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }

    @Override
    public T visitIo(GeneticsGrammarParser.IoContext ctx) {
        return super.visitIo(ctx);
    }
}
