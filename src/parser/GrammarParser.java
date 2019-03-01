// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NUMBER=10, STRING=11, WHITESPACE=12;
	public static final int
		RULE_start = 0, RULE_valor = 1, RULE_propiedades = 2, RULE_propiedad = 3, 
		RULE_valores = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "valor", "propiedades", "propiedad", "valores"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "','", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"STRING", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Json ast;
		public ValorContext valor;
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).valor = valor();
			setState(11);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Json(((StartContext)_localctx).valor.ast) ;
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

	public static class ValorContext extends ParserRuleContext {
		public Valor ast;
		public Token STRING;
		public Token NUMBER;
		public PropiedadesContext propiedades;
		public ValoresContext valores;
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public PropiedadesContext propiedades() {
			return getRuleContext(PropiedadesContext.class,0);
		}
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((ValorContext)_localctx).STRING = match(STRING);
				((ValorContext)_localctx).ast =  new Cadena(((ValorContext)_localctx).STRING) ;
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				((ValorContext)_localctx).NUMBER = match(NUMBER);
				((ValorContext)_localctx).ast =  new Numero(((ValorContext)_localctx).NUMBER) ;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(T__0);
				((ValorContext)_localctx).ast =  new True(); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				match(T__1);
				((ValorContext)_localctx).ast =  new False(); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(T__2);
				((ValorContext)_localctx).ast =  new Null(); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(T__3);
				setState(25);
				((ValorContext)_localctx).propiedades = propiedades();
				setState(26);
				match(T__4);
				 ((ValorContext)_localctx).ast =  new Objeto(((ValorContext)_localctx).propiedades.list); 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(29);
				match(T__5);
				setState(30);
				((ValorContext)_localctx).valores = valores();
				setState(31);
				match(T__6);
				((ValorContext)_localctx).ast =  new Array(((ValorContext)_localctx).valores.list); 
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

	public static class PropiedadesContext extends ParserRuleContext {
		public List<Atributo> list = new ArrayList<>();
		public PropiedadContext propiedad;
		public List<PropiedadContext> propiedad() {
			return getRuleContexts(PropiedadContext.class);
		}
		public PropiedadContext propiedad(int i) {
			return getRuleContext(PropiedadContext.class,i);
		}
		public PropiedadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propiedades; }
	}

	public final PropiedadesContext propiedades() throws RecognitionException {
		PropiedadesContext _localctx = new PropiedadesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_propiedades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(36);
				((PropiedadesContext)_localctx).propiedad = propiedad();
				_localctx.list.add(((PropiedadesContext)_localctx).propiedad.ast); 
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(38);
					match(T__7);
					setState(39);
					((PropiedadesContext)_localctx).propiedad = propiedad();
					_localctx.list.add(((PropiedadesContext)_localctx).propiedad.ast); 
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class PropiedadContext extends ParserRuleContext {
		public Atributo ast;
		public Token STRING;
		public ValorContext valor;
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public PropiedadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propiedad; }
	}

	public final PropiedadContext propiedad() throws RecognitionException {
		PropiedadContext _localctx = new PropiedadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_propiedad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((PropiedadContext)_localctx).STRING = match(STRING);
			setState(50);
			match(T__8);
			setState(51);
			((PropiedadContext)_localctx).valor = valor();
			 ((PropiedadContext)_localctx).ast =  new Atributo(((PropiedadContext)_localctx).STRING, ((PropiedadContext)_localctx).valor.ast); 
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

	public static class ValoresContext extends ParserRuleContext {
		public List<Valor> list = new ArrayList<>();
		public ValorContext valor;
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(54);
				((ValoresContext)_localctx).valor = valor();
				_localctx.list.add(((ValoresContext)_localctx).valor.ast); 
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(56);
					match(T__7);
					setState(57);
					((ValoresContext)_localctx).valor = valor();
					_localctx.list.add(((ValoresContext)_localctx).valor.ast);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\5\4\62\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\5\6D\n\6\3\6\2\2"+
		"\7\2\4\6\b\n\2\2\2J\2\f\3\2\2\2\4$\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2\n"+
		"C\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16\17\b\2\1\2\17\3\3\2\2\2\20\21\7"+
		"\r\2\2\21%\b\3\1\2\22\23\7\f\2\2\23%\b\3\1\2\24\25\7\3\2\2\25%\b\3\1\2"+
		"\26\27\7\4\2\2\27%\b\3\1\2\30\31\7\5\2\2\31%\b\3\1\2\32\33\7\6\2\2\33"+
		"\34\5\6\4\2\34\35\7\7\2\2\35\36\b\3\1\2\36%\3\2\2\2\37 \7\b\2\2 !\5\n"+
		"\6\2!\"\7\t\2\2\"#\b\3\1\2#%\3\2\2\2$\20\3\2\2\2$\22\3\2\2\2$\24\3\2\2"+
		"\2$\26\3\2\2\2$\30\3\2\2\2$\32\3\2\2\2$\37\3\2\2\2%\5\3\2\2\2&\'\5\b\5"+
		"\2\'.\b\4\1\2()\7\n\2\2)*\5\b\5\2*+\b\4\1\2+-\3\2\2\2,(\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61&\3\2\2\2\61\62\3"+
		"\2\2\2\62\7\3\2\2\2\63\64\7\r\2\2\64\65\7\13\2\2\65\66\5\4\3\2\66\67\b"+
		"\5\1\2\67\t\3\2\2\289\5\4\3\29@\b\6\1\2:;\7\n\2\2;<\5\4\3\2<=\b\6\1\2"+
		"=?\3\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2"+
		"C8\3\2\2\2CD\3\2\2\2D\13\3\2\2\2\7$.\61@C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}