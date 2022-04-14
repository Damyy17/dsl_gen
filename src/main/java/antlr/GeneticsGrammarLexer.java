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
		PARENT=30, GENERATION=31, DSLBOOLEAN=32, DSLNUMBER=33, DSLSTRING=34, SET=35, 
		DOM=36, PHENOTYPE=37, CODOMINANCE=38, LOCATION=39, LABEL=40, GENOTYPE=41, 
		FREQUENCY=42, PUNNET=43, VALUE=44, FIND=45, CROSS=46, PRED=47, ESTIMATE=48, 
		IF=49, THEN=50, ELSE=51, END=52, WHILE=53, DO=54, ALL=55, PRINT=56;
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
			"GENES", "PARENT", "GENERATION", "DSLBOOLEAN", "DSLNUMBER", "DSLSTRING", 
			"SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", "GENOTYPE", 
			"FREQUENCY", "PUNNET", "VALUE", "FIND", "CROSS", "PRED", "ESTIMATE", 
			"IF", "THEN", "ELSE", "END", "WHILE", "DO", "ALL", "PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'?'", null, "'('", "')'", "','", "';'", null, "'\"'", null, null, null, 
			null, null, null, "'true'", "'false'", "'and'", "'or'", "'*'", "'genes'", 
			"'parents'", "'generation'", "'boolean'", "'number'", "'string'", "'set'", 
			"'dom'", "'phenotype'", "'codominance'", "'location'", "'label'", "'genotype'", 
			"'frequency '", "'square'", "'value'", "'find'", "'cross'", "'pred'", 
			"'estimate'", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", 
			"'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"LPAREN", "RPAREN", "COOMA", "SEMICOLON", "SYMBOLS", "DQ", "COMMENT", 
			"LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", "STRING", "TRUE", 
			"FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\6\f\u0094\n\f\r\f\16\f\u0095\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23\u00aa\n\23\f\23\16\23\u00ad\13\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00b6\n\24\f\24\16\24\u00b9\13\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\5\27\u00c2\n\27\3\27\3\27\3\27\6\27\u00c7\n\27\r\27\16"+
		"\27\u00c8\3\27\5\27\u00cc\n\27\3\27\5\27\u00cf\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00d5\n\27\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\7\30\u00dd\n\30\f"+
		"\30\16\30\u00e0\13\30\5\30\u00e2\n\30\3\31\3\31\5\31\u00e6\n\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u00f0\n\33\f\33\16\33\u00f3\13"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<"+
		"\3\u00ab\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\31\67\32"+
		"9\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63"+
		"k\64m\65o\66q\67s8u9w:\3\2\n\5\2\13\f\17\17\"\"\5\2\60\61==AA\4\2\f\f"+
		"\17\17\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\f\f\17\17$$^^\2\u01cf\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\u0080\3\2\2\2\13\u0083"+
		"\3\2\2\2\r\u0086\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008d\3"+
		"\2\2\2\25\u0090\3\2\2\2\27\u0093\3\2\2\2\31\u0099\3\2\2\2\33\u009b\3\2"+
		"\2\2\35\u009d\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%"+
		"\u00a5\3\2\2\2\'\u00b1\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00d7\3"+
		"\2\2\2/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63\u00e9\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00f6\3\2\2\29\u00fb\3\2\2\2;\u0101\3\2\2\2=\u0105\3\2\2\2?\u0108"+
		"\3\2\2\2A\u010a\3\2\2\2C\u0110\3\2\2\2E\u0118\3\2\2\2G\u0123\3\2\2\2I"+
		"\u012b\3\2\2\2K\u0132\3\2\2\2M\u0139\3\2\2\2O\u013d\3\2\2\2Q\u0141\3\2"+
		"\2\2S\u014b\3\2\2\2U\u0157\3\2\2\2W\u0160\3\2\2\2Y\u0166\3\2\2\2[\u016f"+
		"\3\2\2\2]\u017a\3\2\2\2_\u0181\3\2\2\2a\u0187\3\2\2\2c\u018c\3\2\2\2e"+
		"\u0192\3\2\2\2g\u0197\3\2\2\2i\u01a0\3\2\2\2k\u01a3\3\2\2\2m\u01a8\3\2"+
		"\2\2o\u01ad\3\2\2\2q\u01b1\3\2\2\2s\u01b7\3\2\2\2u\u01ba\3\2\2\2w\u01be"+
		"\3\2\2\2yz\7@\2\2z\4\3\2\2\2{|\7>\2\2|\6\3\2\2\2}~\7>\2\2~\177\7?\2\2"+
		"\177\b\3\2\2\2\u0080\u0081\7@\2\2\u0081\u0082\7?\2\2\u0082\n\3\2\2\2\u0083"+
		"\u0084\7?\2\2\u0084\u0085\7?\2\2\u0085\f\3\2\2\2\u0086\u0087\7#\2\2\u0087"+
		"\u0088\7?\2\2\u0088\16\3\2\2\2\u0089\u008a\7?\2\2\u008a\20\3\2\2\2\u008b"+
		"\u008c\7<\2\2\u008c\22\3\2\2\2\u008d\u008e\7/\2\2\u008e\u008f\7@\2\2\u008f"+
		"\24\3\2\2\2\u0090\u0091\7A\2\2\u0091\26\3\2\2\2\u0092\u0094\t\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\f\2\2\u0098\30\3\2\2\2\u0099\u009a"+
		"\7*\2\2\u009a\32\3\2\2\2\u009b\u009c\7+\2\2\u009c\34\3\2\2\2\u009d\u009e"+
		"\7.\2\2\u009e\36\3\2\2\2\u009f\u00a0\7=\2\2\u00a0 \3\2\2\2\u00a1\u00a2"+
		"\t\3\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4$\3\2\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\u00a7\7,\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13\2\2\2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7,\2\2\u00af"+
		"\u00b0\7\61\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7\61\2"+
		"\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6\n\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\b\24\3\2\u00bb(\3\2\2\2\u00bc\u00bd\4C\\\2"+
		"\u00bd*\3\2\2\2\u00be\u00bf\4c|\2\u00bf,\3\2\2\2\u00c0\u00c2\7/\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5/"+
		"\30\2\u00c4\u00c6\7\60\2\2\u00c5\u00c7\t\5\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00cc\5\61\31\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00d8\3\2\2\2\u00cd\u00cf\7/\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5/\30\2\u00d1\u00d2\5\61\31\2\u00d2"+
		"\u00d8\3\2\2\2\u00d3\u00d5\7/\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\5/\30\2\u00d7\u00c1\3\2\2\2\u00d7"+
		"\u00ce\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8.\3\2\2\2\u00d9\u00e2\7\62\2\2"+
		"\u00da\u00de\t\6\2\2\u00db\u00dd\t\5\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2\60\3\2\2"+
		"\2\u00e3\u00e5\t\7\2\2\u00e4\u00e6\t\b\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\5/\30\2\u00e8\62\3\2\2\2\u00e9"+
		"\u00ea\7^\2\2\u00ea\u00eb\13\2\2\2\u00eb\64\3\2\2\2\u00ec\u00f1\7$\2\2"+
		"\u00ed\u00f0\5\63\32\2\u00ee\u00f0\n\t\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5\66\3\2\2\2"+
		"\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe"+
		"\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100:\3\2\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7p\2\2\u0103\u0104\7f\2\2\u0104<\3\2\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7t\2\2\u0107>\3\2\2\2\u0108\u0109\7,\2\2\u0109@\3"+
		"\2\2\2\u010a\u010b\7i\2\2\u010b\u010c\7g\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7u\2\2\u010fB\3\2\2\2\u0110\u0111\7r\2\2\u0111"+
		"\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2"+
		"\u0115\u0116\7v\2\2\u0116\u0117\7u\2\2\u0117D\3\2\2\2\u0118\u0119\7i\2"+
		"\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b\u011c\7g\2\2\u011c\u011d"+
		"\7t\2\2\u011d\u011e\7c\2\2\u011e\u011f\7v\2\2\u011f\u0120\7k\2\2\u0120"+
		"\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122F\3\2\2\2\u0123\u0124\7d\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7q\2\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2"+
		"\u0128\u0129\7c\2\2\u0129\u012a\7p\2\2\u012aH\3\2\2\2\u012b\u012c\7p\2"+
		"\2\u012c\u012d\7w\2\2\u012d\u012e\7o\2\2\u012e\u012f\7d\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0131\7t\2\2\u0131J\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7i\2\2\u0138L\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7v\2\2\u013cN\3\2\2\2\u013d\u013e\7f\2\2\u013e\u013f\7q\2\2\u013f"+
		"\u0140\7o\2\2\u0140P\3\2\2\2\u0141\u0142\7r\2\2\u0142\u0143\7j\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7p\2\2\u0145\u0146\7q\2\2\u0146\u0147\7v\2\2"+
		"\u0147\u0148\7{\2\2\u0148\u0149\7r\2\2\u0149\u014a\7g\2\2\u014aR\3\2\2"+
		"\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7f\2\2\u014e\u014f"+
		"\7q\2\2\u014f\u0150\7o\2\2\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152"+
		"\u0153\7c\2\2\u0153\u0154\7p\2\2\u0154\u0155\7e\2\2\u0155\u0156\7g\2\2"+
		"\u0156T\3\2\2\2\u0157\u0158\7n\2\2\u0158\u0159\7q\2\2\u0159\u015a\7e\2"+
		"\2\u015a\u015b\7c\2\2\u015b\u015c\7v\2\2\u015c\u015d\7k\2\2\u015d\u015e"+
		"\7q\2\2\u015e\u015f\7p\2\2\u015fV\3\2\2\2\u0160\u0161\7n\2\2\u0161\u0162"+
		"\7c\2\2\u0162\u0163\7d\2\2\u0163\u0164\7g\2\2\u0164\u0165\7n\2\2\u0165"+
		"X\3\2\2\2\u0166\u0167\7i\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169"+
		"\u016a\7q\2\2\u016a\u016b\7v\2\2\u016b\u016c\7{\2\2\u016c\u016d\7r\2\2"+
		"\u016d\u016e\7g\2\2\u016eZ\3\2\2\2\u016f\u0170\7h\2\2\u0170\u0171\7t\2"+
		"\2\u0171\u0172\7g\2\2\u0172\u0173\7s\2\2\u0173\u0174\7w\2\2\u0174\u0175"+
		"\7g\2\2\u0175\u0176\7p\2\2\u0176\u0177\7e\2\2\u0177\u0178\7{\2\2\u0178"+
		"\u0179\7\"\2\2\u0179\\\3\2\2\2\u017a\u017b\7u\2\2\u017b\u017c\7s\2\2\u017c"+
		"\u017d\7w\2\2\u017d\u017e\7c\2\2\u017e\u017f\7t\2\2\u017f\u0180\7g\2\2"+
		"\u0180^\3\2\2\2\u0181\u0182\7x\2\2\u0182\u0183\7c\2\2\u0183\u0184\7n\2"+
		"\2\u0184\u0185\7w\2\2\u0185\u0186\7g\2\2\u0186`\3\2\2\2\u0187\u0188\7"+
		"h\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b\7f\2\2\u018bb"+
		"\3\2\2\2\u018c\u018d\7e\2\2\u018d\u018e\7t\2\2\u018e\u018f\7q\2\2\u018f"+
		"\u0190\7u\2\2\u0190\u0191\7u\2\2\u0191d\3\2\2\2\u0192\u0193\7r\2\2\u0193"+
		"\u0194\7t\2\2\u0194\u0195\7g\2\2\u0195\u0196\7f\2\2\u0196f\3\2\2\2\u0197"+
		"\u0198\7g\2\2\u0198\u0199\7u\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2"+
		"\u019b\u019c\7o\2\2\u019c\u019d\7c\2\2\u019d\u019e\7v\2\2\u019e\u019f"+
		"\7g\2\2\u019fh\3\2\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7h\2\2\u01a2j\3"+
		"\2\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7j\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		"\u01a7\7p\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7n\2\2\u01aa"+
		"\u01ab\7u\2\2\u01ab\u01ac\7g\2\2\u01acn\3\2\2\2\u01ad\u01ae\7g\2\2\u01ae"+
		"\u01af\7p\2\2\u01af\u01b0\7f\2\2\u01b0p\3\2\2\2\u01b1\u01b2\7y\2\2\u01b2"+
		"\u01b3\7j\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b6\7g\2\2"+
		"\u01b6r\3\2\2\2\u01b7\u01b8\7f\2\2\u01b8\u01b9\7q\2\2\u01b9t\3\2\2\2\u01ba"+
		"\u01bb\7c\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7n\2\2\u01bdv\3\2\2\2\u01be"+
		"\u01bf\7r\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7p\2\2"+
		"\u01c2\u01c3\7v\2\2\u01c3x\3\2\2\2\21\2\u0095\u00ab\u00b7\u00c1\u00c8"+
		"\u00cb\u00ce\u00d4\u00d7\u00de\u00e1\u00e5\u00ef\u00f1\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}