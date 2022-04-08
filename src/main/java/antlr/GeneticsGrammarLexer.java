// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneticsGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WS=12, LPAREN=13, RPAREN=14, COOMA=15, SEMICOLON=16, 
		SYMBOLS=17, DQ=18, COMMENT=19, LINE_COMMENT=20, BIGALPHA=21, SMALLALPHA=22, 
		NUMBER=23, STRING=24, TRUE=25, FALSE=26, AND=27, OR=28, CROSS_OPERATION=29, 
		GENES=30, PARENT=31, GENERATION=32, SET=33, DOM=34, PHENOTYPE=35, CODOMINANCE=36, 
		LOCATION=37, LABEL=38, GENOTYPE=39, FREQUENCY=40, PUNNET=41, FIND=42, 
		CROSS=43, PRED=44, ESTIMATE=45, IF=46, THEN=47, ELSE=48, END=49, WHILE=50, 
		DO=51, ALL=52, PRINT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "WS", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", 
			"DQ", "COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", 
			"DIGIT", "EXP", "ESC", "STRING", "TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", 
			"GENES", "PARENT", "GENERATION", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", 
			"LOCATION", "LABEL", "GENOTYPE", "FREQUENCY", "PUNNET", "FIND", "CROSS", 
			"PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "ALL", 
			"PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'*'", "'?'", null, "'('", "')'", "','", "';'", null, "'\"'", null, null, 
			null, null, null, null, "'true'", "'false'", "'and'", "'or'", "'x'", 
			"'genes'", "'parents'", "'generation'", "'set'", "'dom'", "'phenotype'", 
			"'codominance'", "'location'", "'label'", "'genotype'", "'frequency '", 
			"'square'", "'find'", "'cross'", "'pred'", "'estimate'", "'if'", "'then'", 
			"'else'", "'end'", "'while'", "'do'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", "COMMENT", 
			"LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "STRING", "TRUE", 
			"FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", 
			"SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", "GENOTYPE", 
			"FREQUENCY", "PUNNET", "FIND", "CROSS", "PRED", "ESTIMATE", "IF", "THEN", 
			"ELSE", "END", "WHILE", "DO", "ALL", "PRINT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GeneticsGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GeneticsGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\6\r\u0090\n\r\r\r\16\r\u0091\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00a6\n\24\f\24\16\24\u00a9\13\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u00b2\n\25\f\25\16\25\u00b5\13\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\5\30\u00be\n\30\3\30\3\30\3\30\6\30\u00c3\n\30\r\30\16\30\u00c4"+
		"\3\30\5\30\u00c8\n\30\3\30\5\30\u00cb\n\30\3\30\3\30\3\30\3\30\5\30\u00d1"+
		"\n\30\3\30\5\30\u00d4\n\30\3\31\3\31\3\31\7\31\u00d9\n\31\f\31\16\31\u00dc"+
		"\13\31\5\31\u00de\n\31\3\32\3\32\5\32\u00e2\n\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\7\34\u00ec\n\34\f\34\16\34\u00ef\13\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\38\38\39\39\39\39\39\39\3\u00a7\2:\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q"+
		"\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67\3\2\n\5\2\13\f\17\17"+
		"\"\"\5\2\60\61==AA\4\2\f\f\17\17\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\f"+
		"\f\17\17$$^^\2\u01af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\tz\3\2\2\2\13}\3\2\2\2\r\u0080"+
		"\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25\u008a\3"+
		"\2\2\2\27\u008c\3\2\2\2\31\u008f\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2"+
		"\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00d3\3\2\2\2\61"+
		"\u00dd\3\2\2\2\63\u00df\3\2\2\2\65\u00e5\3\2\2\2\67\u00e8\3\2\2\29\u00f2"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00fd\3\2\2\2?\u0101\3\2\2\2A\u0104\3\2\2\2C"+
		"\u0106\3\2\2\2E\u010c\3\2\2\2G\u0114\3\2\2\2I\u011f\3\2\2\2K\u0123\3\2"+
		"\2\2M\u0127\3\2\2\2O\u0131\3\2\2\2Q\u013d\3\2\2\2S\u0146\3\2\2\2U\u014c"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0160\3\2\2\2[\u0167\3\2\2\2]\u016c\3\2\2\2_"+
		"\u0172\3\2\2\2a\u0177\3\2\2\2c\u0180\3\2\2\2e\u0183\3\2\2\2g\u0188\3\2"+
		"\2\2i\u018d\3\2\2\2k\u0191\3\2\2\2m\u0197\3\2\2\2o\u019a\3\2\2\2q\u019e"+
		"\3\2\2\2st\7@\2\2t\4\3\2\2\2uv\7>\2\2v\6\3\2\2\2wx\7>\2\2xy\7?\2\2y\b"+
		"\3\2\2\2z{\7@\2\2{|\7?\2\2|\n\3\2\2\2}~\7?\2\2~\177\7?\2\2\177\f\3\2\2"+
		"\2\u0080\u0081\7#\2\2\u0081\u0082\7?\2\2\u0082\16\3\2\2\2\u0083\u0084"+
		"\7?\2\2\u0084\20\3\2\2\2\u0085\u0086\7<\2\2\u0086\22\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\u0089\7@\2\2\u0089\24\3\2\2\2\u008a\u008b\7,\2\2\u008b\26"+
		"\3\2\2\2\u008c\u008d\7A\2\2\u008d\30\3\2\2\2\u008e\u0090\t\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\r\2\2\u0094\32\3\2\2\2\u0095\u0096"+
		"\7*\2\2\u0096\34\3\2\2\2\u0097\u0098\7+\2\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7.\2\2\u009a \3\2\2\2\u009b\u009c\7=\2\2\u009c\"\3\2\2\2\u009d\u009e"+
		"\t\3\2\2\u009e$\3\2\2\2\u009f\u00a0\7$\2\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\7\61\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\13\2\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\u00ac\7\61\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7\61\2"+
		"\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\b\25\3\2\u00b7*\3\2\2\2\u00b8\u00b9\4C\\\2"+
		"\u00b9,\3\2\2\2\u00ba\u00bb\4c|\2\u00bb.\3\2\2\2\u00bc\u00be\7/\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5\61"+
		"\31\2\u00c0\u00c2\7\60\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c8\5\63\32\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00d4\3\2\2\2\u00c9\u00cb\7/\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\61\31\2\u00cd\u00ce\5\63\32\2\u00ce"+
		"\u00d4\3\2\2\2\u00cf\u00d1\7/\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\5\61\31\2\u00d3\u00bd\3\2\2\2\u00d3"+
		"\u00ca\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\60\3\2\2\2\u00d5\u00de\7\62\2"+
		"\2\u00d6\u00da\t\6\2\2\u00d7\u00d9\t\5\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de\62\3\2\2"+
		"\2\u00df\u00e1\t\7\2\2\u00e0\u00e2\t\b\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\61\31\2\u00e4\64\3\2\2\2\u00e5"+
		"\u00e6\7^\2\2\u00e6\u00e7\13\2\2\2\u00e7\66\3\2\2\2\u00e8\u00ed\7$\2\2"+
		"\u00e9\u00ec\5\65\33\2\u00ea\u00ec\n\t\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$\2\2\u00f18\3\2\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6:\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2"+
		"\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7"+
		"c\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100>\3\2\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7t\2\2\u0103@\3\2\2\2\u0104\u0105\7z\2\2\u0105B\3"+
		"\2\2\2\u0106\u0107\7i\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7u\2\2\u010bD\3\2\2\2\u010c\u010d\7r\2\2\u010d"+
		"\u010e\7c\2\2\u010e\u010f\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2"+
		"\u0111\u0112\7v\2\2\u0112\u0113\7u\2\2\u0113F\3\2\2\2\u0114\u0115\7i\2"+
		"\2\u0115\u0116\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118\7g\2\2\u0118\u0119"+
		"\7t\2\2\u0119\u011a\7c\2\2\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7p\2\2\u011eH\3\2\2\2\u011f\u0120\7u\2\2\u0120"+
		"\u0121\7g\2\2\u0121\u0122\7v\2\2\u0122J\3\2\2\2\u0123\u0124\7f\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7o\2\2\u0126L\3\2\2\2\u0127\u0128\7r\2\2\u0128"+
		"\u0129\7j\2\2\u0129\u012a\7g\2\2\u012a\u012b\7p\2\2\u012b\u012c\7q\2\2"+
		"\u012c\u012d\7v\2\2\u012d\u012e\7{\2\2\u012e\u012f\7r\2\2\u012f\u0130"+
		"\7g\2\2\u0130N\3\2\2\2\u0131\u0132\7e\2\2\u0132\u0133\7q\2\2\u0133\u0134"+
		"\7f\2\2\u0134\u0135\7q\2\2\u0135\u0136\7o\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u0139\7c\2\2\u0139\u013a\7p\2\2\u013a\u013b\7e\2\2"+
		"\u013b\u013c\7g\2\2\u013cP\3\2\2\2\u013d\u013e\7n\2\2\u013e\u013f\7q\2"+
		"\2\u013f\u0140\7e\2\2\u0140\u0141\7c\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7k\2\2\u0143\u0144\7q\2\2\u0144\u0145\7p\2\2\u0145R\3\2\2\2\u0146\u0147"+
		"\7n\2\2\u0147\u0148\7c\2\2\u0148\u0149\7d\2\2\u0149\u014a\7g\2\2\u014a"+
		"\u014b\7n\2\2\u014bT\3\2\2\2\u014c\u014d\7i\2\2\u014d\u014e\7g\2\2\u014e"+
		"\u014f\7p\2\2\u014f\u0150\7q\2\2\u0150\u0151\7v\2\2\u0151\u0152\7{\2\2"+
		"\u0152\u0153\7r\2\2\u0153\u0154\7g\2\2\u0154V\3\2\2\2\u0155\u0156\7h\2"+
		"\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2\u0158\u0159\7s\2\2\u0159\u015a"+
		"\7w\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c\u015d\7e\2\2\u015d"+
		"\u015e\7{\2\2\u015e\u015f\7\"\2\2\u015fX\3\2\2\2\u0160\u0161\7u\2\2\u0161"+
		"\u0162\7s\2\2\u0162\u0163\7w\2\2\u0163\u0164\7c\2\2\u0164\u0165\7t\2\2"+
		"\u0165\u0166\7g\2\2\u0166Z\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169\7k\2"+
		"\2\u0169\u016a\7p\2\2\u016a\u016b\7f\2\2\u016b\\\3\2\2\2\u016c\u016d\7"+
		"e\2\2\u016d\u016e\7t\2\2\u016e\u016f\7q\2\2\u016f\u0170\7u\2\2\u0170\u0171"+
		"\7u\2\2\u0171^\3\2\2\2\u0172\u0173\7r\2\2\u0173\u0174\7t\2\2\u0174\u0175"+
		"\7g\2\2\u0175\u0176\7f\2\2\u0176`\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179"+
		"\7u\2\2\u0179\u017a\7v\2\2\u017a\u017b\7k\2\2\u017b\u017c\7o\2\2\u017c"+
		"\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e\u017f\7g\2\2\u017fb\3\2\2\2\u0180"+
		"\u0181\7k\2\2\u0181\u0182\7h\2\2\u0182d\3\2\2\2\u0183\u0184\7v\2\2\u0184"+
		"\u0185\7j\2\2\u0185\u0186\7g\2\2\u0186\u0187\7p\2\2\u0187f\3\2\2\2\u0188"+
		"\u0189\7g\2\2\u0189\u018a\7n\2\2\u018a\u018b\7u\2\2\u018b\u018c\7g\2\2"+
		"\u018ch\3\2\2\2\u018d\u018e\7g\2\2\u018e\u018f\7p\2\2\u018f\u0190\7f\2"+
		"\2\u0190j\3\2\2\2\u0191\u0192\7y\2\2\u0192\u0193\7j\2\2\u0193\u0194\7"+
		"k\2\2\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196l\3\2\2\2\u0197\u0198"+
		"\7f\2\2\u0198\u0199\7q\2\2\u0199n\3\2\2\2\u019a\u019b\7c\2\2\u019b\u019c"+
		"\7n\2\2\u019c\u019d\7n\2\2\u019dp\3\2\2\2\u019e\u019f\7r\2\2\u019f\u01a0"+
		"\7t\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7v\2\2\u01a3"+
		"r\3\2\2\2\21\2\u0091\u00a7\u00b3\u00bd\u00c4\u00c7\u00ca\u00d0\u00d3\u00da"+
		"\u00dd\u00e1\u00eb\u00ed\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}