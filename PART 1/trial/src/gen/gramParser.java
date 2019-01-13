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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, SYMBOL=16, 
		FUNC=17, NUMBER=18, IDENTIFIER=19, STRING=20, CHAR=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_mod = 2, RULE_funcmap = 3;
	public static final String[] ruleNames = {
		"prog", "start", "mod", "funcmap"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'sc'", "'\n'", "'.range('", "','", "')'", "'.textFile('", 
		"'.map('", "'.filter'", "'('", "'.reduce'", "'.reduceByKey'", "'.sortBy'", 
		"'.collect()'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "SYMBOL", "FUNC", "NUMBER", "IDENTIFIER", "STRING", 
		"CHAR", "WS"
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
		public TerminalNode IDENTIFIER() { return getToken(gramParser.IDENTIFIER, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
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
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(IDENTIFIER);
				setState(9);
				match(T__0);
				setState(10);
				start();
				}
				break;
			case EOF:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				start();
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

	public static class StartContext extends ParserRuleContext {
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__1);
				setState(15);
				mod();
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(16);
					match(T__2);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ModContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(gramParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramParser.NUMBER, i);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public TerminalNode STRING() { return getToken(gramParser.STRING, 0); }
		public FuncmapContext funcmap() {
			return getRuleContext(FuncmapContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(gramParser.FUNC, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mod);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__3);
				setState(26);
				match(NUMBER);
				setState(27);
				match(T__4);
				setState(28);
				match(NUMBER);
				setState(29);
				match(T__5);
				setState(30);
				mod();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__6);
				setState(32);
				match(STRING);
				setState(33);
				match(T__5);
				setState(34);
				mod();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(T__7);
				setState(36);
				funcmap();
				setState(37);
				mod();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(T__8);
				setState(40);
				match(T__9);
				setState(41);
				match(FUNC);
				setState(42);
				match(T__5);
				setState(43);
				mod();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(T__10);
				setState(45);
				match(FUNC);
				setState(46);
				mod();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(T__11);
				setState(48);
				match(FUNC);
				setState(49);
				mod();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				match(T__12);
				setState(51);
				match(FUNC);
				setState(52);
				mod();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				match(T__13);
				setState(54);
				mod();
				}
				break;
			case EOF:
			case T__2:
				enterOuterAlt(_localctx, 9);
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

	public static class FuncmapContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(gramParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(gramParser.SYMBOL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(gramParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramParser.NUMBER, i);
		}
		public FuncmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcmap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncmap(this);
		}
	}

	public final FuncmapContext funcmap() throws RecognitionException {
		FuncmapContext _localctx = new FuncmapContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(T__14);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << SYMBOL) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << SYMBOL) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\7\3\24\n\3\f"+
		"\3\16\3\27\13\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5\2\2\6\2\4\6"+
		"\b\2\3\6\2\7\b\f\f\22\22\24\25\2K\2\16\3\2\2\2\4\31\3\2\2\2\6:\3\2\2\2"+
		"\b<\3\2\2\2\n\13\7\25\2\2\13\f\7\3\2\2\f\17\5\4\3\2\r\17\5\4\3\2\16\n"+
		"\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\21\7\4\2\2\21\25\5\6\4\2\22\24\7"+
		"\5\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\32\3"+
		"\2\2\2\27\25\3\2\2\2\30\32\3\2\2\2\31\20\3\2\2\2\31\30\3\2\2\2\32\5\3"+
		"\2\2\2\33\34\7\6\2\2\34\35\7\24\2\2\35\36\7\7\2\2\36\37\7\24\2\2\37 \7"+
		"\b\2\2 ;\5\6\4\2!\"\7\t\2\2\"#\7\26\2\2#$\7\b\2\2$;\5\6\4\2%&\7\n\2\2"+
		"&\'\5\b\5\2\'(\5\6\4\2(;\3\2\2\2)*\7\13\2\2*+\7\f\2\2+,\7\23\2\2,-\7\b"+
		"\2\2-;\5\6\4\2./\7\r\2\2/\60\7\23\2\2\60;\5\6\4\2\61\62\7\16\2\2\62\63"+
		"\7\23\2\2\63;\5\6\4\2\64\65\7\17\2\2\65\66\7\23\2\2\66;\5\6\4\2\678\7"+
		"\20\2\28;\5\6\4\29;\3\2\2\2:\33\3\2\2\2:!\3\2\2\2:%\3\2\2\2:)\3\2\2\2"+
		":.\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\67\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<="+
		"\7\25\2\2=?\7\21\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"B\t\3\2\2\2\7\16\25\31:A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}