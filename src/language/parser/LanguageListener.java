// Generated from c:\Users\leona\git\GitHub\calculadora\src\language\Language.g4 by ANTLR 4.8
package language.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(LanguageParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(LanguageParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(LanguageParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(LanguageParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSum(LanguageParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSum(LanguageParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(LanguageParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(LanguageParser.IntContext ctx);
}