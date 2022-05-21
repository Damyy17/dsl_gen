// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeneticsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeneticsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GeneticsGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GeneticsGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GeneticsGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GeneticsGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GeneticsGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(GeneticsGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GeneticsGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GeneticsGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(GeneticsGrammarParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#array_init_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_init_id(GeneticsGrammarParser.Array_init_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#array_init_alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_init_alpha(GeneticsGrammarParser.Array_init_alphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#array_init_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_init_values(GeneticsGrammarParser.Array_init_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GeneticsGrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#alpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha(GeneticsGrammarParser.AlphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#alpanum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpanum(GeneticsGrammarParser.AlpanumContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(GeneticsGrammarParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GeneticsGrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#assigments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigments(GeneticsGrammarParser.AssigmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(GeneticsGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#computations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputations(GeneticsGrammarParser.ComputationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#flow_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GeneticsGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneticsGrammarParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo(GeneticsGrammarParser.IoContext ctx);
}