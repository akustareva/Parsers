// Generated from C:/Users/Anna/Desktop/Lab3/src/ifmo/ctddev/lab3\PascalGrammer.g4 by ANTLR 4.7
package ifmo.ctddev.lab3.antlr;
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
		SEMI=1, COLON=2, COMMA=3, DOT=4, PROGRAM=5, VAR=6, BEGIN=7, END=8, BOOLEAN=9, 
		CHAR=10, INTEGER=11, REAL=12, DOUBLE=13, EXTENDED=14, STRING=15, IDENTIFIER=16, 
		WS=17, OLD_STYLE_COMMENT=18, COMMENT=19;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_varDeclarations = 2, RULE_programBody = 3, 
		RULE_identifier = 4, RULE_varsDeclarationBlock = 5, RULE_listOfIdentifiers = 6, 
		RULE_type = 7;
	public static final String[] ruleNames = {
		"program", "programHeading", "varDeclarations", "programBody", "identifier", 
		"varsDeclarationBlock", "listOfIdentifiers", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "COLON", "COMMA", "DOT", "PROGRAM", "VAR", "BEGIN", "END", 
		"BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", "STRING", 
		"IDENTIFIER", "WS", "OLD_STYLE_COMMENT", "COMMENT"
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(16);
				programHeading();
				}
			}


			       ((ProgramContext)_localctx).code =  "#include <stdlib.h>\n";
			       _localctx.code += "#include <stdio.h>\n";
			       _localctx.code += "#include <stdbool.h>\n\n";
			      
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(20);
				((ProgramContext)_localctx).varDeclarations = varDeclarations();
				_localctx.code += ((ProgramContext)_localctx).varDeclarations.code;
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			programBody();

			           _localctx.code += "int main() {\n";
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
			setState(31);
			match(PROGRAM);
			setState(32);
			identifier();
			setState(33);
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
			setState(35);
			match(VAR);
			((VarDeclarationsContext)_localctx).code =  "";
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				((VarDeclarationsContext)_localctx).varsDeclarationBlock = varsDeclarationBlock();
				_localctx.code += ((VarDeclarationsContext)_localctx).varsDeclarationBlock.code + "\n";
				}
				}
				setState(42); 
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
		public TerminalNode BEGIN() { return getToken(PascalGrammerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalGrammerParser.END, 0); }
		public TerminalNode DOT() { return getToken(PascalGrammerParser.DOT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(BEGIN);
			setState(45);
			match(END);
			setState(46);
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
		enterRule(_localctx, 8, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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
			setState(50);
			((VarsDeclarationBlockContext)_localctx).listOfIdentifiers = listOfIdentifiers();
			setState(51);
			match(COLON);
			setState(52);
			((VarsDeclarationBlockContext)_localctx).type = type();
			setState(53);
			match(SEMI);
			((VarsDeclarationBlockContext)_localctx).code =  ((VarsDeclarationBlockContext)_localctx).type.code + " " + ((VarsDeclarationBlockContext)_localctx).listOfIdentifiers.code + ";";
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
		enterRule(_localctx, 12, RULE_listOfIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((ListOfIdentifiersContext)_localctx).identifier = identifier();
			((ListOfIdentifiersContext)_localctx).code =  (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				((ListOfIdentifiersContext)_localctx).identifier = identifier();
				_localctx.code += ", " + (((ListOfIdentifiersContext)_localctx).identifier!=null?_input.getText(((ListOfIdentifiersContext)_localctx).identifier.start,((ListOfIdentifiersContext)_localctx).identifier.stop):null);
				}
				}
				setState(66);
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
		public TerminalNode REAL() { return getToken(PascalGrammerParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(PascalGrammerParser.DOUBLE, 0); }
		public TerminalNode EXTENDED() { return getToken(PascalGrammerParser.EXTENDED, 0); }
		public TerminalNode STRING() { return getToken(PascalGrammerParser.STRING, 0); }
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(CHAR);
				((TypeContext)_localctx).code =  "char";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(BOOLEAN);
				((TypeContext)_localctx).code =  "bool";
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(INTEGER);
				((TypeContext)_localctx).code =  "int";
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(REAL);
				((TypeContext)_localctx).code =  "float";
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(DOUBLE);
				((TypeContext)_localctx).code =  "double";
				}
				break;
			case EXTENDED:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(EXTENDED);
				((TypeContext)_localctx).code =  "long double";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(STRING);
				((TypeContext)_localctx).code =  "char *";
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\24\n\2\3\2"+
		"\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bA\n\b\f\b\16\bD\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\2\2W\2\23\3\2\2\2\4!\3\2\2\2\6%\3\2\2\2\b.\3\2\2"+
		"\2\n\62\3\2\2\2\f\64\3\2\2\2\16:\3\2\2\2\20S\3\2\2\2\22\24\5\4\3\2\23"+
		"\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\33\b\2\1\2\26\27\5\6\4\2\27"+
		"\30\b\2\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\5\b\5\2\37 \b\2\1\2 \3\3"+
		"\2\2\2!\"\7\7\2\2\"#\5\n\6\2#$\7\3\2\2$\5\3\2\2\2%&\7\b\2\2&*\b\4\1\2"+
		"\'(\5\f\7\2()\b\4\1\2)+\3\2\2\2*\'\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-\7\3\2\2\2./\7\t\2\2/\60\7\n\2\2\60\61\7\6\2\2\61\t\3\2\2\2\62\63\7"+
		"\22\2\2\63\13\3\2\2\2\64\65\5\16\b\2\65\66\7\4\2\2\66\67\5\20\t\2\678"+
		"\7\3\2\289\b\7\1\29\r\3\2\2\2:;\5\n\6\2;B\b\b\1\2<=\7\5\2\2=>\5\n\6\2"+
		">?\b\b\1\2?A\3\2\2\2@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\17\3\2\2"+
		"\2DB\3\2\2\2EF\7\f\2\2FT\b\t\1\2GH\7\13\2\2HT\b\t\1\2IJ\7\r\2\2JT\b\t"+
		"\1\2KL\7\16\2\2LT\b\t\1\2MN\7\17\2\2NT\b\t\1\2OP\7\20\2\2PT\b\t\1\2QR"+
		"\7\21\2\2RT\b\t\1\2SE\3\2\2\2SG\3\2\2\2SI\3\2\2\2SK\3\2\2\2SM\3\2\2\2"+
		"SO\3\2\2\2SQ\3\2\2\2T\21\3\2\2\2\7\23\33,BS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}