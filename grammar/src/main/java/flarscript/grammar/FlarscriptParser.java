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
		STRING_BACK=7, KEY_OUT=8, LPAREN=9, RPAREN=10, PLUS=11, MINUS=12, SLASH=13, 
		ASTERISK=14, PERCENT=15, LEFT_TRANSFER=16, LESS=17, LESS_OR_EQUAL=18, 
		EQUAL=19, GREATER_OR_EQUAL=20, GREATER=21, SEMICOLON=22, SINGLE_LINE_COMMENT=23, 
		MULTILINE_COMMENT=24;
	public static final int
		RULE_flarscript = 0, RULE_statement = 1, RULE_expression = 2, RULE_ends = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"flarscript", "statement", "expression", "ends"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'out'", "'('", "')'", 
			"'+'", "'-'", "'/'", "'*'", "'%'", "'<<'", "'<'", "'<='", "'=='", "'>='", 
			"'>'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "LPAREN", "RPAREN", "PLUS", "MINUS", "SLASH", 
			"ASTERISK", "PERCENT", "LEFT_TRANSFER", "LESS", "LESS_OR_EQUAL", "EQUAL", 
			"GREATER_OR_EQUAL", "GREATER", "SEMICOLON", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(FlarscriptParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(FlarscriptParser.EOF, i);
		}
		public List<EndsContext> ends() {
			return getRuleContexts(EndsContext.class);
		}
		public EndsContext ends(int i) {
			return getRuleContext(EndsContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << INTEGER) | (1L << STRING_DOUBLE) | (1L << STRING_SINGLE) | (1L << STRING_BACK) | (1L << KEY_OUT) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(8);
				statement();
				setState(15);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
					{
					setState(9);
					match(EOF);
					}
					break;
				case NEWLINE:
				case SEMICOLON:
					{
					setState(11); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(10);
						ends();
						}
						}
						setState(13); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE || _la==SEMICOLON );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
			case INTEGER:
			case STRING_DOUBLE:
			case STRING_SINGLE:
			case STRING_BACK:
			case LPAREN:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				expression(0);
				}
				break;
			case KEY_OUT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(KEY_OUT);
				setState(24);
				match(LEFT_TRANSFER);
				setState(25);
				expression(0);
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(29);
				match(LPAREN);
				setState(30);
				expression(0);
				setState(31);
				match(RPAREN);
				}
				break;
			case DECIMAL:
			case INTEGER:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
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
				setState(34);
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
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyOrDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyOrDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
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
						setState(39);
						((MultiplyOrDivideExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new PlusOrMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PlusOrMinusExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41);
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
						setState(42);
						((PlusOrMinusExpressionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ComparsionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ComparsionExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(44);
						((ComparsionExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_OR_EQUAL) | (1L << EQUAL) | (1L << GREATER_OR_EQUAL) | (1L << GREATER))) != 0)) ) {
							((ComparsionExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(45);
						((ComparsionExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(50);
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
		enterRule(_localctx, 6, RULE_ends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		"\u0004\u0001\u00186\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0003\u0000\u0010\b"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"/\b\u0002\n\u0002\f\u00022\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0000\u0001\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u0006\u0001\u0000"+
		"\u0003\u0004\u0001\u0000\u0005\u0007\u0001\u0000\r\u000f\u0001\u0000\u000b"+
		"\f\u0001\u0000\u0011\u0015\u0002\u0000\u0001\u0001\u0016\u0016:\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b\u000f\u0003"+
		"\u0002\u0001\u0000\t\u0010\u0005\u0000\u0000\u0001\n\f\u0003\u0006\u0003"+
		"\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001"+
		"\u0000\u0000\u0000\u000f\t\u0001\u0000\u0000\u0000\u000f\u000b\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\b\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0004\u0002"+
		"\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018\u0019\u0005\u0010\u0000\u0000"+
		"\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u0017\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0006\u0002\uffff\uffff\u0000\u001d\u001e\u0005\t\u0000\u0000"+
		"\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\n\u0000\u0000 $\u0001"+
		"\u0000\u0000\u0000!$\u0007\u0000\u0000\u0000\"$\u0007\u0001\u0000\u0000"+
		"#\u001c\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$0\u0001\u0000\u0000\u0000%&\n\u0003\u0000\u0000&\'\u0007"+
		"\u0002\u0000\u0000\'/\u0003\u0004\u0002\u0004()\n\u0002\u0000\u0000)*"+
		"\u0007\u0003\u0000\u0000*/\u0003\u0004\u0002\u0003+,\n\u0001\u0000\u0000"+
		",-\u0007\u0004\u0000\u0000-/\u0003\u0004\u0002\u0002.%\u0001\u0000\u0000"+
		"\u0000.(\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0005"+
		"\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0007\u0005\u0000"+
		"\u00004\u0007\u0001\u0000\u0000\u0000\u0007\r\u000f\u0013\u001a#.0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}