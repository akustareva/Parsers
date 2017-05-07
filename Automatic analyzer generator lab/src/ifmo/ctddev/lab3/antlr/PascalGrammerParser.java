// Generated from C:/Users/Anna/Desktop/Lab3/src/ifmo/ctddev/lab3\PascalGrammer.g4 by ANTLR 4.7
package ifmo.ctddev.lab3.antlr;

import ifmo.ctddev.lab3.maps.VarTypes;
import ifmo.ctddev.lab3.maps.Functions;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, COLON=2, COMMA=3, DOT=4, LPAREN=5, RPAREN=6, EQUALITY=7, ASSIGNMENT=8, 
		PLUS=9, MINUS=10, MUL=11, DIV=12, PROGRAM=13, VAR=14, BEGIN=15, END=16, 
		BOOLEAN=17, CHAR=18, INTEGER=19, REAL=20, DOUBLE=21, EXTENDED=22, STRING=23, 
		READ=24, READLN=25, WRITE=26, WRITELN=27, IDENTIFIER=28, DIGIT=29, WS=30, 
		OLD_STYLE_COMMENT=31, COMMENT=32;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_varDeclarations = 2, RULE_programBody = 3, 
		RULE_varsDeclarationBlock = 4, RULE_listOfIdentifiers = 5, RULE_type = 6, 
		RULE_mainPart = 7, RULE_readWritePart = 8, RULE_assignmentPart = 9, RULE_funcName = 10, 
		RULE_simpleExpression = 11, RULE_identifier = 12, RULE_digit = 13;
	public static final String[] ruleNames = {
		"program", "programHeading", "varDeclarations", "programBody", "varsDeclarationBlock", 
		"listOfIdentifiers", "type", "mainPart", "readWritePart", "assignmentPart", 
		"funcName", "simpleExpression", "identifier", "digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'.'", "'('", "')'", "'='", "':='", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", "STRING", 
		"READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "DIGIT", "WS", "OLD_STYLE_COMMENT", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PascalGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public String code;
		public VarDeclarationsContext varDeclarations;
		public ProgramBodyContext programBody;
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public List<VarDeclarationsContext> varDeclarations() {
			return getRuleContexts(VarDeclarationsContext.class);
		}
		public VarDeclarationsContext varDeclarations(int i) {
			return getRuleContext(VarDeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(28);
				programHeading();
				}
			}


			       ((ProgramContext)_localctx).code =  "#include <stdlib.h>\n";
			       _localctx.code += "#include <stdio.h>\n";
			       _localctx.code += "#include <stdbool.h>\n\n";
			      
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(32);
				((ProgramContext)_localctx).varDeclarations = varDeclarations();
				_localctx.code += ((ProgramContext)_localctx).varDeclarations.code;
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			((ProgramContext)_localctx).programBody = programBody();

			           _localctx.code += "int main() {\n";
			           _localctx.code += ((ProgramContext)_localctx).programBody.code;
			           _localctx.code += "\treturn 0;\n";
			           _localctx.code += "}\n";
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalGrammerParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitProgramHeading(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PROGRAM);
			setState(44);
			identifier();
			setState(45);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationsContext extends ParserRuleContext {
		public String code;
		public VarsDeclarationBlockContext varsDeclarationBlock;
		public TerminalNode VAR() { return getToken(PascalGrammerParser.VAR, 0); }
		public List<VarsDeclarationBlockContext> varsDeclarationBlock() {
			return getRuleContexts(VarsDeclarationBlockContext.class);
		}
		public VarsDeclarationBlockContext varsDeclarationBlock(int i) {
			return getRuleContext(VarsDeclarationBlockContext.class,i);
		}
		public VarDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterVarDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitVarDeclarations(this);
		}
	}

	public final VarDeclarationsContext varDeclarations() throws RecognitionException {
		VarDeclarationsContext _localctx = new VarDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(VAR);
			((VarDeclarationsContext)_localctx).code =  "";
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				((VarDeclarationsContext)_localctx).varsDeclarationBlock = varsDeclarationBlock();
				_localctx.code += ((VarDeclarationsContext)_localctx).varsDeclarationBlock.code + "\n";
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBodyContext extends ParserRuleContext {
		public String code;
		public MainPartContext mainPart;
		public TerminalNode BEGIN() { return getToken(PascalGrammerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalGrammerParser.END, 0); }
		public TerminalNode DOT() { return getToken(PascalGrammerParser.DOT, 0); }
		public List<MainPartContext> mainPart() {
			return getRuleContexts(MainPartContext.class);
		}
		public MainPartContext mainPart(int i) {
			return getRuleContext(MainPartContext.class,i);
		}
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterProgramBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitProgramBody(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(BEGIN);
			((ProgramBodyContext)_localctx).code =  "";
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << READLN) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(58);
				((ProgramBodyContext)_localctx).mainPart = mainPart();
				_localctx.code += ((ProgramBodyContext)_localctx).mainPart.code;
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(END);
			setState(67);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsDeclarationBlockContext extends ParserRuleContext {
		public String code;
		public ListOfIdentifiersContext listOfIdentifiers;
		public TypeContext type;
		public ListOfIdentifiersContext listOfIdentifiers() {
			return getRuleContext(ListOfIdentifiersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammerParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public VarsDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterVarsDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitVarsDeclarationBlock(this);
		}
	}

	public final VarsDeclarationBlockContext varsDeclarationBlock() throws RecognitionException {
		VarsDeclarationBlockContext _localctx = new VarsDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varsDeclarationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((VarsDeclarationBlockContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(70);
			match(COLON);
			setState(71);
			((VarsDeclarationBlockContext)_localctx).type = type();
			setState(72);
			match(SEMI);
			((VarsDeclarationBlockContext)_localctx).code =  ((VarsDeclarationBlockContext)_localctx).type.code + " " + ((VarsDeclarationBlockContext)_localctx).listOfIdentifiers.code + ";";
			}
			_ctx.stop = _input.LT(-1);

			        VarTypes.addVars(_localctx.type().code, _localctx.listOfIdentifiers().code.split(", "));
			    
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOfIdentifiersContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammerParser.COMMA, i);
		}
		public ListOfIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterListOfIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitListOfIdentifiers(this);
		}
	}

	public final ListOfIdentifiersContext listOfIdentifiers() throws RecognitionException {
		ListOfIdentifiersContext _localctx = new ListOfIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listOfIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((ListOfIdentifiersContext)_localctx).identifier = identifier();
			((ListOfIdentifiersContext)_localctx).code =  (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				((ListOfIdentifiersContext)_localctx).identifier = identifier();
				_localctx.code += ", " + (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String code;
		public TerminalNode CHAR() { return getToken(PascalGrammerParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalGrammerParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalGrammerParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(PascalGrammerParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(CHAR);
				((TypeContext)_localctx).code =  "char";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(BOOLEAN);
				((TypeContext)_localctx).code =  "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(INTEGER);
				((TypeContext)_localctx).code =  "int";
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(DOUBLE);
				((TypeContext)_localctx).code =  "double";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainPartContext extends ParserRuleContext {
		public String code;
		public ReadWritePartContext readWritePart;
		public AssignmentPartContext assignmentPart;
		public ReadWritePartContext readWritePart() {
			return getRuleContext(ReadWritePartContext.class,0);
		}
		public AssignmentPartContext assignmentPart() {
			return getRuleContext(AssignmentPartContext.class,0);
		}
		public MainPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterMainPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitMainPart(this);
		}
	}

	public final MainPartContext mainPart() throws RecognitionException {
		MainPartContext _localctx = new MainPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainPart);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case READLN:
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((MainPartContext)_localctx).readWritePart = readWritePart();
				((MainPartContext)_localctx).code =  ((MainPartContext)_localctx).readWritePart.code;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((MainPartContext)_localctx).assignmentPart = assignmentPart();
				((MainPartContext)_localctx).code =  ((MainPartContext)_localctx).assignmentPart.code;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWritePartContext extends ParserRuleContext {
		public String code;
		public FuncNameContext funcName;
		public ListOfIdentifiersContext listOfIdentifiers;
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalGrammerParser.LPAREN, 0); }
		public ListOfIdentifiersContext listOfIdentifiers() {
			return getRuleContext(ListOfIdentifiersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammerParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public ReadWritePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWritePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterReadWritePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitReadWritePart(this);
		}
	}

	public final ReadWritePartContext readWritePart() throws RecognitionException {
		ReadWritePartContext _localctx = new ReadWritePartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_readWritePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ReadWritePartContext)_localctx).funcName = funcName();
			setState(105);
			match(LPAREN);
			setState(106);
			((ReadWritePartContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(107);
			match(RPAREN);
			setState(108);
			match(SEMI);

			        ((ReadWritePartContext)_localctx).code =  Functions.convertFuncToC(((ReadWritePartContext)_localctx).funcName.name, ((ReadWritePartContext)_localctx).listOfIdentifiers.code.split(", "));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentPartContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public DigitContext digit;
		public SimpleExpressionContext simpleExpression;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PascalGrammerParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AssignmentPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterAssignmentPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitAssignmentPart(this);
		}
	}

	public final AssignmentPartContext assignmentPart() throws RecognitionException {
		AssignmentPartContext _localctx = new AssignmentPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((AssignmentPartContext)_localctx).identifier = identifier();
			((AssignmentPartContext)_localctx).code =  "\t" + (((AssignmentPartContext)_localctx).identifier!=null?_input.getText(((AssignmentPartContext)_localctx).identifier.start,((AssignmentPartContext)_localctx).identifier.stop):null) + " = ";
			setState(113);
			match(ASSIGNMENT);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				((AssignmentPartContext)_localctx).identifier = identifier();
				_localctx.code += (((AssignmentPartContext)_localctx).identifier!=null?_input.getText(((AssignmentPartContext)_localctx).identifier.start,((AssignmentPartContext)_localctx).identifier.stop):null);
				}
				break;
			case 2:
				{
				setState(117);
				((AssignmentPartContext)_localctx).digit = digit();
				_localctx.code += (((AssignmentPartContext)_localctx).digit!=null?_input.getText(((AssignmentPartContext)_localctx).digit.start,((AssignmentPartContext)_localctx).digit.stop):null);
				}
				break;
			case 3:
				{
				setState(120);
				((AssignmentPartContext)_localctx).simpleExpression = simpleExpression();
				_localctx.code += ((AssignmentPartContext)_localctx).simpleExpression.code;
				}
				break;
			}
			setState(125);
			match(SEMI);
			_localctx.code += ";\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncNameContext extends ParserRuleContext {
		public String name;
		public TerminalNode READ() { return getToken(PascalGrammerParser.READ, 0); }
		public TerminalNode READLN() { return getToken(PascalGrammerParser.READLN, 0); }
		public TerminalNode WRITE() { return getToken(PascalGrammerParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(PascalGrammerParser.WRITELN, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcName);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(READ);
				((FuncNameContext)_localctx).name =  "read";
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(READLN);
				((FuncNameContext)_localctx).name =  "readln";
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(WRITE);
				((FuncNameContext)_localctx).name =  "write";
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(WRITELN);
				((FuncNameContext)_localctx).name =  "writeln";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public DigitContext digit;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PascalGrammerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PascalGrammerParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PascalGrammerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PascalGrammerParser.MINUS, i);
		}
		public List<TerminalNode> MUL() { return getTokens(PascalGrammerParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(PascalGrammerParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PascalGrammerParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PascalGrammerParser.DIV, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(138);
				((SimpleExpressionContext)_localctx).identifier = identifier();
				((SimpleExpressionContext)_localctx).code =  (((SimpleExpressionContext)_localctx).identifier!=null?_input.getText(((SimpleExpressionContext)_localctx).identifier.start,((SimpleExpressionContext)_localctx).identifier.stop):null);
				}
				break;
			case DIGIT:
				{
				setState(141);
				((SimpleExpressionContext)_localctx).digit = digit();
				((SimpleExpressionContext)_localctx).code =  (((SimpleExpressionContext)_localctx).digit!=null?_input.getText(((SimpleExpressionContext)_localctx).digit.start,((SimpleExpressionContext)_localctx).digit.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(146);
					match(PLUS);
					_localctx.code += " + ";
					}
					break;
				case MINUS:
					{
					setState(148);
					match(MINUS);
					_localctx.code += " - ";
					}
					break;
				case MUL:
					{
					setState(150);
					match(MUL);
					_localctx.code += " * ";
					}
					break;
				case DIV:
					{
					setState(152);
					match(DIV);
					_localctx.code += " / ";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(156);
					((SimpleExpressionContext)_localctx).identifier = identifier();
					_localctx.code += (((SimpleExpressionContext)_localctx).identifier!=null?_input.getText(((SimpleExpressionContext)_localctx).identifier.start,((SimpleExpressionContext)_localctx).identifier.stop):null);
					}
					break;
				case DIGIT:
					{
					setState(159);
					((SimpleExpressionContext)_localctx).digit = digit();
					_localctx.code += (((SimpleExpressionContext)_localctx).digit!=null?_input.getText(((SimpleExpressionContext)_localctx).digit.start,((SimpleExpressionContext)_localctx).digit.stop):null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PascalGrammerParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(PascalGrammerParser.DIGIT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\2\3\2\7"+
		"\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\6\4\67\n\4\r\4\16\48\3\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7T\n\7\f\7"+
		"\16\7W\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0093"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a5\n\r\6\r\u00a7\n\r\r\r\16\r\u00a8\3\16\3\16\3\17\3\17\3"+
		"\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00b4\2\37\3\2\2"+
		"\2\4-\3\2\2\2\6\61\3\2\2\2\b:\3\2\2\2\nG\3\2\2\2\fM\3\2\2\2\16`\3\2\2"+
		"\2\20h\3\2\2\2\22j\3\2\2\2\24q\3\2\2\2\26\u008a\3\2\2\2\30\u0092\3\2\2"+
		"\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2"+
		"\2\2 !\3\2\2\2!\'\b\2\1\2\"#\5\6\4\2#$\b\2\1\2$&\3\2\2\2%\"\3\2\2\2&)"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\b\5\2+,\b\2\1"+
		"\2,\3\3\2\2\2-.\7\17\2\2./\5\32\16\2/\60\7\3\2\2\60\5\3\2\2\2\61\62\7"+
		"\20\2\2\62\66\b\4\1\2\63\64\5\n\6\2\64\65\b\4\1\2\65\67\3\2\2\2\66\63"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:;\7\21\2\2;A\b\5"+
		"\1\2<=\5\20\t\2=>\b\5\1\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\22\2\2EF\7\6\2\2F\t\3\2\2\2GH\5\f\7\2H"+
		"I\7\4\2\2IJ\5\16\b\2JK\7\3\2\2KL\b\6\1\2L\13\3\2\2\2MN\5\32\16\2NU\b\7"+
		"\1\2OP\7\5\2\2PQ\5\32\16\2QR\b\7\1\2RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2XY\7\24\2\2Ya\b\b\1\2Z[\7\23\2\2"+
		"[a\b\b\1\2\\]\7\25\2\2]a\b\b\1\2^_\7\27\2\2_a\b\b\1\2`X\3\2\2\2`Z\3\2"+
		"\2\2`\\\3\2\2\2`^\3\2\2\2a\17\3\2\2\2bc\5\22\n\2cd\b\t\1\2di\3\2\2\2e"+
		"f\5\24\13\2fg\b\t\1\2gi\3\2\2\2hb\3\2\2\2he\3\2\2\2i\21\3\2\2\2jk\5\26"+
		"\f\2kl\7\7\2\2lm\5\f\7\2mn\7\b\2\2no\7\3\2\2op\b\n\1\2p\23\3\2\2\2qr\5"+
		"\32\16\2rs\b\13\1\2s}\7\n\2\2tu\5\32\16\2uv\b\13\1\2v~\3\2\2\2wx\5\34"+
		"\17\2xy\b\13\1\2y~\3\2\2\2z{\5\30\r\2{|\b\13\1\2|~\3\2\2\2}t\3\2\2\2}"+
		"w\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177\u0080\7\3\2\2\u0080\u0081\b\13\1"+
		"\2\u0081\25\3\2\2\2\u0082\u0083\7\32\2\2\u0083\u008b\b\f\1\2\u0084\u0085"+
		"\7\33\2\2\u0085\u008b\b\f\1\2\u0086\u0087\7\34\2\2\u0087\u008b\b\f\1\2"+
		"\u0088\u0089\7\35\2\2\u0089\u008b\b\f\1\2\u008a\u0082\3\2\2\2\u008a\u0084"+
		"\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b\27\3\2\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\u008e\b\r\1\2\u008e\u0093\3\2\2\2\u008f\u0090\5"+
		"\34\17\2\u0090\u0091\b\r\1\2\u0091\u0093\3\2\2\2\u0092\u008c\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0093\u00a6\3\2\2\2\u0094\u0095\7\13\2\2\u0095\u009d\b"+
		"\r\1\2\u0096\u0097\7\f\2\2\u0097\u009d\b\r\1\2\u0098\u0099\7\r\2\2\u0099"+
		"\u009d\b\r\1\2\u009a\u009b\7\16\2\2\u009b\u009d\b\r\1\2\u009c\u0094\3"+
		"\2\2\2\u009c\u0096\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u00a4\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\r\1\2\u00a0\u00a5\3"+
		"\2\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009c\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\37\2\2"+
		"\u00ad\35\3\2\2\2\17\37\'8AU`h}\u008a\u0092\u009c\u00a4\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}