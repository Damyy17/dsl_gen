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
		T__9=10, WS=11, LPAREN=12, RPAREN=13, COOMA=14, SEMICOLON=15, SYMBOLS=16, 
		DQ=17, COMMENT=18, LINE_COMMENT=19, BIGALPHA=20, SMALLALPHA=21, NUMBER=22, 
		STRING=23, TRUE=24, FALSE=25, AND=26, OR=27, CROSS_OPERATION=28, GENES=29, 
		PARENT=30, GENERATION=31, SET=32, DOM=33, PHENOTYPE=34, CODOMINANCE=35, 
		LOCATION=36, LABEL=37, GENOTYPE=38, FREQUENCY=39, PUNNET=40, VALUE=41, 
		FIND=42, CROSS=43, PRED=44, ESTIMATE=45, IF=46, THEN=47, ELSE=48, END=49, 
		WHILE=50, DO=51, ALL=52, PRINT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "WS", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", 
			"COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "DIGIT", 
			"EXP", "ESC", "STRING", "TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", 
			"GENES", "PARENT", "GENERATION", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", 
			"LOCATION", "LABEL", "GENOTYPE", "FREQUENCY", "PUNNET", "VALUE", "FIND", 
			"CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "DO", 
			"ALL", "PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'?'", null, "'('", "')'", "','", "';'", null, "'\"'", null, null, null, 
			null, null, null, "'true'", "'false'", "'and'", "'or'", "'*'", "'genes'", 
			"'parents'", "'generation'", "'set'", "'dom'", "'phenotype'", "'codominance'", 
			"'location'", "'label'", "'genotype'", "'frequency '", "'square'", "'value'", 
			"'find'", "'cross'", "'pred'", "'estimate'", "'if'", "'then'", "'else'", 
			"'end'", "'while'", "'do'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", "COMMENT", 
			"LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "STRING", "TRUE", 
			"FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", 
			"SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", "GENOTYPE", 
			"FREQUENCY", "PUNNET", "VALUE", "FIND", "CROSS", "PRED", "ESTIMATE", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "ALL", "PRINT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\6\f\u008e\n\f\r\f\16\f\u008f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00a4"+
		"\n\23\f\23\16\23\u00a7\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00b0"+
		"\n\24\f\24\16\24\u00b3\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27\u00bc"+
		"\n\27\3\27\3\27\3\27\6\27\u00c1\n\27\r\27\16\27\u00c2\3\27\5\27\u00c6"+
		"\n\27\3\27\5\27\u00c9\n\27\3\27\3\27\3\27\3\27\5\27\u00cf\n\27\3\27\5"+
		"\27\u00d2\n\27\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16\30\u00da\13\30\5"+
		"\30\u00dc\n\30\3\31\3\31\5\31\u00e0\n\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\7\33\u00ea\n\33\f\33\16\33\u00ed\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\3\u00a5\2:\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\67\329\33;\34=\35?\36"+
		"A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67"+
		"\3\2\n\5\2\13\f\17\17\"\"\5\2\60\61==AA\4\2\f\f\17\17\3\2\62;\3\2\63;"+
		"\4\2GGgg\4\2--//\6\2\f\f\17\17$$^^\2\u01b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\tz\3\2"+
		"\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23"+
		"\u0087\3\2\2\2\25\u008a\3\2\2\2\27\u008d\3\2\2\2\31\u0093\3\2\2\2\33\u0095"+
		"\3\2\2\2\35\u0097\3\2\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2"+
		"\2%\u009f\3\2\2\2\'\u00ab\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00d1"+
		"\3\2\2\2/\u00db\3\2\2\2\61\u00dd\3\2\2\2\63\u00e3\3\2\2\2\65\u00e6\3\2"+
		"\2\2\67\u00f0\3\2\2\29\u00f5\3\2\2\2;\u00fb\3\2\2\2=\u00ff\3\2\2\2?\u0102"+
		"\3\2\2\2A\u0104\3\2\2\2C\u010a\3\2\2\2E\u0112\3\2\2\2G\u011d\3\2\2\2I"+
		"\u0121\3\2\2\2K\u0125\3\2\2\2M\u012f\3\2\2\2O\u013b\3\2\2\2Q\u0144\3\2"+
		"\2\2S\u014a\3\2\2\2U\u0153\3\2\2\2W\u015e\3\2\2\2Y\u0165\3\2\2\2[\u016b"+
		"\3\2\2\2]\u0170\3\2\2\2_\u0176\3\2\2\2a\u017b\3\2\2\2c\u0184\3\2\2\2e"+
		"\u0187\3\2\2\2g\u018c\3\2\2\2i\u0191\3\2\2\2k\u0195\3\2\2\2m\u019b\3\2"+
		"\2\2o\u019e\3\2\2\2q\u01a2\3\2\2\2st\7@\2\2t\4\3\2\2\2uv\7>\2\2v\6\3\2"+
		"\2\2wx\7>\2\2xy\7?\2\2y\b\3\2\2\2z{\7@\2\2{|\7?\2\2|\n\3\2\2\2}~\7?\2"+
		"\2~\177\7?\2\2\177\f\3\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7?\2\2\u0082"+
		"\16\3\2\2\2\u0083\u0084\7?\2\2\u0084\20\3\2\2\2\u0085\u0086\7<\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089\7@\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7A\2\2\u008b\26\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\b\f\2\2\u0092\30\3\2\2\2\u0093\u0094\7*\2\2\u0094"+
		"\32\3\2\2\2\u0095\u0096\7+\2\2\u0096\34\3\2\2\2\u0097\u0098\7.\2\2\u0098"+
		"\36\3\2\2\2\u0099\u009a\7=\2\2\u009a \3\2\2\2\u009b\u009c\t\3\2\2\u009c"+
		"\"\3\2\2\2\u009d\u009e\7$\2\2\u009e$\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00b1"+
		"\3\2\2\2\u00ae\u00b0\n\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\b\24\3\2\u00b5(\3\2\2\2\u00b6\u00b7\4C\\\2\u00b7*\3\2"+
		"\2\2\u00b8\u00b9\4c|\2\u00b9,\3\2\2\2\u00ba\u00bc\7/\2\2\u00bb\u00ba\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\5/\30\2\u00be"+
		"\u00c0\7\60\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c6\5\61\31\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d2\3"+
		"\2\2\2\u00c7\u00c9\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\5/\30\2\u00cb\u00cc\5\61\31\2\u00cc\u00d2\3"+
		"\2\2\2\u00cd\u00cf\7/\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\5/\30\2\u00d1\u00bb\3\2\2\2\u00d1\u00c8\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d2.\3\2\2\2\u00d3\u00dc\7\62\2\2\u00d4\u00d8"+
		"\t\6\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc\60\3\2\2\2\u00dd\u00df"+
		"\t\7\2\2\u00de\u00e0\t\b\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\5/\30\2\u00e2\62\3\2\2\2\u00e3\u00e4\7^\2\2"+
		"\u00e4\u00e5\13\2\2\2\u00e5\64\3\2\2\2\u00e6\u00eb\7$\2\2\u00e7\u00ea"+
		"\5\63\32\2\u00e8\u00ea\n\t\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7$\2\2\u00ef\66\3\2\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f48\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2"+
		"\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7"+
		"c\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7f\2\2\u00fe<\3\2\2\2\u00ff\u0100"+
		"\7q\2\2\u0100\u0101\7t\2\2\u0101>\3\2\2\2\u0102\u0103\7,\2\2\u0103@\3"+
		"\2\2\2\u0104\u0105\7i\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7u\2\2\u0109B\3\2\2\2\u010a\u010b\7r\2\2\u010b"+
		"\u010c\7c\2\2\u010c\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2"+
		"\u010f\u0110\7v\2\2\u0110\u0111\7u\2\2\u0111D\3\2\2\2\u0112\u0113\7i\2"+
		"\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0118\7c\2\2\u0118\u0119\7v\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7p\2\2\u011cF\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7v\2\2\u0120H\3\2\2\2\u0121\u0122\7f\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7o\2\2\u0124J\3\2\2\2\u0125\u0126\7r\2\2\u0126"+
		"\u0127\7j\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a\7q\2\2"+
		"\u012a\u012b\7v\2\2\u012b\u012c\7{\2\2\u012c\u012d\7r\2\2\u012d\u012e"+
		"\7g\2\2\u012eL\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7q\2\2\u0131\u0132"+
		"\7f\2\2\u0132\u0133\7q\2\2\u0133\u0134\7o\2\2\u0134\u0135\7k\2\2\u0135"+
		"\u0136\7p\2\2\u0136\u0137\7c\2\2\u0137\u0138\7p\2\2\u0138\u0139\7e\2\2"+
		"\u0139\u013a\7g\2\2\u013aN\3\2\2\2\u013b\u013c\7n\2\2\u013c\u013d\7q\2"+
		"\2\u013d\u013e\7e\2\2\u013e\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141"+
		"\7k\2\2\u0141\u0142\7q\2\2\u0142\u0143\7p\2\2\u0143P\3\2\2\2\u0144\u0145"+
		"\7n\2\2\u0145\u0146\7c\2\2\u0146\u0147\7d\2\2\u0147\u0148\7g\2\2\u0148"+
		"\u0149\7n\2\2\u0149R\3\2\2\2\u014a\u014b\7i\2\2\u014b\u014c\7g\2\2\u014c"+
		"\u014d\7p\2\2\u014d\u014e\7q\2\2\u014e\u014f\7v\2\2\u014f\u0150\7{\2\2"+
		"\u0150\u0151\7r\2\2\u0151\u0152\7g\2\2\u0152T\3\2\2\2\u0153\u0154\7h\2"+
		"\2\u0154\u0155\7t\2\2\u0155\u0156\7g\2\2\u0156\u0157\7s\2\2\u0157\u0158"+
		"\7w\2\2\u0158\u0159\7g\2\2\u0159\u015a\7p\2\2\u015a\u015b\7e\2\2\u015b"+
		"\u015c\7{\2\2\u015c\u015d\7\"\2\2\u015dV\3\2\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7s\2\2\u0160\u0161\7w\2\2\u0161\u0162\7c\2\2\u0162\u0163\7t\2\2"+
		"\u0163\u0164\7g\2\2\u0164X\3\2\2\2\u0165\u0166\7x\2\2\u0166\u0167\7c\2"+
		"\2\u0167\u0168\7n\2\2\u0168\u0169\7w\2\2\u0169\u016a\7g\2\2\u016aZ\3\2"+
		"\2\2\u016b\u016c\7h\2\2\u016c\u016d\7k\2\2\u016d\u016e\7p\2\2\u016e\u016f"+
		"\7f\2\2\u016f\\\3\2\2\2\u0170\u0171\7e\2\2\u0171\u0172\7t\2\2\u0172\u0173"+
		"\7q\2\2\u0173\u0174\7u\2\2\u0174\u0175\7u\2\2\u0175^\3\2\2\2\u0176\u0177"+
		"\7r\2\2\u0177\u0178\7t\2\2\u0178\u0179\7g\2\2\u0179\u017a\7f\2\2\u017a"+
		"`\3\2\2\2\u017b\u017c\7g\2\2\u017c\u017d\7u\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7k\2\2\u017f\u0180\7o\2\2\u0180\u0181\7c\2\2\u0181\u0182\7v\2\2"+
		"\u0182\u0183\7g\2\2\u0183b\3\2\2\2\u0184\u0185\7k\2\2\u0185\u0186\7h\2"+
		"\2\u0186d\3\2\2\2\u0187\u0188\7v\2\2\u0188\u0189\7j\2\2\u0189\u018a\7"+
		"g\2\2\u018a\u018b\7p\2\2\u018bf\3\2\2\2\u018c\u018d\7g\2\2\u018d\u018e"+
		"\7n\2\2\u018e\u018f\7u\2\2\u018f\u0190\7g\2\2\u0190h\3\2\2\2\u0191\u0192"+
		"\7g\2\2\u0192\u0193\7p\2\2\u0193\u0194\7f\2\2\u0194j\3\2\2\2\u0195\u0196"+
		"\7y\2\2\u0196\u0197\7j\2\2\u0197\u0198\7k\2\2\u0198\u0199\7n\2\2\u0199"+
		"\u019a\7g\2\2\u019al\3\2\2\2\u019b\u019c\7f\2\2\u019c\u019d\7q\2\2\u019d"+
		"n\3\2\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7n\2\2\u01a1"+
		"p\3\2\2\2\u01a2\u01a3\7r\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7k\2\2\u01a5"+
		"\u01a6\7p\2\2\u01a6\u01a7\7v\2\2\u01a7r\3\2\2\2\21\2\u008f\u00a5\u00b1"+
		"\u00bb\u00c2\u00c5\u00c8\u00ce\u00d1\u00d8\u00db\u00df\u00e9\u00eb\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}