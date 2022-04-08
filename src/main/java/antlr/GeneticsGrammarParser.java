// Generated from D:/HW University/Year2/PBL_4/dsl_gen/src/main/java/antlr\GeneticsGrammar.g4 by ANTLR 4.9.2
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
		LOCATION=36, LABEL=37, GENOTYPE=38, FREQUENCY=39, PUNNET=40, FIND=41, 
		CROSS=42, PRED=43, ESTIMATE=44, IF=45, THEN=46, ELSE=47, END=48, WHILE=49, 
		DO=50, ALL=51, PRINT=52;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_id = 2, RULE_declaration = 3, 
		RULE_type = 4, RULE_bool = 5, RULE_string = 6, RULE_number = 7, RULE_alpha = 8, 
		RULE_alpanum = 9, RULE_operator = 10, RULE_expresion = 11, RULE_assigments = 12, 
		RULE_field = 13, RULE_computations = 14, RULE_flow_structure = 15, RULE_condition = 16, 
		RULE_io = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "id", "declaration", "type", "bool", "string", 
			"number", "alpha", "alpanum", "operator", "expresion", "assigments", 
			"field", "computations", "flow_structure", "condition", "io"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'='", "':'", "'->'", 
			"'?'", null, "'('", "')'", "','", "';'", null, "'\"'", null, null, null, 
			null, null, null, "'true'", "'false'", "'and'", "'or'", "'x'", "'genes'", 
			"'parents'", "'generation'", "'set'", "'dom'", "'phenotype'", "'codominance'", 
			"'location'", "'label'", "'genotype'", "'frequency '", "'square'", "'find'", 
			"'cross'", "'pred'", "'estimate'", "'if'", "'then'", "'else'", "'end'", 
			"'while'", "'do'", "'all'", "'print'"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				statements();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGALPHA) | (1L << SMALLALPHA) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << SET) | (1L << DOM) | (1L << FIND) | (1L << PRED) | (1L << ESTIMATE) | (1L << IF) | (1L << WHILE) | (1L << PRINT))) != 0) );
			setState(41);
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				assigments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				flow_structure();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				computations();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				io();
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
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					alpanum();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
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
		public TerminalNode COOMA() { return getToken(GeneticsGrammarParser.COOMA, 0); }
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
			setState(55);
			type();
			setState(56);
			id();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COOMA) {
				{
				setState(57);
				match(COOMA);
				setState(58);
				id();
				}
			}

			setState(61);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GENES:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(GENES);
				}
				break;
			case PARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(PARENT);
				}
				break;
			case GENERATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(GENERATION);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				string();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				number();
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
		enterRule(_localctx, 16, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 18, RULE_alpanum);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				alpha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				alpha();
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
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << AND) | (1L << OR))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				bool();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				string();
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					alpha();
					}
					}
					setState(92); 
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
		enterRule(_localctx, 24, RULE_assigments);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(SET);
				setState(97);
				field();
				setState(98);
				id();
				setState(99);
				match(T__6);
				setState(100);
				expresion();
				setState(101);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(DOM);
				setState(104);
				match(T__7);
				setState(105);
				id();
				setState(106);
				match(T__8);
				setState(107);
				id();
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(SET);
				setState(111);
				field();
				setState(112);
				id();
				setState(113);
				match(T__6);
				setState(114);
				computations();
				setState(115);
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
		enterRule(_localctx, 26, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOM) | (1L << PHENOTYPE) | (1L << CODOMINANCE) | (1L << LOCATION) | (1L << LABEL) | (1L << GENOTYPE) | (1L << FREQUENCY) | (1L << PUNNET))) != 0)) ) {
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
		public TerminalNode SEMICOLON() { return getToken(GeneticsGrammarParser.SEMICOLON, 0); }
		public TerminalNode PRED() { return getToken(GeneticsGrammarParser.PRED, 0); }
		public TerminalNode ESTIMATE() { return getToken(GeneticsGrammarParser.ESTIMATE, 0); }
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
		public TerminalNode LPAREN() { return getToken(GeneticsGrammarParser.LPAREN, 0); }
		public TerminalNode COOMA() { return getToken(GeneticsGrammarParser.COOMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeneticsGrammarParser.RPAREN, 0); }
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
		enterRule(_localctx, 28, RULE_computations);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(FIND);
				setState(122);
				field();
				setState(123);
				id();
				setState(124);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(PRED);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					id();
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGALPHA) | (1L << SMALLALPHA) | (1L << NUMBER))) != 0) );
				setState(132);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(ESTIMATE);
				setState(135);
				id();
				setState(136);
				number();
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(ESTIMATE);
				setState(140);
				field();
				setState(141);
				id();
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					alpha();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(147);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				id();
				setState(150);
				match(T__6);
				setState(151);
				match(CROSS);
				setState(152);
				match(LPAREN);
				setState(153);
				id();
				setState(154);
				match(COOMA);
				setState(155);
				id();
				setState(156);
				match(RPAREN);
				setState(157);
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
		enterRule(_localctx, 30, RULE_flow_structure);
		int _la;
		try {
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IF);
				setState(162);
				condition();
				setState(163);
				match(THEN);
				setState(165); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(164);
						statements();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(167); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(169);
				match(ELSE);
				setState(170);
				statements();
				setState(171);
				match(END);
				setState(172);
				match(SEMICOLON);
				}
				break;
			case BIGALPHA:
			case SMALLALPHA:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				condition();
				setState(175);
				match(T__9);
				setState(176);
				condition();
				setState(177);
				match(T__7);
				setState(178);
				statements();
				setState(179);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(WHILE);
				setState(182);
				condition();
				setState(183);
				match(DO);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					statements();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGALPHA) | (1L << SMALLALPHA) | (1L << NUMBER) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << GENES) | (1L << PARENT) | (1L << GENERATION) | (1L << SET) | (1L << DOM) | (1L << FIND) | (1L << PRED) | (1L << ESTIMATE) | (1L << IF) | (1L << WHILE) | (1L << PRINT))) != 0) );
				setState(189);
				match(END);
				setState(190);
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
		enterRule(_localctx, 32, RULE_condition);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				id();
				setState(195);
				operator();
				setState(196);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				id();
				setState(199);
				operator();
				setState(200);
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
		enterRule(_localctx, 34, RULE_io);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(PRINT);
				setState(205);
				id();
				setState(206);
				field();
				setState(207);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(PRINT);
				setState(210);
				id();
				setState(211);
				field();
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					alpha();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BIGALPHA || _la==SMALLALPHA );
				setState(217);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(PRINT);
				setState(220);
				id();
				setState(221);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00e4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\6\4\66\n\4\r\4\16\4\67\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\5\13U\n\13\3\f\3\f\3\r\3\r\3\r\3\r\6\r]\n\r\r\r\16\r^\5\ra\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16x\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u0083\n\20\r\20\16\20\u0084\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0092\n\20\r\20\16\20\u0093\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a2\n\20"+
		"\3\21\3\21\3\21\3\21\6\21\u00a8\n\21\r\21\16\21\u00a9\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00bc"+
		"\n\21\r\21\16\21\u00bd\3\21\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\6\23\u00d8\n\23\r\23\16\23\u00d9\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00e2\n\23\3\23\3\u00a9\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\6\3\2\32\33\3\2\26\27\4\2\3\b\34\35\3\2#*\2\u00f3\2"+
		"\'\3\2\2\2\4\62\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2"+
		"\16K\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30`\3\2\2"+
		"\2\32w\3\2\2\2\34y\3\2\2\2\36\u00a1\3\2\2\2 \u00c2\3\2\2\2\"\u00cc\3\2"+
		"\2\2$\u00e1\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
		"\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-\63\5\b\5\2.\63\5\32\16\2/\63\5 \21"+
		"\2\60\63\5\36\20\2\61\63\5$\23\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62"+
		"\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\66\5\24\13\2\65\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29:\5\n\6\2:=\5\6\4\2;"+
		"<\7\20\2\2<>\5\6\4\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\21\2\2@\t\3\2\2"+
		"\2AH\7\37\2\2BH\7 \2\2CH\7!\2\2DH\5\f\7\2EH\5\16\b\2FH\5\20\t\2GA\3\2"+
		"\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\13\3\2\2\2IJ\t"+
		"\2\2\2J\r\3\2\2\2KL\7\31\2\2L\17\3\2\2\2MN\7\30\2\2N\21\3\2\2\2OP\t\3"+
		"\2\2P\23\3\2\2\2QU\5\22\n\2RU\7\30\2\2SU\5\22\n\2TQ\3\2\2\2TR\3\2\2\2"+
		"TS\3\2\2\2U\25\3\2\2\2VW\t\4\2\2W\27\3\2\2\2Xa\5\f\7\2Ya\5\20\t\2Za\5"+
		"\16\b\2[]\5\22\n\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`\\\3\2\2\2a\31\3\2\2\2bc\7\"\2\2cd\5\34"+
		"\17\2de\5\6\4\2ef\7\t\2\2fg\5\30\r\2gh\7\21\2\2hx\3\2\2\2ij\7#\2\2jk\7"+
		"\n\2\2kl\5\6\4\2lm\7\13\2\2mn\5\6\4\2no\7\21\2\2ox\3\2\2\2pq\7\"\2\2q"+
		"r\5\34\17\2rs\5\6\4\2st\7\t\2\2tu\5\36\20\2uv\7\21\2\2vx\3\2\2\2wb\3\2"+
		"\2\2wi\3\2\2\2wp\3\2\2\2x\33\3\2\2\2yz\t\5\2\2z\35\3\2\2\2{|\7+\2\2|}"+
		"\5\34\17\2}~\5\6\4\2~\177\7\21\2\2\177\u00a2\3\2\2\2\u0080\u0082\7-\2"+
		"\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\21\2\2"+
		"\u0087\u00a2\3\2\2\2\u0088\u0089\7.\2\2\u0089\u008a\5\6\4\2\u008a\u008b"+
		"\5\20\t\2\u008b\u008c\7\21\2\2\u008c\u00a2\3\2\2\2\u008d\u008e\7.\2\2"+
		"\u008e\u008f\5\34\17\2\u008f\u0091\5\6\4\2\u0090\u0092\5\22\n\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\21\2\2\u0096\u00a2\3\2\2\2\u0097"+
		"\u0098\5\6\4\2\u0098\u0099\7\t\2\2\u0099\u009a\7,\2\2\u009a\u009b\7\16"+
		"\2\2\u009b\u009c\5\6\4\2\u009c\u009d\7\20\2\2\u009d\u009e\5\6\4\2\u009e"+
		"\u009f\7\17\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\3\2\2\2\u00a1{\3\2\2"+
		"\2\u00a1\u0080\3\2\2\2\u00a1\u0088\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0097"+
		"\3\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\5\"\22\2\u00a5"+
		"\u00a7\7\60\2\2\u00a6\u00a8\5\4\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7\61\2\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7\62\2\2\u00ae\u00af\7"+
		"\21\2\2\u00af\u00c3\3\2\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\f\2\2\u00b2"+
		"\u00b3\5\"\22\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b6\7"+
		"\21\2\2\u00b6\u00c3\3\2\2\2\u00b7\u00b8\7\63\2\2\u00b8\u00b9\5\"\22\2"+
		"\u00b9\u00bb\7\64\2\2\u00ba\u00bc\5\4\3\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\7\62\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00a3\3"+
		"\2\2\2\u00c2\u00b0\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00c5"+
		"\5\6\4\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\5\6\4\2\u00c7\u00cd\3\2\2\2"+
		"\u00c8\u00c9\5\6\4\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\5\30\r\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd#\3\2\2\2\u00ce"+
		"\u00cf\7\66\2\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2"+
		"\7\21\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\7\66\2\2\u00d4\u00d5\5\6\4\2"+
		"\u00d5\u00d7\5\34\17\2\u00d6\u00d8\5\22\n\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7\21\2\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\7\66\2\2\u00de"+
		"\u00df\5\6\4\2\u00df\u00e0\7\21\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00ce\3"+
		"\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2%\3\2\2\2\24)\62\67"+
		"=GT^`w\u0084\u0093\u00a1\u00a9\u00bd\u00c2\u00cc\u00d9\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}