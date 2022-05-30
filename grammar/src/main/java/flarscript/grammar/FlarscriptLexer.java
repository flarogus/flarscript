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
		ASTERISK=14, PERCENT=15, LEFT_TRANSFER=16, SEMICOLON=17, SINGLE_LINE_COMMENT=18, 
		MULTILINE_COMMENT=19;
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
			"ASTERISK", "PERCENT", "LEFT_TRANSFER", "SEMICOLON", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT"
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
		"\u0004\u0000\u0013\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"+\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001\u0002\u0001\u0002\u0004"+
		"\u00028\b\u0002\u000b\u0002\f\u00029\u0003\u0002<\b\u0002\u0001\u0003"+
		"\u0004\u0003?\b\u0003\u000b\u0003\f\u0003@\u0001\u0004\u0001\u0004\u0005"+
		"\u0004E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006\n\u0006"+
		"\f\u0006Z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011y\b\u0011\n\u0011\f\u0011"+
		"|\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0084\b\u0012\n\u0012\f\u0012\u0087\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004FOX\u0085"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0003"+
		"\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u000009\u0096\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"*\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000"+
		"\u0000\u000bK\u0001\u0000\u0000\u0000\rT\u0001\u0000\u0000\u0000\u000f"+
		"]\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013c\u0001"+
		"\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g\u0001\u0000\u0000"+
		"\u0000\u0019i\u0001\u0000\u0000\u0000\u001bk\u0001\u0000\u0000\u0000\u001d"+
		"m\u0001\u0000\u0000\u0000\u001fo\u0001\u0000\u0000\u0000!r\u0001\u0000"+
		"\u0000\u0000#t\u0001\u0000\u0000\u0000%\u007f\u0001\u0000\u0000\u0000"+
		"\'+\u0007\u0000\u0000\u0000()\u0005\r\u0000\u0000)+\u0005\n\u0000\u0000"+
		"*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+\u0002\u0001\u0000"+
		"\u0000\u0000,-\u0007\u0001\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0006"+
		"\u0001\u0000\u0000/\u0004\u0001\u0000\u0000\u000002\u0007\u0002\u0000"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004;\u0001\u0000\u0000\u000057\u0005"+
		".\u0000\u000068\u0007\u0002\u0000\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u0006\u0001\u0000\u0000\u0000=?\u0007\u0002\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\b\u0001\u0000\u0000\u0000BF\u0005\"\u0000"+
		"\u0000CE\t\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\"\u0000\u0000J\n\u0001"+
		"\u0000\u0000\u0000KO\u0005\'\u0000\u0000LN\t\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0005\'\u0000\u0000S\f\u0001\u0000\u0000\u0000TX\u0005`\u0000"+
		"\u0000UW\t\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005`\u0000\u0000\\\u000e\u0001"+
		"\u0000\u0000\u0000]^\u0005o\u0000\u0000^_\u0005u\u0000\u0000_`\u0005t"+
		"\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005(\u0000\u0000b\u0012"+
		"\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000d\u0014\u0001\u0000\u0000"+
		"\u0000ef\u0005+\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005-\u0000"+
		"\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005/\u0000\u0000j\u001a\u0001"+
		"\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u001c\u0001\u0000\u0000\u0000"+
		"mn\u0005%\u0000\u0000n\u001e\u0001\u0000\u0000\u0000op\u0005<\u0000\u0000"+
		"pq\u0005<\u0000\u0000q \u0001\u0000\u0000\u0000rs\u0005;\u0000\u0000s"+
		"\"\u0001\u0000\u0000\u0000tu\u0005/\u0000\u0000uv\u0005/\u0000\u0000v"+
		"z\u0001\u0000\u0000\u0000wy\b\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\u0011"+
		"\u0001\u0000~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005/\u0000\u0000"+
		"\u0080\u0081\u0005*\u0000\u0000\u0081\u0085\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\t\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005*\u0000\u0000\u0089\u008a\u0005"+
		"/\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0006\u0012"+
		"\u0001\u0000\u008c&\u0001\u0000\u0000\u0000\u000b\u0000*39;@FOXz\u0085"+
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