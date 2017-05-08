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
		SEMI=1, COLON=2, COMMA=3, DOT=4, LPAREN=5, RPAREN=6, EQUALITY=7, ASSIGNMENT=8, 
		PLUS=9, MINUS=10, MUL=11, DIV=12, PROGRAM=13, VAR=14, BEGIN=15, END=16, 
		BOOLEAN=17, CHAR=18, INTEGER=19, REAL=20, DOUBLE=21, EXTENDED=22, STRING=23, 
		READ=24, READLN=25, WRITE=26, WRITELN=27, IDENTIFIER=28, NUMBER=29, WS=30, 
		OLD_STYLE_COMMENT=31, COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", "ASSIGNMENT", 
		"PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", "END", "BOOLEAN", 
		"CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", "STRING", "READ", "READLN", 
		"WRITE", "WRITELN", "IDENTIFIER", "NUMBER", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "WS", "OLD_STYLE_COMMENT", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", "'.'", "'('", "')'", "'='", "':='", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", 
		"ASSIGNMENT", "PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", 
		"END", "BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", "STRING", 
		"READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", "WS", "OLD_STYLE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0151\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\7\35\u00f4\n\35\f\35\16\35\u00f7\13\35\3\36"+
		"\6\36\u00fa\n\36\r\36\16\36\u00fb\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\69\u0133\n9\r9\169\u0134\39\39\3:\3:\3:\3:\7"+
		":\u013d\n:\f:\16:\u0140\13:\3:\3:\3:\3:\3:\3;\3;\7;\u0149\n;\f;\16;\u014c"+
		"\13;\3;\3;\3;\3;\4\u013e\u014a\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U"+
		"\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q s!u\"\3\2\37\4\2C\\c|\6\2\62"+
		";C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3"+
		"\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0098\3\2"+
		"\2\2\37\u009c\3\2\2\2!\u00a2\3\2\2\2#\u00a6\3\2\2\2%\u00ae\3\2\2\2\'\u00b3"+
		"\3\2\2\2)\u00bb\3\2\2\2+\u00c0\3\2\2\2-\u00c7\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u00dc\3\2\2\2\65\u00e3\3\2\2\2\67\u00e9\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f9\3\2\2\2=\u00fd\3\2\2\2?\u00ff\3\2\2\2A\u0101\3\2\2\2C"+
		"\u0103\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K\u010b\3\2"+
		"\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0113\3\2\2\2U\u0115"+
		"\3\2\2\2W\u0117\3\2\2\2Y\u0119\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_"+
		"\u011f\3\2\2\2a\u0121\3\2\2\2c\u0123\3\2\2\2e\u0125\3\2\2\2g\u0127\3\2"+
		"\2\2i\u0129\3\2\2\2k\u012b\3\2\2\2m\u012d\3\2\2\2o\u012f\3\2\2\2q\u0132"+
		"\3\2\2\2s\u0138\3\2\2\2u\u0146\3\2\2\2wx\7=\2\2x\4\3\2\2\2yz\7<\2\2z\6"+
		"\3\2\2\2{|\7.\2\2|\b\3\2\2\2}~\7\60\2\2~\n\3\2\2\2\177\u0080\7*\2\2\u0080"+
		"\f\3\2\2\2\u0081\u0082\7+\2\2\u0082\16\3\2\2\2\u0083\u0084\7?\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\7<\2\2\u0086\u0087\7?\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7-\2\2\u0089\24\3\2\2\2\u008a\u008b\7/\2\2\u008b\26\3\2\2\2\u008c"+
		"\u008d\7,\2\2\u008d\30\3\2\2\2\u008e\u008f\7\61\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\5[.\2\u0091\u0092\5_\60\2\u0092\u0093\5Y-\2\u0093\u0094\5I%\2\u0094"+
		"\u0095\5_\60\2\u0095\u0096\5=\37\2\u0096\u0097\5U+\2\u0097\34\3\2\2\2"+
		"\u0098\u0099\5g\64\2\u0099\u009a\5=\37\2\u009a\u009b\5_\60\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\5? \2\u009d\u009e\5E#\2\u009e\u009f\5I%\2\u009f\u00a0"+
		"\5M\'\2\u00a0\u00a1\5W,\2\u00a1 \3\2\2\2\u00a2\u00a3\5E#\2\u00a3\u00a4"+
		"\5W,\2\u00a4\u00a5\5C\"\2\u00a5\"\3\2\2\2\u00a6\u00a7\5? \2\u00a7\u00a8"+
		"\5Y-\2\u00a8\u00a9\5Y-\2\u00a9\u00aa\5S*\2\u00aa\u00ab\5E#\2\u00ab\u00ac"+
		"\5=\37\2\u00ac\u00ad\5W,\2\u00ad$\3\2\2\2\u00ae\u00af\5A!\2\u00af\u00b0"+
		"\5K&\2\u00b0\u00b1\5=\37\2\u00b1\u00b2\5_\60\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\5M\'\2\u00b4\u00b5\5W,\2\u00b5\u00b6\5c\62\2\u00b6\u00b7\5E#\2\u00b7"+
		"\u00b8\5I%\2\u00b8\u00b9\5E#\2\u00b9\u00ba\5_\60\2\u00ba(\3\2\2\2\u00bb"+
		"\u00bc\5_\60\2\u00bc\u00bd\5E#\2\u00bd\u00be\5=\37\2\u00be\u00bf\5S*\2"+
		"\u00bf*\3\2\2\2\u00c0\u00c1\5C\"\2\u00c1\u00c2\5Y-\2\u00c2\u00c3\5e\63"+
		"\2\u00c3\u00c4\5? \2\u00c4\u00c5\5S*\2\u00c5\u00c6\5E#\2\u00c6,\3\2\2"+
		"\2\u00c7\u00c8\5E#\2\u00c8\u00c9\5k\66\2\u00c9\u00ca\5c\62\2\u00ca\u00cb"+
		"\5E#\2\u00cb\u00cc\5W,\2\u00cc\u00cd\5C\"\2\u00cd\u00ce\5E#\2\u00ce\u00cf"+
		"\5C\"\2\u00cf.\3\2\2\2\u00d0\u00d1\5a\61\2\u00d1\u00d2\5c\62\2\u00d2\u00d3"+
		"\5_\60\2\u00d3\u00d4\5M\'\2\u00d4\u00d5\5W,\2\u00d5\u00d6\5I%\2\u00d6"+
		"\60\3\2\2\2\u00d7\u00d8\5_\60\2\u00d8\u00d9\5E#\2\u00d9\u00da\5=\37\2"+
		"\u00da\u00db\5C\"\2\u00db\62\3\2\2\2\u00dc\u00dd\5_\60\2\u00dd\u00de\5"+
		"E#\2\u00de\u00df\5=\37\2\u00df\u00e0\5C\"\2\u00e0\u00e1\5S*\2\u00e1\u00e2"+
		"\5W,\2\u00e2\64\3\2\2\2\u00e3\u00e4\5i\65\2\u00e4\u00e5\5_\60\2\u00e5"+
		"\u00e6\5M\'\2\u00e6\u00e7\5c\62\2\u00e7\u00e8\5E#\2\u00e8\66\3\2\2\2\u00e9"+
		"\u00ea\5i\65\2\u00ea\u00eb\5_\60\2\u00eb\u00ec\5M\'\2\u00ec\u00ed\5c\62"+
		"\2\u00ed\u00ee\5E#\2\u00ee\u00ef\5S*\2\u00ef\u00f0\5W,\2\u00f08\3\2\2"+
		"\2\u00f1\u00f5\t\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6:\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\4\62;\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc<\3\2\2\2\u00fd\u00fe"+
		"\t\4\2\2\u00fe>\3\2\2\2\u00ff\u0100\t\5\2\2\u0100@\3\2\2\2\u0101\u0102"+
		"\t\6\2\2\u0102B\3\2\2\2\u0103\u0104\t\7\2\2\u0104D\3\2\2\2\u0105\u0106"+
		"\t\b\2\2\u0106F\3\2\2\2\u0107\u0108\t\t\2\2\u0108H\3\2\2\2\u0109\u010a"+
		"\t\n\2\2\u010aJ\3\2\2\2\u010b\u010c\t\13\2\2\u010cL\3\2\2\2\u010d\u010e"+
		"\t\f\2\2\u010eN\3\2\2\2\u010f\u0110\t\r\2\2\u0110P\3\2\2\2\u0111\u0112"+
		"\t\16\2\2\u0112R\3\2\2\2\u0113\u0114\t\17\2\2\u0114T\3\2\2\2\u0115\u0116"+
		"\t\20\2\2\u0116V\3\2\2\2\u0117\u0118\t\21\2\2\u0118X\3\2\2\2\u0119\u011a"+
		"\t\22\2\2\u011aZ\3\2\2\2\u011b\u011c\t\23\2\2\u011c\\\3\2\2\2\u011d\u011e"+
		"\t\24\2\2\u011e^\3\2\2\2\u011f\u0120\t\25\2\2\u0120`\3\2\2\2\u0121\u0122"+
		"\t\26\2\2\u0122b\3\2\2\2\u0123\u0124\t\27\2\2\u0124d\3\2\2\2\u0125\u0126"+
		"\t\30\2\2\u0126f\3\2\2\2\u0127\u0128\t\31\2\2\u0128h\3\2\2\2\u0129\u012a"+
		"\t\32\2\2\u012aj\3\2\2\2\u012b\u012c\t\33\2\2\u012cl\3\2\2\2\u012d\u012e"+
		"\t\34\2\2\u012en\3\2\2\2\u012f\u0130\t\35\2\2\u0130p\3\2\2\2\u0131\u0133"+
		"\t\36\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b9\2\2\u0137r\3\2"+
		"\2\2\u0138\u0139\7*\2\2\u0139\u013a\7,\2\2\u013a\u013e\3\2\2\2\u013b\u013d"+
		"\13\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142"+
		"\7,\2\2\u0142\u0143\7+\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b:\2\2\u0145"+
		"t\3\2\2\2\u0146\u014a\7}\2\2\u0147\u0149\13\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\177\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0150\b;\2\2\u0150v\3\2\2\2\b\2\u00f5\u00fb\u0134\u013e\u014a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}