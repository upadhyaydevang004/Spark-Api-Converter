// Generated from gram.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#mod1}.
	 * @param ctx the parse tree
	 */
	void enterMod1(gramParser.Mod1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#mod1}.
	 * @param ctx the parse tree
	 */
	void exitMod1(gramParser.Mod1Context ctx);
}