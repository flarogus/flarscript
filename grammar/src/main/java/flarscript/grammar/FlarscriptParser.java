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
		ASTERISK=14, PERCENT=15, LEFT_TRANSFER=16, SEMICOLON=17, SINGLE_LINE_COMMENT=18, 
		MULTILINE_COMMENT=19;
	public static final int
		RULE_flarscript = 0, RULE_statement = 1, RULE_expression = 2, RULE_operation = 3, 
		RULE_ends = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"flarscript", "statement", "expression", "operation", "ends"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'out'", "'('", "')'", 
			"'+'", "'-'", "'/'", "'*'", "'%'", "'<<'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "LPAREN", "RPAREN", "PLUS", "MINUS", "SLASH", 
			"ASTERISK", "PERCENT", "LEFT_TRANSFER", "SEMICOLON", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterFlarscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitFlarscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitFlarscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlarscriptContext flarscript() throws RecognitionException {
		FlarscriptContext _localctx = new FlarscriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flarscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << INTEGER) | (1L << STRING_DOUBLE) | (1L << STRING_SINGLE) | (1L << STRING_BACK) | (1L << KEY_OUT) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(10);
				statement();
				setState(17);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
					{
					setState(11);
					match(EOF);
					}
					break;
				case NEWLINE:
				case SEMICOLON:
					{
					setState(13); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(12);
						ends();
						}
						}
						setState(15); 
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
				setState(23);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode KEY_OUT() { return getToken(FlarscriptParser.KEY_OUT, 0); }
		public TerminalNode LEFT_TRANSFER() { return getToken(FlarscriptParser.LEFT_TRANSFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(28);
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
				setState(24);
				expression(0);
				}
				break;
			case KEY_OUT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(KEY_OUT);
				setState(26);
				match(LEFT_TRANSFER);
				setState(27);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ExpressionContext {
		public Token value;
		public TerminalNode STRING_DOUBLE() { return getToken(FlarscriptParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(FlarscriptParser.STRING_SINGLE, 0); }
		public TerminalNode STRING_BACK() { return getToken(FlarscriptParser.STRING_BACK, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberLiteralContext extends ExpressionContext {
		public Token value;
		public TerminalNode DECIMAL() { return getToken(FlarscriptParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(FlarscriptParser.INTEGER, 0); }
		public NumberLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				match(LPAREN);
				setState(32);
				expression(0);
				setState(33);
				match(RPAREN);
				}
				break;
			case DECIMAL:
			case INTEGER:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
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
				setState(36);
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
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationExpressionContext(new ExpressionContext(_parentctx, _parentState));
					((OperationExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(39);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(40);
					operation();
					setState(41);
					((OperationExpressionContext)_localctx).right = expression(5);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusOpContext extends OperationContext {
		public TerminalNode MINUS() { return getToken(FlarscriptParser.MINUS, 0); }
		public MinusOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterMinusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitMinusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloOpContext extends OperationContext {
		public TerminalNode PERCENT() { return getToken(FlarscriptParser.PERCENT, 0); }
		public ModuloOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterModuloOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitModuloOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitModuloOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusOpContext extends OperationContext {
		public TerminalNode PLUS() { return getToken(FlarscriptParser.PLUS, 0); }
		public PlusOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitPlusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideOpContext extends OperationContext {
		public TerminalNode SLASH() { return getToken(FlarscriptParser.SLASH, 0); }
		public DivideOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterDivideOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitDivideOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitDivideOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyOpContext extends OperationContext {
		public TerminalNode ASTERISK() { return getToken(FlarscriptParser.ASTERISK, 0); }
		public MultiplyOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterMultiplyOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitMultiplyOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitMultiplyOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLASH:
				_localctx = new DivideOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(SLASH);
				}
				break;
			case ASTERISK:
				_localctx = new MultiplyOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ASTERISK);
				}
				break;
			case PERCENT:
				_localctx = new ModuloOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(PERCENT);
				}
				break;
			case PLUS:
				_localctx = new PlusOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(MINUS);
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

	public static class EndsContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FlarscriptParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FlarscriptParser.NEWLINE, 0); }
		public EndsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).enterEnds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlarscriptParserListener ) ((FlarscriptParserListener)listener).exitEnds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlarscriptParserVisitor ) return ((FlarscriptParserVisitor<? extends T>)visitor).visitEnds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndsContext ends() throws RecognitionException {
		EndsContext _localctx = new EndsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0003\u0000\u0012\b\u0000\u0005\u0000\u0014\b\u0000\n\u0000"+
		"\f\u0000\u0017\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002"+
		"/\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001"+
		"\u0004\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001\u0000\u0003\u0004"+
		"\u0001\u0000\u0005\u0007\u0002\u0000\u0001\u0001\u0011\u0011?\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004%\u0001"+
		"\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000"+
		"\u0000\n\u0011\u0003\u0002\u0001\u0000\u000b\u0012\u0005\u0000\u0000\u0001"+
		"\f\u000e\u0003\b\u0004\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000b\u0001\u0000"+
		"\u0000\u0000\u0011\r\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\n\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0018\u001d\u0003\u0004\u0002\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a"+
		"\u001b\u0005\u0010\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c"+
		"\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001d"+
		"\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0002\uffff\uffff\u0000"+
		"\u001f \u0005\t\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\n\u0000"+
		"\u0000\"&\u0001\u0000\u0000\u0000#&\u0007\u0000\u0000\u0000$&\u0007\u0001"+
		"\u0000\u0000%\u001e\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000&-\u0001\u0000\u0000\u0000\'(\n\u0004\u0000"+
		"\u0000()\u0003\u0006\u0003\u0000)*\u0003\u0004\u0002\u0005*,\u0001\u0000"+
		"\u0000\u0000+\'\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000006\u0005\r\u0000\u000016\u0005\u000e\u0000"+
		"\u000026\u0005\u000f\u0000\u000036\u0005\u000b\u0000\u000046\u0005\f\u0000"+
		"\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0007"+
		"\u0001\u0000\u0000\u000078\u0007\u0002\u0000\u00008\t\u0001\u0000\u0000"+
		"\u0000\u0007\u000f\u0011\u0015\u001c%-5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}