// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeneticsGrammarParser}.
 */
public interface GeneticsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GeneticsGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GeneticsGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GeneticsGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GeneticsGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GeneticsGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GeneticsGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GeneticsGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GeneticsGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GeneticsGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GeneticsGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GeneticsGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GeneticsGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GeneticsGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GeneticsGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GeneticsGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GeneticsGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(GeneticsGrammarParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(GeneticsGrammarParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#array_init_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_init_id(GeneticsGrammarParser.Array_init_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#array_init_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_init_id(GeneticsGrammarParser.Array_init_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#array_init_alpha}.
	 * @param ctx the parse tree
	 */
	void enterArray_init_alpha(GeneticsGrammarParser.Array_init_alphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#array_init_alpha}.
	 * @param ctx the parse tree
	 */
	void exitArray_init_alpha(GeneticsGrammarParser.Array_init_alphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#array_init_values}.
	 * @param ctx the parse tree
	 */
	void enterArray_init_values(GeneticsGrammarParser.Array_init_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#array_init_values}.
	 * @param ctx the parse tree
	 */
	void exitArray_init_values(GeneticsGrammarParser.Array_init_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GeneticsGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GeneticsGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(GeneticsGrammarParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(GeneticsGrammarParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#alpanum}.
	 * @param ctx the parse tree
	 */
	void enterAlpanum(GeneticsGrammarParser.AlpanumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#alpanum}.
	 * @param ctx the parse tree
	 */
	void exitAlpanum(GeneticsGrammarParser.AlpanumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(GeneticsGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(GeneticsGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GeneticsGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GeneticsGrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#assigments}.
	 * @param ctx the parse tree
	 */
	void enterAssigments(GeneticsGrammarParser.AssigmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#assigments}.
	 * @param ctx the parse tree
	 */
	void exitAssigments(GeneticsGrammarParser.AssigmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GeneticsGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GeneticsGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#computations}.
	 * @param ctx the parse tree
	 */
	void enterComputations(GeneticsGrammarParser.ComputationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#computations}.
	 * @param ctx the parse tree
	 */
	void exitComputations(GeneticsGrammarParser.ComputationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#flow_structure}.
	 * @param ctx the parse tree
	 */
	void enterFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#flow_structure}.
	 * @param ctx the parse tree
	 */
	void exitFlow_structure(GeneticsGrammarParser.Flow_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GeneticsGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GeneticsGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneticsGrammarParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(GeneticsGrammarParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneticsGrammarParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(GeneticsGrammarParser.IoContext ctx);
}