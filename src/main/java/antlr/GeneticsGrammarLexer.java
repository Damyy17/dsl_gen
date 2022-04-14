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
		T__9=10, WS=11, WHITESPACE=12, LPAREN=13, RPAREN=14, COOMA=15, SEMICOLON=16, 
		SYMBOLS=17, DQ=18, COMMENT=19, LINE_COMMENT=20, BIGALPHA=21, SMALLALPHA=22, 
		NUMBER=23, STRING=24, TRUE=25, FALSE=26, AND=27, OR=28, CROSS_OPERATION=29, 
		GENES=30, PARENT=31, GENERATION=32, DSLBOOLEAN=33, DSLNUMBER=34, DSLSTRING=35, 
		SET=36, DOM=37, PHENOTYPE=38, CODOMINANCE=39, LOCATION=40, LABEL=41, GENOTYPE=42, 
		FREQUENCY=43, PUNNET=44, VALUE=45, FIND=46, CROSS=47, PRED=48, ESTIMATE=49, 
		IF=50, THEN=51, ELSE=52, END=53, WHILE=54, DO=55, ALL=56, PRINT=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "WS", "WHITESPACE", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", 
			"SYMBOLS", "DQ", "COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", 
			"NUMBER", "DIGIT", "EXP", "ESC", "STRING", "TRUE", "FALSE", "AND", "OR", 
			"CROSS_OPERATION", "GENES", "PARENT", "GENERATION", "DSLBOOLEAN", "DSLNUMBER", 
			"DSLSTRING", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", 
			"GENOTYPE", "FREQUENCY", "PUNNET", "VALUE", "FIND", "CROSS", "PRED", 
			"ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "ALL", "PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'?'", null, "' '", "'('", "')'", "','", "';'", null, "'\"'", null, null, 
			null, null, null, null, "'true'", "'false'", "'and'", "'or'", "'*'", 
			"'genes'", "'parents'", "'generation'", "'boolean'", "'number'", "'string'", 
			"'set'", "'dom'", "'phenotype'", "'codominance'", "'location'", "'label'", 
			"'genotype'", "'frequency'", "'square'", "'value'", "'find'", "'cross'", 
			"'pred'", "'estimate'", "'if'", "'then'", "'else'", "'end'", "'while'", 
			"'do'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"WHITESPACE", "LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", 
			"COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "STRING", 
			"TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", 
			"DSLBOOLEAN", "DSLNUMBER", "DSLSTRING", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", 
			"LOCATION", "LABEL", "GENOTYPE", "FREQUENCY", "PUNNET", "VALUE", "FIND", 
			"CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "DO", 
			"ALL", "PRINT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\6\f\u0096\n\f\r\f\16\f\u0097\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u00ae\n\24\f\24\16\24\u00b1\13\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ba\n\25\f\25\16\25\u00bd\13\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u00c6\n\30\3\30\3\30\3\30\6\30"+
		"\u00cb\n\30\r\30\16\30\u00cc\3\30\5\30\u00d0\n\30\3\30\5\30\u00d3\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00d9\n\30\3\30\5\30\u00dc\n\30\3\31\3\31\3"+
		"\31\7\31\u00e1\n\31\f\31\16\31\u00e4\13\31\5\31\u00e6\n\31\3\32\3\32\5"+
		"\32\u00ea\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00f4\n\34"+
		"\f\34\16\34\u00f7\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3\u00af\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\2\63\2\65\2\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_"+
		".a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;\3\2\n\5\2\13\f\17\17\"\"\5"+
		"\2\60\61==AA\4\2\f\f\17\17\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\f\f\17"+
		"\17$$^^\2\u01d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\177"+
		"\3\2\2\2\t\u0082\3\2\2\2\13\u0085\3\2\2\2\r\u0088\3\2\2\2\17\u008b\3\2"+
		"\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2\2\25\u0092\3\2\2\2\27\u0095\3\2\2"+
		"\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2"+
		"!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00b5\3"+
		"\2\2\2+\u00c0\3\2\2\2-\u00c2\3\2\2\2/\u00db\3\2\2\2\61\u00e5\3\2\2\2\63"+
		"\u00e7\3\2\2\2\65\u00ed\3\2\2\2\67\u00f0\3\2\2\29\u00fa\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0105\3\2\2\2?\u0109\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0114\3\2\2\2G\u011c\3\2\2\2I\u0127\3\2\2\2K\u012f\3\2\2\2M\u0136\3\2"+
		"\2\2O\u013d\3\2\2\2Q\u0141\3\2\2\2S\u0145\3\2\2\2U\u014f\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u0164\3\2\2\2[\u016a\3\2\2\2]\u0173\3\2\2\2_\u017d\3\2\2\2a"+
		"\u0184\3\2\2\2c\u018a\3\2\2\2e\u018f\3\2\2\2g\u0195\3\2\2\2i\u019a\3\2"+
		"\2\2k\u01a3\3\2\2\2m\u01a6\3\2\2\2o\u01ab\3\2\2\2q\u01b0\3\2\2\2s\u01b4"+
		"\3\2\2\2u\u01ba\3\2\2\2w\u01bd\3\2\2\2y\u01c1\3\2\2\2{|\7@\2\2|\4\3\2"+
		"\2\2}~\7>\2\2~\6\3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081\b\3"+
		"\2\2\2\u0082\u0083\7@\2\2\u0083\u0084\7?\2\2\u0084\n\3\2\2\2\u0085\u0086"+
		"\7?\2\2\u0086\u0087\7?\2\2\u0087\f\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a"+
		"\7?\2\2\u008a\16\3\2\2\2\u008b\u008c\7?\2\2\u008c\20\3\2\2\2\u008d\u008e"+
		"\7<\2\2\u008e\22\3\2\2\2\u008f\u0090\7/\2\2\u0090\u0091\7@\2\2\u0091\24"+
		"\3\2\2\2\u0092\u0093\7A\2\2\u0093\26\3\2\2\2\u0094\u0096\t\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\f\2\2\u009a\30\3\2\2\2\u009b\u009c"+
		"\7\"\2\2\u009c\32\3\2\2\2\u009d\u009e\7*\2\2\u009e\34\3\2\2\2\u009f\u00a0"+
		"\7+\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2 \3\2\2\2\u00a3\u00a4"+
		"\7=\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6$\3\2\2\2\u00a7\u00a8"+
		"\7$\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2\2\u00ab\u00af"+
		"\3\2\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7\61\2\2\u00b4(\3\2\2\2\u00b5"+
		"\u00b6\7\61\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\n"+
		"\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\25"+
		"\3\2\u00bf*\3\2\2\2\u00c0\u00c1\4C\\\2\u00c1,\3\2\2\2\u00c2\u00c3\4c|"+
		"\2\u00c3.\3\2\2\2\u00c4\u00c6\7/\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\61\31\2\u00c8\u00ca\7\60\2\2"+
		"\u00c9\u00cb\t\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\5\63\32\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00dc\3\2\2\2\u00d1\u00d3"+
		"\7/\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\5\61\31\2\u00d5\u00d6\5\63\32\2\u00d6\u00dc\3\2\2\2\u00d7\u00d9"+
		"\7/\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\5\61\31\2\u00db\u00c5\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d8\3"+
		"\2\2\2\u00dc\60\3\2\2\2\u00dd\u00e6\7\62\2\2\u00de\u00e2\t\6\2\2\u00df"+
		"\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00dd\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\62\3\2\2\2\u00e7\u00e9\t\7\2"+
		"\2\u00e8\u00ea\t\b\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\5\61\31\2\u00ec\64\3\2\2\2\u00ed\u00ee\7^\2\2\u00ee"+
		"\u00ef\13\2\2\2\u00ef\66\3\2\2\2\u00f0\u00f5\7$\2\2\u00f1\u00f4\5\65\33"+
		"\2\u00f2\u00f4\n\t\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7$\2\2\u00f98\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe:\3\2\2\2\u00ff"+
		"\u0100\7h\2\2\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2"+
		"\u0103\u0104\7g\2\2\u0104<\3\2\2\2\u0105\u0106\7c\2\2\u0106\u0107\7p\2"+
		"\2\u0107\u0108\7f\2\2\u0108>\3\2\2\2\u0109\u010a\7q\2\2\u010a\u010b\7"+
		"t\2\2\u010b@\3\2\2\2\u010c\u010d\7,\2\2\u010dB\3\2\2\2\u010e\u010f\7i"+
		"\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7u\2\2\u0113D\3\2\2\2\u0114\u0115\7r\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a"+
		"\u011b\7u\2\2\u011bF\3\2\2\2\u011c\u011d\7i\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7p\2\2\u011f\u0120\7g\2\2\u0120\u0121\7t\2\2\u0121\u0122\7c\2\2"+
		"\u0122\u0123\7v\2\2\u0123\u0124\7k\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7p\2\2\u0126H\3\2\2\2\u0127\u0128\7d\2\2\u0128\u0129\7q\2\2\u0129\u012a"+
		"\7q\2\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012e\7p\2\2\u012eJ\3\2\2\2\u012f\u0130\7p\2\2\u0130\u0131\7w\2\2\u0131"+
		"\u0132\7o\2\2\u0132\u0133\7d\2\2\u0133\u0134\7g\2\2\u0134\u0135\7t\2\2"+
		"\u0135L\3\2\2\2\u0136\u0137\7u\2\2\u0137\u0138\7v\2\2\u0138\u0139\7t\2"+
		"\2\u0139\u013a\7k\2\2\u013a\u013b\7p\2\2\u013b\u013c\7i\2\2\u013cN\3\2"+
		"\2\2\u013d\u013e\7u\2\2\u013e\u013f\7g\2\2\u013f\u0140\7v\2\2\u0140P\3"+
		"\2\2\2\u0141\u0142\7f\2\2\u0142\u0143\7q\2\2\u0143\u0144\7o\2\2\u0144"+
		"R\3\2\2\2\u0145\u0146\7r\2\2\u0146\u0147\7j\2\2\u0147\u0148\7g\2\2\u0148"+
		"\u0149\7p\2\2\u0149\u014a\7q\2\2\u014a\u014b\7v\2\2\u014b\u014c\7{\2\2"+
		"\u014c\u014d\7r\2\2\u014d\u014e\7g\2\2\u014eT\3\2\2\2\u014f\u0150\7e\2"+
		"\2\u0150\u0151\7q\2\2\u0151\u0152\7f\2\2\u0152\u0153\7q\2\2\u0153\u0154"+
		"\7o\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157\7c\2\2\u0157"+
		"\u0158\7p\2\2\u0158\u0159\7e\2\2\u0159\u015a\7g\2\2\u015aV\3\2\2\2\u015b"+
		"\u015c\7n\2\2\u015c\u015d\7q\2\2\u015d\u015e\7e\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7q\2\2\u0162\u0163"+
		"\7p\2\2\u0163X\3\2\2\2\u0164\u0165\7n\2\2\u0165\u0166\7c\2\2\u0166\u0167"+
		"\7d\2\2\u0167\u0168\7g\2\2\u0168\u0169\7n\2\2\u0169Z\3\2\2\2\u016a\u016b"+
		"\7i\2\2\u016b\u016c\7g\2\2\u016c\u016d\7p\2\2\u016d\u016e\7q\2\2\u016e"+
		"\u016f\7v\2\2\u016f\u0170\7{\2\2\u0170\u0171\7r\2\2\u0171\u0172\7g\2\2"+
		"\u0172\\\3\2\2\2\u0173\u0174\7h\2\2\u0174\u0175\7t\2\2\u0175\u0176\7g"+
		"\2\2\u0176\u0177\7s\2\2\u0177\u0178\7w\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7p\2\2\u017a\u017b\7e\2\2\u017b\u017c\7{\2\2\u017c^\3\2\2\2\u017d\u017e"+
		"\7u\2\2\u017e\u017f\7s\2\2\u017f\u0180\7w\2\2\u0180\u0181\7c\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7g\2\2\u0183`\3\2\2\2\u0184\u0185\7x\2\2\u0185"+
		"\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188\7w\2\2\u0188\u0189\7g\2\2"+
		"\u0189b\3\2\2\2\u018a\u018b\7h\2\2\u018b\u018c\7k\2\2\u018c\u018d\7p\2"+
		"\2\u018d\u018e\7f\2\2\u018ed\3\2\2\2\u018f\u0190\7e\2\2\u0190\u0191\7"+
		"t\2\2\u0191\u0192\7q\2\2\u0192\u0193\7u\2\2\u0193\u0194\7u\2\2\u0194f"+
		"\3\2\2\2\u0195\u0196\7r\2\2\u0196\u0197\7t\2\2\u0197\u0198\7g\2\2\u0198"+
		"\u0199\7f\2\2\u0199h\3\2\2\2\u019a\u019b\7g\2\2\u019b\u019c\7u\2\2\u019c"+
		"\u019d\7v\2\2\u019d\u019e\7k\2\2\u019e\u019f\7o\2\2\u019f\u01a0\7c\2\2"+
		"\u01a0\u01a1\7v\2\2\u01a1\u01a2\7g\2\2\u01a2j\3\2\2\2\u01a3\u01a4\7k\2"+
		"\2\u01a4\u01a5\7h\2\2\u01a5l\3\2\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7"+
		"j\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7p\2\2\u01aan\3\2\2\2\u01ab\u01ac"+
		"\7g\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7g\2\2\u01af"+
		"p\3\2\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7f\2\2\u01b3"+
		"r\3\2\2\2\u01b4\u01b5\7y\2\2\u01b5\u01b6\7j\2\2\u01b6\u01b7\7k\2\2\u01b7"+
		"\u01b8\7n\2\2\u01b8\u01b9\7g\2\2\u01b9t\3\2\2\2\u01ba\u01bb\7f\2\2\u01bb"+
		"\u01bc\7q\2\2\u01bcv\3\2\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7n\2\2\u01bf"+
		"\u01c0\7n\2\2\u01c0x\3\2\2\2\u01c1\u01c2\7r\2\2\u01c2\u01c3\7t\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6\7v\2\2\u01c6z\3\2\2\2\21"+
		"\2\u0097\u00af\u00bb\u00c5\u00cc\u00cf\u00d2\u00d8\u00db\u00e2\u00e5\u00e9"+
		"\u00f3\u00f5\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}