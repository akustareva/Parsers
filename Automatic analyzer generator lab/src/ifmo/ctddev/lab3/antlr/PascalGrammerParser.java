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
		SEMI=1, COLON=2, COMMA=3, DOT=4, LPAREN=5, RPAREN=6, PROGRAM=7, VAR=8, 
		BEGIN=9, END=10, BOOLEAN=11, CHAR=12, INTEGER=13, REAL=14, DOUBLE=15, 
		EXTENDED=16, STRING=17, READ=18, READLN=19, WRITE=20, WRITELN=21, IDENTIFIER=22, 
		WS=23, OLD_STYLE_COMMENT=24, COMMENT=25;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_varDeclarations = 2, RULE_programBody = 3, 
		RULE_varsDeclarationBlock = 4, RULE_listOfIdentifiers = 5, RULE_type = 6, 
		RULE_mainPart = 7, RULE_readWritePart = 8, RULE_assignmentPart = 9, RULE_funcName = 10, 
		RULE_identifier = 11;
	public static final String[] ruleNames = {
		"program", "programHeading", "varDeclarations", "programBody", "varsDeclarationBlock", 
		"listOfIdentifiers", "type", "mainPart", "readWritePart", "assignmentPart", 
		"funcName", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "PROGRAM", 
		"VAR", "BEGIN", "END", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", 
		"EXTENDED", "STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", 
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(24);
				programHeading();
				}
			}


			       ((ProgramContext)_localctx).code =  "#include <stdlib.h>\n";
			       _localctx.code += "#include <stdio.h>\n";
			       _localctx.code += "#include <stdbool.h>\n\n";
			      
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(28);
				((ProgramContext)_localctx).varDeclarations = varDeclarations();
				_localctx.code += ((ProgramContext)_localctx).varDeclarations.code;
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(39);
			match(PROGRAM);
			setState(40);
			identifier();
			setState(41);
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
			setState(43);
			match(VAR);
			((VarDeclarationsContext)_localctx).code =  "";
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((VarDeclarationsContext)_localctx).varsDeclarationBlock = varsDeclarationBlock();
				_localctx.code += ((VarDeclarationsContext)_localctx).varsDeclarationBlock.code + "\n";
				}
				}
				setState(50); 
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
			setState(52);
			match(BEGIN);
			((ProgramBodyContext)_localctx).code =  "";
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << READLN) | (1L << WRITE) | (1L << WRITELN))) != 0)) {
				{
				{
				setState(54);
				((ProgramBodyContext)_localctx).mainPart = mainPart();
				_localctx.code += ((ProgramBodyContext)_localctx).mainPart.code;
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(END);
			setState(63);
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
			setState(65);
			((VarsDeclarationBlockContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(66);
			match(COLON);
			setState(67);
			((VarsDeclarationBlockContext)_localctx).type = type();
			setState(68);
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
			setState(71);
			((ListOfIdentifiersContext)_localctx).identifier = identifier();
			((ListOfIdentifiersContext)_localctx).code =  (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				((ListOfIdentifiersContext)_localctx).identifier = identifier();
				_localctx.code += ", " + (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
				}
				}
				setState(81);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(CHAR);
				((TypeContext)_localctx).code =  "char";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(BOOLEAN);
				((TypeContext)_localctx).code =  "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(INTEGER);
				((TypeContext)_localctx).code =  "int";
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
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
		public ReadWritePartContext readWritePart() {
			return getRuleContext(ReadWritePartContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((MainPartContext)_localctx).readWritePart = readWritePart();
			((MainPartContext)_localctx).code =  ((MainPartContext)_localctx).readWritePart.code;
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
			setState(95);
			((ReadWritePartContext)_localctx).funcName = funcName();
			setState(96);
			match(LPAREN);
			setState(97);
			((ReadWritePartContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(98);
			match(RPAREN);
			setState(99);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(READ);
				((FuncNameContext)_localctx).name =  "read";
				}
				break;
			case READLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(READLN);
				((FuncNameContext)_localctx).name =  "readln";
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(WRITE);
				((FuncNameContext)_localctx).name =  "write";
				}
				break;
			case WRITELN:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
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
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4\63\n\4\r\4\16\4\64"+
		"\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2u\2\33\3\2\2\2\4)\3\2\2\2\6-\3\2\2"+
		"\2\b\66\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22a\3\2"+
		"\2\2\24h\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33"+
		"\34\3\2\2\2\34\35\3\2\2\2\35#\b\2\1\2\36\37\5\6\4\2\37 \b\2\1\2 \"\3\2"+
		"\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'"+
		"\5\b\5\2\'(\b\2\1\2(\3\3\2\2\2)*\7\t\2\2*+\5\30\r\2+,\7\3\2\2,\5\3\2\2"+
		"\2-.\7\n\2\2.\62\b\4\1\2/\60\5\n\6\2\60\61\b\4\1\2\61\63\3\2\2\2\62/\3"+
		"\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\67\7"+
		"\13\2\2\67=\b\5\1\289\5\20\t\29:\b\5\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\f\2\2AB\7\6\2\2B\t\3\2\2"+
		"\2CD\5\f\7\2DE\7\4\2\2EF\5\16\b\2FG\7\3\2\2GH\b\6\1\2H\13\3\2\2\2IJ\5"+
		"\30\r\2JQ\b\7\1\2KL\7\5\2\2LM\5\30\r\2MN\b\7\1\2NP\3\2\2\2OK\3\2\2\2P"+
		"S\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\7\16\2\2U]\b\b\1"+
		"\2VW\7\r\2\2W]\b\b\1\2XY\7\17\2\2Y]\b\b\1\2Z[\7\21\2\2[]\b\b\1\2\\T\3"+
		"\2\2\2\\V\3\2\2\2\\X\3\2\2\2\\Z\3\2\2\2]\17\3\2\2\2^_\5\22\n\2_`\b\t\1"+
		"\2`\21\3\2\2\2ab\5\26\f\2bc\7\7\2\2cd\5\f\7\2de\7\b\2\2ef\7\3\2\2fg\b"+
		"\n\1\2g\23\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jk\7\24\2\2ks\b\f\1\2lm\7\25\2"+
		"\2ms\b\f\1\2no\7\26\2\2os\b\f\1\2pq\7\27\2\2qs\b\f\1\2rj\3\2\2\2rl\3\2"+
		"\2\2rn\3\2\2\2rp\3\2\2\2s\27\3\2\2\2tu\7\30\2\2u\31\3\2\2\2\t\33#\64="+
		"Q\\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}