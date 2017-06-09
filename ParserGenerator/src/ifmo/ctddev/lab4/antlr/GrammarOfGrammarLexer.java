// Generated from C:/Users/Anna/IdeaProjects/ParserGenerator/src/ifmo/ctddev/lab4\GrammarOfGrammar.g4 by ANTLR 4.7
package ifmo.ctddev.lab4.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarOfGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NON_TERM_NAME=1, TERM_NAME=2, IDENTIFIER=3, STRING=4, QUOTE=5, HEADER=6, 
		MEMBERS=7, JAVA_CODE=8, AT=9, QUESTION_MARK=10, ASTERISK=11, PLUS=12, 
		PIPE=13, LEFT_BRACE=14, RIGHT_BRACE=15, LEFT_PARENTHESIS=16, RIGHT_PARENTHESIS=17, 
		SQUARE_BR_LEFT=18, SQUARE_BR_RIGHT=19, SEMI=20, COLON=21, COMMA=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NON_TERM_NAME", "TERM_NAME", "IDENTIFIER", "STRING", "QUOTE", "HEADER", 
		"MEMBERS", "JAVA_CODE", "AT", "QUESTION_MARK", "ASTERISK", "PLUS", "PIPE", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
		"SQUARE_BR_LEFT", "SQUARE_BR_RIGHT", "SEMI", "COLON", "COMMA", "WS"
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


	public GrammarOfGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarOfGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3"+
		"\4\7\4B\n\4\f\4\16\4E\13\4\3\5\3\5\6\5I\n\5\r\5\16\5J\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bs\n\b\3\t\3\t\6\tw\n\t\r\t\16\tx\3\t\5\t|\n\t\7\t~\n\t\f\t\16\t\u0081"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\6\30\u00a2\n\30\r\30\16\30\u00a3\3\30\3\30\2\2\31\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\t\3\2c|\6\2\62;C\\aac|\3\2C\\\4"+
		"\2C\\c|\3\2))\4\2}}\177\177\5\2\13\f\17\17\"\"\2\u00b0\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"8\3\2\2\2\7?\3\2\2\2\tF\3\2\2\2\13N\3\2\2\2\r_\3\2\2\2\17r\3\2\2\2\21"+
		"t\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2"+
		"\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u009a\3\2\2\2+\u009c"+
		"\3\2\2\2-\u009e\3\2\2\2/\u00a1\3\2\2\2\61\65\t\2\2\2\62\64\t\3\2\2\63"+
		"\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\4\3\2\2\2\67"+
		"\65\3\2\2\28<\t\4\2\29;\t\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2"+
		"\2=\6\3\2\2\2><\3\2\2\2?C\t\5\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2D\b\3\2\2\2EC\3\2\2\2FH\5\13\6\2GI\n\6\2\2HG\3\2\2\2IJ\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\13\6\2M\n\3\2\2\2NO\7)\2\2O\f"+
		"\3\2\2\2PQ\7B\2\2QR\7j\2\2RS\7g\2\2ST\7c\2\2TU\7f\2\2UV\7g\2\2V`\7t\2"+
		"\2WX\7B\2\2XY\7\"\2\2YZ\7j\2\2Z[\7g\2\2[\\\7c\2\2\\]\7f\2\2]^\7g\2\2^"+
		"`\7t\2\2_P\3\2\2\2_W\3\2\2\2`\16\3\2\2\2ab\7B\2\2bc\7o\2\2cd\7g\2\2de"+
		"\7o\2\2ef\7d\2\2fg\7g\2\2gh\7t\2\2hs\7u\2\2ij\7B\2\2jk\7\"\2\2kl\7o\2"+
		"\2lm\7g\2\2mn\7o\2\2no\7d\2\2op\7g\2\2pq\7t\2\2qs\7u\2\2ra\3\2\2\2ri\3"+
		"\2\2\2s\20\3\2\2\2t\177\5\35\17\2uw\n\7\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y{\3\2\2\2z|\5\21\t\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}v\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\5\37\20\2\u0083\22\3\2\2\2\u0084\u0085"+
		"\7B\2\2\u0085\24\3\2\2\2\u0086\u0087\7A\2\2\u0087\26\3\2\2\2\u0088\u0089"+
		"\7,\2\2\u0089\30\3\2\2\2\u008a\u008b\7-\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7~\2\2\u008d\34\3\2\2\2\u008e\u008f\7}\2\2\u008f\36\3\2\2\2\u0090\u0091"+
		"\7\177\2\2\u0091 \3\2\2\2\u0092\u0093\7*\2\2\u0093\"\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095$\3\2\2\2\u0096\u0097\7]\2\2\u0097&\3\2\2\2\u0098\u0099\7"+
		"_\2\2\u0099(\3\2\2\2\u009a\u009b\7=\2\2\u009b*\3\2\2\2\u009c\u009d\7<"+
		"\2\2\u009d,\3\2\2\2\u009e\u009f\7.\2\2\u009f.\3\2\2\2\u00a0\u00a2\t\b"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\30\2\2\u00a6\60\3\2\2"+
		"\2\r\2\65<CJ_rx{\177\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}