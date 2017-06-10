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
		SQUARE_BR_RIGHT=18, SEMI=19, COLON=20, COMMA=21, WS=22;
	public static final int
		RULE_gram = 0, RULE_header = 1, RULE_members = 2, RULE_grammarRule = 3, 
		RULE_localAttrs = 4, RULE_returnedAttrs = 5, RULE_nonterminalProduction = 6, 
		RULE_nontermVariations = 7, RULE_terminalProduction = 8, RULE_attr = 9, 
		RULE_args = 10, RULE_attrType = 11, RULE_attrName = 12, RULE_identifier = 13;
	public static final String[] ruleNames = {
		"gram", "header", "members", "grammarRule", "localAttrs", "returnedAttrs", 
		"nonterminalProduction", "nontermVariations", "terminalProduction", "attr", 
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
		"SQUARE_BR_RIGHT", "SEMI", "COLON", "COMMA", "WS"
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
		public List<NonterminalProductionContext> nonterminalProduction() {
			return getRuleContexts(NonterminalProductionContext.class);
		}
		public NonterminalProductionContext nonterminalProduction(int i) {
			return getRuleContext(NonterminalProductionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(GrammarOfGrammarParser.SEMI, 0); }
		public LocalAttrsContext localAttrs() {
			return getRuleContext(LocalAttrsContext.class,0);
		}
		public ReturnedAttrsContext returnedAttrs() {
			return getRuleContext(ReturnedAttrsContext.class,0);
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
					returnedAttrs();
					}
				}

				setState(53);
				match(COLON);
				setState(54);
				nonterminalProduction();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(55);
					match(PIPE);
					setState(56);
					nonterminalProduction();
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

	public static class ReturnedAttrsContext extends ParserRuleContext {
		public TerminalNode SQUARE_BR_LEFT() { return getToken(GrammarOfGrammarParser.SQUARE_BR_LEFT, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public TerminalNode SQUARE_BR_RIGHT() { return getToken(GrammarOfGrammarParser.SQUARE_BR_RIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarOfGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarOfGrammarParser.COMMA, i);
		}
		public ReturnedAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnedAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).enterReturnedAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarOfGrammarListener ) ((GrammarOfGrammarListener)listener).exitReturnedAttrs(this);
		}
	}

	public final ReturnedAttrsContext returnedAttrs() throws RecognitionException {
		ReturnedAttrsContext _localctx = new ReturnedAttrsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnedAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SQUARE_BR_LEFT);
			setState(90);
			attr();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				attr();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		public List<NontermVariationsContext> nontermVariations() {
			return getRuleContexts(NontermVariationsContext.class);
		}
		public NontermVariationsContext nontermVariations(int i) {
			return getRuleContext(NontermVariationsContext.class,i);
		}
		public List<TerminalNode> JAVA_CODE() { return getTokens(GrammarOfGrammarParser.JAVA_CODE); }
		public TerminalNode JAVA_CODE(int i) {
			return getToken(GrammarOfGrammarParser.JAVA_CODE, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				nontermVariations();
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
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NON_TERM_NAME) | (1L << TERM_NAME) | (1L << LEFT_PARENTHESIS))) != 0) );
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
		public TerminalNode TERM_NAME() { return getToken(GrammarOfGrammarParser.TERM_NAME, 0); }
		public TerminalNode ASTERISK() { return getToken(GrammarOfGrammarParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(GrammarOfGrammarParser.PLUS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(GrammarOfGrammarParser.QUESTION_MARK, 0); }
		public TerminalNode NON_TERM_NAME() { return getToken(GrammarOfGrammarParser.NON_TERM_NAME, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.LEFT_PARENTHESIS, 0); }
		public NontermVariationsContext nontermVariations() {
			return getRuleContext(NontermVariationsContext.class,0);
		}
		public TerminalNode JAVA_CODE() { return getToken(GrammarOfGrammarParser.JAVA_CODE, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(GrammarOfGrammarParser.RIGHT_PARENTHESIS, 0); }
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(TERM_NAME);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION_MARK) | (1L << ASTERISK) | (1L << PLUS))) != 0)) {
					{
					setState(109);
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

				}
				break;
			case NON_TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NON_TERM_NAME);
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(113);
					args();
					}
					break;
				}
				}
				break;
			case LEFT_PARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(LEFT_PARENTHESIS);
				setState(117);
				nontermVariations();
				setState(118);
				match(JAVA_CODE);
				setState(119);
				match(RIGHT_PARENTHESIS);
				setState(120);
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
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				match(STRING);
				}
				}
				setState(127); 
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
			setState(129);
			attrType();
			setState(130);
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
		public List<AttrNameContext> attrName() {
			return getRuleContexts(AttrNameContext.class);
		}
		public AttrNameContext attrName(int i) {
			return getRuleContext(AttrNameContext.class,i);
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
			setState(132);
			match(LEFT_PARENTHESIS);
			setState(133);
			attrName();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				attrName();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(143);
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
			setState(145);
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
			setState(147);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\5\2#\n\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\5\5\63\n\5"+
		"\3\5\5\5\66\n\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\7\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c"+
		"\13\7\3\7\3\7\3\b\3\b\5\bi\n\b\6\bk\n\b\r\b\16\bl\3\t\3\t\5\tq\n\t\3\t"+
		"\3\t\5\tu\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\6\n\u0080\n\n\r\n\16"+
		"\n\u0081\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e\13"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\4\3\2\13\r\3\2\3\4\2\u009b\2\37\3\2\2\2\4*\3\2\2\2\6"+
		"-\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\f[\3\2\2\2\16j\3\2\2\2\20|\3\2\2\2\22"+
		"\177\3\2\2\2\24\u0083\3\2\2\2\26\u0086\3\2\2\2\30\u0091\3\2\2\2\32\u0093"+
		"\3\2\2\2\34\u0095\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2"+
		"\2\2!#\5\6\4\2\"!\3\2\2\2\"#\3\2\2\2#\'\3\2\2\2$&\5\b\5\2%$\3\2\2\2&)"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*+\7\7\2\2+,\7\t\2"+
		"\2,\5\3\2\2\2-.\7\b\2\2./\7\t\2\2/\7\3\2\2\2\60\62\7\3\2\2\61\63\5\n\6"+
		"\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\f\7\2\65\64\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\26\2\28=\5\16\b\29:\7\16\2\2:<\5"+
		"\16\b\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A"+
		"\7\25\2\2AO\3\2\2\2BC\7\4\2\2CD\7\26\2\2DI\5\22\n\2EF\7\16\2\2FH\5\22"+
		"\n\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\25"+
		"\2\2MO\3\2\2\2N\60\3\2\2\2NB\3\2\2\2O\t\3\2\2\2PQ\7\21\2\2QV\5\24\13\2"+
		"RS\7\27\2\2SU\5\24\13\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2"+
		"\2\2XV\3\2\2\2YZ\7\22\2\2Z\13\3\2\2\2[\\\7\23\2\2\\a\5\24\13\2]^\7\27"+
		"\2\2^`\5\24\13\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2de\7\24\2\2e\r\3\2\2\2fh\5\20\t\2gi\7\t\2\2hg\3\2\2\2hi\3\2\2\2"+
		"ik\3\2\2\2jf\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\17\3\2\2\2np\7\4\2"+
		"\2oq\t\2\2\2po\3\2\2\2pq\3\2\2\2q}\3\2\2\2rt\7\3\2\2su\5\26\f\2ts\3\2"+
		"\2\2tu\3\2\2\2u}\3\2\2\2vw\7\21\2\2wx\5\20\t\2xy\7\t\2\2yz\7\22\2\2z{"+
		"\t\2\2\2{}\3\2\2\2|n\3\2\2\2|r\3\2\2\2|v\3\2\2\2}\21\3\2\2\2~\u0080\7"+
		"\5\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\5\30\r\2\u0084\u0085\5\32\16\2\u0085"+
		"\25\3\2\2\2\u0086\u0087\7\21\2\2\u0087\u008c\5\32\16\2\u0088\u0089\7\27"+
		"\2\2\u0089\u008b\5\32\16\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\22\2\2\u0090\27\3\2\2\2\u0091\u0092\5\34\17\2\u0092"+
		"\31\3\2\2\2\u0093\u0094\5\34\17\2\u0094\33\3\2\2\2\u0095\u0096\t\3\2\2"+
		"\u0096\35\3\2\2\2\23\37\"\'\62\65=INVahlpt|\u0081\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}