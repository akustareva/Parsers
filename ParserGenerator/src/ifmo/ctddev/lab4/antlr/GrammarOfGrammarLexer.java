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
		NON_TERM_NAME=1, TERM_NAME=2, STRING=3, QUOTE=4, HEADER=5, MEMBERS=6, 
		JAVA_CODE=7, AT=8, QUESTION_MARK=9, ASTERISK=10, PLUS=11, PIPE=12, LEFT_BRACE=13, 
		RIGHT_BRACE=14, LEFT_PARENTHESIS=15, RIGHT_PARENTHESIS=16, SQUARE_BR_LEFT=17, 
		SQUARE_BR_RIGHT=18, SEMI=19, COLON=20, COMMA=21, OLD_STYLE_COMMENT=22, 
		COMMENT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NON_TERM_NAME", "TERM_NAME", "STRING", "QUOTE", "HEADER", "MEMBERS", 
		"JAVA_CODE", "AT", "QUESTION_MARK", "ASTERISK", "PLUS", "PIPE", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "SQUARE_BR_LEFT", 
		"SQUARE_BR_RIGHT", "SEMI", "COLON", "COMMA", "OLD_STYLE_COMMENT", "COMMENT", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\7\3=\n\3\f\3\16\3@\13"+
		"\3\3\4\3\4\6\4D\n\4\r\4\16\4E\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\6\br\n\b"+
		"\r\b\16\bs\3\b\5\bw\n\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7"+
		"\27\u00a0\n\27\f\27\16\27\u00a3\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\7\30\u00ac\n\30\f\30\16\30\u00af\13\30\3\30\3\30\3\30\3\30\3\31\6"+
		"\31\u00b6\n\31\r\31\16\31\u00b7\3\31\3\31\4\u00a1\u00ad\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\3\2c|\6\2\62;C\\aac|\3\2C\\"+
		"\3\2))\4\2}}\177\177\5\2\13\f\17\17\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3"+
		"\2\2\2\5:\3\2\2\2\7A\3\2\2\2\tI\3\2\2\2\13Z\3\2\2\2\rm\3\2\2\2\17o\3\2"+
		"\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2"+
		"\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!"+
		"\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3"+
		"\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u00a9\3\2\2\2\61\u00b5\3\2\2\2\63"+
		"\67\t\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678"+
		"\3\2\2\28\4\3\2\2\29\67\3\2\2\2:>\t\4\2\2;=\t\3\2\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?\6\3\2\2\2@>\3\2\2\2AC\5\t\5\2BD\n\5\2\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\t\5\2H\b\3\2\2\2IJ\7"+
		")\2\2J\n\3\2\2\2KL\7B\2\2LM\7j\2\2MN\7g\2\2NO\7c\2\2OP\7f\2\2PQ\7g\2\2"+
		"Q[\7t\2\2RS\7B\2\2ST\7\"\2\2TU\7j\2\2UV\7g\2\2VW\7c\2\2WX\7f\2\2XY\7g"+
		"\2\2Y[\7t\2\2ZK\3\2\2\2ZR\3\2\2\2[\f\3\2\2\2\\]\7B\2\2]^\7o\2\2^_\7g\2"+
		"\2_`\7o\2\2`a\7d\2\2ab\7g\2\2bc\7t\2\2cn\7u\2\2de\7B\2\2ef\7\"\2\2fg\7"+
		"o\2\2gh\7g\2\2hi\7o\2\2ij\7d\2\2jk\7g\2\2kl\7t\2\2ln\7u\2\2m\\\3\2\2\2"+
		"md\3\2\2\2n\16\3\2\2\2oz\5\33\16\2pr\n\6\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2uw\5\17\b\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xq\3"+
		"\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\5\35\17\2~"+
		"\20\3\2\2\2\177\u0080\7B\2\2\u0080\22\3\2\2\2\u0081\u0082\7A\2\2\u0082"+
		"\24\3\2\2\2\u0083\u0084\7,\2\2\u0084\26\3\2\2\2\u0085\u0086\7-\2\2\u0086"+
		"\30\3\2\2\2\u0087\u0088\7~\2\2\u0088\32\3\2\2\2\u0089\u008a\7}\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\7\177\2\2\u008c\36\3\2\2\2\u008d\u008e\7*\2\2"+
		"\u008e \3\2\2\2\u008f\u0090\7+\2\2\u0090\"\3\2\2\2\u0091\u0092\7]\2\2"+
		"\u0092$\3\2\2\2\u0093\u0094\7_\2\2\u0094&\3\2\2\2\u0095\u0096\7=\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\7<\2\2\u0098*\3\2\2\2\u0099\u009a\7.\2\2\u009a,"+
		"\3\2\2\2\u009b\u009c\7*\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2\2\u009e"+
		"\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00a6\7+\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\27"+
		"\2\2\u00a8.\3\2\2\2\u00a9\u00ad\7}\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\b\30\2\2\u00b3\60\3\2\2\2\u00b4\u00b6\t\7\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\31\2\2\u00ba\62\3\2\2\2\16\2\67"+
		">EZmsvz\u00a1\u00ad\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}