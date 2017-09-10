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
		CONST=17, BOOLEAN=18, CHAR=19, INTEGER=20, REAL=21, DOUBLE=22, EXTENDED=23, 
		STRING=24, READ=25, READLN=26, WRITE=27, WRITELN=28, IDENTIFIER=29, NUMBER=30, 
		WS=31, OLD_STYLE_COMMENT=32, COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMI", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "EQUALITY", "ASSIGNMENT", 
		"PLUS", "MINUS", "MUL", "DIV", "PROGRAM", "VAR", "BEGIN", "END", "CONST", 
		"BOOLEAN", "CHAR", "INTEGER", "REAL", "DOUBLE", "EXTENDED", "STRING", 
		"READ", "READLN", "WRITE", "WRITELN", "IDENTIFIER", "NUMBER", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "WS", "OLD_STYLE_COMMENT", 
		"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00fc"+
		"\n\36\f\36\16\36\u00ff\13\36\3\37\6\37\u0102\n\37\r\37\16\37\u0103\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\6:\u013b\n:\r:\16"+
		":\u013c\3:\3:\3;\3;\3;\3;\7;\u0145\n;\f;\16;\u0148\13;\3;\3;\3;\3;\3;"+
		"\3<\3<\7<\u0151\n<\f<\16<\u0154\13<\3<\3<\3<\3<\4\u0146\u0152\2=\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2"+
		"A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2"+
		"o\2q\2s!u\"w#\3\2\37\4\2C\\c|\6\2\62;C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\2\u0143"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2"+
		"\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085"+
		"\3\2\2\2\21\u0087\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3"+
		"\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u009a\3\2\2\2\37\u009e\3\2"+
		"\2\2!\u00a4\3\2\2\2#\u00a8\3\2\2\2%\u00ae\3\2\2\2\'\u00b6\3\2\2\2)\u00bb"+
		"\3\2\2\2+\u00c3\3\2\2\2-\u00c8\3\2\2\2/\u00cf\3\2\2\2\61\u00d8\3\2\2\2"+
		"\63\u00df\3\2\2\2\65\u00e4\3\2\2\2\67\u00eb\3\2\2\29\u00f1\3\2\2\2;\u00f9"+
		"\3\2\2\2=\u0101\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E"+
		"\u010b\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u011b\3\2\2\2W\u011d"+
		"\3\2\2\2Y\u011f\3\2\2\2[\u0121\3\2\2\2]\u0123\3\2\2\2_\u0125\3\2\2\2a"+
		"\u0127\3\2\2\2c\u0129\3\2\2\2e\u012b\3\2\2\2g\u012d\3\2\2\2i\u012f\3\2"+
		"\2\2k\u0131\3\2\2\2m\u0133\3\2\2\2o\u0135\3\2\2\2q\u0137\3\2\2\2s\u013a"+
		"\3\2\2\2u\u0140\3\2\2\2w\u014e\3\2\2\2yz\7=\2\2z\4\3\2\2\2{|\7<\2\2|\6"+
		"\3\2\2\2}~\7.\2\2~\b\3\2\2\2\177\u0080\7\60\2\2\u0080\n\3\2\2\2\u0081"+
		"\u0082\7*\2\2\u0082\f\3\2\2\2\u0083\u0084\7+\2\2\u0084\16\3\2\2\2\u0085"+
		"\u0086\7?\2\2\u0086\20\3\2\2\2\u0087\u0088\7<\2\2\u0088\u0089\7?\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7-\2\2\u008b\24\3\2\2\2\u008c\u008d\7/\2\2\u008d"+
		"\26\3\2\2\2\u008e\u008f\7,\2\2\u008f\30\3\2\2\2\u0090\u0091\7\61\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\5]/\2\u0093\u0094\5a\61\2\u0094\u0095\5[.\2\u0095"+
		"\u0096\5K&\2\u0096\u0097\5a\61\2\u0097\u0098\5? \2\u0098\u0099\5W,\2\u0099"+
		"\34\3\2\2\2\u009a\u009b\5i\65\2\u009b\u009c\5? \2\u009c\u009d\5a\61\2"+
		"\u009d\36\3\2\2\2\u009e\u009f\5A!\2\u009f\u00a0\5G$\2\u00a0\u00a1\5K&"+
		"\2\u00a1\u00a2\5O(\2\u00a2\u00a3\5Y-\2\u00a3 \3\2\2\2\u00a4\u00a5\5G$"+
		"\2\u00a5\u00a6\5Y-\2\u00a6\u00a7\5E#\2\u00a7\"\3\2\2\2\u00a8\u00a9\5C"+
		"\"\2\u00a9\u00aa\5[.\2\u00aa\u00ab\5Y-\2\u00ab\u00ac\5c\62\2\u00ac\u00ad"+
		"\5e\63\2\u00ad$\3\2\2\2\u00ae\u00af\5A!\2\u00af\u00b0\5[.\2\u00b0\u00b1"+
		"\5[.\2\u00b1\u00b2\5U+\2\u00b2\u00b3\5G$\2\u00b3\u00b4\5? \2\u00b4\u00b5"+
		"\5Y-\2\u00b5&\3\2\2\2\u00b6\u00b7\5C\"\2\u00b7\u00b8\5M\'\2\u00b8\u00b9"+
		"\5? \2\u00b9\u00ba\5a\61\2\u00ba(\3\2\2\2\u00bb\u00bc\5O(\2\u00bc\u00bd"+
		"\5Y-\2\u00bd\u00be\5e\63\2\u00be\u00bf\5G$\2\u00bf\u00c0\5K&\2\u00c0\u00c1"+
		"\5G$\2\u00c1\u00c2\5a\61\2\u00c2*\3\2\2\2\u00c3\u00c4\5a\61\2\u00c4\u00c5"+
		"\5G$\2\u00c5\u00c6\5? \2\u00c6\u00c7\5U+\2\u00c7,\3\2\2\2\u00c8\u00c9"+
		"\5E#\2\u00c9\u00ca\5[.\2\u00ca\u00cb\5g\64\2\u00cb\u00cc\5A!\2\u00cc\u00cd"+
		"\5U+\2\u00cd\u00ce\5G$\2\u00ce.\3\2\2\2\u00cf\u00d0\5G$\2\u00d0\u00d1"+
		"\5m\67\2\u00d1\u00d2\5e\63\2\u00d2\u00d3\5G$\2\u00d3\u00d4\5Y-\2\u00d4"+
		"\u00d5\5E#\2\u00d5\u00d6\5G$\2\u00d6\u00d7\5E#\2\u00d7\60\3\2\2\2\u00d8"+
		"\u00d9\5c\62\2\u00d9\u00da\5e\63\2\u00da\u00db\5a\61\2\u00db\u00dc\5O"+
		"(\2\u00dc\u00dd\5Y-\2\u00dd\u00de\5K&\2\u00de\62\3\2\2\2\u00df\u00e0\5"+
		"a\61\2\u00e0\u00e1\5G$\2\u00e1\u00e2\5? \2\u00e2\u00e3\5E#\2\u00e3\64"+
		"\3\2\2\2\u00e4\u00e5\5a\61\2\u00e5\u00e6\5G$\2\u00e6\u00e7\5? \2\u00e7"+
		"\u00e8\5E#\2\u00e8\u00e9\5U+\2\u00e9\u00ea\5Y-\2\u00ea\66\3\2\2\2\u00eb"+
		"\u00ec\5k\66\2\u00ec\u00ed\5a\61\2\u00ed\u00ee\5O(\2\u00ee\u00ef\5e\63"+
		"\2\u00ef\u00f0\5G$\2\u00f08\3\2\2\2\u00f1\u00f2\5k\66\2\u00f2\u00f3\5"+
		"a\61\2\u00f3\u00f4\5O(\2\u00f4\u00f5\5e\63\2\u00f5\u00f6\5G$\2\u00f6\u00f7"+
		"\5U+\2\u00f7\u00f8\5Y-\2\u00f8:\3\2\2\2\u00f9\u00fd\t\2\2\2\u00fa\u00fc"+
		"\t\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe<\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\4\62;\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104>\3\2\2\2\u0105\u0106\t\4\2\2\u0106@\3\2\2\2\u0107\u0108"+
		"\t\5\2\2\u0108B\3\2\2\2\u0109\u010a\t\6\2\2\u010aD\3\2\2\2\u010b\u010c"+
		"\t\7\2\2\u010cF\3\2\2\2\u010d\u010e\t\b\2\2\u010eH\3\2\2\2\u010f\u0110"+
		"\t\t\2\2\u0110J\3\2\2\2\u0111\u0112\t\n\2\2\u0112L\3\2\2\2\u0113\u0114"+
		"\t\13\2\2\u0114N\3\2\2\2\u0115\u0116\t\f\2\2\u0116P\3\2\2\2\u0117\u0118"+
		"\t\r\2\2\u0118R\3\2\2\2\u0119\u011a\t\16\2\2\u011aT\3\2\2\2\u011b\u011c"+
		"\t\17\2\2\u011cV\3\2\2\2\u011d\u011e\t\20\2\2\u011eX\3\2\2\2\u011f\u0120"+
		"\t\21\2\2\u0120Z\3\2\2\2\u0121\u0122\t\22\2\2\u0122\\\3\2\2\2\u0123\u0124"+
		"\t\23\2\2\u0124^\3\2\2\2\u0125\u0126\t\24\2\2\u0126`\3\2\2\2\u0127\u0128"+
		"\t\25\2\2\u0128b\3\2\2\2\u0129\u012a\t\26\2\2\u012ad\3\2\2\2\u012b\u012c"+
		"\t\27\2\2\u012cf\3\2\2\2\u012d\u012e\t\30\2\2\u012eh\3\2\2\2\u012f\u0130"+
		"\t\31\2\2\u0130j\3\2\2\2\u0131\u0132\t\32\2\2\u0132l\3\2\2\2\u0133\u0134"+
		"\t\33\2\2\u0134n\3\2\2\2\u0135\u0136\t\34\2\2\u0136p\3\2\2\2\u0137\u0138"+
		"\t\35\2\2\u0138r\3\2\2\2\u0139\u013b\t\36\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\b:\2\2\u013ft\3\2\2\2\u0140\u0141\7*\2\2\u0141\u0142"+
		"\7,\2\2\u0142\u0146\3\2\2\2\u0143\u0145\13\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7,\2\2\u014a\u014b\7+\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\b;\2\2\u014dv\3\2\2\2\u014e\u0152\7}\2\2\u014f\u0151"+
		"\13\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156"+
		"\7\177\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b<\2\2\u0158x\3\2\2\2\b\2\u00fd"+
		"\u0103\u013c\u0146\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}