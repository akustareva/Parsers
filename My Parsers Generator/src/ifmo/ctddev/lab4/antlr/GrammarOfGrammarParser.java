// Generated from C:/Users/Anna/IdeaProjects/ParserGenerator/src/ifmo/ctddev/lab4\GrammarOfGrammar.g4 by ANTLR 4.7
package ifmo.ctddev.lab4.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarOfGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NON_TERM_NAME=1, TERM_NAME=2, STRING=3, QUOTE=4, HEADER=5, MEMBERS=6, 
		JAVA_CODE=7, AT=8, QUESTION_MARK=9, ASTERISK=10, PLUS=11, PIPE=12, LEFT_BRACE=13, 
		RIGHT_BRACE=14, LEFT_PARENTHESIS=15, RIGHT_PARENTHESIS=16, SQUARE_BR_LEFT=17, 
		SQUARE_BR_RIGHT=18, SEMI=19, COLON=20, COMMA=21, OLD_STYLE_COMMENT=22, 
		COMMENT=23, WS=24;
	public static final int
		RULE_gram = 0, RULE_header = 1, RULE_members = 2, RULE_grammarRule = 3, 
		RULE_localAttrs = 4, RULE_returnedAttr = 5, RULE_nonTerminalProduction = 6, 
		RULE_nonTermVariations = 7, RULE_terminalProduction = 8, RULE_attr = 9, 
		RULE_args = 10, RULE_attrType = 11, RULE_attrName = 12, RULE_identifier = 13;
	public static final String[] ruleNames = {
		"gram", "header", "members", "grammarRule", "localAttrs", "returnedAttr", 
		"nonTerminalProduction", "nonTermVariations", "terminalProduction", "attr", 
		"args", "attrType", "attrName", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'''", null, null, null, "'@'", "'?'", "'*'", 
		"'+'", "'|'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NON_TERM_NAME", "TERM_NAME", "STRING", "QUOTE", "HEADER", "MEMBERS", 
		"JAVA_CODE", "AT", "QUESTION_MARK", "ASTERISK", "PLUS", "PIPE", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "SQUARE_BR_LEFT", 
		"SQUARE_BR_RIGHT", "SEMI", "COLON", "COMMA", "OLD_STYLE_COMMENT", "COMMENT", 
		"WS"
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
	public String getGrammarFileName() { return "GrammarOfGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarOfGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitGram(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(28);
				header();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBERS) {
				{
				setState(31);
				members();
				}
			}

			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(34);
				grammarRule();
				}
				}
				setState(39);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(GrammarOfGrammarParser.HEADER, 0); }
		public TerminalNode JAVA_CODE() { return getToken(GrammarOfGrammarParser.JAVA_CODE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(HEADER);
			setState(41);
			match(JAVA_CODE);
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

	public static class MembersContext extends ParserRuleContext {
		public TerminalNode MEMBERS() { return getToken(GrammarOfGrammarParser.MEMBERS, 0); }
		public TerminalNode JAVA_CODE() { return getToken(GrammarOfGrammarParser.JAVA_CODE, 0); }
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitMembers(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(MEMBERS);
			setState(44);
			match(JAVA_CODE);
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

	public static class GrammarRuleContext extends ParserRuleContext {
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
	 
		public GrammarRuleContext() { }
		public void copyFrom(GrammarRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermRuleLabelContext extends GrammarRuleContext {
		public TerminalNode TERM_NAME() { return getToken(GrammarOfGrammarParser.TERM_NAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarOfGrammarParser.COLON, 0); }
		public List<TerminalProductionContext> terminalProduction() {
			return getRuleContexts(TerminalProductionContext.class);
		}
		public TerminalProductionContext terminalProduction(int i) {
			return getRuleContext(TerminalProductionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrammarOfGrammarParser.SEMI, 0); }
		public List<TerminalNode> PIPE() { return getTokens(GrammarOfGrammarParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GrammarOfGrammarParser.PIPE, i);
		}
		public TermRuleLabelContext(GrammarRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterTermRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitTermRuleLabel(this);
		}
	}
	public static class NonTermRuleLabelContext extends GrammarRuleContext {
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarOfGrammarParser.NON_TERM_NAME, 0); }
		public TerminalNode COLON() { return getToken(GrammarOfGrammarParser.COLON, 0); }
		public List<NonTerminalProductionContext> nonTerminalProduction() {
			return getRuleContexts(NonTerminalProductionContext.class);
		}
		public NonTerminalProductionContext nonTerminalProduction(int i) {
			return getRuleContext(NonTerminalProductionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrammarOfGrammarParser.SEMI, 0); }
		public LocalAttrsContext localAttrs() {
			return getRuleContext(LocalAttrsContext.class,0);
		}
		public ReturnedAttrContext returnedAttr() {
			return getRuleContext(ReturnedAttrContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(GrammarOfGrammarParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GrammarOfGrammarParser.PIPE, i);
		}
		public NonTermRuleLabelContext(GrammarRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNonTermRuleLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNonTermRuleLabel(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarRule);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermRuleLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(NON_TERM_NAME);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PARENTHESIS) {
					{
					setState(47);
					localAttrs();
					}
				}

				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQUARE_BR_LEFT) {
					{
					setState(50);
					returnedAttr();
					}
				}

				setState(53);
				match(COLON);
				setState(54);
				nonTerminalProduction();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(55);
					match(PIPE);
					setState(56);
					nonTerminalProduction();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(SEMI);
				}
				break;
			case TERM_NAME:
				_localctx = new TermRuleLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(TERM_NAME);
				setState(65);
				match(COLON);
				setState(66);
				terminalProduction();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(67);
					match(PIPE);
					setState(68);
					terminalProduction();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(SEMI);
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

	public static class LocalAttrsContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.LEFT_PARENTHESIS, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarOfGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarOfGrammarParser.COMMA, i);
		}
		public LocalAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterLocalAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitLocalAttrs(this);
		}
	}

	public final LocalAttrsContext localAttrs() throws RecognitionException {
		LocalAttrsContext _localctx = new LocalAttrsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LEFT_PARENTHESIS);
			setState(79);
			attr();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				attr();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RIGHT_PARENTHESIS);
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

	public static class ReturnedAttrContext extends ParserRuleContext {
		public TerminalNode SQUARE_BR_LEFT() { return getToken(GrammarOfGrammarParser.SQUARE_BR_LEFT, 0); }
		public AttrTypeContext attrType() {
			return getRuleContext(AttrTypeContext.class,0);
		}
		public TerminalNode SQUARE_BR_RIGHT() { return getToken(GrammarOfGrammarParser.SQUARE_BR_RIGHT, 0); }
		public ReturnedAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnedAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterReturnedAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitReturnedAttr(this);
		}
	}

	public final ReturnedAttrContext returnedAttr() throws RecognitionException {
		ReturnedAttrContext _localctx = new ReturnedAttrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnedAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SQUARE_BR_LEFT);
			setState(90);
			attrType();
			setState(91);
			match(SQUARE_BR_RIGHT);
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

	public static class NonTerminalProductionContext extends ParserRuleContext {
		public List<NonTermVariationsContext> nonTermVariations() {
			return getRuleContexts(NonTermVariationsContext.class);
		}
		public NonTermVariationsContext nonTermVariations(int i) {
			return getRuleContext(NonTermVariationsContext.class,i);
		}
		public TerminalNode JAVA_CODE() { return getToken(GrammarOfGrammarParser.JAVA_CODE, 0); }
		public NonTerminalProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNonTerminalProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNonTerminalProduction(this);
		}
	}

	public final NonTerminalProductionContext nonTerminalProduction() throws RecognitionException {
		NonTerminalProductionContext _localctx = new NonTerminalProductionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonTerminalProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(93);
				nonTermVariations();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JAVA_CODE) {
				{
				setState(99);
				match(JAVA_CODE);
				}
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

	public static class NonTermVariationsContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(GrammarOfGrammarParser.TERM_NAME, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarOfGrammarParser.NON_TERM_NAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NonTermVariationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermVariations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNonTermVariations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNonTermVariations(this);
		}
	}

	public final NonTermVariationsContext nonTermVariations() throws RecognitionException {
		NonTermVariationsContext _localctx = new NonTermVariationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nonTermVariations);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(TERM_NAME);
				}
				break;
			case NON_TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(NON_TERM_NAME);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PARENTHESIS) {
					{
					setState(104);
					args();
					}
				}

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

	public static class TerminalProductionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GrammarOfGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarOfGrammarParser.STRING, i);
		}
		public TerminalProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterTerminalProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitTerminalProduction(this);
		}
	}

	public final TerminalProductionContext terminalProduction() throws RecognitionException {
		TerminalProductionContext _localctx = new TerminalProductionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminalProduction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(STRING);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class AttrContext extends ParserRuleContext {
		public AttrTypeContext attrType() {
			return getRuleContext(AttrTypeContext.class,0);
		}
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			attrType();
			setState(115);
			attrName();
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> JAVA_CODE() { return getTokens(GrammarOfGrammarParser.JAVA_CODE); }
		public TerminalNode JAVA_CODE(int i) {
			return getToken(GrammarOfGrammarParser.JAVA_CODE, i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarOfGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarOfGrammarParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LEFT_PARENTHESIS);
			setState(118);
			match(JAVA_CODE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(120);
				match(JAVA_CODE);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(RIGHT_PARENTHESIS);
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

	public static class AttrTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterAttrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitAttrType(this);
		}
	}

	public final AttrTypeContext attrType() throws RecognitionException {
		AttrTypeContext _localctx = new AttrTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			identifier();
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

	public static class AttrNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitAttrName(this);
		}
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			identifier();
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
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarOfGrammarParser.NON_TERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(GrammarOfGrammarParser.TERM_NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==NON_TERM_NAME || _la==TERM_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\5\2#\n\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\63\n\5"+
		"\3\5\5\5\66\n\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\7\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\7\ba\n\b\f\b\16"+
		"\bd\13\b\3\b\5\bg\n\b\3\t\3\t\3\t\5\tl\n\t\5\tn\n\t\3\n\6\nq\n\n\r\n\16"+
		"\nr\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\3\3\2\3\4\2\u0089\2\37\3\2\2\2\4*\3\2\2\2\6-\3\2\2\2\bN\3\2\2"+
		"\2\nP\3\2\2\2\f[\3\2\2\2\16b\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24t\3\2\2"+
		"\2\26w\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u0086\3\2\2\2\36 "+
		"\5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!#\5\6\4\2\"!\3\2\2\2\"#"+
		"\3\2\2\2#\'\3\2\2\2$&\5\b\5\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(\3\3\2\2\2)\'\3\2\2\2*+\7\7\2\2+,\7\t\2\2,\5\3\2\2\2-.\7\b\2\2./\7"+
		"\t\2\2/\7\3\2\2\2\60\62\7\3\2\2\61\63\5\n\6\2\62\61\3\2\2\2\62\63\3\2"+
		"\2\2\63\65\3\2\2\2\64\66\5\f\7\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\678\7\26\2\28=\5\16\b\29:\7\16\2\2:<\5\16\b\2;9\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\25\2\2AO\3\2\2\2BC\7\4\2"+
		"\2CD\7\26\2\2DI\5\22\n\2EF\7\16\2\2FH\5\22\n\2GE\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\25\2\2MO\3\2\2\2N\60\3\2\2\2"+
		"NB\3\2\2\2O\t\3\2\2\2PQ\7\21\2\2QV\5\24\13\2RS\7\27\2\2SU\5\24\13\2TR"+
		"\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\22\2\2"+
		"Z\13\3\2\2\2[\\\7\23\2\2\\]\5\30\r\2]^\7\24\2\2^\r\3\2\2\2_a\5\20\t\2"+
		"`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\7\t\2\2"+
		"fe\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hn\7\4\2\2ik\7\3\2\2jl\5\26\f\2kj\3\2"+
		"\2\2kl\3\2\2\2ln\3\2\2\2mh\3\2\2\2mi\3\2\2\2n\21\3\2\2\2oq\7\5\2\2po\3"+
		"\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tu\5\30\r\2uv\5\32\16"+
		"\2v\25\3\2\2\2wx\7\21\2\2x}\7\t\2\2yz\7\27\2\2z|\7\t\2\2{y\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7"+
		"\22\2\2\u0081\27\3\2\2\2\u0082\u0083\5\34\17\2\u0083\31\3\2\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\33\3\2\2\2\u0086\u0087\t\2\2\2\u0087\35\3\2\2\2"+
		"\21\37\"\'\62\65=INVbfkmr}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}