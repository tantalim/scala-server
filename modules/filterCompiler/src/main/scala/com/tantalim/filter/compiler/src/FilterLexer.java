// Generated from /Users/trevorallred/projects/tantalim/scala/modules/filterCompiler/src/main/scala/com/tantalim/filter/compiler/Filter.g4 by ANTLR 4.5
package com.tantalim.filter.compiler.src;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, TRUE=34, FALSE=35, AND=36, OR=37, NOW=38, FIELD=39, 
		INT=40, FLOAT=41, STRING=42, SPACE=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"TRUE", "FALSE", "AND", "OR", "NOW", "FIELD", "INT", "FLOAT", "STRING", 
		"SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'-'", "','", "'='", "'!='", "'Equals'", "'NotEquals'", 
		"'In'", "'NotIn'", "'BeginsWith'", "'EndsWith'", "'Contains'", "'>'", 
		"'>='", "'GreaterThan'", "'GreaterThanOrEqual'", "'<'", "'<='", "'LessThan'", 
		"'LessThanOrEqual'", "'Before'", "'OnOrBefore'", "'After'", "'OnOrAfter'", 
		"'IsEmpty'", "'s'", "'m'", "'h'", "'D'", "'W'", "'M'", "'Y'", "'true'", 
		"'false'", null, null, "'NOW'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
		"AND", "OR", "NOW", "FIELD", "INT", "FLOAT", "STRING", "SPACE"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Filter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0129\n%\3&\3&\3&\3&\5&\u012f\n&\3"+
		"\'\3\'\3\'\3\'\3(\3(\7(\u0137\n(\f(\16(\u013a\13(\3)\6)\u013d\n)\r)\16"+
		")\u013e\3*\6*\u0142\n*\r*\16*\u0143\3*\3*\7*\u0148\n*\f*\16*\u014b\13"+
		"*\3*\3*\6*\u014f\n*\r*\16*\u0150\5*\u0153\n*\3+\3+\7+\u0157\n+\f+\16+"+
		"\u015a\13+\3+\3+\3+\7+\u015f\n+\f+\16+\u0162\13+\3+\5+\u0165\n+\3,\3,"+
		"\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\b\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\62;\5\2\f\f\17\17$$\6\2\f\f\17\17$$))\5\2\13\f\17\17\"\"\u0174"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3"+
		"\2\2\2\rc\3\2\2\2\17f\3\2\2\2\21m\3\2\2\2\23w\3\2\2\2\25z\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u008b\3\2\2\2\33\u0094\3\2\2\2\35\u009d\3\2\2\2\37\u009f\3"+
		"\2\2\2!\u00a2\3\2\2\2#\u00ae\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c6"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00df\3\2\2\2/\u00e6\3\2\2\2\61\u00f1\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u0101\3\2\2\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d"+
		"\3\2\2\2=\u010f\3\2\2\2?\u0111\3\2\2\2A\u0113\3\2\2\2C\u0115\3\2\2\2E"+
		"\u0117\3\2\2\2G\u011c\3\2\2\2I\u0128\3\2\2\2K\u012e\3\2\2\2M\u0130\3\2"+
		"\2\2O\u0134\3\2\2\2Q\u013c\3\2\2\2S\u0152\3\2\2\2U\u0164\3\2\2\2W\u0166"+
		"\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2[\\\7+\2\2\\\6\3\2\2\2]^\7/\2\2^\b\3\2\2\2"+
		"_`\7.\2\2`\n\3\2\2\2ab\7?\2\2b\f\3\2\2\2cd\7#\2\2de\7?\2\2e\16\3\2\2\2"+
		"fg\7G\2\2gh\7s\2\2hi\7w\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2l\20\3\2\2\2mn\7"+
		"P\2\2no\7q\2\2op\7v\2\2pq\7G\2\2qr\7s\2\2rs\7w\2\2st\7c\2\2tu\7n\2\2u"+
		"v\7u\2\2v\22\3\2\2\2wx\7K\2\2xy\7p\2\2y\24\3\2\2\2z{\7P\2\2{|\7q\2\2|"+
		"}\7v\2\2}~\7K\2\2~\177\7p\2\2\177\26\3\2\2\2\u0080\u0081\7D\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7i\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7u\2\2\u0086\u0087\7Y\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u008a\7j\2\2\u008a\30\3\2\2\2\u008b\u008c\7G\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7f\2\2\u008e\u008f\7u\2\2\u008f\u0090\7Y\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7v\2\2\u0092\u0093\7j\2\2\u0093\32\3\2\2\2\u0094"+
		"\u0095\7E\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098\u0099\7c\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7u\2\2\u009c\34\3\2\2\2\u009d\u009e\7@\2\2\u009e\36\3\2\2\2\u009f\u00a0"+
		"\7@\2\2\u00a0\u00a1\7?\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7I\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7j\2\2"+
		"\u00ab\u00ac\7c\2\2\u00ac\u00ad\7p\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7I"+
		"\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7V\2\2\u00b6"+
		"\u00b7\7j\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7Q\2\2"+
		"\u00ba\u00bb\7t\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7s\2\2\u00bd\u00be"+
		"\7w\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0$\3\2\2\2\u00c1\u00c2"+
		"\7>\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5(\3"+
		"\2\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7u\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7c\2\2"+
		"\u00cd\u00ce\7p\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7g\2"+
		"\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7V\2\2\u00d4\u00d5"+
		"\7j\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7Q\2\2\u00d8"+
		"\u00d9\7t\2\2\u00d9\u00da\7G\2\2\u00da\u00db\7s\2\2\u00db\u00dc\7w\2\2"+
		"\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de,\3\2\2\2\u00df\u00e0\7D\2"+
		"\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7g\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7D\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7t\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7"+
		"h\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6\62"+
		"\3\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7Q\2\2\u00fa"+
		"\u00fb\7t\2\2\u00fb\u00fc\7C\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100\64\3\2\2\2\u0101\u0102\7"+
		"K\2\2\u0102\u0103\7u\2\2\u0103\u0104\7G\2\2\u0104\u0105\7o\2\2\u0105\u0106"+
		"\7r\2\2\u0106\u0107\7v\2\2\u0107\u0108\7{\2\2\u0108\66\3\2\2\2\u0109\u010a"+
		"\7u\2\2\u010a8\3\2\2\2\u010b\u010c\7o\2\2\u010c:\3\2\2\2\u010d\u010e\7"+
		"j\2\2\u010e<\3\2\2\2\u010f\u0110\7F\2\2\u0110>\3\2\2\2\u0111\u0112\7Y"+
		"\2\2\u0112@\3\2\2\2\u0113\u0114\7O\2\2\u0114B\3\2\2\2\u0115\u0116\7[\2"+
		"\2\u0116D\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7"+
		"w\2\2\u011a\u011b\7g\2\2\u011bF\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7n\2\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2\u0121"+
		"H\3\2\2\2\u0122\u0123\7c\2\2\u0123\u0124\7p\2\2\u0124\u0129\7f\2\2\u0125"+
		"\u0126\7C\2\2\u0126\u0127\7P\2\2\u0127\u0129\7F\2\2\u0128\u0122\3\2\2"+
		"\2\u0128\u0125\3\2\2\2\u0129J\3\2\2\2\u012a\u012b\7q\2\2\u012b\u012f\7"+
		"t\2\2\u012c\u012d\7Q\2\2\u012d\u012f\7T\2\2\u012e\u012a\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012fL\3\2\2\2\u0130\u0131\7P\2\2\u0131\u0132\7Q\2\2\u0132"+
		"\u0133\7Y\2\2\u0133N\3\2\2\2\u0134\u0138\t\2\2\2\u0135\u0137\t\3\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139P\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\t\4\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"R\3\2\2\2\u0140\u0142\t\4\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0149"+
		"\7\60\2\2\u0146\u0148\t\4\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0153\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\7\60\2\2\u014d\u014f\t\4\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u0141\3\2\2\2\u0152\u014c\3\2\2\2\u0153T\3\2\2\2\u0154"+
		"\u0158\7$\2\2\u0155\u0157\n\5\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u0165\7$\2\2\u015c\u0160\7)\2\2\u015d\u015f\n\6\2"+
		"\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7)\2\2\u0164"+
		"\u0154\3\2\2\2\u0164\u015c\3\2\2\2\u0165V\3\2\2\2\u0166\u0167\t\7\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0169\b,\2\2\u0169X\3\2\2\2\16\2\u0128\u012e"+
		"\u0138\u013e\u0143\u0149\u0150\u0152\u0158\u0160\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}