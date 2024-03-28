// Generated from D:/Stud/IDE/lab1_v1/src/main/java/com/example/lab1_v1/java_pars.g4 by ANTLR 4.13.1
package com.example.lab1_v1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class java_pars extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, TYPE=2, FOR=3, IF=4, ELSE=5, CLASS=6, MODIFIER=7, ARITHMETIC=8, 
		DIV=9, MOD=10, ASSIGN=11, SIGN=12, AND=13, OR=14, LPAREN=15, RPAREN=16, 
		LBRACE=17, RBRACE=18, SEMI=19, COMMA=20, QUOTE=21, DOT=22, COLON=23, LSBRACE=24, 
		RSBRACE=25, INC=26, DEC=27, RETURN=28, VOID=29, LINE_COMMENT=30, BLOCK_COMMENT=31, 
		NEWLINE=32, VARIABLE=33, INTEGER=34, FLOAT=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_if_statement = 4, RULE_expression = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_integer = 8, RULE_float = 9, RULE_double = 10, RULE_increment = 11, 
		RULE_decrement = 12, RULE_for_loop = 13, RULE_for_init = 14, RULE_for_update = 15, 
		RULE_increment_in_for = 16, RULE_decrement_in_for = 17, RULE_class_declaration = 18, 
		RULE_class_statement = 19, RULE_method_declaration = 20, RULE_return_statement = 21, 
		RULE_method_body = 22, RULE_parameter_list = 23, RULE_parameter = 24, 
		RULE_method_call = 25, RULE_expression_list = 26, RULE_import_statement = 27, 
		RULE_import_name = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "if_statement", 
			"expression", "term", "factor", "integer", "float", "double", "increment", 
			"decrement", "for_loop", "for_init", "for_update", "increment_in_for", 
			"decrement_in_for", "class_declaration", "class_statement", "method_declaration", 
			"return_statement", "method_body", "parameter_list", "parameter", "method_call", 
			"expression_list", "import_statement", "import_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", null, "'for'", "'if'", "'else'", "'class'", null, null, 
			"'/'", "'%'", "'='", null, "'&&'", "'||'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'\"'", "'.'", "':'", "'['", "']'", "'++'", "'--'", "'return'", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "TYPE", "FOR", "IF", "ELSE", "CLASS", "MODIFIER", "ARITHMETIC", 
			"DIV", "MOD", "ASSIGN", "SIGN", "AND", "OR", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COMMA", "QUOTE", "DOT", "COLON", "LSBRACE", "RSBRACE", 
			"INC", "DEC", "RETURN", "VOID", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", 
			"VARIABLE", "INTEGER", "FLOAT"
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
	public String getGrammarFileName() { return "java_pars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public java_pars(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(java_pars.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9395241182L) != 0)) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Import_statementContext import_statement() {
			return getRuleContext(Import_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				increment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				decrement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				class_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				method_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				method_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				import_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				return_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(java_pars.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(java_pars.VARIABLE, i);
		}
		public TerminalNode TYPE() { return getToken(java_pars.TYPE, 0); }
		public TerminalNode MODIFIER() { return getToken(java_pars.MODIFIER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(java_pars.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(java_pars.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(java_pars.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(java_pars.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(79);
				match(MODIFIER);
				}
			}

			setState(82);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(83);
			match(VARIABLE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(84);
				match(ASSIGN);
				setState(85);
				expression();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				match(VARIABLE);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(90);
					match(ASSIGN);
					setState(91);
					expression();
					}
				}

				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(99);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token type;
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(java_pars.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public TerminalNode TYPE() { return getToken(java_pars.TYPE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(101);
				((AssignmentContext)_localctx).type = match(TYPE);
				}
			}

			setState(104);
			match(VARIABLE);
			setState(105);
			match(ASSIGN);
			setState(106);
			expression();
			setState(107);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(java_pars.IF, 0); }
		public TerminalNode LPAREN() { return getToken(java_pars.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(java_pars.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(java_pars.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(java_pars.LBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(java_pars.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(java_pars.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(java_pars.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IF);
			setState(110);
			match(LPAREN);
			setState(111);
			expression();
			setState(112);
			match(RPAREN);
			setState(113);
			match(LBRACE);
			setState(114);
			statement();
			setState(115);
			match(RBRACE);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(116);
				match(ELSE);
				setState(117);
				match(LBRACE);
				setState(118);
				statement();
				setState(119);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public String type;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ARITHMETIC() { return getTokens(java_pars.ARITHMETIC); }
		public TerminalNode ARITHMETIC(int i) {
			return getToken(java_pars.ARITHMETIC, i);
		}
		public List<TerminalNode> DIV() { return getTokens(java_pars.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(java_pars.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(java_pars.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(java_pars.MOD, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ExpressionContext)_localctx).term = term();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				((ExpressionContext)_localctx).term = term();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExpressionContext)_localctx).type =  ((ExpressionContext)_localctx).term.type;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public String type;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SIGN() { return getTokens(java_pars.SIGN); }
		public TerminalNode SIGN(int i) {
			return getToken(java_pars.SIGN, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((TermContext)_localctx).factor = factor();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN) {
				{
				{
				{
				setState(134);
				match(SIGN);
				}
				setState(135);
				((TermContext)_localctx).factor = factor();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TermContext)_localctx).type =  ((TermContext)_localctx).factor.type;
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String type;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(java_pars.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(java_pars.RPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(LPAREN);
				setState(144);
				((FactorContext)_localctx).expression = expression();
				setState(145);
				match(RPAREN);
				((FactorContext)_localctx).type =  ((FactorContext)_localctx).expression.type;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				integer();
				((FactorContext)_localctx).type =  "int";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				float_();
				((FactorContext)_localctx).type =  "float";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				double_();
				((FactorContext)_localctx).type =  "double";
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public String type;
		public TerminalNode INTEGER() { return getToken(java_pars.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(INTEGER);
			 ((IntegerContext)_localctx).type =  "int"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ParserRuleContext {
		public String type;
		public TerminalNode FLOAT() { return getToken(java_pars.FLOAT, 0); }
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(FLOAT);
			 ((FloatContext)_localctx).type =  "float"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleContext extends ParserRuleContext {
		public String type;
		public TerminalNode FLOAT() { return getToken(java_pars.FLOAT, 0); }
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(FLOAT);
			 ((DoubleContext)_localctx).type =  "double"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode INC() { return getToken(java_pars.INC, 0); }
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(VARIABLE);
			setState(170);
			match(INC);
			setState(171);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode DEC() { return getToken(java_pars.DEC, 0); }
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(VARIABLE);
			setState(174);
			match(DEC);
			setState(175);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(java_pars.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(java_pars.LPAREN, 0); }
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public For_updateContext for_update() {
			return getRuleContext(For_updateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(java_pars.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(java_pars.LBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(java_pars.RBRACE, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FOR);
			setState(178);
			match(LPAREN);
			setState(179);
			for_init();
			setState(180);
			expression();
			setState(181);
			match(SEMI);
			setState(182);
			for_update();
			setState(183);
			match(RPAREN);
			setState(184);
			match(LBRACE);
			setState(185);
			statement();
			setState(186);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_initContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(188);
				assignment();
				}
				break;
			case 2:
				{
				setState(189);
				declaration();
				}
				break;
			case 3:
				{
				setState(190);
				match(SEMI);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_updateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Increment_in_forContext increment_in_for() {
			return getRuleContext(Increment_in_forContext.class,0);
		}
		public Decrement_in_forContext decrement_in_for() {
			return getRuleContext(Decrement_in_forContext.class,0);
		}
		public For_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterFor_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitFor_update(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitFor_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_updateContext for_update() throws RecognitionException {
		For_updateContext _localctx = new For_updateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(193);
				expression();
				}
				break;
			case 2:
				{
				setState(194);
				increment_in_for();
				}
				break;
			case 3:
				{
				setState(195);
				decrement_in_for();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Increment_in_forContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode INC() { return getToken(java_pars.INC, 0); }
		public Increment_in_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_in_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterIncrement_in_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitIncrement_in_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitIncrement_in_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_in_forContext increment_in_for() throws RecognitionException {
		Increment_in_forContext _localctx = new Increment_in_forContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increment_in_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(VARIABLE);
			setState(199);
			match(INC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decrement_in_forContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode DEC() { return getToken(java_pars.DEC, 0); }
		public Decrement_in_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_in_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterDecrement_in_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitDecrement_in_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitDecrement_in_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrement_in_forContext decrement_in_for() throws RecognitionException {
		Decrement_in_forContext _localctx = new Decrement_in_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decrement_in_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VARIABLE);
			setState(202);
			match(DEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(java_pars.CLASS, 0); }
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode LBRACE() { return getToken(java_pars.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(java_pars.RBRACE, 0); }
		public TerminalNode MODIFIER() { return getToken(java_pars.MODIFIER, 0); }
		public List<Class_statementContext> class_statement() {
			return getRuleContexts(Class_statementContext.class);
		}
		public Class_statementContext class_statement(int i) {
			return getRuleContext(Class_statementContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(204);
				match(MODIFIER);
				}
			}

			setState(207);
			match(CLASS);
			setState(208);
			match(VARIABLE);
			setState(209);
			match(LBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9126805660L) != 0)) {
				{
				{
				setState(210);
				class_statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_statementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterClass_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitClass_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				increment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(223);
				decrement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				method_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				method_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public Token type;
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(java_pars.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(java_pars.RPAREN, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(java_pars.TYPE, 0); }
		public TerminalNode MODIFIER() { return getToken(java_pars.MODIFIER, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode VOID() { return getToken(java_pars.VOID, 0); }
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_method_declaration);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
			case MODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MODIFIER) {
					{
					setState(228);
					match(MODIFIER);
					}
				}

				setState(231);
				((Method_declarationContext)_localctx).type = match(TYPE);
				setState(232);
				match(VARIABLE);
				setState(233);
				match(LPAREN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(234);
					parameter_list();
					}
				}

				setState(237);
				match(RPAREN);
				setState(238);
				method_body();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(VOID);
				setState(240);
				match(VARIABLE);
				setState(241);
				match(LPAREN);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(242);
					parameter_list();
					}
				}

				setState(245);
				match(RPAREN);
				setState(246);
				method_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(java_pars.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(RETURN);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129574912L) != 0)) {
				{
				setState(250);
				expression();
				}
			}

			setState(253);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(java_pars.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(java_pars.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_body);
		int _la;
		try {
			int _alt;
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(LBRACE);
				{
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						statement();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(262);
					return_statement();
					}
				}

				}
				setState(265);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(LBRACE);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9395241182L) != 0)) {
					{
					{
					setState(267);
					statement();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(java_pars.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(java_pars.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			parameter();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				parameter();
				}
				}
				setState(283);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public Token type;
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode TYPE() { return getToken(java_pars.TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((ParameterContext)_localctx).type = match(TYPE);
			setState(285);
			match(VARIABLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(java_pars.VARIABLE, 0); }
		public TerminalNode LPAREN() { return getToken(java_pars.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(java_pars.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(VARIABLE);
			setState(288);
			match(LPAREN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129574912L) != 0)) {
				{
				setState(289);
				expression_list();
				}
			}

			setState(292);
			match(RPAREN);
			setState(293);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(java_pars.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(java_pars.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			expression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				expression();
				}
				}
				setState(302);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(java_pars.IMPORT, 0); }
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(java_pars.SEMI, 0); }
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IMPORT);
			setState(304);
			import_name();
			setState(305);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Import_nameContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(java_pars.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(java_pars.VARIABLE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(java_pars.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(java_pars.DOT, i);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof java_parsListener ) ((java_parsListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof java_parsVisitor ) return ((java_parsVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_import_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(VARIABLE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(308);
				match(DOT);
				setState(309);
				match(VARIABLE);
				}
				}
				setState(314);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u013c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"]\b\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003g\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u007f\b\u0005\n\u0005\f\u0005\u0082\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009f\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c0\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0003\u0012\u00ce\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00d4\b\u0012\n\u0012\f\u0012\u00d7\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e3\b\u0013\u0001\u0014\u0003"+
		"\u0014\u00e6\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00ec\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00f8\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00fc\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0102\b\u0016"+
		"\n\u0016\f\u0016\u0105\t\u0016\u0001\u0016\u0003\u0016\u0108\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u010d\b\u0016\n\u0016\f\u0016"+
		"\u0110\t\u0016\u0001\u0016\u0003\u0016\u0113\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0118\b\u0017\n\u0017\f\u0017\u011b\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0123\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u012b\b\u001a\n\u001a\f\u001a\u012e"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0137\b\u001c\n\u001c\f\u001c\u013a\t\u001c"+
		"\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0001\u0001"+
		"\u0000\b\n\u0151\u0000=\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000"+
		"\u0000\u0004P\u0001\u0000\u0000\u0000\u0006f\u0001\u0000\u0000\u0000\b"+
		"m\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000"+
		"\u0000\u0000\u000e\u009e\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000"+
		"\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000"+
		"\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000"+
		"\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000"+
		"\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000"+
		"\u0000\"\u00c9\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000"+
		"&\u00e2\u0001\u0000\u0000\u0000(\u00f7\u0001\u0000\u0000\u0000*\u00f9"+
		"\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000.\u0114\u0001\u0000"+
		"\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u011f\u0001\u0000\u0000\u0000"+
		"4\u0127\u0001\u0000\u0000\u00006\u012f\u0001\u0000\u0000\u00008\u0133"+
		"\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0000\u0000\u0001A\u0001\u0001\u0000\u0000\u0000BN\u0003\u0004\u0002"+
		"\u0000CN\u0003\u0006\u0003\u0000DN\u0003\b\u0004\u0000EN\u0003\u001a\r"+
		"\u0000FN\u0003\u0016\u000b\u0000GN\u0003\u0018\f\u0000HN\u0003$\u0012"+
		"\u0000IN\u0003(\u0014\u0000JN\u00032\u0019\u0000KN\u00036\u001b\u0000"+
		"LN\u0003*\u0015\u0000MB\u0001\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000"+
		"MD\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000"+
		"\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000N\u0003\u0001\u0000\u0000\u0000OQ\u0005\u0007\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0002\u0000\u0000SV\u0005!\u0000\u0000TU\u0005\u000b"+
		"\u0000\u0000UW\u0003\n\u0005\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W`\u0001\u0000\u0000\u0000XY\u0005\u0014\u0000\u0000Y\\\u0005"+
		"!\u0000\u0000Z[\u0005\u000b\u0000\u0000[]\u0003\n\u0005\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^X\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0013\u0000\u0000d\u0005\u0001\u0000\u0000\u0000"+
		"eg\u0005\u0002\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0005!\u0000\u0000ij\u0005\u000b\u0000"+
		"\u0000jk\u0003\n\u0005\u0000kl\u0005\u0013\u0000\u0000l\u0007\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0004\u0000\u0000no\u0005\u000f\u0000\u0000op\u0003"+
		"\n\u0005\u0000pq\u0005\u0010\u0000\u0000qr\u0005\u0011\u0000\u0000rs\u0003"+
		"\u0002\u0001\u0000sy\u0005\u0012\u0000\u0000tu\u0005\u0005\u0000\u0000"+
		"uv\u0005\u0011\u0000\u0000vw\u0003\u0002\u0001\u0000wx\u0005\u0012\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\t\u0001\u0000\u0000\u0000{\u0080\u0003\f\u0006\u0000|}\u0007"+
		"\u0000\u0000\u0000}\u007f\u0003\f\u0006\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0005\uffff\uffff\u0000"+
		"\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u008a\u0003\u000e\u0007\u0000"+
		"\u0086\u0087\u0005\f\u0000\u0000\u0087\u0089\u0003\u000e\u0007\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0006\u0006\uffff\uffff\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u000f\u0000\u0000\u0090\u0091\u0003\n\u0005\u0000\u0091\u0092"+
		"\u0005\u0010\u0000\u0000\u0092\u0093\u0006\u0007\uffff\uffff\u0000\u0093"+
		"\u009f\u0001\u0000\u0000\u0000\u0094\u009f\u0005!\u0000\u0000\u0095\u0096"+
		"\u0003\u0010\b\u0000\u0096\u0097\u0006\u0007\uffff\uffff\u0000\u0097\u009f"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0012\t\u0000\u0099\u009a\u0006"+
		"\u0007\uffff\uffff\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003\u0014\n\u0000\u009c\u009d\u0006\u0007\uffff\uffff\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u008f\u0001\u0000\u0000\u0000\u009e\u0094"+
		"\u0001\u0000\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u000f"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\"\u0000\u0000\u00a1\u00a2\u0006"+
		"\b\uffff\uffff\u0000\u00a2\u0011\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"#\u0000\u0000\u00a4\u00a5\u0006\t\uffff\uffff\u0000\u00a5\u0013\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u00a8\u0006\n"+
		"\uffff\uffff\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"!\u0000\u0000\u00aa\u00ab\u0005\u001a\u0000\u0000\u00ab\u00ac\u0005\u0013"+
		"\u0000\u0000\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005!\u0000"+
		"\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00b0\u0005\u0013\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0003\u0000"+
		"\u0000\u00b2\u00b3\u0005\u000f\u0000\u0000\u00b3\u00b4\u0003\u001c\u000e"+
		"\u0000\u00b4\u00b5\u0003\n\u0005\u0000\u00b5\u00b6\u0005\u0013\u0000\u0000"+
		"\u00b6\u00b7\u0003\u001e\u000f\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0011\u0000\u0000\u00b9\u00ba\u0003\u0002\u0001\u0000"+
		"\u00ba\u00bb\u0005\u0012\u0000\u0000\u00bb\u001b\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c0\u0003\u0006\u0003\u0000\u00bd\u00c0\u0003\u0004\u0002\u0000"+
		"\u00be\u00c0\u0005\u0013\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001d\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c5\u0003\n\u0005\u0000\u00c2\u00c5\u0003 \u0010\u0000\u00c3"+
		"\u00c5\u0003\"\u0011\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0005!\u0000\u0000\u00c7\u00c8\u0005\u001a\u0000\u0000\u00c8!\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005!\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000"+
		"\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u0007\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000"+
		"\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00d5\u0005\u0011\u0000\u0000\u00d2"+
		"\u00d4\u0003&\u0013\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0012\u0000\u0000\u00d9%\u0001"+
		"\u0000\u0000\u0000\u00da\u00e3\u0003\u0004\u0002\u0000\u00db\u00e3\u0003"+
		"\u0006\u0003\u0000\u00dc\u00e3\u0003\b\u0004\u0000\u00dd\u00e3\u0003\u001a"+
		"\r\u0000\u00de\u00e3\u0003\u0016\u000b\u0000\u00df\u00e3\u0003\u0018\f"+
		"\u0000\u00e0\u00e3\u0003(\u0014\u0000\u00e1\u00e3\u00032\u0019\u0000\u00e2"+
		"\u00da\u0001\u0000\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000\u00e2"+
		"\u00dc\u0001\u0000\u0000\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2"+
		"\u00de\u0001\u0000\u0000\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\'\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005\u0007\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0002\u0000\u0000\u00e8\u00e9"+
		"\u0005!\u0000\u0000\u00e9\u00eb\u0005\u000f\u0000\u0000\u00ea\u00ec\u0003"+
		".\u0017\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0010"+
		"\u0000\u0000\u00ee\u00f8\u0003,\u0016\u0000\u00ef\u00f0\u0005\u001d\u0000"+
		"\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1\u00f3\u0005\u000f\u0000\u0000"+
		"\u00f2\u00f4\u0003.\u0017\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0010\u0000\u0000\u00f6\u00f8\u0003,\u0016\u0000\u00f7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f8)\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0005\u001c\u0000\u0000\u00fa\u00fc\u0003"+
		"\n\u0005\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0013"+
		"\u0000\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0103\u0005\u0011\u0000"+
		"\u0000\u0100\u0102\u0003\u0002\u0001\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0108\u0003*\u0015\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0113\u0005\u0012\u0000\u0000"+
		"\u010a\u010e\u0005\u0011\u0000\u0000\u010b\u010d\u0003\u0002\u0001\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0005\u0012\u0000\u0000\u0112\u00ff\u0001\u0000\u0000\u0000"+
		"\u0112\u010a\u0001\u0000\u0000\u0000\u0113-\u0001\u0000\u0000\u0000\u0114"+
		"\u0119\u00030\u0018\u0000\u0115\u0116\u0005\u0014\u0000\u0000\u0116\u0118"+
		"\u00030\u0018\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a/\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d\u011e\u0005!\u0000"+
		"\u0000\u011e1\u0001\u0000\u0000\u0000\u011f\u0120\u0005!\u0000\u0000\u0120"+
		"\u0122\u0005\u000f\u0000\u0000\u0121\u0123\u00034\u001a\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0010\u0000\u0000\u0125\u0126"+
		"\u0005\u0013\u0000\u0000\u01263\u0001\u0000\u0000\u0000\u0127\u012c\u0003"+
		"\n\u0005\u0000\u0128\u0129\u0005\u0014\u0000\u0000\u0129\u012b\u0003\n"+
		"\u0005\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d5\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005\u0001\u0000\u0000\u0130\u0131\u00038\u001c\u0000"+
		"\u0131\u0132\u0005\u0013\u0000\u0000\u01327\u0001\u0000\u0000\u0000\u0133"+
		"\u0138\u0005!\u0000\u0000\u0134\u0135\u0005\u0016\u0000\u0000\u0135\u0137"+
		"\u0005!\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u01399\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u001d=MPV\\`fy\u0080\u008a\u009e\u00bf\u00c4\u00cd\u00d5"+
		"\u00e2\u00e5\u00eb\u00f3\u00f7\u00fb\u0103\u0107\u010e\u0112\u0119\u0122"+
		"\u012c\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}