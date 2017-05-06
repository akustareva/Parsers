// Generated from C:/Users/Anna/Desktop/Lab3/src/ifmo/ctddev/lab3\PascalGrammer.g4 by ANTLR 4.7
package ifmo.ctddev.lab3.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalGrammerParser}.
 */
public interface PascalGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalGrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalGrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascalGrammerParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascalGrammerParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarations(PascalGrammerParser.VarDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#varDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarations(PascalGrammerParser.VarDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#programBody}.
	 * @param ctx the parse tree
	 */
	void enterProgramBody(PascalGrammerParser.ProgramBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#programBody}.
	 * @param ctx the parse tree
	 */
	void exitProgramBody(PascalGrammerParser.ProgramBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalGrammerParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalGrammerParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#varsDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterVarsDeclarationBlock(PascalGrammerParser.VarsDeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#varsDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitVarsDeclarationBlock(PascalGrammerParser.VarsDeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#listOfIdentifiers}.
	 * @param ctx the parse tree
	 */
	void enterListOfIdentifiers(PascalGrammerParser.ListOfIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#listOfIdentifiers}.
	 * @param ctx the parse tree
	 */
	void exitListOfIdentifiers(PascalGrammerParser.ListOfIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalGrammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalGrammerParser.TypeContext ctx);
}