// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneticsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, WS=14, WHITESPACE=15, LPAREN=16, 
		RPAREN=17, COMMA=18, SEMICOLON=19, SYMBOLS=20, DQ=21, COMMENT=22, LINE_COMMENT=23, 
		BIGALPHA=24, SMALLALPHA=25, NUMBER=26, STRING=27, TRUE=28, FALSE=29, AND=30, 
		OR=31, CROSS_OPERATION=32, FAMILY=33, GENES=34, PARENT=35, GENERATION=36, 
		DSLBOOLEAN=37, DSLNUMBER=38, DSLSTRING=39, SET=40, DOM=41, PHENOTYPE=42, 
		CODOMINANCE=43, LOCATION=44, LABEL=45, PARENTS=46, GENOTYPE=47, FREQUENCY=48, 
		PUNNET=49, VALUE=50, GEN=51, FIND=52, CROSS=53, PRED=54, ESTIMATE=55, 
		IF=56, THEN=57, ELSE=58, END=59, WHILE=60, DO=61, FOR=62, ALL=63, PRINT=64;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_id = 2, RULE_declaration = 3, 
		RULE_type = 4, RULE_bool = 5, RULE_string = 6, RULE_number = 7, RULE_values = 8, 
		RULE_array_init_id = 9, RULE_array_init_alpha = 10, RULE_array_init_values = 11, 
		RULE_array = 12, RULE_alpha = 13, RULE_alpanum = 14, RULE_operator = 15, 
		RULE_expresion = 16, RULE_assigments = 17, RULE_field = 18, RULE_computations = 19, 
		RULE_flow_structure = 20, RULE_condition = 21, RULE_io = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "id", "declaration", "type", "bool", "string", 
			"number", "values", "array_init_id", "array_init_alpha", "array_init_values", 
			"array", "alpha", "alpanum", "operator", "expresion", "assigments", "field", 
			"computations", "flow_structure", "condition", "io"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", 
			"':'", "'->'", "'?'", "'from'", null, "' '", "'('", "')'", "','", "';'", 
			null, "'\"'", null, null, null, null, null, null, "'true'", "'false'", 
			"'and'", "'or'", "'*'", "'family'", "'genes'", "'parents'", "'generation'", 
			"'boolean'", "'number'", "'string'", "'set'", "'dom'", "'phenotype'", 
			"'codominance'", "'location'", "'label'", "'ancestors'", "'genotype'", 
			"'frequency'", "'square'", "'value'", "'gen'", "'find'", "'cross'", "'pred'", 
			"'estimate'", "'if'", "'then'", "'else'", "'end'", "'while'", "'do'", 
			"'for'", "'all'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "WHITESPACE", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", 
			"SYMBOLS", "DQ", "COMMENT", "LINE_COMMENT", "BIGALPHA", "SMALLALPHA", 
			"NUMBER", "STRING", "TRUE", "FALSE", "AND", "OR", "CROSS_OPERATION", 
			"FAMILY", "GENES", "PARENT", "GENERATION", "DSLBOOLEAN", "DSLNUMBER", 
			"DSLSTRING", "SET", "DOM", "PHENOTYPE", "CODOMINANCE", "LOCATION", "LABEL", 
			"PARENTS", "GENOTYPE", "FREQUENCY", "PUNNET", "VALUE", "GEN", "FIND", 
			"CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", "WHILE", "DO", 
			"FOR", "ALL", "PRINT"
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

	@Override
	public String getGrammarFileName() { return "GeneticsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeneticsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GeneticsGrammarParser.EOF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statements();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BIGALPHA - 24)) | (1L << (SMALLALPHA - 24)) | (1L << (NUMBER - 24)) | (1L << (FAMILY - 24)) | (1L << (GENES - 24)) | (1L << (PARENT - 24)) | (1L << (GENERATION - 24)) | (1L << (DSLBOOLEAN - 24)) | (1L << (DSLNUMBER - 24)) | (1L << (DSLSTRING - 24)) | (1L << (SET - 24)) | (1L << (DOM - 24)) | (1L << (FIND - 24)) | (1L << (CROSS - 24)) | (1L << (PRED - 24)) | (1L << (ESTIMATE - 24)) | (1L << (IF - 24)) | (1L << (WHILE - 24)) | (1L << (FOR - 24)) | (1L << (PRINT - 24)))) != 0) );
			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssigmentsContext assigments() {
			return getRuleContext(AssigmentsContext.class,0);
		}
		public Flow_structureContext flow_structure() {
			return getRuleContext(Flow_structureContext.class,0);
		}
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FAMILY:
			case GENES:
			case PARENT:
			case GENERATION:
			case DSLBOOLEAN:
			case DSLNUMBER:
			case DSLSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				declaration();
				}
				break;
			case SET:
			case DOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assigments();
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
			case NUMBER:
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				flow_structure();
				}
				break;
			case FIND:
			case CROSS:
			case PRED:
			case ESTIMATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				computations();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				io();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public List<AlpanumContext> alpanum() {
			return getRuleContexts(AlpanumContext.class);
		}
		public AlpanumContext alpanum(int i) {
			return getRuleContext(AlpanumContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					alpanum();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			type();
			setState(66);
			id();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(67);
				match(COMMA);
				setState(68);
				id();
				}
			}

			setState(71);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode GENES() { return getToken(GeneticsGrammarParser.GENES, 0); }
		public TerminalNode PARENT() { return getToken(GeneticsGrammarParser.PARENT, 0); }
		public TerminalNode GENERATION() { return getToken(GeneticsGrammarParser.GENERATION, 0); }
		public TerminalNode DSLBOOLEAN() { return getToken(GeneticsGrammarParser.DSLBOOLEAN, 0); }
		public TerminalNode DSLNUMBER() { return getToken(GeneticsGrammarParser.DSLNUMBER, 0); }
		public TerminalNode DSLSTRING() { return getToken(GeneticsGrammarParser.DSLSTRING, 0); }
		public TerminalNode FAMILY() { return getToken(GeneticsGrammarParser.FAMILY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAMILY) | (1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << DSLBOOLEAN) | (1L << DSLNUMBER) | (1L << DSLSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GeneticsGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GeneticsGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GeneticsGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(GeneticsGrammarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_values);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				bool();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_init_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public Array_init_idContext array_init_id() {
			return getRuleContext(Array_init_idContext.class,0);
		}
		public Array_init_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterArray_init_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitArray_init_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitArray_init_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_init_idContext array_init_id() throws RecognitionException {
		Array_init_idContext _localctx = new Array_init_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_init_id);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				id();
				setState(87);
				match(COMMA);
				setState(88);
				array_init_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_init_alphaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public Array_init_alphaContext array_init_alpha() {
			return getRuleContext(Array_init_alphaContext.class,0);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public Array_init_alphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterArray_init_alpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitArray_init_alpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitArray_init_alpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_init_alphaContext array_init_alpha() throws RecognitionException {
		Array_init_alphaContext _localctx = new Array_init_alphaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_init_alpha);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					alpha();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(98);
				match(COMMA);
				setState(99);
				array_init_alpha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					alpha();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_init_valuesContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public Array_init_valuesContext array_init_values() {
			return getRuleContext(Array_init_valuesContext.class,0);
		}
		public Array_init_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterArray_init_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitArray_init_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitArray_init_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_init_valuesContext array_init_values() throws RecognitionException {
		Array_init_valuesContext _localctx = new Array_init_valuesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_init_values);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				values();
				setState(109);
				match(COMMA);
				setState(110);
				array_init_values();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				values();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public Array_init_alphaContext array_init_alpha() {
			return getRuleContext(Array_init_alphaContext.class,0);
		}
		public Array_init_idContext array_init_id() {
			return getRuleContext(Array_init_idContext.class,0);
		}
		public Array_init_valuesContext array_init_values() {
			return getRuleContext(Array_init_valuesContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(116);
				array_init_alpha();
				}
				break;
			case 2:
				{
				setState(117);
				array_init_id();
				}
				break;
			case 3:
				{
				setState(118);
				array_init_values();
				}
				break;
			}
			setState(121);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode BIGALPHA() { return getToken(GeneticsGrammarParser.BIGALPHA, 0); }
		public TerminalNode SMALLALPHA() { return getToken(GeneticsGrammarParser.SMALLALPHA, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==BIGALPHA || _la==SMALLALPHA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlpanumContext extends ParserRuleContext {
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GeneticsGrammarParser.NUMBER, 0); }
		public AlpanumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpanum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterAlpanum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitAlpanum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitAlpanum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlpanumContext alpanum() throws RecognitionException {
		AlpanumContext _localctx = new AlpanumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alpanum);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIGALPHA:
			case SMALLALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				alpha();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GeneticsGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(GeneticsGrammarParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				bool();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				string();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				array();
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					alpha();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(GeneticsGrammarParser.SET, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public TerminalNode DOM() { return getToken(GeneticsGrammarParser.DOM, 0); }
		public ComputationsContext computations() {
			return getRuleContext(ComputationsContext.class,0);
		}
		public AssigmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterAssigments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitAssigments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitAssigments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentsContext assigments() throws RecognitionException {
		AssigmentsContext _localctx = new AssigmentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assigments);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(SET);
				setState(143);
				field();
				setState(144);
				id();
				setState(145);
				match(T__8);
				setState(146);
				expresion();
				setState(147);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(DOM);
				setState(150);
				match(T__9);
				setState(151);
				id();
				setState(152);
				match(T__10);
				setState(153);
				id();
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(SET);
				setState(157);
				field();
				setState(158);
				id();
				setState(159);
				match(T__8);
				setState(160);
				computations();
				setState(161);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(GeneticsGrammarParser.LABEL, 0); }
		public TerminalNode PHENOTYPE() { return getToken(GeneticsGrammarParser.PHENOTYPE, 0); }
		public TerminalNode DOM() { return getToken(GeneticsGrammarParser.DOM, 0); }
		public TerminalNode CODOMINANCE() { return getToken(GeneticsGrammarParser.CODOMINANCE, 0); }
		public TerminalNode LOCATION() { return getToken(GeneticsGrammarParser.LOCATION, 0); }
		public TerminalNode GENOTYPE() { return getToken(GeneticsGrammarParser.GENOTYPE, 0); }
		public TerminalNode FREQUENCY() { return getToken(GeneticsGrammarParser.FREQUENCY, 0); }
		public TerminalNode PUNNET() { return getToken(GeneticsGrammarParser.PUNNET, 0); }
		public TerminalNode VALUE() { return getToken(GeneticsGrammarParser.VALUE, 0); }
		public TerminalNode PARENTS() { return getToken(GeneticsGrammarParser.PARENTS, 0); }
		public TerminalNode GEN() { return getToken(GeneticsGrammarParser.GEN, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOM) | (1L << PHENOTYPE) | (1L << CODOMINANCE) | (1L << LOCATION) | (1L << LABEL) | (1L << PARENTS) | (1L << GENOTYPE) | (1L << FREQUENCY) | (1L << PUNNET) | (1L << VALUE) | (1L << GEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComputationsContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(GeneticsGrammarParser.FIND, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public TerminalNode PRED() { return getToken(GeneticsGrammarParser.PRED, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode ESTIMATE() { return getToken(GeneticsGrammarParser.ESTIMATE, 0); }
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(GeneticsGrammarParser.CROSS, 0); }
		public TerminalNode CROSS_OPERATION() { return getToken(GeneticsGrammarParser.CROSS_OPERATION, 0); }
		public ComputationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterComputations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitComputations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitComputations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputationsContext computations() throws RecognitionException {
		ComputationsContext _localctx = new ComputationsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_computations);
		int _la;
		try {
			int _alt;
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(FIND);
				setState(168);
				field();
				setState(170); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(169);
						alpha();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(172); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(PRED);
				setState(175);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(PRED);
				setState(177);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(ESTIMATE);
				setState(179);
				field();
				setState(180);
				id();
				setState(181);
				match(COMMA);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					alpha();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(187);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(ESTIMATE);
				setState(190);
				field();
				setState(191);
				id();
				setState(192);
				match(COMMA);
				setState(194); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(193);
						alpha();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(196); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(CROSS);
				setState(199);
				id();
				setState(200);
				match(CROSS_OPERATION);
				setState(201);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_structureContext extends ParserRuleContext {
		public IdContext iterator;
		public TerminalNode IF() { return getToken(GeneticsGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GeneticsGrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GeneticsGrammarParser.ELSE, 0); }
		public TerminalNode END() { return getToken(GeneticsGrammarParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(GeneticsGrammarParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(GeneticsGrammarParser.DO, 0); }
		public TerminalNode FOR() { return getToken(GeneticsGrammarParser.FOR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Flow_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterFlow_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitFlow_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitFlow_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_structureContext flow_structure() throws RecognitionException {
		Flow_structureContext _localctx = new Flow_structureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flow_structure);
		int _la;
		try {
			int _alt;
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(IF);
				setState(206);
				condition();
				setState(207);
				match(THEN);
				setState(209); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(208);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(211); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(213);
				match(ELSE);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					statements();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BIGALPHA - 24)) | (1L << (SMALLALPHA - 24)) | (1L << (NUMBER - 24)) | (1L << (FAMILY - 24)) | (1L << (GENES - 24)) | (1L << (PARENT - 24)) | (1L << (GENERATION - 24)) | (1L << (DSLBOOLEAN - 24)) | (1L << (DSLNUMBER - 24)) | (1L << (DSLSTRING - 24)) | (1L << (SET - 24)) | (1L << (DOM - 24)) | (1L << (FIND - 24)) | (1L << (CROSS - 24)) | (1L << (PRED - 24)) | (1L << (ESTIMATE - 24)) | (1L << (IF - 24)) | (1L << (WHILE - 24)) | (1L << (FOR - 24)) | (1L << (PRINT - 24)))) != 0) );
				setState(219);
				match(END);
				setState(220);
				match(SEMICOLON);
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				condition();
				setState(223);
				match(T__11);
				setState(224);
				statements();
				setState(225);
				match(T__9);
				setState(226);
				statements();
				setState(227);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(WHILE);
				setState(230);
				condition();
				setState(231);
				match(DO);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					statements();
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BIGALPHA - 24)) | (1L << (SMALLALPHA - 24)) | (1L << (NUMBER - 24)) | (1L << (FAMILY - 24)) | (1L << (GENES - 24)) | (1L << (PARENT - 24)) | (1L << (GENERATION - 24)) | (1L << (DSLBOOLEAN - 24)) | (1L << (DSLNUMBER - 24)) | (1L << (DSLSTRING - 24)) | (1L << (SET - 24)) | (1L << (DOM - 24)) | (1L << (FIND - 24)) | (1L << (CROSS - 24)) | (1L << (PRED - 24)) | (1L << (ESTIMATE - 24)) | (1L << (IF - 24)) | (1L << (WHILE - 24)) | (1L << (FOR - 24)) | (1L << (PRINT - 24)))) != 0) );
				setState(237);
				match(END);
				setState(238);
				match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(FOR);
				setState(241);
				((Flow_structureContext)_localctx).iterator = id();
				setState(242);
				match(T__12);
				setState(243);
				id();
				setState(244);
				match(T__9);
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					statements();
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (BIGALPHA - 24)) | (1L << (SMALLALPHA - 24)) | (1L << (NUMBER - 24)) | (1L << (FAMILY - 24)) | (1L << (GENES - 24)) | (1L << (PARENT - 24)) | (1L << (GENERATION - 24)) | (1L << (DSLBOOLEAN - 24)) | (1L << (DSLNUMBER - 24)) | (1L << (DSLSTRING - 24)) | (1L << (SET - 24)) | (1L << (DOM - 24)) | (1L << (FIND - 24)) | (1L << (CROSS - 24)) | (1L << (PRED - 24)) | (1L << (ESTIMATE - 24)) | (1L << (IF - 24)) | (1L << (WHILE - 24)) | (1L << (FOR - 24)) | (1L << (PRINT - 24)))) != 0) );
				setState(250);
				match(END);
				setState(251);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condition);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				id();
				setState(256);
				operator();
				setState(257);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				id();
				setState(260);
				operator();
				setState(261);
				expresion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GeneticsGrammarParser.PRINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_io);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(PRINT);
				setState(266);
				id();
				setState(267);
				field();
				setState(268);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(PRINT);
				setState(271);
				id();
				setState(272);
				field();
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					alpha();
					}
					}
					setState(276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(278);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(PRINT);
				setState(281);
				id();
				setState(282);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u011f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000"+
		"\f\u00001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0004\u0002"+
		">\b\u0002\u000b\u0002\f\u0002?\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\bU\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\\\b\t\u0001\n\u0004\n_\b\n\u000b\n\f\n`\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\ng\b\n\u000b\n\f\nh\u0003\nk\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000br\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fx\b\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0080\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u0089\b\u0010\u000b\u0010\f\u0010\u008a\u0003\u0010\u008d"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a4\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u00ab"+
		"\b\u0013\u000b\u0013\f\u0013\u00ac\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u00b8\b\u0013\u000b\u0013\f\u0013\u00b9\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u00c3\b\u0013\u000b\u0013\f\u0013\u00c4\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cc\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00d2\b\u0014\u000b\u0014"+
		"\f\u0014\u00d3\u0001\u0014\u0001\u0014\u0004\u0014\u00d8\b\u0014\u000b"+
		"\u0014\f\u0014\u00d9\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00ea\b\u0014\u000b"+
		"\u0014\f\u0014\u00eb\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00f7"+
		"\b\u0014\u000b\u0014\f\u0014\u00f8\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00fe\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0108\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0113\b\u0016\u000b\u0016"+
		"\f\u0016\u0114\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u011d\b\u0016\u0001\u0016\u0001\u00d3\u0000\u0017"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,\u0000\u0005\u0001\u0000!\'\u0001\u0000\u001c\u001d"+
		"\u0001\u0000\u0018\u0019\u0002\u0000\u0003\b\u001e\u001f\u0001\u0000)"+
		"3\u0132\u0000/\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000"+
		"\u0004=\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bI\u0001"+
		"\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000"+
		"\u000eO\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000\u0000\u0012["+
		"\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016q\u0001\u0000"+
		"\u0000\u0000\u0018s\u0001\u0000\u0000\u0000\u001a{\u0001\u0000\u0000\u0000"+
		"\u001c\u007f\u0001\u0000\u0000\u0000\u001e\u0081\u0001\u0000\u0000\u0000"+
		" \u008c\u0001\u0000\u0000\u0000\"\u00a3\u0001\u0000\u0000\u0000$\u00a5"+
		"\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00fd\u0001\u0000"+
		"\u0000\u0000*\u0107\u0001\u0000\u0000\u0000,\u011c\u0001\u0000\u0000\u0000"+
		".0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u0000"+
		"5;\u0003\u0006\u0003\u00006;\u0003\"\u0011\u00007;\u0003(\u0014\u0000"+
		"8;\u0003&\u0013\u00009;\u0003,\u0016\u0000:5\u0001\u0000\u0000\u0000:"+
		"6\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<>\u0003"+
		"\u001c\u000e\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005\u0001\u0000"+
		"\u0000\u0000AB\u0003\b\u0004\u0000BE\u0003\u0004\u0002\u0000CD\u0005\u0012"+
		"\u0000\u0000DF\u0003\u0004\u0002\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0013\u0000\u0000"+
		"H\u0007\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000J\t\u0001\u0000"+
		"\u0000\u0000KL\u0007\u0001\u0000\u0000L\u000b\u0001\u0000\u0000\u0000"+
		"MN\u0005\u001b\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u001a\u0000"+
		"\u0000P\u000f\u0001\u0000\u0000\u0000QU\u0003\n\u0005\u0000RU\u0003\u000e"+
		"\u0007\u0000SU\u0003\f\u0006\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0011\u0001\u0000\u0000\u0000"+
		"VW\u0003\u0004\u0002\u0000WX\u0005\u0012\u0000\u0000XY\u0003\u0012\t\u0000"+
		"Y\\\u0001\u0000\u0000\u0000Z\\\u0003\u0004\u0002\u0000[V\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]_\u0003"+
		"\u001a\r\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0012\u0000\u0000cd\u0003\u0014\n\u0000dk\u0001\u0000\u0000\u0000"+
		"eg\u0003\u001a\r\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000j^\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000k\u0015\u0001"+
		"\u0000\u0000\u0000lm\u0003\u0010\b\u0000mn\u0005\u0012\u0000\u0000no\u0003"+
		"\u0016\u000b\u0000or\u0001\u0000\u0000\u0000pr\u0003\u0010\b\u0000ql\u0001"+
		"\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0017\u0001\u0000\u0000"+
		"\u0000sw\u0005\u0001\u0000\u0000tx\u0003\u0014\n\u0000ux\u0003\u0012\t"+
		"\u0000vx\u0003\u0016\u000b\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0002\u0000\u0000z\u0019\u0001\u0000\u0000\u0000{|\u0007\u0002\u0000"+
		"\u0000|\u001b\u0001\u0000\u0000\u0000}\u0080\u0003\u001a\r\u0000~\u0080"+
		"\u0005\u001a\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\u001d\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0003"+
		"\u0000\u0000\u0082\u001f\u0001\u0000\u0000\u0000\u0083\u008d\u0003\n\u0005"+
		"\u0000\u0084\u008d\u0003\u000e\u0007\u0000\u0085\u008d\u0003\f\u0006\u0000"+
		"\u0086\u008d\u0003\u0018\f\u0000\u0087\u0089\u0003\u001a\r\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u0083\u0001\u0000\u0000\u0000\u008c"+
		"\u0084\u0001\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000\u0000\u008c"+
		"\u0086\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d"+
		"!\u0001\u0000\u0000\u0000\u008e\u008f\u0005(\u0000\u0000\u008f\u0090\u0003"+
		"$\u0012\u0000\u0090\u0091\u0003\u0004\u0002\u0000\u0091\u0092\u0005\t"+
		"\u0000\u0000\u0092\u0093\u0003 \u0010\u0000\u0093\u0094\u0005\u0013\u0000"+
		"\u0000\u0094\u00a4\u0001\u0000\u0000\u0000\u0095\u0096\u0005)\u0000\u0000"+
		"\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0003\u0004\u0002\u0000\u0098"+
		"\u0099\u0005\u000b\u0000\u0000\u0099\u009a\u0003\u0004\u0002\u0000\u009a"+
		"\u009b\u0005\u0013\u0000\u0000\u009b\u00a4\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005(\u0000\u0000\u009d\u009e\u0003$\u0012\u0000\u009e\u009f\u0003"+
		"\u0004\u0002\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0003&"+
		"\u0013\u0000\u00a1\u00a2\u0005\u0013\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u008e\u0001\u0000\u0000\u0000\u00a3\u0095\u0001\u0000"+
		"\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a4#\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0007\u0004\u0000\u0000\u00a6%\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u00054\u0000\u0000\u00a8\u00aa\u0003$\u0012\u0000\u00a9\u00ab"+
		"\u0003\u001a\r\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00cc\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"6\u0000\u0000\u00af\u00cc\u0003\u0004\u0002\u0000\u00b0\u00b1\u00056\u0000"+
		"\u0000\u00b1\u00cc\u0003\u0018\f\u0000\u00b2\u00b3\u00057\u0000\u0000"+
		"\u00b3\u00b4\u0003$\u0012\u0000\u00b4\u00b5\u0003\u0004\u0002\u0000\u00b5"+
		"\u00b7\u0005\u0012\u0000\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u000e\u0007\u0000\u00bc\u00cc"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u00057\u0000\u0000\u00be\u00bf\u0003"+
		"$\u0012\u0000\u00bf\u00c0\u0003\u0004\u0002\u0000\u00c0\u00c2\u0005\u0012"+
		"\u0000\u0000\u00c1\u00c3\u0003\u001a\r\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00cc\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u00055\u0000\u0000\u00c7\u00c8\u0003\u0004\u0002\u0000"+
		"\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00ca\u0003\u0004\u0002\u0000\u00ca"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cb\u00a7\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ae\u0001\u0000\u0000\u0000\u00cb\u00b0\u0001\u0000\u0000\u0000\u00cb"+
		"\u00b2\u0001\u0000\u0000\u0000\u00cb\u00bd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u00058\u0000\u0000\u00ce\u00cf\u0003*\u0015\u0000\u00cf\u00d1\u00059"+
		"\u0000\u0000\u00d0\u00d2\u0003\u0002\u0001\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u0005:\u0000\u0000\u00d6\u00d8\u0003\u0002\u0001"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005;\u0000\u0000"+
		"\u00dc\u00dd\u0005\u0013\u0000\u0000\u00dd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0003*\u0015\u0000\u00df\u00e0\u0005\f\u0000\u0000\u00e0"+
		"\u00e1\u0003\u0002\u0001\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0002\u0001\u0000\u00e3\u00e4\u0005\u0013\u0000\u0000\u00e4\u00fe"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005<\u0000\u0000\u00e6\u00e7\u0003"+
		"*\u0015\u0000\u00e7\u00e9\u0005=\u0000\u0000\u00e8\u00ea\u0003\u0002\u0001"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005;\u0000\u0000"+
		"\u00ee\u00ef\u0005\u0013\u0000\u0000\u00ef\u00fe\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005>\u0000\u0000\u00f1\u00f2\u0003\u0004\u0002\u0000\u00f2"+
		"\u00f3\u0005\r\u0000\u0000\u00f3\u00f4\u0003\u0004\u0002\u0000\u00f4\u00f6"+
		"\u0005\n\u0000\u0000\u00f5\u00f7\u0003\u0002\u0001\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005;\u0000\u0000\u00fb\u00fc\u0005\u0013"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00cd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00de\u0001\u0000\u0000\u0000\u00fd\u00e5\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f0\u0001\u0000\u0000\u0000\u00fe)\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0003\u0004\u0002\u0000\u0100\u0101\u0003\u001e\u000f"+
		"\u0000\u0101\u0102\u0003\u0004\u0002\u0000\u0102\u0108\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0003\u0004\u0002\u0000\u0104\u0105\u0003\u001e\u000f"+
		"\u0000\u0105\u0106\u0003 \u0010\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u00ff\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000"+
		"\u0108+\u0001\u0000\u0000\u0000\u0109\u010a\u0005@\u0000\u0000\u010a\u010b"+
		"\u0003\u0004\u0002\u0000\u010b\u010c\u0003$\u0012\u0000\u010c\u010d\u0005"+
		"\u0013\u0000\u0000\u010d\u011d\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"@\u0000\u0000\u010f\u0110\u0003\u0004\u0002\u0000\u0110\u0112\u0003$\u0012"+
		"\u0000\u0111\u0113\u0003\u001a\r\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u0013\u0000\u0000\u0117\u011d\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005@\u0000\u0000\u0119\u011a\u0003\u0004\u0002\u0000\u011a"+
		"\u011b\u0005\u0013\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u0109\u0001\u0000\u0000\u0000\u011c\u010e\u0001\u0000\u0000\u0000\u011c"+
		"\u0118\u0001\u0000\u0000\u0000\u011d-\u0001\u0000\u0000\u0000\u001b1:"+
		"?ET[`hjqw\u007f\u008a\u008c\u00a3\u00ac\u00b9\u00c4\u00cb\u00d3\u00d9"+
		"\u00eb\u00f8\u00fd\u0107\u0114\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}