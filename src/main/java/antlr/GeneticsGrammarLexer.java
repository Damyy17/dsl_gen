// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, WHITESPACE=14, LPAREN=15, RPAREN=16, 
		COMMA=17, SEMICOLON=18, SYMBOLS=19, DQ=20, COMMENT=21, LINE_COMMENT=22, 
		BIGALPHA=23, SMALLALPHA=24, NUMBER=25, STRING=26, TRUE=27, FALSE=28, AND=29, 
		OR=30, CROSS_OPERATION=31, GENES=32, PARENT=33, GENERATION=34, DSLBOOLEAN=35, 
		DSLNUMBER=36, DSLSTRING=37, SET=38, DOM=39, PHENOTYPE=40, CODOMINANCE=41, 
		LOCATION=42, LABEL=43, PARENTS=44, GENOTYPE=45, FREQUENCY=46, PUNNET=47, 
		VALUE=48, FIND=49, CROSS=50, PRED=51, ESTIMATE=52, IF=53, THEN=54, ELSE=55, 
		END=56, WHILE=57, FOR=58, DO=59, ALL=60, PRINT=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WS", "WHITESPACE", "LPAREN", "RPAREN", "COMMA", 
			"SEMICOLON", "SYMBOLS", "DQ", "COMMENT", "LINE_COMMENT", "BIGALPHA", 
			"SMALLALPHA", "NUMBER", "DIGIT", "EXP", "ESC", "STRING", "TRUE", "FALSE", 
			"AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", "GENERATION", "DSLBOOLEAN", 
			"DSLNUMBER", "DSLSTRING", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", 
			"LABEL", "PARENTS", "GENOTYPE", "FREQUENCY", "PUNNET", "VALUE", "FIND", 
			"CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "FOR", 
			"DO", "ALL", "PRINT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", 
			"':'", "'->'", "'?'", null, "' '", "'('", "')'", "','", "';'", null, 
			"'\"'", null, null, null, null, null, null, "'true'", "'false'", "'and'", 
			"'or'", "'*'", "'genes'", "'parents'", "'generation'", "'boolean'", "'number'", 
			"'string'", "'set'", "'dom'", "'phenotype'", "'codominance'", "'location'", 
			"'label'", "'ancestors'", "'genotype'", "'frequency'", "'square'", "'value'", 
			"'find'", "'cross'", "'pred'", "'estimate'", "'if'", "'then'", "'else'", 
			"'end'", "'while'", "'for'", "'do'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "WHITESPACE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", "SYMBOLS", 
			"DQ", "COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", "NUMBER", 
			"STRING", "TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", "GENES", "PARENT", 
			"GENERATION", "DSLBOOLEAN", "DSLNUMBER", "DSLSTRING", "SET", "DOM", "PHENOTYPE", 
			"CODOMINANCE", "LOCATION", "LABEL", "PARENTS", "GENOTYPE", "FREQUENCY", 
			"PUNNET", "VALUE", "FIND", "CROSS", "PRED", "ESTIMATE", "IF", "THEN", 
			"ELSE", "END", "WHILE", "FOR", "DO", "ALL", "PRINT"
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
		"\u0004\u0000=\u01df\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00a0\b\f\u000b\f\f"+
		"\f\u00a1\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00b8\b\u0014\n\u0014\f\u0014\u00bb\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00c4\b\u0015\n\u0015\f\u0015\u00c7\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0003\u0018\u00d0\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u00d5\b\u0018\u000b\u0018\f\u0018\u00d6\u0001\u0018\u0003\u0018"+
		"\u00da\b\u0018\u0001\u0018\u0003\u0018\u00dd\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e3\b\u0018\u0001\u0018\u0003"+
		"\u0018\u00e6\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00eb"+
		"\b\u0019\n\u0019\f\u0019\u00ee\t\u0019\u0003\u0019\u00f0\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00f4\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u00fe\b\u001c\n\u001c\f\u001c\u0101\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001\u00b9\u0000@\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u00005\u00007\u00009\u001a"+
		";\u001b=\u001c?\u001dA\u001eC\u001fE G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/"+
		"e0g1i2k3m4o5q6s7u8w9y:{;}<\u007f=\u0001\u0000\b\u0003\u0000\t\n\r\r  "+
		"\u0003\u0000./;;??\u0002\u0000\n\n\r\r\u0001\u000009\u0001\u000019\u0002"+
		"\u0000EEee\u0002\u0000++--\u0004\u0000\n\n\r\r\"\"\\\\\u01ea\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000"+
		"W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001"+
		"\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000"+
		"\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000"+
		"e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001"+
		"\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000"+
		"\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000"+
		"s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001"+
		"\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000"+
		"\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000"+
		"\u0001\u0081\u0001\u0000\u0000\u0000\u0003\u0083\u0001\u0000\u0000\u0000"+
		"\u0005\u0085\u0001\u0000\u0000\u0000\u0007\u0087\u0001\u0000\u0000\u0000"+
		"\t\u0089\u0001\u0000\u0000\u0000\u000b\u008c\u0001\u0000\u0000\u0000\r"+
		"\u008f\u0001\u0000\u0000\u0000\u000f\u0092\u0001\u0000\u0000\u0000\u0011"+
		"\u0095\u0001\u0000\u0000\u0000\u0013\u0097\u0001\u0000\u0000\u0000\u0015"+
		"\u0099\u0001\u0000\u0000\u0000\u0017\u009c\u0001\u0000\u0000\u0000\u0019"+
		"\u009f\u0001\u0000\u0000\u0000\u001b\u00a5\u0001\u0000\u0000\u0000\u001d"+
		"\u00a7\u0001\u0000\u0000\u0000\u001f\u00a9\u0001\u0000\u0000\u0000!\u00ab"+
		"\u0001\u0000\u0000\u0000#\u00ad\u0001\u0000\u0000\u0000%\u00af\u0001\u0000"+
		"\u0000\u0000\'\u00b1\u0001\u0000\u0000\u0000)\u00b3\u0001\u0000\u0000"+
		"\u0000+\u00bf\u0001\u0000\u0000\u0000-\u00ca\u0001\u0000\u0000\u0000/"+
		"\u00cc\u0001\u0000\u0000\u00001\u00e5\u0001\u0000\u0000\u00003\u00ef\u0001"+
		"\u0000\u0000\u00005\u00f1\u0001\u0000\u0000\u00007\u00f7\u0001\u0000\u0000"+
		"\u00009\u00fa\u0001\u0000\u0000\u0000;\u0104\u0001\u0000\u0000\u0000="+
		"\u0109\u0001\u0000\u0000\u0000?\u010f\u0001\u0000\u0000\u0000A\u0113\u0001"+
		"\u0000\u0000\u0000C\u0116\u0001\u0000\u0000\u0000E\u0118\u0001\u0000\u0000"+
		"\u0000G\u011e\u0001\u0000\u0000\u0000I\u0126\u0001\u0000\u0000\u0000K"+
		"\u0131\u0001\u0000\u0000\u0000M\u0139\u0001\u0000\u0000\u0000O\u0140\u0001"+
		"\u0000\u0000\u0000Q\u0147\u0001\u0000\u0000\u0000S\u014b\u0001\u0000\u0000"+
		"\u0000U\u014f\u0001\u0000\u0000\u0000W\u0159\u0001\u0000\u0000\u0000Y"+
		"\u0165\u0001\u0000\u0000\u0000[\u016e\u0001\u0000\u0000\u0000]\u0174\u0001"+
		"\u0000\u0000\u0000_\u017e\u0001\u0000\u0000\u0000a\u0187\u0001\u0000\u0000"+
		"\u0000c\u0191\u0001\u0000\u0000\u0000e\u0198\u0001\u0000\u0000\u0000g"+
		"\u019e\u0001\u0000\u0000\u0000i\u01a3\u0001\u0000\u0000\u0000k\u01a9\u0001"+
		"\u0000\u0000\u0000m\u01ae\u0001\u0000\u0000\u0000o\u01b7\u0001\u0000\u0000"+
		"\u0000q\u01ba\u0001\u0000\u0000\u0000s\u01bf\u0001\u0000\u0000\u0000u"+
		"\u01c4\u0001\u0000\u0000\u0000w\u01c8\u0001\u0000\u0000\u0000y\u01ce\u0001"+
		"\u0000\u0000\u0000{\u01d2\u0001\u0000\u0000\u0000}\u01d5\u0001\u0000\u0000"+
		"\u0000\u007f\u01d9\u0001\u0000\u0000\u0000\u0081\u0082\u0005[\u0000\u0000"+
		"\u0082\u0002\u0001\u0000\u0000\u0000\u0083\u0084\u0005]\u0000\u0000\u0084"+
		"\u0004\u0001\u0000\u0000\u0000\u0085\u0086\u0005>\u0000\u0000\u0086\u0006"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005<\u0000\u0000\u0088\b\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005<\u0000\u0000\u008a\u008b\u0005=\u0000"+
		"\u0000\u008b\n\u0001\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000"+
		"\u008d\u008e\u0005=\u0000\u0000\u008e\f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005=\u0000\u0000\u0090\u0091\u0005=\u0000\u0000\u0091\u000e\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005!\u0000\u0000\u0093\u0094\u0005=\u0000"+
		"\u0000\u0094\u0010\u0001\u0000\u0000\u0000\u0095\u0096\u0005=\u0000\u0000"+
		"\u0096\u0012\u0001\u0000\u0000\u0000\u0097\u0098\u0005:\u0000\u0000\u0098"+
		"\u0014\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u009b"+
		"\u0005>\u0000\u0000\u009b\u0016\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"?\u0000\u0000\u009d\u0018\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0000"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\f\u0000"+
		"\u0000\u00a4\u001a\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005 \u0000\u0000"+
		"\u00a6\u001c\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005(\u0000\u0000\u00a8"+
		"\u001e\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005)\u0000\u0000\u00aa \u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac\"\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005;\u0000\u0000\u00ae$\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0007\u0001\u0000\u0000\u00b0&\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\"\u0000\u0000\u00b2(\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005/\u0000\u0000\u00b4\u00b5\u0005*\u0000\u0000\u00b5\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b8\t\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005*\u0000\u0000"+
		"\u00bd\u00be\u0005/\u0000\u0000\u00be*\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005/\u0000\u0000\u00c0\u00c1\u0005/\u0000\u0000\u00c1\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\b\u0002\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0015\u0001"+
		"\u0000\u00c9,\u0001\u0000\u0000\u0000\u00ca\u00cb\u0002AZ\u0000\u00cb"+
		".\u0001\u0000\u0000\u0000\u00cc\u00cd\u0002az\u0000\u00cd0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0005-\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u00033\u0019\u0000\u00d2\u00d4\u0005.\u0000\u0000\u00d3"+
		"\u00d5\u0007\u0003\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u00035\u001a\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00e6\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0005-\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0003"+
		"3\u0019\u0000\u00df\u00e0\u00035\u001a\u0000\u00e0\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0005-\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u00033\u0019\u0000\u00e5\u00cf\u0001\u0000\u0000\u0000\u00e5"+
		"\u00dc\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e6"+
		"2\u0001\u0000\u0000\u0000\u00e7\u00f0\u00050\u0000\u0000\u00e8\u00ec\u0007"+
		"\u0004\u0000\u0000\u00e9\u00eb\u0007\u0003\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000\u0000\u00f04\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0007\u0005\u0000\u0000\u00f2\u00f4\u0007\u0006"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u00033\u0019"+
		"\u0000\u00f66\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\\\u0000\u0000"+
		"\u00f8\u00f9\t\u0000\u0000\u0000\u00f98\u0001\u0000\u0000\u0000\u00fa"+
		"\u00ff\u0005\"\u0000\u0000\u00fb\u00fe\u00037\u001b\u0000\u00fc\u00fe"+
		"\b\u0007\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"\"\u0000\u0000\u0103:\u0001\u0000\u0000\u0000\u0104\u0105\u0005t\u0000"+
		"\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107\u0005u\u0000\u0000\u0107"+
		"\u0108\u0005e\u0000\u0000\u0108<\u0001\u0000\u0000\u0000\u0109\u010a\u0005"+
		"f\u0000\u0000\u010a\u010b\u0005a\u0000\u0000\u010b\u010c\u0005l\u0000"+
		"\u0000\u010c\u010d\u0005s\u0000\u0000\u010d\u010e\u0005e\u0000\u0000\u010e"+
		">\u0001\u0000\u0000\u0000\u010f\u0110\u0005a\u0000\u0000\u0110\u0111\u0005"+
		"n\u0000\u0000\u0111\u0112\u0005d\u0000\u0000\u0112@\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005o\u0000\u0000\u0114\u0115\u0005r\u0000\u0000\u0115"+
		"B\u0001\u0000\u0000\u0000\u0116\u0117\u0005*\u0000\u0000\u0117D\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005g\u0000\u0000\u0119\u011a\u0005e\u0000"+
		"\u0000\u011a\u011b\u0005n\u0000\u0000\u011b\u011c\u0005e\u0000\u0000\u011c"+
		"\u011d\u0005s\u0000\u0000\u011dF\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"p\u0000\u0000\u011f\u0120\u0005a\u0000\u0000\u0120\u0121\u0005r\u0000"+
		"\u0000\u0121\u0122\u0005e\u0000\u0000\u0122\u0123\u0005n\u0000\u0000\u0123"+
		"\u0124\u0005t\u0000\u0000\u0124\u0125\u0005s\u0000\u0000\u0125H\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005g\u0000\u0000\u0127\u0128\u0005e\u0000"+
		"\u0000\u0128\u0129\u0005n\u0000\u0000\u0129\u012a\u0005e\u0000\u0000\u012a"+
		"\u012b\u0005r\u0000\u0000\u012b\u012c\u0005a\u0000\u0000\u012c\u012d\u0005"+
		"t\u0000\u0000\u012d\u012e\u0005i\u0000\u0000\u012e\u012f\u0005o\u0000"+
		"\u0000\u012f\u0130\u0005n\u0000\u0000\u0130J\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0005b\u0000\u0000\u0132\u0133\u0005o\u0000\u0000\u0133\u0134\u0005"+
		"o\u0000\u0000\u0134\u0135\u0005l\u0000\u0000\u0135\u0136\u0005e\u0000"+
		"\u0000\u0136\u0137\u0005a\u0000\u0000\u0137\u0138\u0005n\u0000\u0000\u0138"+
		"L\u0001\u0000\u0000\u0000\u0139\u013a\u0005n\u0000\u0000\u013a\u013b\u0005"+
		"u\u0000\u0000\u013b\u013c\u0005m\u0000\u0000\u013c\u013d\u0005b\u0000"+
		"\u0000\u013d\u013e\u0005e\u0000\u0000\u013e\u013f\u0005r\u0000\u0000\u013f"+
		"N\u0001\u0000\u0000\u0000\u0140\u0141\u0005s\u0000\u0000\u0141\u0142\u0005"+
		"t\u0000\u0000\u0142\u0143\u0005r\u0000\u0000\u0143\u0144\u0005i\u0000"+
		"\u0000\u0144\u0145\u0005n\u0000\u0000\u0145\u0146\u0005g\u0000\u0000\u0146"+
		"P\u0001\u0000\u0000\u0000\u0147\u0148\u0005s\u0000\u0000\u0148\u0149\u0005"+
		"e\u0000\u0000\u0149\u014a\u0005t\u0000\u0000\u014aR\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005d\u0000\u0000\u014c\u014d\u0005o\u0000\u0000\u014d"+
		"\u014e\u0005m\u0000\u0000\u014eT\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"p\u0000\u0000\u0150\u0151\u0005h\u0000\u0000\u0151\u0152\u0005e\u0000"+
		"\u0000\u0152\u0153\u0005n\u0000\u0000\u0153\u0154\u0005o\u0000\u0000\u0154"+
		"\u0155\u0005t\u0000\u0000\u0155\u0156\u0005y\u0000\u0000\u0156\u0157\u0005"+
		"p\u0000\u0000\u0157\u0158\u0005e\u0000\u0000\u0158V\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005c\u0000\u0000\u015a\u015b\u0005o\u0000\u0000\u015b"+
		"\u015c\u0005d\u0000\u0000\u015c\u015d\u0005o\u0000\u0000\u015d\u015e\u0005"+
		"m\u0000\u0000\u015e\u015f\u0005i\u0000\u0000\u015f\u0160\u0005n\u0000"+
		"\u0000\u0160\u0161\u0005a\u0000\u0000\u0161\u0162\u0005n\u0000\u0000\u0162"+
		"\u0163\u0005c\u0000\u0000\u0163\u0164\u0005e\u0000\u0000\u0164X\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005l\u0000\u0000\u0166\u0167\u0005o\u0000"+
		"\u0000\u0167\u0168\u0005c\u0000\u0000\u0168\u0169\u0005a\u0000\u0000\u0169"+
		"\u016a\u0005t\u0000\u0000\u016a\u016b\u0005i\u0000\u0000\u016b\u016c\u0005"+
		"o\u0000\u0000\u016c\u016d\u0005n\u0000\u0000\u016dZ\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005l\u0000\u0000\u016f\u0170\u0005a\u0000\u0000\u0170"+
		"\u0171\u0005b\u0000\u0000\u0171\u0172\u0005e\u0000\u0000\u0172\u0173\u0005"+
		"l\u0000\u0000\u0173\\\u0001\u0000\u0000\u0000\u0174\u0175\u0005a\u0000"+
		"\u0000\u0175\u0176\u0005n\u0000\u0000\u0176\u0177\u0005c\u0000\u0000\u0177"+
		"\u0178\u0005e\u0000\u0000\u0178\u0179\u0005s\u0000\u0000\u0179\u017a\u0005"+
		"t\u0000\u0000\u017a\u017b\u0005o\u0000\u0000\u017b\u017c\u0005r\u0000"+
		"\u0000\u017c\u017d\u0005s\u0000\u0000\u017d^\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005g\u0000\u0000\u017f\u0180\u0005e\u0000\u0000\u0180\u0181\u0005"+
		"n\u0000\u0000\u0181\u0182\u0005o\u0000\u0000\u0182\u0183\u0005t\u0000"+
		"\u0000\u0183\u0184\u0005y\u0000\u0000\u0184\u0185\u0005p\u0000\u0000\u0185"+
		"\u0186\u0005e\u0000\u0000\u0186`\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"f\u0000\u0000\u0188\u0189\u0005r\u0000\u0000\u0189\u018a\u0005e\u0000"+
		"\u0000\u018a\u018b\u0005q\u0000\u0000\u018b\u018c\u0005u\u0000\u0000\u018c"+
		"\u018d\u0005e\u0000\u0000\u018d\u018e\u0005n\u0000\u0000\u018e\u018f\u0005"+
		"c\u0000\u0000\u018f\u0190\u0005y\u0000\u0000\u0190b\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005s\u0000\u0000\u0192\u0193\u0005q\u0000\u0000\u0193"+
		"\u0194\u0005u\u0000\u0000\u0194\u0195\u0005a\u0000\u0000\u0195\u0196\u0005"+
		"r\u0000\u0000\u0196\u0197\u0005e\u0000\u0000\u0197d\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0005v\u0000\u0000\u0199\u019a\u0005a\u0000\u0000\u019a"+
		"\u019b\u0005l\u0000\u0000\u019b\u019c\u0005u\u0000\u0000\u019c\u019d\u0005"+
		"e\u0000\u0000\u019df\u0001\u0000\u0000\u0000\u019e\u019f\u0005f\u0000"+
		"\u0000\u019f\u01a0\u0005i\u0000\u0000\u01a0\u01a1\u0005n\u0000\u0000\u01a1"+
		"\u01a2\u0005d\u0000\u0000\u01a2h\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005"+
		"c\u0000\u0000\u01a4\u01a5\u0005r\u0000\u0000\u01a5\u01a6\u0005o\u0000"+
		"\u0000\u01a6\u01a7\u0005s\u0000\u0000\u01a7\u01a8\u0005s\u0000\u0000\u01a8"+
		"j\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005p\u0000\u0000\u01aa\u01ab\u0005"+
		"r\u0000\u0000\u01ab\u01ac\u0005e\u0000\u0000\u01ac\u01ad\u0005d\u0000"+
		"\u0000\u01adl\u0001\u0000\u0000\u0000\u01ae\u01af\u0005e\u0000\u0000\u01af"+
		"\u01b0\u0005s\u0000\u0000\u01b0\u01b1\u0005t\u0000\u0000\u01b1\u01b2\u0005"+
		"i\u0000\u0000\u01b2\u01b3\u0005m\u0000\u0000\u01b3\u01b4\u0005a\u0000"+
		"\u0000\u01b4\u01b5\u0005t\u0000\u0000\u01b5\u01b6\u0005e\u0000\u0000\u01b6"+
		"n\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005i\u0000\u0000\u01b8\u01b9\u0005"+
		"f\u0000\u0000\u01b9p\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005t\u0000"+
		"\u0000\u01bb\u01bc\u0005h\u0000\u0000\u01bc\u01bd\u0005e\u0000\u0000\u01bd"+
		"\u01be\u0005n\u0000\u0000\u01ber\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"e\u0000\u0000\u01c0\u01c1\u0005l\u0000\u0000\u01c1\u01c2\u0005s\u0000"+
		"\u0000\u01c2\u01c3\u0005e\u0000\u0000\u01c3t\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0005e\u0000\u0000\u01c5\u01c6\u0005n\u0000\u0000\u01c6\u01c7\u0005"+
		"d\u0000\u0000\u01c7v\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005w\u0000"+
		"\u0000\u01c9\u01ca\u0005h\u0000\u0000\u01ca\u01cb\u0005i\u0000\u0000\u01cb"+
		"\u01cc\u0005l\u0000\u0000\u01cc\u01cd\u0005e\u0000\u0000\u01cdx\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0005f\u0000\u0000\u01cf\u01d0\u0005o\u0000"+
		"\u0000\u01d0\u01d1\u0005r\u0000\u0000\u01d1z\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0005d\u0000\u0000\u01d3\u01d4\u0005o\u0000\u0000\u01d4|\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0005a\u0000\u0000\u01d6\u01d7\u0005l\u0000"+
		"\u0000\u01d7\u01d8\u0005l\u0000\u0000\u01d8~\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0005p\u0000\u0000\u01da\u01db\u0005r\u0000\u0000\u01db\u01dc\u0005"+
		"i\u0000\u0000\u01dc\u01dd\u0005n\u0000\u0000\u01dd\u01de\u0005t\u0000"+
		"\u0000\u01de\u0080\u0001\u0000\u0000\u0000\u000f\u0000\u00a1\u00b9\u00c5"+
		"\u00cf\u00d6\u00d9\u00dc\u00e2\u00e5\u00ec\u00ef\u00f3\u00fd\u00ff\u0002"+
		"\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}