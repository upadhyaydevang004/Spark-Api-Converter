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
	 * Enter a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(gramParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(gramParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#funcmap}.
	 * @param ctx the parse tree
	 */
	void enterFuncmap(gramParser.FuncmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#funcmap}.
	 * @param ctx the parse tree
	 */
	void exitFuncmap(gramParser.FuncmapContext ctx);
}