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
		T__9=10, T__10=11, T__11=12, WS=13, WHITESPACE=14, LPAREN=15, RPAREN=16, 
		COMMA=17, SEMICOLON=18, SYMBOLS=19, DQ=20, COMMENT=21, LINE_COMMENT=22, 
		BIGALPHA=23, SMALLALPHA=24, NUMBER=25, STRING=26, TRUE=27, FALSE=28, AND=29, 
		OR=30, CROSS_OPERATION=31, GENES=32, PARENT=33, GENERATION=34, DSLBOOLEAN=35, 
		DSLNUMBER=36, DSLSTRING=37, SET=38, DOM=39, PHENOTYPE=40, CODOMINANCE=41, 
		LOCATION=42, LABEL=43, GENOTYPE=44, FREQUENCY=45, PUNNET=46, VALUE=47, 
		FIND=48, CROSS=49, PRED=50, ESTIMATE=51, IF=52, THEN=53, ELSE=54, END=55, 
		WHILE=56, DO=57, ALL=58, PRINT=59;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_id = 2, RULE_declaration = 3, 
		RULE_type = 4, RULE_bool = 5, RULE_string = 6, RULE_number = 7, RULE_values = 8, 
		RULE_array_init = 9, RULE_array = 10, RULE_alpha = 11, RULE_alpanum = 12, 
		RULE_operator = 13, RULE_expresion = 14, RULE_assigments = 15, RULE_field = 16, 
		RULE_computations = 17, RULE_flow_structure = 18, RULE_condition = 19, 
		RULE_io = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "id", "declaration", "type", "bool", "string", 
			"number", "values", "array_init", "array", "alpha", "alpanum", "operator", 
			"expresion", "assigments", "field", "computations", "flow_structure", 
			"condition", "io"
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
			"'label'", "'genotype'", "'frequency'", "'square'", "'value'", "'find'", 
			"'cross'", "'pred'", "'estimate'", "'if'", "'then'", "'else'", "'end'", 
			"'while'", "'do'", "'all'", "'print'"
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
			"CODOMINANCE", "LOCATION", "LABEL", "GENOTYPE", "FREQUENCY", "PUNNET", 
			"VALUE", "FIND", "CROSS", "PRED", "ESTIMATE", "IF", "THEN", "ELSE", "END", 
			"WHILE", "DO", "ALL", "PRINT"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statements();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGALPHA) | (1L << SMALLALPHA) | (1L << NUMBER) | (1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << DSLBOOLEAN) | (1L << DSLNUMBER) | (1L << DSLSTRING) | (1L << SET) | (1L << DOM) | (1L << FIND) | (1L << CROSS) | (1L << PRED) | (1L << ESTIMATE) | (1L << IF) | (1L << WHILE) | (1L << PRINT))) != 0) );
			setState(47);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GENES:
			case PARENT:
			case GENERATION:
			case DSLBOOLEAN:
			case DSLNUMBER:
			case DSLSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				declaration();
				}
				break;
			case SET:
			case DOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				assigments();
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
			case NUMBER:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				flow_structure();
				}
				break;
			case FIND:
			case CROSS:
			case PRED:
			case ESTIMATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				computations();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
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
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					alpanum();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
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
			setState(61);
			type();
			setState(62);
			id();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(63);
				match(COMMA);
				setState(64);
				id();
				}
			}

			setState(67);
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
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << DSLBOOLEAN) | (1L << DSLNUMBER) | (1L << DSLSTRING))) != 0)) ) {
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
			setState(71);
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
			setState(73);
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
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				bool();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
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

	public static class Array_initContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).enterArray_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneticsGrammarListener ) ((GeneticsGrammarListener)listener).exitArray_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneticsGrammarVisitor ) return ((GeneticsGrammarVisitor<? extends T>)visitor).visitArray_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_init);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(82);
					values();
					}
					break;
				case 2:
					{
					setState(83);
					id();
					}
					break;
				case 3:
					{
					setState(84);
					alpha();
					}
					break;
				}
				setState(87);
				match(COMMA);
				setState(88);
				array_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90);
					values();
					}
					break;
				case 2:
					{
					setState(91);
					id();
					}
					break;
				case 3:
					{
					setState(92);
					alpha();
					}
					break;
				}
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
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
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
		enterRule(_localctx, 20, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			array_init();
			setState(99);
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
		enterRule(_localctx, 22, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 24, RULE_alpanum);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIGALPHA:
			case SMALLALPHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				alpha();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 28, RULE_expresion);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				bool();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				string();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				array();
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					alpha();
					}
					}
					setState(116); 
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
		enterRule(_localctx, 30, RULE_assigments);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(SET);
				setState(121);
				field();
				setState(122);
				id();
				setState(123);
				match(T__8);
				setState(124);
				expresion();
				setState(125);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(DOM);
				setState(128);
				match(T__9);
				setState(129);
				id();
				setState(130);
				match(T__10);
				setState(131);
				id();
				setState(132);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(SET);
				setState(135);
				field();
				setState(136);
				id();
				setState(137);
				match(T__8);
				setState(138);
				computations();
				setState(139);
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
		enterRule(_localctx, 32, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOM) | (1L << PHENOTYPE) | (1L << CODOMINANCE) | (1L << LOCATION) | (1L << LABEL) | (1L << GENOTYPE) | (1L << FREQUENCY) | (1L << PUNNET) | (1L << VALUE))) != 0)) ) {
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PRED() { return getToken(GeneticsGrammarParser.PRED, 0); }
		public TerminalNode ESTIMATE() { return getToken(GeneticsGrammarParser.ESTIMATE, 0); }
		public TerminalNode COMMA() { return getToken(GeneticsGrammarParser.COMMA, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
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
		enterRule(_localctx, 34, RULE_computations);
		int _la;
		try {
			int _alt;
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(FIND);
				setState(146);
				field();
				setState(147);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(PRED);
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(150);
						id();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(ESTIMATE);
				setState(156);
				field();
				setState(157);
				id();
				setState(158);
				match(COMMA);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					alpha();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(164);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(ESTIMATE);
				setState(167);
				field();
				setState(168);
				id();
				setState(169);
				match(COMMA);
				setState(171); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(170);
						alpha();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(173); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(CROSS);
				setState(176);
				id();
				setState(177);
				match(CROSS_OPERATION);
				setState(178);
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
		public TerminalNode IF() { return getToken(GeneticsGrammarParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(GeneticsGrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GeneticsGrammarParser.ELSE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(GeneticsGrammarParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public TerminalNode WHILE() { return getToken(GeneticsGrammarParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(GeneticsGrammarParser.DO, 0); }
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
		enterRule(_localctx, 36, RULE_flow_structure);
		int _la;
		try {
			int _alt;
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(IF);
				setState(183);
				condition();
				setState(184);
				match(THEN);
				setState(186); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(185);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(190);
				match(ELSE);
				setState(191);
				statements();
				setState(192);
				match(END);
				setState(193);
				match(SEMICOLON);
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				condition();
				setState(196);
				match(T__11);
				setState(197);
				condition();
				setState(198);
				match(T__9);
				setState(199);
				statements();
				setState(200);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(WHILE);
				setState(203);
				condition();
				setState(204);
				match(DO);
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					statements();
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGALPHA) | (1L << SMALLALPHA) | (1L << NUMBER) | (1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << DSLBOOLEAN) | (1L << DSLNUMBER) | (1L << DSLSTRING) | (1L << SET) | (1L << DOM) | (1L << FIND) | (1L << CROSS) | (1L << PRED) | (1L << ESTIMATE) | (1L << IF) | (1L << WHILE) | (1L << PRINT))) != 0) );
				setState(210);
				match(END);
				setState(211);
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
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				id();
				setState(216);
				operator();
				setState(217);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				id();
				setState(220);
				operator();
				setState(221);
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
		enterRule(_localctx, 40, RULE_io);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(PRINT);
				setState(226);
				id();
				setState(227);
				field();
				setState(228);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(PRINT);
				setState(231);
				id();
				setState(232);
				field();
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					alpha();
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(238);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(PRINT);
				setState(241);
				id();
				setState(242);
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
		"\u0004\u0001;\u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001"+
		"\u0002\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0003\tV\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t^\b\t\u0003\t`\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0003\fj\b\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000es\b"+
		"\u000e\u000b\u000e\f\u000et\u0003\u000ew\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u008e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011"+
		"\u0098\b\u0011\u000b\u0011\f\u0011\u0099\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00a1\b\u0011\u000b\u0011\f"+
		"\u0011\u00a2\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00ac\b\u0011\u000b\u0011\f\u0011"+
		"\u00ad\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00b5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u00bb\b\u0012\u000b\u0012\f\u0012\u00bc\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u00cf\b\u0012\u000b\u0012\f\u0012"+
		"\u00d0\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d6\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u00eb\b\u0014\u000b\u0014\f\u0014\u00ec\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00f5\b\u0014\u0001\u0014\u0001\u00bc\u0000\u0015\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000"+
		"\u0005\u0001\u0000 %\u0001\u0000\u001b\u001c\u0001\u0000\u0017\u0018\u0002"+
		"\u0000\u0003\b\u001d\u001e\u0001\u0000\'/\u0106\u0000+\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"=\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000"+
		"\u0000\fI\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014a\u0001"+
		"\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000"+
		"\u0000\u001ak\u0001\u0000\u0000\u0000\u001cv\u0001\u0000\u0000\u0000\u001e"+
		"\u008d\u0001\u0000\u0000\u0000 \u008f\u0001\u0000\u0000\u0000\"\u00b4"+
		"\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00df\u0001\u0000"+
		"\u0000\u0000(\u00f4\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000"+
		"+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0000"+
		"\u0000\u00010\u0001\u0001\u0000\u0000\u000017\u0003\u0006\u0003\u0000"+
		"27\u0003\u001e\u000f\u000037\u0003$\u0012\u000047\u0003\"\u0011\u0000"+
		"57\u0003(\u0014\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u0000"+
		"63\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000"+
		"\u00007\u0003\u0001\u0000\u0000\u00008:\u0003\u0018\f\u000098\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0003\b\u0004\u0000"+
		">A\u0003\u0004\u0002\u0000?@\u0005\u0011\u0000\u0000@B\u0003\u0004\u0002"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0012\u0000\u0000D\u0007\u0001\u0000\u0000\u0000"+
		"EF\u0007\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0007\u0001\u0000"+
		"\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u001a\u0000\u0000J\r\u0001"+
		"\u0000\u0000\u0000KL\u0005\u0019\u0000\u0000L\u000f\u0001\u0000\u0000"+
		"\u0000MQ\u0003\n\u0005\u0000NQ\u0003\u000e\u0007\u0000OQ\u0003\f\u0006"+
		"\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0011\u0001\u0000\u0000\u0000RV\u0003\u0010\b\u0000SV\u0003"+
		"\u0004\u0002\u0000TV\u0003\u0016\u000b\u0000UR\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0011\u0000\u0000XY\u0003\u0012\t\u0000Y`\u0001\u0000\u0000"+
		"\u0000Z^\u0003\u0010\b\u0000[^\u0003\u0004\u0002\u0000\\^\u0003\u0016"+
		"\u000b\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_U\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`\u0013\u0001\u0000\u0000\u0000ab\u0005\u0001"+
		"\u0000\u0000bc\u0003\u0012\t\u0000cd\u0005\u0002\u0000\u0000d\u0015\u0001"+
		"\u0000\u0000\u0000ef\u0007\u0002\u0000\u0000f\u0017\u0001\u0000\u0000"+
		"\u0000gj\u0003\u0016\u000b\u0000hj\u0005\u0019\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0019\u0001\u0000\u0000\u0000"+
		"kl\u0007\u0003\u0000\u0000l\u001b\u0001\u0000\u0000\u0000mw\u0003\n\u0005"+
		"\u0000nw\u0003\u000e\u0007\u0000ow\u0003\f\u0006\u0000pw\u0003\u0014\n"+
		"\u0000qs\u0003\u0016\u000b\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001"+
		"\u0000\u0000\u0000vm\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000"+
		"vo\u0001\u0000\u0000\u0000vp\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000"+
		"\u0000w\u001d\u0001\u0000\u0000\u0000xy\u0005&\u0000\u0000yz\u0003 \u0010"+
		"\u0000z{\u0003\u0004\u0002\u0000{|\u0005\t\u0000\u0000|}\u0003\u001c\u000e"+
		"\u0000}~\u0005\u0012\u0000\u0000~\u008e\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\'\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000\u0081\u0082"+
		"\u0003\u0004\u0002\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083\u0084"+
		"\u0003\u0004\u0002\u0000\u0084\u0085\u0005\u0012\u0000\u0000\u0085\u008e"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005&\u0000\u0000\u0087\u0088\u0003"+
		" \u0010\u0000\u0088\u0089\u0003\u0004\u0002\u0000\u0089\u008a\u0005\t"+
		"\u0000\u0000\u008a\u008b\u0003\"\u0011\u0000\u008b\u008c\u0005\u0012\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008dx\u0001\u0000\u0000\u0000"+
		"\u008d\u007f\u0001\u0000\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000"+
		"\u008e\u001f\u0001\u0000\u0000\u0000\u008f\u0090\u0007\u0004\u0000\u0000"+
		"\u0090!\u0001\u0000\u0000\u0000\u0091\u0092\u00050\u0000\u0000\u0092\u0093"+
		"\u0003 \u0010\u0000\u0093\u0094\u0003\u0004\u0002\u0000\u0094\u00b5\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u00052\u0000\u0000\u0096\u0098\u0003\u0004"+
		"\u0002\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u00b5\u0001\u0000\u0000\u0000\u009b\u009c\u00053\u0000"+
		"\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u009e\u0003\u0004\u0002\u0000"+
		"\u009e\u00a0\u0005\u0011\u0000\u0000\u009f\u00a1\u0003\u0016\u000b\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u000e\u0007\u0000"+
		"\u00a5\u00b5\u0001\u0000\u0000\u0000\u00a6\u00a7\u00053\u0000\u0000\u00a7"+
		"\u00a8\u0003 \u0010\u0000\u00a8\u00a9\u0003\u0004\u0002\u0000\u00a9\u00ab"+
		"\u0005\u0011\u0000\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b5"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u00051\u0000\u0000\u00b0\u00b1\u0003"+
		"\u0004\u0002\u0000\u00b1\u00b2\u0005\u001f\u0000\u0000\u00b2\u00b3\u0003"+
		"\u0004\u0002\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u0091\u0001"+
		"\u0000\u0000\u0000\u00b4\u0095\u0001\u0000\u0000\u0000\u00b4\u009b\u0001"+
		"\u0000\u0000\u0000\u00b4\u00a6\u0001\u0000\u0000\u0000\u00b4\u00af\u0001"+
		"\u0000\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u00054\u0000"+
		"\u0000\u00b7\u00b8\u0003&\u0013\u0000\u00b8\u00ba\u00055\u0000\u0000\u00b9"+
		"\u00bb\u0003\u0002\u0001\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u00056\u0000\u0000\u00bf\u00c0\u0003\u0002\u0001\u0000\u00c0\u00c1"+
		"\u00057\u0000\u0000\u00c1\u00c2\u0005\u0012\u0000\u0000\u00c2\u00d6\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0005\f"+
		"\u0000\u0000\u00c5\u00c6\u0003&\u0013\u0000\u00c6\u00c7\u0005\n\u0000"+
		"\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000\u00c8\u00c9\u0005\u0012\u0000"+
		"\u0000\u00c9\u00d6\u0001\u0000\u0000\u0000\u00ca\u00cb\u00058\u0000\u0000"+
		"\u00cb\u00cc\u0003&\u0013\u0000\u00cc\u00ce\u00059\u0000\u0000\u00cd\u00cf"+
		"\u0003\u0002\u0001\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u00057\u0000\u0000\u00d3\u00d4\u0005\u0012\u0000\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00b6\u0001\u0000\u0000\u0000\u00d5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d6%\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0003\u0004\u0002\u0000\u00d8\u00d9\u0003\u001a"+
		"\r\u0000\u00d9\u00da\u0003\u0004\u0002\u0000\u00da\u00e0\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0003\u0004\u0002\u0000\u00dc\u00dd\u0003\u001a\r\u0000"+
		"\u00dd\u00de\u0003\u001c\u000e\u0000\u00de\u00e0\u0001\u0000\u0000\u0000"+
		"\u00df\u00d7\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000"+
		"\u00e0\'\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005;\u0000\u0000\u00e2"+
		"\u00e3\u0003\u0004\u0002\u0000\u00e3\u00e4\u0003 \u0010\u0000\u00e4\u00e5"+
		"\u0005\u0012\u0000\u0000\u00e5\u00f5\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005;\u0000\u0000\u00e7\u00e8\u0003\u0004\u0002\u0000\u00e8\u00ea\u0003"+
		" \u0010\u0000\u00e9\u00eb\u0003\u0016\u000b\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0012\u0000\u0000\u00ef\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005;\u0000\u0000\u00f1\u00f2\u0003\u0004\u0002"+
		"\u0000\u00f2\u00f3\u0005\u0012\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00e1\u0001\u0000\u0000\u0000\u00f4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5)\u0001\u0000\u0000\u0000"+
		"\u0016-6;APU]_itv\u008d\u0099\u00a2\u00ad\u00b4\u00bc\u00d0\u00d5\u00df"+
		"\u00ec\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}