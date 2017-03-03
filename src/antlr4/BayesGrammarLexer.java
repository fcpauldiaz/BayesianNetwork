// Generated from /Users/SDX/NetBeansProjects/BayesianNetwork/src/antlr4/BayesGrammar.g4 by ANTLR 4.4
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BayesGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NEGATION=5, TOKEN=6, NUM=7, EQUALS=8, 
		WS=9, COMMENT=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "LETTER", "DIGIT", "NEGATION", "TOKEN", 
		"NUM", "EQUALS", "WS", "COMMENT"
	};


	public BayesGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BayesGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\5\t,\n\t\3\n\3\n\5\n\60\n\n\3\n\7\n\63\n\n\f\n\16\n\66"+
		"\13\n\5\n8\n\n\3\13\3\13\3\f\6\f=\n\f\r\f\16\f>\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\7\rG\n\r\f\r\16\rJ\13\r\3\r\5\rM\n\r\3\r\3\r\3\r\3\r\3\r\7\rT\n\r\f"+
		"\r\16\rW\13\r\3\r\3\r\5\r[\n\r\3\r\3\r\3U\2\16\3\3\5\4\7\5\t\6\13\2\r"+
		"\2\17\7\21\b\23\t\25\n\27\13\31\f\3\2\5\4\2C\\c|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2"+
		"\2\2\17\'\3\2\2\2\21)\3\2\2\2\23-\3\2\2\2\259\3\2\2\2\27<\3\2\2\2\31Z"+
		"\3\2\2\2\33\34\7R\2\2\34\4\3\2\2\2\35\36\7*\2\2\36\6\3\2\2\2\37 \7+\2"+
		"\2 \b\3\2\2\2!\"\7~\2\2\"\n\3\2\2\2#$\t\2\2\2$\f\3\2\2\2%&\4\62;\2&\16"+
		"\3\2\2\2\'(\7#\2\2(\20\3\2\2\2)+\5\13\6\2*,\7.\2\2+*\3\2\2\2+,\3\2\2\2"+
		",\22\3\2\2\2-\67\5\r\7\2.\60\7\60\2\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2"+
		"\2\2\61\63\5\r\7\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\67/\3\2\2\2\678\3\2\2\28\24\3\2\2\29:\7"+
		"?\2\2:\26\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@"+
		"\3\2\2\2@A\b\f\2\2A\30\3\2\2\2BC\7\61\2\2CD\7\61\2\2DH\3\2\2\2EG\n\4\2"+
		"\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\7\17"+
		"\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2N[\7\f\2\2OP\7\61\2\2PQ\7,\2\2QU\3\2"+
		"\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3"+
		"\2\2\2XY\7,\2\2Y[\7\61\2\2ZB\3\2\2\2ZO\3\2\2\2[\\\3\2\2\2\\]\b\r\2\2]"+
		"\32\3\2\2\2\f\2+/\64\67>HLUZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}