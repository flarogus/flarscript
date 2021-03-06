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
		STRING_BACK=7, KEY_OUT=8, KEY_IF=9, KEY_ELSE=10, TRUE=11, FALSE=12, NULL=13, 
		LPAREN=14, RPAREN=15, LCURLY=16, RCURLY=17, PLUS=18, MINUS=19, SLASH=20, 
		ASTERISK=21, PERCENT=22, LEFT_TRANSFER=23, EQUAL=24, LESS=25, GREATER=26, 
		LESS_OR_EQUAL=27, GREATER_OR_EQUAL=28, SEMICOLON=29, ID=30, SINGLE_LINE_COMMENT=31, 
		MULTILINE_COMMENT=32;
	public static final int
		COMMENTS=2, LINEFEED=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS", "LINEFEED"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WH", "DECIMAL", "INTEGER", "STRING_DOUBLE", "STRING_SINGLE", 
			"STRING_BACK", "KEY_OUT", "KEY_IF", "KEY_ELSE", "TRUE", "FALSE", "NULL", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "PLUS", "MINUS", "SLASH", "ASTERISK", 
			"PERCENT", "LEFT_TRANSFER", "EQUAL", "LESS", "GREATER", "LESS_OR_EQUAL", 
			"GREATER_OR_EQUAL", "SEMICOLON", "ID", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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
		"\u0004\u0000 \u00e2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000E\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002N\b\u0002\u000b"+
		"\u0002\f\u0002O\u0001\u0002\u0001\u0002\u0004\u0002T\b\u0002\u000b\u0002"+
		"\f\u0002U\u0003\u0002X\b\u0002\u0001\u0003\u0004\u0003[\b\u0003\u000b"+
		"\u0003\f\u0003\\\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004"+
		"\f\u0004d\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006s\b\u0006\n\u0006\f\u0006v\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u00bc\b\u001d\n\u001d\f\u001d\u00bf\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0004\u001d\u00c3\b\u001d\u000b\u001d\f\u001d\u00c4"+
		"\u0001\u001d\u0003\u001d\u00c8\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u00ce\b\u001e\n\u001e\f\u001e\u00d1\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u00d9\b\u001f\n\u001f\f\u001f\u00dc\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0006bkt\u00bd\u00c4\u00da\u0000"+
		" \u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? \u0001\u0000"+
		"\u0005\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u000009\u0003\u0000"+
		"AZ__az\u0006\u0000##--09AZ__az\u00ee\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0001D\u0001\u0000\u0000\u0000\u0003H\u0001\u0000\u0000"+
		"\u0000\u0005M\u0001\u0000\u0000\u0000\u0007Z\u0001\u0000\u0000\u0000\t"+
		"^\u0001\u0000\u0000\u0000\u000bg\u0001\u0000\u0000\u0000\rp\u0001\u0000"+
		"\u0000\u0000\u000fy\u0001\u0000\u0000\u0000\u0011}\u0001\u0000\u0000\u0000"+
		"\u0013\u0080\u0001\u0000\u0000\u0000\u0015\u0085\u0001\u0000\u0000\u0000"+
		"\u0017\u008a\u0001\u0000\u0000\u0000\u0019\u0090\u0001\u0000\u0000\u0000"+
		"\u001b\u0095\u0001\u0000\u0000\u0000\u001d\u0097\u0001\u0000\u0000\u0000"+
		"\u001f\u0099\u0001\u0000\u0000\u0000!\u009b\u0001\u0000\u0000\u0000#\u009d"+
		"\u0001\u0000\u0000\u0000%\u009f\u0001\u0000\u0000\u0000\'\u00a1\u0001"+
		"\u0000\u0000\u0000)\u00a3\u0001\u0000\u0000\u0000+\u00a5\u0001\u0000\u0000"+
		"\u0000-\u00a7\u0001\u0000\u0000\u0000/\u00aa\u0001\u0000\u0000\u00001"+
		"\u00ad\u0001\u0000\u0000\u00003\u00af\u0001\u0000\u0000\u00005\u00b1\u0001"+
		"\u0000\u0000\u00007\u00b4\u0001\u0000\u0000\u00009\u00b7\u0001\u0000\u0000"+
		"\u0000;\u00c7\u0001\u0000\u0000\u0000=\u00c9\u0001\u0000\u0000\u0000?"+
		"\u00d4\u0001\u0000\u0000\u0000AE\u0007\u0000\u0000\u0000BC\u0005\r\u0000"+
		"\u0000CE\u0005\n\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0006\u0000\u0000\u0000G\u0002\u0001"+
		"\u0000\u0000\u0000HI\u0007\u0001\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0006\u0001\u0001\u0000K\u0004\u0001\u0000\u0000\u0000LN\u0007\u0002"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PW\u0001\u0000\u0000\u0000"+
		"QS\u0005.\u0000\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\u0006\u0001\u0000\u0000\u0000Y[\u0007\u0002\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\b\u0001\u0000\u0000\u0000^b\u0005\""+
		"\u0000\u0000_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\"\u0000\u0000f\n"+
		"\u0001\u0000\u0000\u0000gk\u0005\'\u0000\u0000hj\t\u0000\u0000\u0000i"+
		"h\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\'\u0000\u0000o\f\u0001\u0000\u0000\u0000pt\u0005"+
		"`\u0000\u0000qs\t\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005`\u0000\u0000"+
		"x\u000e\u0001\u0000\u0000\u0000yz\u0005o\u0000\u0000z{\u0005u\u0000\u0000"+
		"{|\u0005t\u0000\u0000|\u0010\u0001\u0000\u0000\u0000}~\u0005i\u0000\u0000"+
		"~\u007f\u0005f\u0000\u0000\u007f\u0012\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005e\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082\u0083\u0005s"+
		"\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0014\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087"+
		"\u0088\u0005u\u0000\u0000\u0088\u0089\u0005e\u0000\u0000\u0089\u0016\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\u008c\u0005a\u0000"+
		"\u0000\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e"+
		"\u008f\u0005e\u0000\u0000\u008f\u0018\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005n\u0000\u0000\u0091\u0092\u0005u\u0000\u0000\u0092\u0093\u0005l"+
		"\u0000\u0000\u0093\u0094\u0005l\u0000\u0000\u0094\u001a\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u001c\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005)\u0000\u0000\u0098\u001e\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005{\u0000\u0000\u009a \u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"}\u0000\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d\u009e\u0005+\u0000"+
		"\u0000\u009e$\u0001\u0000\u0000\u0000\u009f\u00a0\u0005-\u0000\u0000\u00a0"+
		"&\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005/\u0000\u0000\u00a2(\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005*\u0000\u0000\u00a4*\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005%\u0000\u0000\u00a6,\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005<\u0000\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9.\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000\u00ab\u00ac\u0005=\u0000"+
		"\u0000\u00ac0\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005<\u0000\u0000\u00ae"+
		"2\u0001\u0000\u0000\u0000\u00af\u00b0\u0005>\u0000\u0000\u00b04\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2\u00b3\u0005=\u0000"+
		"\u0000\u00b36\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b5"+
		"\u00b6\u0005=\u0000\u0000\u00b68\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		";\u0000\u0000\u00b8:\u0001\u0000\u0000\u0000\u00b9\u00bd\u0007\u0003\u0000"+
		"\u0000\u00ba\u00bc\u0007\u0004\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c8\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005~\u0000\u0000"+
		"\u00c1\u00c3\b\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0005~\u0000\u0000\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c7\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c8<\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"/\u0000\u0000\u00ca\u00cb\u0005/\u0000\u0000\u00cb\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\b\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u001e\u0002\u0000"+
		"\u00d3>\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5\u00d6"+
		"\u0005*\u0000\u0000\u00d6\u00da\u0001\u0000\u0000\u0000\u00d7\u00d9\t"+
		"\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u00df\u0005/\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0006\u001f\u0002"+
		"\u0000\u00e1@\u0001\u0000\u0000\u0000\u000e\u0000DOUW\\bkt\u00bd\u00c4"+
		"\u00c7\u00cf\u00da\u0003\u0000\u0003\u0000\u0006\u0000\u0000\u0000\u0002"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}