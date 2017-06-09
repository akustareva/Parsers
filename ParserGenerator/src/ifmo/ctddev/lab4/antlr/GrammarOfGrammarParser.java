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
		NON_TERM_NAME=1, TERM_NAME=2, IDENTIFIER=3, STRING=4, QUOTE=5, HEADER=6, 
		MEMBERS=7, JAVA_CODE=8, AT=9, QUESTION_MARK=10, ASTERISK=11, PLUS=12, 
		PIPE=13, LEFT_BRACE=14, RIGHT_BRACE=15, LEFT_PARENTHESIS=16, RIGHT_PARENTHESIS=17, 
		SQUARE_BR_LEFT=18, SQUARE_BR_RIGHT=19, SEMI=20, COLON=21, COMMA=22, WS=23;
	public static final int
		RULE_gram = 0, RULE_header = 1, RULE_members = 2, RULE_grammarRule = 3, 
		RULE_localAttrs = 4, RULE_returnedAttr = 5, RULE_nonterminalProduction = 6, 
		RULE_nontermVariations = 7, RULE_terminalProduction = 8, RULE_attr = 9, 
		RULE_attrType = 10, RULE_attrName = 11;
	public static final String[] ruleNames = {
		"gram", "header", "members", "grammarRule", "localAttrs", "returnedAttr", 
		"nonterminalProduction", "nontermVariations", "terminalProduction", "attr", 
		"attrType", "attrName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'''", null, null, null, "'@'", "'?'", "'*'", 
		"'+'", "'|'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NON_TERM_NAME", "TERM_NAME", "IDENTIFIER", "STRING", "QUOTE", "HEADER", 
		"MEMBERS", "JAVA_CODE", "AT", "QUESTION_MARK", "ASTERISK", "PLUS", "PIPE", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
		"SQUARE_BR_LEFT", "SQUARE_BR_RIGHT", "SEMI", "COLON", "COMMA", "WS"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(24);
				header();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBERS) {
				{
				setState(27);
				members();
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NON_TERM_NAME || _la==TERM_NAME) {
				{
				{
				setState(30);
				grammarRule();
				}
				}
				setState(35);
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
			setState(36);
			match(HEADER);
			setState(37);
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
			setState(39);
			match(MEMBERS);
			setState(40);
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
		public TerminalNode SEMI() { return getToken(GrammarOfGrammarParser.SEMI, 0); }
		public LocalAttrsContext localAttrs() {
			return getRuleContext(LocalAttrsContext.class,0);
		}
		public ReturnedAttrContext returnedAttr() {
			return getRuleContext(ReturnedAttrContext.class,0);
		}
		public List<NonterminalProductionContext> nonterminalProduction() {
			return getRuleContexts(NonterminalProductionContext.class);
		}
		public NonterminalProductionContext nonterminalProduction(int i) {
			return getRuleContext(NonterminalProductionContext.class,i);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				_localctx = new NonTermRuleLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(NON_TERM_NAME);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PARENTHESIS) {
					{
					setState(43);
					localAttrs();
					}
				}

				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQUARE_BR_LEFT) {
					{
					setState(46);
					returnedAttr();
					}
				}

				setState(49);
				match(COLON);
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(50);
					nonterminalProduction();
					}
					}
					setState(53); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << LEFT_PARENTHESIS))) != 0) );
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(55);
					match(PIPE);
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(56);
						nonterminalProduction();
						}
						}
						setState(59); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << LEFT_PARENTHESIS))) != 0) );
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(SEMI);
				}
				break;
			case TERM_NAME:
				_localctx = new TermRuleLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(TERM_NAME);
				setState(69);
				match(COLON);
				setState(70);
				terminalProduction();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(71);
					match(PIPE);
					setState(72);
					terminalProduction();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
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
			setState(82);
			match(LEFT_PARENTHESIS);
			setState(83);
			attr();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				attr();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
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
			setState(93);
			match(SQUARE_BR_LEFT);
			setState(94);
			attr();
			setState(95);
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

	public static class NonterminalProductionContext extends ParserRuleContext {
		public TerminalNode TERM_NAME() { return getToken(GrammarOfGrammarParser.TERM_NAME, 0); }
		public TerminalNode JAVA_CODE() { return getToken(GrammarOfGrammarParser.JAVA_CODE, 0); }
		public TerminalNode ASTERISK() { return getToken(GrammarOfGrammarParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(GrammarOfGrammarParser.PLUS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(GrammarOfGrammarParser.QUESTION_MARK, 0); }
		public NontermVariationsContext nontermVariations() {
			return getRuleContext(NontermVariationsContext.class,0);
		}
		public NonterminalProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterminalProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNonterminalProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNonterminalProduction(this);
		}
	}

	public final NonterminalProductionContext nonterminalProduction() throws RecognitionException {
		NonterminalProductionContext _localctx = new NonterminalProductionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonterminalProduction);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(TERM_NAME);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << ASTERISK) | (1L << PLUS))) != 0)) {
					{
					setState(98);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << ASTERISK) | (1L << PLUS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JAVA_CODE) {
					{
					setState(101);
					match(JAVA_CODE);
					}
				}

				}
				break;
			case NON_TERM_NAME:
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				nontermVariations();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JAVA_CODE) {
					{
					setState(105);
					match(JAVA_CODE);
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

	public static class NontermVariationsContext extends ParserRuleContext {
		public List<TerminalNode> NON_TERM_NAME() { return getTokens(GrammarOfGrammarParser.NON_TERM_NAME); }
		public TerminalNode NON_TERM_NAME(int i) {
			return getToken(GrammarOfGrammarParser.NON_TERM_NAME, i);
		}
		public List<TerminalNode> JAVA_CODE() { return getTokens(GrammarOfGrammarParser.JAVA_CODE); }
		public TerminalNode JAVA_CODE(int i) {
			return getToken(GrammarOfGrammarParser.JAVA_CODE, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(GrammarOfGrammarParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(GrammarOfGrammarParser.PIPE, i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.LEFT_PARENTHESIS, 0); }
		public NontermVariationsContext nontermVariations() {
			return getRuleContext(NontermVariationsContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode ASTERISK() { return getToken(GrammarOfGrammarParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(GrammarOfGrammarParser.PLUS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(GrammarOfGrammarParser.QUESTION_MARK, 0); }
		public NontermVariationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nontermVariations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterNontermVariations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitNontermVariations(this);
		}
	}

	public final NontermVariationsContext nontermVariations() throws RecognitionException {
		NontermVariationsContext _localctx = new NontermVariationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nontermVariations);
		int _la;
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NON_TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(NON_TERM_NAME);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(111);
					match(JAVA_CODE);
					}
					break;
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(PIPE);
						setState(115);
						match(NON_TERM_NAME);
						setState(117);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(116);
							match(JAVA_CODE);
							}
							break;
						}
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(LEFT_PARENTHESIS);
				setState(125);
				nontermVariations();
				setState(126);
				match(RIGHT_PARENTHESIS);
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << ASTERISK) | (1L << PLUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(STRING);
				}
				}
				setState(134); 
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
			setState(136);
			attrType();
			setState(137);
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

	public static class AttrTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarOfGrammarParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_attrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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

	public static class AttrNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarOfGrammarParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 22, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\5\2\37\n\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5/\n\5\3\5\5\5\62\n\5\3"+
		"\5\3\5\6\5\66\n\5\r\5\16\5\67\3\5\3\5\6\5<\n\5\r\5\16\5=\7\5@\n\5\f\5"+
		"\16\5C\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3"+
		"\5\5\5S\n\5\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\5\bf\n\b\3\b\5\bi\n\b\3\b\3\b\5\bm\n\b\5\bo\n\b\3\t\3\t"+
		"\5\ts\n\t\3\t\3\t\3\t\5\tx\n\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0084\n\t\3\n\6\n\u0087\n\n\r\n\16\n\u0088\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\f\16\2\u0099"+
		"\2\33\3\2\2\2\4&\3\2\2\2\6)\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f_\3\2\2\2\16"+
		"n\3\2\2\2\20\u0083\3\2\2\2\22\u0086\3\2\2\2\24\u008a\3\2\2\2\26\u008d"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34"+
		"\36\3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\36\37\3\2\2\2\37#\3\2\2\2 \"\5"+
		"\b\5\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&"+
		"\'\7\b\2\2\'(\7\n\2\2(\5\3\2\2\2)*\7\t\2\2*+\7\n\2\2+\7\3\2\2\2,.\7\3"+
		"\2\2-/\5\n\6\2.-\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\5\f\7\2\61\60\3\2"+
		"\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\7\27\2\2\64\66\5\16\b\2\65\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28A\3\2\2\29;\7\17\2\2:<"+
		"\5\16\b\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?9\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\26\2\2ES\3\2\2"+
		"\2FG\7\4\2\2GH\7\27\2\2HM\5\22\n\2IJ\7\17\2\2JL\5\22\n\2KI\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\26\2\2QS\3\2\2\2R,"+
		"\3\2\2\2RF\3\2\2\2S\t\3\2\2\2TU\7\22\2\2UZ\5\24\13\2VW\7\30\2\2WY\5\24"+
		"\13\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^"+
		"\7\23\2\2^\13\3\2\2\2_`\7\24\2\2`a\5\24\13\2ab\7\25\2\2b\r\3\2\2\2ce\7"+
		"\4\2\2df\t\2\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\7\n\2\2hg\3\2\2\2hi\3"+
		"\2\2\2io\3\2\2\2jl\5\20\t\2km\7\n\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2nc"+
		"\3\2\2\2nj\3\2\2\2o\17\3\2\2\2pr\7\3\2\2qs\7\n\2\2rq\3\2\2\2rs\3\2\2\2"+
		"s{\3\2\2\2tu\7\17\2\2uw\7\3\2\2vx\7\n\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2"+
		"\2yt\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0084\3\2\2\2}{\3\2\2\2~\177"+
		"\7\22\2\2\177\u0080\5\20\t\2\u0080\u0081\7\23\2\2\u0081\u0082\t\2\2\2"+
		"\u0082\u0084\3\2\2\2\u0083p\3\2\2\2\u0083~\3\2\2\2\u0084\21\3\2\2\2\u0085"+
		"\u0087\7\6\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c"+
		"\5\30\r\2\u008c\25\3\2\2\2\u008d\u008e\7\5\2\2\u008e\27\3\2\2\2\u008f"+
		"\u0090\7\5\2\2\u0090\31\3\2\2\2\26\33\36#.\61\67=AMRZehlnrw{\u0083\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}