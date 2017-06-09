// Generated from C:/Users/Anna/IdeaProjects/ParserGenerator/src/ifmo/ctddev/lab4\GrammarOfGrammar.g4 by ANTLR 4.7
package ifmo.ctddev.lab4.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarOfGrammarParser}.
 */
public interface GrammarOfGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GrammarOfGrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GrammarOfGrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarOfGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarOfGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(GrammarOfGrammarParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(GrammarOfGrammarParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonTermRuleLabel}
	 * labeled alternative in {@link GrammarOfGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTermRuleLabel(GrammarOfGrammarParser.NonTermRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonTermRuleLabel}
	 * labeled alternative in {@link GrammarOfGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTermRuleLabel(GrammarOfGrammarParser.NonTermRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termRuleLabel}
	 * labeled alternative in {@link GrammarOfGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterTermRuleLabel(GrammarOfGrammarParser.TermRuleLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termRuleLabel}
	 * labeled alternative in {@link GrammarOfGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitTermRuleLabel(GrammarOfGrammarParser.TermRuleLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#localAttrs}.
	 * @param ctx the parse tree
	 */
	void enterLocalAttrs(GrammarOfGrammarParser.LocalAttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#localAttrs}.
	 * @param ctx the parse tree
	 */
	void exitLocalAttrs(GrammarOfGrammarParser.LocalAttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#returnedAttr}.
	 * @param ctx the parse tree
	 */
	void enterReturnedAttr(GrammarOfGrammarParser.ReturnedAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#returnedAttr}.
	 * @param ctx the parse tree
	 */
	void exitReturnedAttr(GrammarOfGrammarParser.ReturnedAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#nonterminalProduction}.
	 * @param ctx the parse tree
	 */
	void enterNonterminalProduction(GrammarOfGrammarParser.NonterminalProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#nonterminalProduction}.
	 * @param ctx the parse tree
	 */
	void exitNonterminalProduction(GrammarOfGrammarParser.NonterminalProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#nontermVariations}.
	 * @param ctx the parse tree
	 */
	void enterNontermVariations(GrammarOfGrammarParser.NontermVariationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#nontermVariations}.
	 * @param ctx the parse tree
	 */
	void exitNontermVariations(GrammarOfGrammarParser.NontermVariationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#terminalProduction}.
	 * @param ctx the parse tree
	 */
	void enterTerminalProduction(GrammarOfGrammarParser.TerminalProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#terminalProduction}.
	 * @param ctx the parse tree
	 */
	void exitTerminalProduction(GrammarOfGrammarParser.TerminalProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GrammarOfGrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GrammarOfGrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#attrType}.
	 * @param ctx the parse tree
	 */
	void enterAttrType(GrammarOfGrammarParser.AttrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#attrType}.
	 * @param ctx the parse tree
	 */
	void exitAttrType(GrammarOfGrammarParser.AttrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarOfGrammarParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(GrammarOfGrammarParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarOfGrammarParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(GrammarOfGrammarParser.AttrNameContext ctx);
}