// Generated from /data/data/com.termux/files/home/projects/flarscript/grammar/FlarscriptParser.g4 by ANTLR 4.10.1
package flarscript.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlarscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WH=2, DECIMAL=3, INTEGER=4, STRING_DOUBLE=5, STRING_SINGLE=6, 
		STRING_BACK=7, KEY_OUT=8, KEY_IF=9, KEY_ELSE=10, TRUE=11, FALSE=12, NULL=13, 
		LPAREN=14, RPAREN=15, LCURLY=16, RCURLY=17, PLUS=18, MINUS=19, SLASH=20, 
		ASTERISK=21, PERCENT=22, LEFT_TRANSFER=23, EQUAL=24, LESS=25, GREATER=26, 
		LESS_OR_EQUAL=27, GREATER_OR_EQUAL=28, SEMICOLON=29, ID=30, SINGLE_LINE_COMMENT=31, 
		MULTILINE_COMMENT=32;
	public static final int
		RULE_flarscript = 0, RULE_statement = 1, RULE_expression = 2, RULE_statementBlock = 3, 
		RULE_ifPart = 4, RULE_elsePart = 5, RULE_ends = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"flarscript", "statement", "expression", "statementBlock", "ifPart", 
			"elsePart", "ends"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'out'", "'if'", "'else'", 
			"'true'", "'false'", "'null'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", 
			"'/'", "'*'", "'%'", "'<<'", "'=='", "'<'", "'>'", "'<='", "'>='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "KEY_IF", "KEY_ELSE", "TRUE", "FALSE", "NULL", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "PLUS", "MINUS", "SLASH", "ASTERISK", 
			"PERCENT", "LEFT_TRANSFER", "EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "SEMICOLON", "ID", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "FlarscriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlarscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FlarscriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FlarscriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FlarscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flarscript; }
	}

	public final FlarscriptContext flarscript() throws RecognitionException {
		FlarscriptContext _localctx = new FlarscriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flarscript);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << INTEGER) | (1L << STRING_DOUBLE) | (1L << STRING_SINGLE) | (1L << STRING_BACK) | (1L << KEY_OUT) | (1L << KEY_IF) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN))) != 0)) {
				{
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(14);
						statement();
						}
						} 
					}
					setState(19);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(20);
				statement();
				}
			}

			setState(23);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public IfPartContext ifPart() {
			return getRuleContext(IfPartContext.class,0);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SingleExpressionContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleExpressionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode KEY_OUT() { return getToken(FlarscriptParser.KEY_OUT, 0); }
		public TerminalNode LEFT_TRANSFER() { return getToken(FlarscriptParser.LEFT_TRANSFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case INTEGER:
			case STRING_DOUBLE:
			case STRING_SINGLE:
			case STRING_BACK:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				expression(0);
				}
				break;
			case KEY_OUT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(KEY_OUT);
				setState(27);
				match(LEFT_TRANSFER);
				setState(28);
				expression(0);
				}
				break;
			case KEY_IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				ifPart();
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(30);
					elsePart();
					}
					break;
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(FlarscriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FlarscriptParser.RPAREN, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparsionExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(FlarscriptParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(FlarscriptParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(FlarscriptParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(FlarscriptParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(FlarscriptParser.GREATER_OR_EQUAL, 0); }
		public ComparsionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PlusOrMinusExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(FlarscriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FlarscriptParser.MINUS, 0); }
		public PlusOrMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends ExpressionContext {
		public Token value;
		public TerminalNode STRING_DOUBLE() { return getToken(FlarscriptParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(FlarscriptParser.STRING_SINGLE, 0); }
		public TerminalNode STRING_BACK() { return getToken(FlarscriptParser.STRING_BACK, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends ExpressionContext {
		public Token value;
		public TerminalNode FALSE() { return getToken(FlarscriptParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(FlarscriptParser.TRUE, 0); }
		public BooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplyOrDivideExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(FlarscriptParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(FlarscriptParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(FlarscriptParser.PERCENT, 0); }
		public MultiplyOrDivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NullLiteralContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(FlarscriptParser.NULL, 0); }
		public NullLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NumberLiteralContext extends ExpressionContext {
		public Token value;
		public TerminalNode DECIMAL() { return getToken(FlarscriptParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(FlarscriptParser.INTEGER, 0); }
		public NumberLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(36);
				match(LPAREN);
				setState(37);
				expression(0);
				setState(38);
				match(RPAREN);
				}
				break;
			case DECIMAL:
			case INTEGER:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				((NumberLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==INTEGER) ) {
					((NumberLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING_DOUBLE:
			case STRING_SINGLE:
			case STRING_BACK:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				((StringLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_DOUBLE) | (1L << STRING_SINGLE) | (1L << STRING_BACK))) != 0)) ) {
					((StringLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				((BooleanLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NULL:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyOrDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyOrDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47);
						((MultiplyOrDivideExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << ASTERISK) | (1L << PERCENT))) != 0)) ) {
							((MultiplyOrDivideExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(48);
						((MultiplyOrDivideExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new PlusOrMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PlusOrMinusExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(50);
						((PlusOrMinusExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusOrMinusExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(51);
						((PlusOrMinusExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ComparsionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparsionExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(53);
						((ComparsionExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
							((ComparsionExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(54);
						((ComparsionExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EndsContext> ends() {
			return getRuleContexts(EndsContext.class);
		}
		public EndsContext ends(int i) {
			return getRuleContext(EndsContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(60);
					statement();
					setState(61);
					ends();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(68);
			statement();
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

	public static class IfPartContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode KEY_IF() { return getToken(FlarscriptParser.KEY_IF, 0); }
		public TerminalNode LPAREN() { return getToken(FlarscriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FlarscriptParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(FlarscriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(FlarscriptParser.RCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPart; }
	}

	public final IfPartContext ifPart() throws RecognitionException {
		IfPartContext _localctx = new IfPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifPart);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(KEY_IF);
				setState(71);
				match(LPAREN);
				setState(72);
				((IfPartContext)_localctx).condition = expression(0);
				setState(73);
				match(RPAREN);
				setState(74);
				match(LCURLY);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << INTEGER) | (1L << STRING_DOUBLE) | (1L << STRING_SINGLE) | (1L << STRING_BACK) | (1L << KEY_OUT) | (1L << KEY_IF) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN))) != 0)) {
					{
					setState(75);
					statementBlock();
					}
				}

				setState(78);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(KEY_IF);
				setState(81);
				match(LPAREN);
				setState(82);
				((IfPartContext)_localctx).condition = expression(0);
				setState(83);
				match(RPAREN);
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(84);
					statement();
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

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode KEY_ELSE() { return getToken(FlarscriptParser.KEY_ELSE, 0); }
		public TerminalNode LCURLY() { return getToken(FlarscriptParser.LCURLY, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(FlarscriptParser.RCURLY, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elsePart);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(KEY_ELSE);
				setState(90);
				match(LCURLY);
				setState(91);
				statementBlock();
				setState(92);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(KEY_ELSE);
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(95);
					statement();
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

	public static class EndsContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FlarscriptParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FlarscriptParser.NEWLINE, 0); }
		public EndsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ends; }
	}

	public final EndsContext ends() throws RecognitionException {
		EndsContext _localctx = new EndsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010\b\u0000"+
		"\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0003\u0000\u0016\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"V\b\u0004\u0003\u0004X\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0003"+
		"\u0005c\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0002\u0011A\u0001"+
		"\u0004\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0007\u0001\u0000\u0003"+
		"\u0004\u0001\u0000\u0005\u0007\u0001\u0000\u000b\f\u0001\u0000\u0014\u0016"+
		"\u0001\u0000\u0012\u0013\u0001\u0000\u0018\u001c\u0002\u0000\u0001\u0001"+
		"\u001d\u001dq\u0000\u0015\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004,\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001"+
		"\u0000\u0015\u0011\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000"+
		"\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\"\u0003\u0004\u0002\u0000"+
		"\u001a\u001b\u0005\b\u0000\u0000\u001b\u001c\u0005\u0017\u0000\u0000\u001c"+
		"\"\u0003\u0004\u0002\u0000\u001d\u001f\u0003\b\u0004\u0000\u001e \u0003"+
		"\n\u0005\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u0019\u0001\u0000\u0000\u0000"+
		"!\u001a\u0001\u0000\u0000\u0000!\u001d\u0001\u0000\u0000\u0000\"\u0003"+
		"\u0001\u0000\u0000\u0000#$\u0006\u0002\uffff\uffff\u0000$%\u0005\u000e"+
		"\u0000\u0000%&\u0003\u0004\u0002\u0000&\'\u0005\u000f\u0000\u0000\'-\u0001"+
		"\u0000\u0000\u0000(-\u0007\u0000\u0000\u0000)-\u0007\u0001\u0000\u0000"+
		"*-\u0007\u0002\u0000\u0000+-\u0005\r\u0000\u0000,#\u0001\u0000\u0000\u0000"+
		",(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-9\u0001\u0000\u0000\u0000./\n\u0003\u0000"+
		"\u0000/0\u0007\u0003\u0000\u000008\u0003\u0004\u0002\u000412\n\u0002\u0000"+
		"\u000023\u0007\u0004\u0000\u000038\u0003\u0004\u0002\u000345\n\u0001\u0000"+
		"\u000056\u0007\u0005\u0000\u000068\u0003\u0004\u0002\u00027.\u0001\u0000"+
		"\u0000\u000071\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":\u0005\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0003\u0002"+
		"\u0001\u0000=>\u0003\f\u0006\u0000>@\u0001\u0000\u0000\u0000?<\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"DE\u0003\u0002\u0001\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\t\u0000"+
		"\u0000GH\u0005\u000e\u0000\u0000HI\u0003\u0004\u0002\u0000IJ\u0005\u000f"+
		"\u0000\u0000JL\u0005\u0010\u0000\u0000KM\u0003\u0006\u0003\u0000LK\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0011\u0000\u0000OX\u0001\u0000\u0000\u0000PQ\u0005\t\u0000\u0000"+
		"QR\u0005\u000e\u0000\u0000RS\u0003\u0004\u0002\u0000SU\u0005\u000f\u0000"+
		"\u0000TV\u0003\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WF\u0001\u0000\u0000\u0000WP\u0001"+
		"\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YZ\u0005\n\u0000\u0000Z["+
		"\u0005\u0010\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005\u0011\u0000"+
		"\u0000]c\u0001\u0000\u0000\u0000^`\u0005\n\u0000\u0000_a\u0003\u0002\u0001"+
		"\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000"+
		"\u0000\u0000bY\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000c\u000b"+
		"\u0001\u0000\u0000\u0000de\u0007\u0006\u0000\u0000e\r\u0001\u0000\u0000"+
		"\u0000\r\u0011\u0015\u001f!,79ALUW`b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}