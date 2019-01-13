// Generated from gram.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UDF=4, EXP=5, SIMPLEEXP=6, COMPLEXEXP=7, TUPLEEXP=8, 
		ASSEXP=9, PUREEXP=10, PUREXPRIME=11, COMPEX=12, COMP=13, SYMBOL=14, STRING=15, 
		CHAR=16, DIGIT=17, NUMBER=18, IDENTIFIER=19, COMMA=20, CURLY=21, ROUND=22, 
		ARROW=23, VAL=24, RANGE=25, SEMICOLON=26;
	public static final int
		RULE_prog = 0, RULE_mod1 = 1;
	public static final String[] ruleNames = {
		"prog", "mod1"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sc.range('", "')'", "'.map'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "','", null, 
		"'('", "'=>'", "'val '", null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "UDF", "EXP", "SIMPLEEXP", "COMPLEXEXP", "TUPLEEXP", 
		"ASSEXP", "PUREEXP", "PUREXPRIME", "COMPEX", "COMP", "SYMBOL", "STRING", 
		"CHAR", "DIGIT", "NUMBER", "IDENTIFIER", "COMMA", "CURLY", "ROUND", "ARROW", 
		"VAL", "RANGE", "SEMICOLON"
	};
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
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(gramParser.RANGE, 0); }
		public Mod1Context mod1() {
			return getRuleContext(Mod1Context.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(9);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(T__0);
				setState(5);
				match(RANGE);
				setState(6);
				match(T__1);
				setState(7);
				mod1();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Mod1Context extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(gramParser.ROUND, 0); }
		public TerminalNode UDF() { return getToken(gramParser.UDF, 0); }
		public Mod1Context mod1() {
			return getRuleContext(Mod1Context.class,0);
		}
		public Mod1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMod1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMod1(this);
		}
	}

	public final Mod1Context mod1() throws RecognitionException {
		Mod1Context _localctx = new Mod1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_mod1);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(T__2);
				setState(12);
				match(ROUND);
				setState(13);
				match(UDF);
				setState(14);
				match(T__1);
				setState(15);
				mod1();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\26\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\5\2\f\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\24\n\3"+
		"\3\3\2\2\4\2\4\2\2\2\25\2\13\3\2\2\2\4\23\3\2\2\2\6\7\7\3\2\2\7\b\7\33"+
		"\2\2\b\t\7\4\2\2\t\f\5\4\3\2\n\f\3\2\2\2\13\6\3\2\2\2\13\n\3\2\2\2\f\3"+
		"\3\2\2\2\r\16\7\5\2\2\16\17\7\30\2\2\17\20\7\6\2\2\20\21\7\4\2\2\21\24"+
		"\5\4\3\2\22\24\3\2\2\2\23\r\3\2\2\2\23\22\3\2\2\2\24\5\3\2\2\2\4\13\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}