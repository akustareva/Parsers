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
		CONST=17, BOOLEAN=18, CHAR=19, INTEGER=20, REAL=21, DOUBLE=22, EXTENDED=23, 
		STRING=24, READ=25, READLN=26, WRITE=27, WRITELN=28, IDENTIFIER=29, NUMBER=30, 
		WS=31, OLD_STYLE_COMMENT=32, COMMENT=33;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_varDeclarations = 2, RULE_constDeclarations = 3, 
		RULE_programBody = 4, RULE_varsDeclarationBlock = 5, RULE_constDeclarationBlock = 6, 
		RULE_listOfIdentifiers = 7, RULE_type = 8, RULE_mainPart = 9, RULE_readWritePart = 10, 
		RULE_assignmentPart = 11, RULE_funcName = 12, RULE_simpleExpression = 13, 
		RULE_identifier = 14, RULE_number = 15;
	public static final String[] ruleNames = {
		"program", "programHeading", "varDeclarations", "constDeclarations", "programBody", 
		"varsDeclarationBlock", "constDeclarationBlock", "listOfIdentifiers", 
		"type", "mainPart", "readWritePart", "assignmentPart", "funcName", "simpleExpression", 
		"identifier", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'.'", "'('", "')'", "'='", "':='", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "CONST", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", 
		"STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", 
		"WS", "OLD_STYLE_COMMENT", "COMMENT"
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
		public ConstDeclarationsContext constDeclarations;
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
		public List<ConstDeclarationsContext> constDeclarations() {
			return getRuleContexts(ConstDeclarationsContext.class);
		}
		public ConstDeclarationsContext constDeclarations(int i) {
			return getRuleContext(ConstDeclarationsContext.class,i);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(32);
				programHeading();
				}
			}


			       ((ProgramContext)_localctx).code =  "#include <stdlib.h>\n";
			       _localctx.code += "#include <stdio.h>\n";
			       _localctx.code += "#include <stdbool.h>\n\n";
			      
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(36);
				((ProgramContext)_localctx).varDeclarations = varDeclarations();
				_localctx.code += ((ProgramContext)_localctx).varDeclarations.code;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(44);
				((ProgramContext)_localctx).constDeclarations = constDeclarations();
				_localctx.code += ((ProgramContext)_localctx).constDeclarations.code;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			setState(55);
			match(PROGRAM);
			setState(56);
			identifier();
			setState(57);
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
			setState(59);
			match(VAR);
			((VarDeclarationsContext)_localctx).code =  "";
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				((VarDeclarationsContext)_localctx).varsDeclarationBlock = varsDeclarationBlock();
				_localctx.code += ((VarDeclarationsContext)_localctx).varsDeclarationBlock.code + "\n";
				}
				}
				setState(66); 
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

	public static class ConstDeclarationsContext extends ParserRuleContext {
		public String code;
		public ConstDeclarationBlockContext constDeclarationBlock;
		public TerminalNode CONST() { return getToken(PascalGrammerParser.CONST, 0); }
		public List<ConstDeclarationBlockContext> constDeclarationBlock() {
			return getRuleContexts(ConstDeclarationBlockContext.class);
		}
		public ConstDeclarationBlockContext constDeclarationBlock(int i) {
			return getRuleContext(ConstDeclarationBlockContext.class,i);
		}
		public ConstDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterConstDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitConstDeclarations(this);
		}
	}

	public final ConstDeclarationsContext constDeclarations() throws RecognitionException {
		ConstDeclarationsContext _localctx = new ConstDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CONST);
			((ConstDeclarationsContext)_localctx).code =  "";
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				((ConstDeclarationsContext)_localctx).constDeclarationBlock = constDeclarationBlock();
				_localctx.code += ((ConstDeclarationsContext)_localctx).constDeclarationBlock.code;
				}
				}
				setState(75); 
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
		enterRule(_localctx, 8, RULE_programBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(BEGIN);
			((ProgramBodyContext)_localctx).code =  "";
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << READLN) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(79);
				((ProgramBodyContext)_localctx).mainPart = mainPart();
				_localctx.code += ((ProgramBodyContext)_localctx).mainPart.code;
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(END);
			setState(88);
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
		enterRule(_localctx, 10, RULE_varsDeclarationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((VarsDeclarationBlockContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(91);
			match(COLON);
			setState(92);
			((VarsDeclarationBlockContext)_localctx).type = type();
			setState(93);
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

	public static class ConstDeclarationBlockContext extends ParserRuleContext {
		public String code;
		public IdentifierContext identifier;
		public TypeContext type;
		public NumberContext number;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammerParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALITY() { return getToken(PascalGrammerParser.EQUALITY, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public ConstDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterConstDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitConstDeclarationBlock(this);
		}
	}

	public final ConstDeclarationBlockContext constDeclarationBlock() throws RecognitionException {
		ConstDeclarationBlockContext _localctx = new ConstDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDeclarationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((ConstDeclarationBlockContext)_localctx).identifier = identifier();
			setState(97);
			match(COLON);
			setState(98);
			((ConstDeclarationBlockContext)_localctx).type = type();
			setState(99);
			match(EQUALITY);
			setState(100);
			((ConstDeclarationBlockContext)_localctx).number = number();
			setState(101);
			match(SEMI);

			        ((ConstDeclarationBlockContext)_localctx).code =  "const " + ((ConstDeclarationBlockContext)_localctx).type.code + " " + (((ConstDeclarationBlockContext)_localctx).identifier!=null?_input.getText(((ConstDeclarationBlockContext)_localctx).identifier.start,((ConstDeclarationBlockContext)_localctx).identifier.stop):null) + " = " + (((ConstDeclarationBlockContext)_localctx).number!=null?_input.getText(((ConstDeclarationBlockContext)_localctx).number.start,((ConstDeclarationBlockContext)_localctx).number.stop):null) + ";\n";
			      
			}
			_ctx.stop = _input.LT(-1);

			        VarTypes.addVars(_localctx.type().code, _localctx.identifier().getText());
			    
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
		enterRule(_localctx, 14, RULE_listOfIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((ListOfIdentifiersContext)_localctx).identifier = identifier();
			((ListOfIdentifiersContext)_localctx).code =  (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				((ListOfIdentifiersContext)_localctx).identifier = identifier();
				_localctx.code += ", " + (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
				}
				}
				setState(114);
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(CHAR);
				((TypeContext)_localctx).code =  "char";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(BOOLEAN);
				((TypeContext)_localctx).code =  "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(INTEGER);
				((TypeContext)_localctx).code =  "int";
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
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
		enterRule(_localctx, 18, RULE_mainPart);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case READLN:
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((MainPartContext)_localctx).readWritePart = readWritePart();
				((MainPartContext)_localctx).code =  ((MainPartContext)_localctx).readWritePart.code;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalGrammerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascalGrammerParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public ListOfIdentifiersContext listOfIdentifiers() {
			return getRuleContext(ListOfIdentifiersContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_readWritePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			funcName();
			setState(134);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(135);
				listOfIdentifiers();
				}
			}

			setState(138);
			match(RPAREN);
			setState(139);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);

			        ((ReadWritePartContext)_localctx).code =  Functions.convertFuncToC(_localctx.funcName().name,
			        _localctx.listOfIdentifiers() == null ? new String[0] : _localctx.listOfIdentifiers().code.split(", "));
			    
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
		public NumberContext number;
		public SimpleExpressionContext simpleExpression;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PascalGrammerParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(PascalGrammerParser.SEMI, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 22, RULE_assignmentPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((AssignmentPartContext)_localctx).identifier = identifier();
			((AssignmentPartContext)_localctx).code =  "\t" + (((AssignmentPartContext)_localctx).identifier!=null?_input.getText(((AssignmentPartContext)_localctx).identifier.start,((AssignmentPartContext)_localctx).identifier.stop):null) + " = ";
			setState(143);
			match(ASSIGNMENT);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(144);
				((AssignmentPartContext)_localctx).identifier = identifier();
				_localctx.code += (((AssignmentPartContext)_localctx).identifier!=null?_input.getText(((AssignmentPartContext)_localctx).identifier.start,((AssignmentPartContext)_localctx).identifier.stop):null);
				}
				break;
			case 2:
				{
				setState(147);
				((AssignmentPartContext)_localctx).number = number();
				_localctx.code += (((AssignmentPartContext)_localctx).number!=null?_input.getText(((AssignmentPartContext)_localctx).number.start,((AssignmentPartContext)_localctx).number.stop):null);
				}
				break;
			case 3:
				{
				setState(150);
				((AssignmentPartContext)_localctx).simpleExpression = simpleExpression();
				_localctx.code += ((AssignmentPartContext)_localctx).simpleExpression.code;
				}
				break;
			}
			setState(155);
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
		enterRule(_localctx, 24, RULE_funcName);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(READ);
				((FuncNameContext)_localctx).name =  "read";
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(READLN);
				((FuncNameContext)_localctx).name =  "readln";
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(WRITE);
				((FuncNameContext)_localctx).name =  "write";
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
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
		public NumberContext number;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 26, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(168);
				((SimpleExpressionContext)_localctx).identifier = identifier();
				((SimpleExpressionContext)_localctx).code =  (((SimpleExpressionContext)_localctx).identifier!=null?_input.getText(((SimpleExpressionContext)_localctx).identifier.start,((SimpleExpressionContext)_localctx).identifier.stop):null);
				}
				break;
			case NUMBER:
				{
				setState(171);
				((SimpleExpressionContext)_localctx).number = number();
				((SimpleExpressionContext)_localctx).code =  (((SimpleExpressionContext)_localctx).number!=null?_input.getText(((SimpleExpressionContext)_localctx).number.start,((SimpleExpressionContext)_localctx).number.stop):null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(176);
					match(PLUS);
					_localctx.code += " + ";
					}
					break;
				case MINUS:
					{
					setState(178);
					match(MINUS);
					_localctx.code += " - ";
					}
					break;
				case MUL:
					{
					setState(180);
					match(MUL);
					_localctx.code += " * ";
					}
					break;
				case DIV:
					{
					setState(182);
					match(DIV);
					_localctx.code += " / ";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(186);
					((SimpleExpressionContext)_localctx).identifier = identifier();
					_localctx.code += (((SimpleExpressionContext)_localctx).identifier!=null?_input.getText(((SimpleExpressionContext)_localctx).identifier.start,((SimpleExpressionContext)_localctx).identifier.stop):null);
					}
					break;
				case NUMBER:
					{
					setState(189);
					((SimpleExpressionContext)_localctx).number = number();
					_localctx.code += (((SimpleExpressionContext)_localctx).number!=null?_input.getText(((SimpleExpressionContext)_localctx).number.start,((SimpleExpressionContext)_localctx).number.stop):null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(196); 
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
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PascalGrammerParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammerListener ) ((PascalGrammerListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\7\2\62\n\2\f\2"+
		"\16\2\65\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4C\n\4"+
		"\r\4\16\4D\3\5\3\5\3\5\3\5\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3\6\3\6\3\6"+
		"\7\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0086\n\13\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00b1\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bb"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\6\17\u00c5\n\17\r"+
		"\17\16\17\u00c6\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\2\2\u00d3\2#\3\2\2\2\49\3\2\2\2\6=\3\2\2\2\bF\3\2\2"+
		"\2\nO\3\2\2\2\f\\\3\2\2\2\16b\3\2\2\2\20j\3\2\2\2\22}\3\2\2\2\24\u0085"+
		"\3\2\2\2\26\u0087\3\2\2\2\30\u008f\3\2\2\2\32\u00a8\3\2\2\2\34\u00b0\3"+
		"\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2#$\3\2\2\2"+
		"$%\3\2\2\2%+\b\2\1\2&\'\5\6\4\2\'(\b\2\1\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2"+
		"\2+)\3\2\2\2+,\3\2\2\2,\63\3\2\2\2-+\3\2\2\2./\5\b\5\2/\60\b\2\1\2\60"+
		"\62\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\5\n\6\2\678\b\2\1\28\3\3\2\2\29:\7\17\2\2"+
		":;\5\36\20\2;<\7\3\2\2<\5\3\2\2\2=>\7\20\2\2>B\b\4\1\2?@\5\f\7\2@A\b\4"+
		"\1\2AC\3\2\2\2B?\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FG\7"+
		"\23\2\2GK\b\5\1\2HI\5\16\b\2IJ\b\5\1\2JL\3\2\2\2KH\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\7\21\2\2PV\b\6\1\2QR\5\24\13\2RS\b\6"+
		"\1\2SU\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2"+
		"\2\2YZ\7\22\2\2Z[\7\6\2\2[\13\3\2\2\2\\]\5\20\t\2]^\7\4\2\2^_\5\22\n\2"+
		"_`\7\3\2\2`a\b\7\1\2a\r\3\2\2\2bc\5\36\20\2cd\7\4\2\2de\5\22\n\2ef\7\t"+
		"\2\2fg\5 \21\2gh\7\3\2\2hi\b\b\1\2i\17\3\2\2\2jk\5\36\20\2kr\b\t\1\2l"+
		"m\7\5\2\2mn\5\36\20\2no\b\t\1\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\7\25\2\2v~\b\n\1\2wx\7\24\2\2x~\b"+
		"\n\1\2yz\7\26\2\2z~\b\n\1\2{|\7\30\2\2|~\b\n\1\2}u\3\2\2\2}w\3\2\2\2}"+
		"y\3\2\2\2}{\3\2\2\2~\23\3\2\2\2\177\u0080\5\26\f\2\u0080\u0081\b\13\1"+
		"\2\u0081\u0086\3\2\2\2\u0082\u0083\5\30\r\2\u0083\u0084\b\13\1\2\u0084"+
		"\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\25\3\2\2\2"+
		"\u0087\u0088\5\32\16\2\u0088\u008a\7\7\2\2\u0089\u008b\5\20\t\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\b"+
		"\2\2\u008d\u008e\7\3\2\2\u008e\27\3\2\2\2\u008f\u0090\5\36\20\2\u0090"+
		"\u0091\b\r\1\2\u0091\u009b\7\n\2\2\u0092\u0093\5\36\20\2\u0093\u0094\b"+
		"\r\1\2\u0094\u009c\3\2\2\2\u0095\u0096\5 \21\2\u0096\u0097\b\r\1\2\u0097"+
		"\u009c\3\2\2\2\u0098\u0099\5\34\17\2\u0099\u009a\b\r\1\2\u009a\u009c\3"+
		"\2\2\2\u009b\u0092\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f\b\r\1\2\u009f\31\3\2\2"+
		"\2\u00a0\u00a1\7\33\2\2\u00a1\u00a9\b\16\1\2\u00a2\u00a3\7\34\2\2\u00a3"+
		"\u00a9\b\16\1\2\u00a4\u00a5\7\35\2\2\u00a5\u00a9\b\16\1\2\u00a6\u00a7"+
		"\7\36\2\2\u00a7\u00a9\b\16\1\2\u00a8\u00a0\3\2\2\2\u00a8\u00a2\3\2\2\2"+
		"\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab"+
		"\5\36\20\2\u00ab\u00ac\b\17\1\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5 \21"+
		"\2\u00ae\u00af\b\17\1\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b1\u00c4\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00bb\b"+
		"\17\1\2\u00b4\u00b5\7\f\2\2\u00b5\u00bb\b\17\1\2\u00b6\u00b7\7\r\2\2\u00b7"+
		"\u00bb\b\17\1\2\u00b8\u00b9\7\16\2\2\u00b9\u00bb\b\17\1\2\u00ba\u00b2"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00c2\3\2\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\b\17\1\2\u00be\u00c3"+
		"\3\2\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\b\17\1\2\u00c1\u00c3\3\2\2\2"+
		"\u00c2\u00bc\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ba"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\35\3\2\2\2\u00c8\u00c9\7\37\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7 \2\2\u00cb"+
		"!\3\2\2\2\22#+\63DMVr}\u0085\u008a\u009b\u00a8\u00b0\u00ba\u00c2\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}