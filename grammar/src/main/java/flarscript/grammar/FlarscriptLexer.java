// Generated from /data/data/com.termux/files/home/projects/flarscript/grammar/FlarscriptLexer.g4 by ANTLR 4.10.1
package flarscript.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlarscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WH=2, DECIMAL=3, INTEGER=4, STRING_DOUBLE=5, STRING_SINGLE=6, 
		STRING_BACK=7, KEY_OUT=8, LPAREN=9, RPAREN=10, PLUS=11, MINUS=12, SLASH=13, 
		ASTERISK=14, PERCENT=15, LEFT_TRANSFER=16, EQUAL=17, LESS=18, GREATER=19, 
		LESS_OR_EQUAL=20, GREATER_OR_EQUAL=21, SEMICOLON=22, SINGLE_LINE_COMMENT=23, 
		MULTILINE_COMMENT=24;
	public static final int
		COMMENTS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "LPAREN", "RPAREN", "PLUS", "MINUS", "SLASH", 
			"ASTERISK", "PERCENT", "LEFT_TRANSFER", "EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "SEMICOLON", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'out'", "'('", "')'", 
			"'+'", "'-'", "'/'", "'*'", "'%'", "'<<'", "'=='", "'<'", "'>'", "'<='", 
			"'>='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "LPAREN", "RPAREN", "PLUS", "MINUS", "SLASH", 
			"ASTERISK", "PERCENT", "LEFT_TRANSFER", "EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "SEMICOLON", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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


	public FlarscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlarscriptLexer.g4"; }

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
		"\u0004\u0000\u0018\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002<\b\u0002"+
		"\u000b\u0002\f\u0002=\u0001\u0002\u0001\u0002\u0004\u0002B\b\u0002\u000b"+
		"\u0002\f\u0002C\u0003\u0002F\b\u0002\u0001\u0003\u0004\u0003I\b\u0003"+
		"\u000b\u0003\f\u0003J\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004"+
		"\f\u0004R\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0090\b\u0016\n\u0016\f\u0016\u0093"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u009b\b\u0017\n\u0017\f\u0017\u009e\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004PYb\u009c\u0000"+
		"\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\u0003\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001"+
		"\u000009\u00ad\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00014\u0001\u0000\u0000\u0000\u0003"+
		"6\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007H\u0001"+
		"\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000"+
		"\u0000\r^\u0001\u0000\u0000\u0000\u000fg\u0001\u0000\u0000\u0000\u0011"+
		"k\u0001\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015o\u0001"+
		"\u0000\u0000\u0000\u0017q\u0001\u0000\u0000\u0000\u0019s\u0001\u0000\u0000"+
		"\u0000\u001bu\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001f"+
		"y\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000\u0000#\u007f\u0001\u0000"+
		"\u0000\u0000%\u0081\u0001\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000"+
		"\u0000)\u0086\u0001\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-"+
		"\u008b\u0001\u0000\u0000\u0000/\u0096\u0001\u0000\u0000\u000015\u0007"+
		"\u0000\u0000\u000023\u0005\r\u0000\u000035\u0005\n\u0000\u000041\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u00005\u0002\u0001\u0000\u0000"+
		"\u000067\u0007\u0001\u0000\u000078\u0001\u0000\u0000\u000089\u0006\u0001"+
		"\u0000\u00009\u0004\u0001\u0000\u0000\u0000:<\u0007\u0002\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>E\u0001\u0000\u0000\u0000?A\u0005.\u0000"+
		"\u0000@B\u0007\u0002\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u0006\u0001\u0000\u0000\u0000GI\u0007\u0002\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\b\u0001\u0000\u0000\u0000LP\u0005\"\u0000\u0000MO"+
		"\t\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000T\n\u0001\u0000"+
		"\u0000\u0000UY\u0005\'\u0000\u0000VX\t\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005\'\u0000\u0000]\f\u0001\u0000\u0000\u0000^b\u0005`\u0000\u0000"+
		"_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000ef\u0005`\u0000\u0000f\u000e\u0001\u0000"+
		"\u0000\u0000gh\u0005o\u0000\u0000hi\u0005u\u0000\u0000ij\u0005t\u0000"+
		"\u0000j\u0010\u0001\u0000\u0000\u0000kl\u0005(\u0000\u0000l\u0012\u0001"+
		"\u0000\u0000\u0000mn\u0005)\u0000\u0000n\u0014\u0001\u0000\u0000\u0000"+
		"op\u0005+\u0000\u0000p\u0016\u0001\u0000\u0000\u0000qr\u0005-\u0000\u0000"+
		"r\u0018\u0001\u0000\u0000\u0000st\u0005/\u0000\u0000t\u001a\u0001\u0000"+
		"\u0000\u0000uv\u0005*\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005"+
		"%\u0000\u0000x\u001e\u0001\u0000\u0000\u0000yz\u0005<\u0000\u0000z{\u0005"+
		"<\u0000\u0000{ \u0001\u0000\u0000\u0000|}\u0005=\u0000\u0000}~\u0005="+
		"\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0080\u0005<\u0000\u0000"+
		"\u0080$\u0001\u0000\u0000\u0000\u0081\u0082\u0005>\u0000\u0000\u0082&"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000\u0000\u0084\u0085\u0005"+
		"=\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086\u0087\u0005>\u0000"+
		"\u0000\u0087\u0088\u0005=\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005;\u0000\u0000\u008a,\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"/\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u0091\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\b\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0016\u0001\u0000"+
		"\u0095.\u0001\u0000\u0000\u0000\u0096\u0097\u0005/\u0000\u0000\u0097\u0098"+
		"\u0005*\u0000\u0000\u0098\u009c\u0001\u0000\u0000\u0000\u0099\u009b\t"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000\u00a0\u00a1\u0005/\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0017\u0001"+
		"\u0000\u00a30\u0001\u0000\u0000\u0000\u000b\u00004=CEJPYb\u0091\u009c"+
		"\u0002\u0006\u0000\u0000\u0000\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}