// Generated from C:/Users/Anna/Desktop/Lab3/src/ifmo/ctddev/lab3\PascalGrammer.g4 by ANTLR 4.7
package ifmo.ctddev.lab3.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, COLON=2, COMMA=3, DOT=4, LPAREN=5, RPAREN=6, PROGRAM=7, VAR=8, 
		BEGIN=9, END=10, BOOLEAN=11, CHAR=12, INTEGER=13, REAL=14, DOUBLE=15, 
		EXTENDED=16, STRING=17, READ=18, READLN=19, WRITE=20, WRITELN=21, IDENTIFIER=22, 
		WS=23, OLD_STYLE_COMMENT=24, COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "PROGRAM", "VAR", 
		"BEGIN", "END", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", 
		"STRING", "READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "WS", "OLD_STYLE_COMMENT", 
		"COMMENT"
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


	public PascalGrammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PascalGrammer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0131\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\7\27\u00d9\n\27\f\27\16\27\u00dc\13\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\6\62"+
		"\u0113\n\62\r\62\16\62\u0114\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u011d"+
		"\n\63\f\63\16\63\u0120\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0129"+
		"\n\64\f\64\16\64\u012c\13\64\3\64\3\64\3\64\3\64\4\u011e\u012a\2\65\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2"+
		"C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\31e\32g\33\3\2\37\4"+
		"\2C\\c|\6\2\62;C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u011a\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3\2\2"+
		"\2\17u\3\2\2\2\21}\3\2\2\2\23\u0081\3\2\2\2\25\u0087\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u0098\3\2\2\2\35\u00a0\3\2\2\2\37\u00a5\3"+
		"\2\2\2!\u00ac\3\2\2\2#\u00b5\3\2\2\2%\u00bc\3\2\2\2\'\u00c1\3\2\2\2)\u00c8"+
		"\3\2\2\2+\u00ce\3\2\2\2-\u00d6\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e7\3\2\2\2;\u00e9"+
		"\3\2\2\2=\u00eb\3\2\2\2?\u00ed\3\2\2\2A\u00ef\3\2\2\2C\u00f1\3\2\2\2E"+
		"\u00f3\3\2\2\2G\u00f5\3\2\2\2I\u00f7\3\2\2\2K\u00f9\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u00fd\3\2\2\2Q\u00ff\3\2\2\2S\u0101\3\2\2\2U\u0103\3\2\2\2W\u0105"+
		"\3\2\2\2Y\u0107\3\2\2\2[\u0109\3\2\2\2]\u010b\3\2\2\2_\u010d\3\2\2\2a"+
		"\u010f\3\2\2\2c\u0112\3\2\2\2e\u0118\3\2\2\2g\u0126\3\2\2\2ij\7=\2\2j"+
		"\4\3\2\2\2kl\7<\2\2l\6\3\2\2\2mn\7.\2\2n\b\3\2\2\2op\7\60\2\2p\n\3\2\2"+
		"\2qr\7*\2\2r\f\3\2\2\2st\7+\2\2t\16\3\2\2\2uv\5M\'\2vw\5Q)\2wx\5K&\2x"+
		"y\5;\36\2yz\5Q)\2z{\5/\30\2{|\5G$\2|\20\3\2\2\2}~\5Y-\2~\177\5/\30\2\177"+
		"\u0080\5Q)\2\u0080\22\3\2\2\2\u0081\u0082\5\61\31\2\u0082\u0083\5\67\34"+
		"\2\u0083\u0084\5;\36\2\u0084\u0085\5? \2\u0085\u0086\5I%\2\u0086\24\3"+
		"\2\2\2\u0087\u0088\5\67\34\2\u0088\u0089\5I%\2\u0089\u008a\5\65\33\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\5\61\31\2\u008c\u008d\5K&\2\u008d\u008e\5K&\2"+
		"\u008e\u008f\5E#\2\u008f\u0090\5\67\34\2\u0090\u0091\5/\30\2\u0091\u0092"+
		"\5I%\2\u0092\30\3\2\2\2\u0093\u0094\5\63\32\2\u0094\u0095\5=\37\2\u0095"+
		"\u0096\5/\30\2\u0096\u0097\5Q)\2\u0097\32\3\2\2\2\u0098\u0099\5? \2\u0099"+
		"\u009a\5I%\2\u009a\u009b\5U+\2\u009b\u009c\5\67\34\2\u009c\u009d\5;\36"+
		"\2\u009d\u009e\5\67\34\2\u009e\u009f\5Q)\2\u009f\34\3\2\2\2\u00a0\u00a1"+
		"\5Q)\2\u00a1\u00a2\5\67\34\2\u00a2\u00a3\5/\30\2\u00a3\u00a4\5E#\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\5\65\33\2\u00a6\u00a7\5K&\2\u00a7\u00a8\5W,\2"+
		"\u00a8\u00a9\5\61\31\2\u00a9\u00aa\5E#\2\u00aa\u00ab\5\67\34\2\u00ab "+
		"\3\2\2\2\u00ac\u00ad\5\67\34\2\u00ad\u00ae\5]/\2\u00ae\u00af\5U+\2\u00af"+
		"\u00b0\5\67\34\2\u00b0\u00b1\5I%\2\u00b1\u00b2\5\65\33\2\u00b2\u00b3\5"+
		"\67\34\2\u00b3\u00b4\5\65\33\2\u00b4\"\3\2\2\2\u00b5\u00b6\5S*\2\u00b6"+
		"\u00b7\5U+\2\u00b7\u00b8\5Q)\2\u00b8\u00b9\5? \2\u00b9\u00ba\5I%\2\u00ba"+
		"\u00bb\5;\36\2\u00bb$\3\2\2\2\u00bc\u00bd\5Q)\2\u00bd\u00be\5\67\34\2"+
		"\u00be\u00bf\5/\30\2\u00bf\u00c0\5\65\33\2\u00c0&\3\2\2\2\u00c1\u00c2"+
		"\5Q)\2\u00c2\u00c3\5\67\34\2\u00c3\u00c4\5/\30\2\u00c4\u00c5\5\65\33\2"+
		"\u00c5\u00c6\5E#\2\u00c6\u00c7\5I%\2\u00c7(\3\2\2\2\u00c8\u00c9\5[.\2"+
		"\u00c9\u00ca\5Q)\2\u00ca\u00cb\5? \2\u00cb\u00cc\5U+\2\u00cc\u00cd\5\67"+
		"\34\2\u00cd*\3\2\2\2\u00ce\u00cf\5[.\2\u00cf\u00d0\5Q)\2\u00d0\u00d1\5"+
		"? \2\u00d1\u00d2\5U+\2\u00d2\u00d3\5\67\34\2\u00d3\u00d4\5E#\2\u00d4\u00d5"+
		"\5I%\2\u00d5,\3\2\2\2\u00d6\u00da\t\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		".\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\t\4\2\2\u00de\60\3\2\2\2\u00df"+
		"\u00e0\t\5\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2\64\3\2\2\2\u00e3"+
		"\u00e4\t\7\2\2\u00e4\66\3\2\2\2\u00e5\u00e6\t\b\2\2\u00e68\3\2\2\2\u00e7"+
		"\u00e8\t\t\2\2\u00e8:\3\2\2\2\u00e9\u00ea\t\n\2\2\u00ea<\3\2\2\2\u00eb"+
		"\u00ec\t\13\2\2\u00ec>\3\2\2\2\u00ed\u00ee\t\f\2\2\u00ee@\3\2\2\2\u00ef"+
		"\u00f0\t\r\2\2\u00f0B\3\2\2\2\u00f1\u00f2\t\16\2\2\u00f2D\3\2\2\2\u00f3"+
		"\u00f4\t\17\2\2\u00f4F\3\2\2\2\u00f5\u00f6\t\20\2\2\u00f6H\3\2\2\2\u00f7"+
		"\u00f8\t\21\2\2\u00f8J\3\2\2\2\u00f9\u00fa\t\22\2\2\u00faL\3\2\2\2\u00fb"+
		"\u00fc\t\23\2\2\u00fcN\3\2\2\2\u00fd\u00fe\t\24\2\2\u00feP\3\2\2\2\u00ff"+
		"\u0100\t\25\2\2\u0100R\3\2\2\2\u0101\u0102\t\26\2\2\u0102T\3\2\2\2\u0103"+
		"\u0104\t\27\2\2\u0104V\3\2\2\2\u0105\u0106\t\30\2\2\u0106X\3\2\2\2\u0107"+
		"\u0108\t\31\2\2\u0108Z\3\2\2\2\u0109\u010a\t\32\2\2\u010a\\\3\2\2\2\u010b"+
		"\u010c\t\33\2\2\u010c^\3\2\2\2\u010d\u010e\t\34\2\2\u010e`\3\2\2\2\u010f"+
		"\u0110\t\35\2\2\u0110b\3\2\2\2\u0111\u0113\t\36\2\2\u0112\u0111\3\2\2"+
		"\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\b\62\2\2\u0117d\3\2\2\2\u0118\u0119\7*\2\2\u0119"+
		"\u011a\7,\2\2\u011a\u011e\3\2\2\2\u011b\u011d\13\2\2\2\u011c\u011b\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7,\2\2\u0122\u0123\7+\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0125\b\63\2\2\u0125f\3\2\2\2\u0126\u012a"+
		"\7}\2\2\u0127\u0129\13\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012e\7\177\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\64\2\2\u0130"+
		"h\3\2\2\2\7\2\u00da\u0114\u011e\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}