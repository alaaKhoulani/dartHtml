// Generated from E:/University/Fourth/term 2/compiler/Compiler/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, OPENED_BRACES=2, CLOSED_BRACES=3, OPENED_CURLY_BRACES=4, CLOSED_CURLY_BRACES=5, 
		OPENED_SQUERE_BRACES=6, CLOSED_SQUERE_BRACES=7, ARROW=8, IMPORT=9, CLASS=10, 
		FOR=11, WHILE=12, DO=13, BODY=14, LIST=15, WIDGET=16, FUNCTION=17, STATE=18, 
		LISTVIEW=19, CHILDREN=20, CHILD=21, ROW=22, COLUMN=23, TEXTWIDGET=24, 
		CONTAINER=25, WIDTH=26, HEIGHT=27, BUTTON=28, ONPRESSED=29, COLOR=30, 
		COLOR_C=31, IMAGE_I=32, IMAGE=33, ASSETIMAGE=34, NETWORKIMAGE=35, NAVIGATOR=36, 
		PUSH=37, POP=38, BUILDER=39, MATERIALPAGEROUTE=40, MATERIALAPP=41, HOME=42, 
		SCAFFOLD=43, TEXTFIELD=44, ONCHANGED=45, SETSTATE=46, INTEGER_LITERAL=47, 
		DOUBLE_LITERAL=48, BOOLEAN_LITERAL=49, STRING_LITERAL=50, DOUBLE_QOUTE=51, 
		SINGLE_QOUTE=52, VOID=53, INT=54, DOUBLE=55, STRING=56, BOOLEAN=57, TRUE=58, 
		FALSE=59, VAR=60, CONST=61, SWITCH=62, CASE=63, DEFAULT=64, BREAK=65, 
		RETURN=66, IF=67, ELSE=68, MAIN=69, EXTEND=70, OVERRIDE=71, REQUIRED=72, 
		COLOR_START=73, HEXDIGIT=74, COLOR_HEX=75, DIGIT=76, IDENTIFIER=77, IDENTIFIER_START=78, 
		IDENTIFIER_PART=79, LETTER=80, EQUAL=81, PLUS=82, PLUSPLUS=83, MINUS=84, 
		MINUSMINUS=85, MULTI=86, DDIVIDE=87, IDIVIDE=88, REMAIN=89, LESS_THAN=90, 
		LESS_THAN_EQUAL=91, GREATER_THAN=92, GREATER_THAN_EQUAL=93, NOT_EQUAL=94, 
		EQUAL_EQUAL=95, NOT=96, OR=97, OROR=98, AND=99, ANDAND=100, XOR=101, LEFT_SHIFT=102, 
		RIGHT_SHIFT=103, DOLLAR_SIGN=104, AT_SIGN=105, WS=106, COMMA=107, COLON=108, 
		SEMICOLON=109, CHAR=110;
	public static final int
		RULE_program = 0, RULE_initFunction = 1, RULE_statement = 2, RULE_navigation = 3, 
		RULE_materialPageRoue = 4, RULE_declaration = 5, RULE_assignment = 6, 
		RULE_type = 7, RULE_literal = 8, RULE_number = 9, RULE_binaryOperation = 10, 
		RULE_binaryOperationSide = 11, RULE_plusOrMinusOperation = 12, RULE_multiOrDivOrRemOperation = 13, 
		RULE_element = 14, RULE_relationalOperator = 15, RULE_side = 16, RULE_relationalCompare = 17, 
		RULE_bitwiseOperator = 18, RULE_bitwiseOperation = 19, RULE_logicOperator = 20, 
		RULE_booleanSide = 21, RULE_logicalOperation = 22, RULE_ifCondition = 23, 
		RULE_ifExpression = 24, RULE_elseExpression = 25, RULE_dfor = 26, RULE_dwhile = 27, 
		RULE_classMemberDefinition = 28, RULE_dclass = 29, RULE_constructor = 30, 
		RULE_block = 31, RULE_listElements = 32, RULE_functionParameter = 33, 
		RULE_namedDeclaration = 34, RULE_voidFunctionBlock = 35, RULE_typeFunctionBlock = 36, 
		RULE_functionType = 37, RULE_functionVoid = 38, RULE_functionDeclaration = 39, 
		RULE_sentParameter = 40, RULE_namedParameter = 41, RULE_nonNamedParameter = 42, 
		RULE_parametersToSend = 43, RULE_functionCall = 44, RULE_expression = 45, 
		RULE_dswitch = 46, RULE_switchCase = 47, RULE_defaultCase = 48, RULE_breakStatement = 49, 
		RULE_widget = 50, RULE_listView = 51, RULE_textWidget = 52, RULE_container = 53, 
		RULE_button = 54, RULE_row = 55, RULE_column = 56, RULE_property = 57, 
		RULE_color = 58, RULE_image = 59, RULE_materialApp = 60, RULE_scaffold = 61, 
		RULE_textField = 62, RULE_onChanged = 63, RULE_setState = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "initFunction", "statement", "navigation", "materialPageRoue", 
			"declaration", "assignment", "type", "literal", "number", "binaryOperation", 
			"binaryOperationSide", "plusOrMinusOperation", "multiOrDivOrRemOperation", 
			"element", "relationalOperator", "side", "relationalCompare", "bitwiseOperator", 
			"bitwiseOperation", "logicOperator", "booleanSide", "logicalOperation", 
			"ifCondition", "ifExpression", "elseExpression", "dfor", "dwhile", "classMemberDefinition", 
			"dclass", "constructor", "block", "listElements", "functionParameter", 
			"namedDeclaration", "voidFunctionBlock", "typeFunctionBlock", "functionType", 
			"functionVoid", "functionDeclaration", "sentParameter", "namedParameter", 
			"nonNamedParameter", "parametersToSend", "functionCall", "expression", 
			"dswitch", "switchCase", "defaultCase", "breakStatement", "widget", "listView", 
			"textWidget", "container", "button", "row", "column", "property", "color", 
			"image", "materialApp", "scaffold", "textField", "onChanged", "setState"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'=>'", "'import'", 
			"'class'", "'for'", "'while'", "'do'", "'body'", "'List'", "'Widget'", 
			"'Function'", "'State'", "'ListView'", "'children'", "'child'", "'Row'", 
			"'Column'", "'Text'", "'Container'", "'width'", "'height'", "'TextButton'", 
			"'onPressed'", "'color'", "'Color'", "'Image'", "'image'", "'AssetImage'", 
			"'NetworkImage'", "'Navigator'", "'push'", "'pop'", "'builder'", "'MaterialPageRoute'", 
			"'MaterialApp'", "'home'", "'Scaffold'", "'TextField'", "'onChanged'", 
			"'setState'", null, null, null, null, "'\"'", "'''", "'void'", "'int'", 
			"'double'", "'String'", "'bool'", "'true'", "'false'", "'var'", "'const'", 
			"'switch'", "'case'", "'default'", "'break'", "'return'", "'if'", "'else'", 
			"'main'", "'extends'", "'override'", "'required'", "'0x'", null, null, 
			null, null, null, null, null, "'='", "'+'", "'++'", "'-'", "'--'", "'*'", 
			"'/'", "'~/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'!='", "'=='", "'!'", 
			"'|'", "'||'", "'&'", "'&&'", "'^'", "'<<'", "'>>'", "'$'", "'@'", null, 
			"','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "OPENED_BRACES", "CLOSED_BRACES", "OPENED_CURLY_BRACES", 
			"CLOSED_CURLY_BRACES", "OPENED_SQUERE_BRACES", "CLOSED_SQUERE_BRACES", 
			"ARROW", "IMPORT", "CLASS", "FOR", "WHILE", "DO", "BODY", "LIST", "WIDGET", 
			"FUNCTION", "STATE", "LISTVIEW", "CHILDREN", "CHILD", "ROW", "COLUMN", 
			"TEXTWIDGET", "CONTAINER", "WIDTH", "HEIGHT", "BUTTON", "ONPRESSED", 
			"COLOR", "COLOR_C", "IMAGE_I", "IMAGE", "ASSETIMAGE", "NETWORKIMAGE", 
			"NAVIGATOR", "PUSH", "POP", "BUILDER", "MATERIALPAGEROUTE", "MATERIALAPP", 
			"HOME", "SCAFFOLD", "TEXTFIELD", "ONCHANGED", "SETSTATE", "INTEGER_LITERAL", 
			"DOUBLE_LITERAL", "BOOLEAN_LITERAL", "STRING_LITERAL", "DOUBLE_QOUTE", 
			"SINGLE_QOUTE", "VOID", "INT", "DOUBLE", "STRING", "BOOLEAN", "TRUE", 
			"FALSE", "VAR", "CONST", "SWITCH", "CASE", "DEFAULT", "BREAK", "RETURN", 
			"IF", "ELSE", "MAIN", "EXTEND", "OVERRIDE", "REQUIRED", "COLOR_START", 
			"HEXDIGIT", "COLOR_HEX", "DIGIT", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"LETTER", "EQUAL", "PLUS", "PLUSPLUS", "MINUS", "MINUSMINUS", "MULTI", 
			"DDIVIDE", "IDIVIDE", "REMAIN", "LESS_THAN", "LESS_THAN_EQUAL", "GREATER_THAN", 
			"GREATER_THAN_EQUAL", "NOT_EQUAL", "EQUAL_EQUAL", "NOT", "OR", "OROR", 
			"AND", "ANDAND", "XOR", "LEFT_SHIFT", "RIGHT_SHIFT", "DOLLAR_SIGN", "AT_SIGN", 
			"WS", "COMMA", "COLON", "SEMICOLON", "CHAR"
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
	public String getGrammarFileName() { return "DartParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public InitFunctionContext initFunction() {
			return getRuleContext(InitFunctionContext.class,0);
		}
		public List<DclassContext> dclass() {
			return getRuleContexts(DclassContext.class);
		}
		public DclassContext dclass(int i) {
			return getRuleContext(DclassContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DartParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DartParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(130);
						dclass();
						}
						break;
					case 2:
						{
						setState(131);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(132);
						declaration();
						setState(133);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(140);
			initFunction();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST))) != 0) || _la==IDENTIFIER) {
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(141);
					dclass();
					}
					break;
				case 2:
					{
					setState(142);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(143);
					declaration();
					setState(144);
					match(SEMICOLON);
					}
					break;
				}
				}
				setState(150);
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

	public static class InitFunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(DartParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(DartParser.MAIN, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterInitFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitInitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitInitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitFunctionContext initFunction() throws RecognitionException {
		InitFunctionContext _localctx = new InitFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(VOID);
			setState(152);
			match(MAIN);
			setState(153);
			match(OPENED_BRACES);
			setState(154);
			match(CLOSED_BRACES);
			setState(155);
			match(OPENED_CURLY_BRACES);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(CLOSED_CURLY_BRACES);
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
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public RelationalCompareContext relationalCompare() {
			return getRuleContext(RelationalCompareContext.class,0);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public DwhileContext dwhile() {
			return getRuleContext(DwhileContext.class,0);
		}
		public DforContext dfor() {
			return getRuleContext(DforContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DswitchContext dswitch() {
			return getRuleContext(DswitchContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public SetStateContext setState() {
			return getRuleContext(SetStateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				navigation();
				setState(165);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				declaration();
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				assignment();
				setState(171);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				binaryOperation();
				setState(174);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				relationalCompare();
				setState(177);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				logicalOperation();
				setState(180);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				dwhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				dfor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				functionCall();
				setState(186);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(188);
				dswitch();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(189);
				ifCondition();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(190);
				setState();
				setState(191);
				match(SEMICOLON);
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

	public static class NavigationContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR() { return getToken(DartParser.NAVIGATOR, 0); }
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public TerminalNode PUSH() { return getToken(DartParser.PUSH, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public MaterialPageRoueContext materialPageRoue() {
			return getRuleContext(MaterialPageRoueContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode POP() { return getToken(DartParser.POP, 0); }
		public NavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNavigation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_navigation);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(NAVIGATOR);
				setState(196);
				match(DOT);
				setState(197);
				match(PUSH);
				setState(198);
				match(OPENED_BRACES);
				setState(199);
				match(IDENTIFIER);
				setState(200);
				match(COMMA);
				setState(201);
				materialPageRoue();
				setState(202);
				match(CLOSED_BRACES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(NAVIGATOR);
				setState(205);
				match(DOT);
				setState(206);
				match(POP);
				setState(207);
				match(OPENED_BRACES);
				setState(208);
				match(IDENTIFIER);
				setState(209);
				match(CLOSED_BRACES);
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

	public static class MaterialPageRoueContext extends ParserRuleContext {
		public TerminalNode MATERIALPAGEROUTE() { return getToken(DartParser.MATERIALPAGEROUTE, 0); }
		public List<TerminalNode> OPENED_BRACES() { return getTokens(DartParser.OPENED_BRACES); }
		public TerminalNode OPENED_BRACES(int i) {
			return getToken(DartParser.OPENED_BRACES, i);
		}
		public TerminalNode BUILDER() { return getToken(DartParser.BUILDER, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public SentParameterContext sentParameter() {
			return getRuleContext(SentParameterContext.class,0);
		}
		public List<TerminalNode> CLOSED_BRACES() { return getTokens(DartParser.CLOSED_BRACES); }
		public TerminalNode CLOSED_BRACES(int i) {
			return getToken(DartParser.CLOSED_BRACES, i);
		}
		public TypeFunctionBlockContext typeFunctionBlock() {
			return getRuleContext(TypeFunctionBlockContext.class,0);
		}
		public MaterialPageRoueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialPageRoue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMaterialPageRoue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMaterialPageRoue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMaterialPageRoue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialPageRoueContext materialPageRoue() throws RecognitionException {
		MaterialPageRoueContext _localctx = new MaterialPageRoueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_materialPageRoue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(MATERIALPAGEROUTE);
			setState(213);
			match(OPENED_BRACES);
			setState(214);
			match(BUILDER);
			setState(215);
			match(COLON);
			setState(216);
			match(OPENED_BRACES);
			setState(217);
			sentParameter();
			setState(218);
			match(CLOSED_BRACES);
			setState(219);
			typeFunctionBlock();
			setState(220);
			match(CLOSED_BRACES);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode CONST() { return getToken(DartParser.CONST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case WIDGET:
			case FUNCTION:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(222);
					match(CONST);
					}
				}

				setState(225);
				type();
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(226);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(227);
					assignment();
					}
					break;
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						match(COMMA);
						setState(233);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(231);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(232);
							assignment();
							}
							break;
						}
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(IDENTIFIER);
				setState(241);
				match(IDENTIFIER);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(242);
					match(EQUAL);
					setState(243);
					match(IDENTIFIER);
					setState(244);
					match(OPENED_BRACES);
					setState(245);
					match(CLOSED_BRACES);
					}
				}

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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public ExpressionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public ListElementsContext listElements() {
			return getRuleContext(ListElementsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public ListAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterListAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitListAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitListAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public LiteralAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLiteralAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLiteralAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLiteralAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WidgetAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public WidgetAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWidgetAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWidgetAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWidgetAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionAssignmentContext extends AssignmentContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(DartParser.EQUAL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public FunctionAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new LiteralAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IDENTIFIER);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(251);
					match(DOT);
					setState(252);
					match(IDENTIFIER);
					}
				}

				setState(255);
				match(EQUAL);
				setState(256);
				literal();
				}
				break;
			case 2:
				_localctx = new ExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(IDENTIFIER);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(258);
					match(DOT);
					setState(259);
					match(IDENTIFIER);
					}
				}

				setState(262);
				match(EQUAL);
				setState(263);
				expression();
				}
				break;
			case 3:
				_localctx = new ListAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(IDENTIFIER);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(265);
					match(DOT);
					setState(266);
					match(IDENTIFIER);
					}
				}

				setState(269);
				match(EQUAL);
				setState(270);
				listElements();
				}
				break;
			case 4:
				_localctx = new WidgetAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(IDENTIFIER);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(272);
					match(DOT);
					setState(273);
					match(IDENTIFIER);
					}
				}

				setState(276);
				match(EQUAL);
				setState(277);
				widget();
				}
				break;
			case 5:
				_localctx = new FunctionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(IDENTIFIER);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(279);
					match(DOT);
					setState(280);
					match(IDENTIFIER);
					}
				}

				setState(283);
				match(EQUAL);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(284);
					functionCall();
					}
					break;
				case 2:
					{
					setState(285);
					functionType();
					}
					break;
				case 3:
					{
					setState(286);
					functionVoid();
					}
					break;
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DartParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(DartParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(DartParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(DartParser.VAR, 0); }
		public TerminalNode LIST() { return getToken(DartParser.LIST, 0); }
		public TerminalNode WIDGET() { return getToken(DartParser.WIDGET, 0); }
		public TerminalNode FUNCTION() { return getToken(DartParser.FUNCTION, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(DartParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends LiteralContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(DartParser.DOUBLE_LITERAL, 0); }
		public DoubleLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(DartParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DartParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_literal);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(INTEGER_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(DOUBLE_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(BOOLEAN_LITERAL);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(DartParser.INTEGER_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(DartParser.DOUBLE_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==DOUBLE_LITERAL) ) {
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

	public static class BinaryOperationContext extends ParserRuleContext {
		public BinaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperation; }
	 
		public BinaryOperationContext() { }
		public void copyFrom(BinaryOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationSideWithPlusOrMinusOperationContext extends BinaryOperationContext {
		public BinaryOperationSideContext binaryOperationSide() {
			return getRuleContext(BinaryOperationSideContext.class,0);
		}
		public List<PlusOrMinusOperationContext> plusOrMinusOperation() {
			return getRuleContexts(PlusOrMinusOperationContext.class);
		}
		public PlusOrMinusOperationContext plusOrMinusOperation(int i) {
			return getRuleContext(PlusOrMinusOperationContext.class,i);
		}
		public OperationSideWithPlusOrMinusOperationContext(BinaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOperationSideWithPlusOrMinusOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOperationSideWithPlusOrMinusOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOperationSideWithPlusOrMinusOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusOperationContext extends BinaryOperationContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(DartParser.PLUSPLUS, 0); }
		public PlusPlusOperationContext(BinaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPlusPlusOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPlusPlusOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPlusPlusOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MiusMinusOperationContext extends BinaryOperationContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(DartParser.MINUSMINUS, 0); }
		public MiusMinusOperationContext(BinaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMiusMinusOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMiusMinusOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMiusMinusOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperationContext binaryOperation() throws RecognitionException {
		BinaryOperationContext _localctx = new BinaryOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binaryOperation);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new OperationSideWithPlusOrMinusOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				binaryOperationSide();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(302);
					plusOrMinusOperation();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new PlusPlusOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				element();
				setState(309);
				match(PLUSPLUS);
				}
				break;
			case 3:
				_localctx = new MiusMinusOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				element();
				setState(312);
				match(MINUSMINUS);
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

	public static class BinaryOperationSideContext extends ParserRuleContext {
		public BinaryOperationSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperationSide; }
	 
		public BinaryOperationSideContext() { }
		public void copyFrom(BinaryOperationSideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryOperationInBracesContext extends BinaryOperationSideContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public List<MultiOrDivOrRemOperationContext> multiOrDivOrRemOperation() {
			return getRuleContexts(MultiOrDivOrRemOperationContext.class);
		}
		public MultiOrDivOrRemOperationContext multiOrDivOrRemOperation(int i) {
			return getRuleContext(MultiOrDivOrRemOperationContext.class,i);
		}
		public BinaryOperationInBracesContext(BinaryOperationSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBinaryOperationInBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBinaryOperationInBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBinaryOperationInBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementWithMultiOrDivOrRemOperationContext extends BinaryOperationSideContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public List<MultiOrDivOrRemOperationContext> multiOrDivOrRemOperation() {
			return getRuleContexts(MultiOrDivOrRemOperationContext.class);
		}
		public MultiOrDivOrRemOperationContext multiOrDivOrRemOperation(int i) {
			return getRuleContext(MultiOrDivOrRemOperationContext.class,i);
		}
		public ElementWithMultiOrDivOrRemOperationContext(BinaryOperationSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterElementWithMultiOrDivOrRemOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitElementWithMultiOrDivOrRemOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitElementWithMultiOrDivOrRemOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOperationSideInBracesContext extends BinaryOperationSideContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public BinaryOperationSideContext binaryOperationSide() {
			return getRuleContext(BinaryOperationSideContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public BinaryOperationSideInBracesContext(BinaryOperationSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBinaryOperationSideInBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBinaryOperationSideInBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBinaryOperationSideInBraces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperationSideContext binaryOperationSide() throws RecognitionException {
		BinaryOperationSideContext _localctx = new BinaryOperationSideContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binaryOperationSide);
		try {
			int _alt;
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ElementWithMultiOrDivOrRemOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				element();
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						multiOrDivOrRemOperation();
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new BinaryOperationInBracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(OPENED_BRACES);
				setState(324);
				binaryOperation();
				setState(325);
				match(CLOSED_BRACES);
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(326);
						multiOrDivOrRemOperation();
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new BinaryOperationSideInBracesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(OPENED_BRACES);
				setState(333);
				binaryOperationSide();
				setState(334);
				match(CLOSED_BRACES);
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

	public static class PlusOrMinusOperationContext extends ParserRuleContext {
		public BinaryOperationSideContext binaryOperationSide() {
			return getRuleContext(BinaryOperationSideContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DartParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DartParser.MINUS, 0); }
		public PlusOrMinusOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOrMinusOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPlusOrMinusOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPlusOrMinusOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPlusOrMinusOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOrMinusOperationContext plusOrMinusOperation() throws RecognitionException {
		PlusOrMinusOperationContext _localctx = new PlusOrMinusOperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_plusOrMinusOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(339);
			binaryOperationSide();
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

	public static class MultiOrDivOrRemOperationContext extends ParserRuleContext {
		public BinaryOperationSideContext binaryOperationSide() {
			return getRuleContext(BinaryOperationSideContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(DartParser.MULTI, 0); }
		public TerminalNode DDIVIDE() { return getToken(DartParser.DDIVIDE, 0); }
		public TerminalNode IDIVIDE() { return getToken(DartParser.IDIVIDE, 0); }
		public TerminalNode REMAIN() { return getToken(DartParser.REMAIN, 0); }
		public MultiOrDivOrRemOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiOrDivOrRemOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMultiOrDivOrRemOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMultiOrDivOrRemOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMultiOrDivOrRemOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiOrDivOrRemOperationContext multiOrDivOrRemOperation() throws RecognitionException {
		MultiOrDivOrRemOperationContext _localctx = new MultiOrDivOrRemOperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiOrDivOrRemOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (MULTI - 86)) | (1L << (DDIVIDE - 86)) | (1L << (IDIVIDE - 86)) | (1L << (REMAIN - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
			binaryOperationSide();
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

	public static class ElementContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(DartParser.DOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_element);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				number();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(IDENTIFIER);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(346);
					match(DOT);
					setState(347);
					match(IDENTIFIER);
					}
				}

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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(DartParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DartParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(DartParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(DartParser.LESS_THAN, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(DartParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(DartParser.NOT_EQUAL, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LESS_THAN - 90)) | (1L << (LESS_THAN_EQUAL - 90)) | (1L << (GREATER_THAN - 90)) | (1L << (GREATER_THAN_EQUAL - 90)) | (1L << (NOT_EQUAL - 90)) | (1L << (EQUAL_EQUAL - 90)))) != 0)) ) {
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

	public static class SideContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_side);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				binaryOperation();
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

	public static class RelationalCompareContext extends ParserRuleContext {
		public RelationalCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalCompare; }
	 
		public RelationalCompareContext() { }
		public void copyFrom(RelationalCompareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalCompareInBracesContext extends RelationalCompareContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public RelationalCompareContext relationalCompare() {
			return getRuleContext(RelationalCompareContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public RelationalCompareInBracesContext(RelationalCompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRelationalCompareInBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRelationalCompareInBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRelationalCompareInBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoSideComapreContext extends RelationalCompareContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public TwoSideComapreContext(RelationalCompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTwoSideComapre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTwoSideComapre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTwoSideComapre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalCompareContext relationalCompare() throws RecognitionException {
		RelationalCompareContext _localctx = new RelationalCompareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalCompare);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new TwoSideComapreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				side();
				setState(359);
				relationalOperator();
				setState(360);
				side();
				}
				break;
			case 2:
				_localctx = new RelationalCompareInBracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(OPENED_BRACES);
				setState(363);
				relationalCompare();
				setState(364);
				match(CLOSED_BRACES);
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

	public static class BitwiseOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(DartParser.OR, 0); }
		public TerminalNode AND() { return getToken(DartParser.AND, 0); }
		public TerminalNode XOR() { return getToken(DartParser.XOR, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(DartParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(DartParser.RIGHT_SHIFT, 0); }
		public BitwiseOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBitwiseOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBitwiseOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBitwiseOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOperatorContext bitwiseOperator() throws RecognitionException {
		BitwiseOperatorContext _localctx = new BitwiseOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bitwiseOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (OR - 97)) | (1L << (AND - 97)) | (1L << (XOR - 97)) | (1L << (LEFT_SHIFT - 97)) | (1L << (RIGHT_SHIFT - 97)))) != 0)) ) {
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

	public static class BitwiseOperationContext extends ParserRuleContext {
		public BitwiseOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOperation; }
	 
		public BitwiseOperationContext() { }
		public void copyFrom(BitwiseOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TowSideBitwiseContext extends BitwiseOperationContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public List<BitwiseOperatorContext> bitwiseOperator() {
			return getRuleContexts(BitwiseOperatorContext.class);
		}
		public BitwiseOperatorContext bitwiseOperator(int i) {
			return getRuleContext(BitwiseOperatorContext.class,i);
		}
		public TowSideBitwiseContext(BitwiseOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTowSideBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTowSideBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTowSideBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SideWithBitwiseOperationContext extends BitwiseOperationContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public List<BitwiseOperatorContext> bitwiseOperator() {
			return getRuleContexts(BitwiseOperatorContext.class);
		}
		public BitwiseOperatorContext bitwiseOperator(int i) {
			return getRuleContext(BitwiseOperatorContext.class,i);
		}
		public List<BitwiseOperationContext> bitwiseOperation() {
			return getRuleContexts(BitwiseOperationContext.class);
		}
		public BitwiseOperationContext bitwiseOperation(int i) {
			return getRuleContext(BitwiseOperationContext.class,i);
		}
		public SideWithBitwiseOperationContext(BitwiseOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSideWithBitwiseOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSideWithBitwiseOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSideWithBitwiseOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOperationWithSidesContext extends BitwiseOperationContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public BitwiseOperationContext bitwiseOperation() {
			return getRuleContext(BitwiseOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public List<BitwiseOperatorContext> bitwiseOperator() {
			return getRuleContexts(BitwiseOperatorContext.class);
		}
		public BitwiseOperatorContext bitwiseOperator(int i) {
			return getRuleContext(BitwiseOperatorContext.class,i);
		}
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public BitwiseOperationWithSidesContext(BitwiseOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBitwiseOperationWithSides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBitwiseOperationWithSides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBitwiseOperationWithSides(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoBitwiseOperationContext extends BitwiseOperationContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public List<BitwiseOperationContext> bitwiseOperation() {
			return getRuleContexts(BitwiseOperationContext.class);
		}
		public BitwiseOperationContext bitwiseOperation(int i) {
			return getRuleContext(BitwiseOperationContext.class,i);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public List<BitwiseOperatorContext> bitwiseOperator() {
			return getRuleContexts(BitwiseOperatorContext.class);
		}
		public BitwiseOperatorContext bitwiseOperator(int i) {
			return getRuleContext(BitwiseOperatorContext.class,i);
		}
		public TwoBitwiseOperationContext(BitwiseOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTwoBitwiseOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTwoBitwiseOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTwoBitwiseOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOperationContext bitwiseOperation() throws RecognitionException {
		BitwiseOperationContext _localctx = new BitwiseOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitwiseOperation);
		try {
			int _alt;
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new TowSideBitwiseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				side();
				setState(374); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(371);
						bitwiseOperator();
						setState(372);
						side();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(376); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new SideWithBitwiseOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				side();
				setState(382); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(379);
						bitwiseOperator();
						setState(380);
						bitwiseOperation();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(384); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new BitwiseOperationWithSidesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(OPENED_BRACES);
				setState(387);
				bitwiseOperation();
				setState(388);
				match(CLOSED_BRACES);
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						bitwiseOperator();
						setState(390);
						side();
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new TwoBitwiseOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(OPENED_BRACES);
				setState(398);
				bitwiseOperation();
				setState(399);
				match(CLOSED_BRACES);
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						bitwiseOperator();
						setState(401);
						bitwiseOperation();
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
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

	public static class LogicOperatorContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(DartParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(DartParser.OROR, 0); }
		public LogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogicOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogicOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOperatorContext logicOperator() throws RecognitionException {
		LogicOperatorContext _localctx = new LogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==OROR || _la==ANDAND) ) {
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

	public static class BooleanSideContext extends ParserRuleContext {
		public BooleanSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSide; }
	 
		public BooleanSideContext() { }
		public void copyFrom(BooleanSideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalBooleanSideContext extends BooleanSideContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public LogicalBooleanSideContext(BooleanSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogicalBooleanSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogicalBooleanSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogicalBooleanSide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanBooleanSideContext extends BooleanSideContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DartParser.BOOLEAN_LITERAL, 0); }
		public BooleanBooleanSideContext(BooleanSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBooleanBooleanSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBooleanBooleanSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBooleanBooleanSide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalBooleanSideContext extends BooleanSideContext {
		public RelationalCompareContext relationalCompare() {
			return getRuleContext(RelationalCompareContext.class,0);
		}
		public RelationalBooleanSideContext(BooleanSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRelationalBooleanSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRelationalBooleanSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRelationalBooleanSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanSideContext booleanSide() throws RecognitionException {
		BooleanSideContext _localctx = new BooleanSideContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanSide);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new RelationalBooleanSideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				relationalCompare();
				}
				break;
			case 2:
				_localctx = new LogicalBooleanSideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(OPENED_BRACES);
				setState(414);
				logicalOperation();
				setState(415);
				match(CLOSED_BRACES);
				}
				break;
			case 3:
				_localctx = new BooleanBooleanSideContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(BOOLEAN_LITERAL);
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
	 
		public LogicalOperationContext() { }
		public void copyFrom(LogicalOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionContext extends LogicalOperationContext {
		public List<BooleanSideContext> booleanSide() {
			return getRuleContexts(BooleanSideContext.class);
		}
		public BooleanSideContext booleanSide(int i) {
			return getRuleContext(BooleanSideContext.class,i);
		}
		public List<LogicOperatorContext> logicOperator() {
			return getRuleContexts(LogicOperatorContext.class);
		}
		public LogicOperatorContext logicOperator(int i) {
			return getRuleContext(LogicOperatorContext.class,i);
		}
		public ConditionContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotConditionContext extends LogicalOperationContext {
		public TerminalNode NOT() { return getToken(DartParser.NOT, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public NotConditionContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalOperation);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENED_BRACES:
			case INTEGER_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case IDENTIFIER:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				booleanSide();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OROR || _la==ANDAND) {
					{
					{
					setState(421);
					logicOperator();
					setState(422);
					booleanSide();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				_localctx = new NotConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(NOT);
				setState(430);
				logicalOperation();
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

	public static class IfConditionContext extends ParserRuleContext {
		public List<IfExpressionContext> ifExpression() {
			return getRuleContexts(IfExpressionContext.class);
		}
		public IfExpressionContext ifExpression(int i) {
			return getRuleContext(IfExpressionContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(DartParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(DartParser.ELSE, i);
		}
		public ElseExpressionContext elseExpression() {
			return getRuleContext(ElseExpressionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifCondition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			ifExpression();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(ELSE);
					setState(435);
					ifExpression();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(441);
				elseExpression();
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DartParser.IF, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IF);
			setState(445);
			match(OPENED_BRACES);
			setState(446);
			logicalOperation();
			setState(447);
			match(CLOSED_BRACES);
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENED_CURLY_BRACES:
				{
				setState(448);
				block();
				}
				break;
			case OPENED_BRACES:
			case FOR:
			case WHILE:
			case LIST:
			case WIDGET:
			case FUNCTION:
			case STATE:
			case NAVIGATOR:
			case SETSTATE:
			case INTEGER_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case VOID:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case VAR:
			case CONST:
			case SWITCH:
			case IF:
			case IDENTIFIER:
			case NOT:
				{
				setState(449);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElseExpressionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DartParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterElseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitElseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExpressionContext elseExpression() throws RecognitionException {
		ElseExpressionContext _localctx = new ElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ELSE);
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENED_CURLY_BRACES:
				{
				setState(453);
				block();
				}
				break;
			case OPENED_BRACES:
			case FOR:
			case WHILE:
			case LIST:
			case WIDGET:
			case FUNCTION:
			case STATE:
			case NAVIGATOR:
			case SETSTATE:
			case INTEGER_LITERAL:
			case DOUBLE_LITERAL:
			case BOOLEAN_LITERAL:
			case VOID:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case VAR:
			case CONST:
			case SWITCH:
			case IF:
			case IDENTIFIER:
			case NOT:
				{
				setState(454);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DartParser.FOR, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(DartParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DartParser.SEMICOLON, i);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public DforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DforContext dfor() throws RecognitionException {
		DforContext _localctx = new DforContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(FOR);
			setState(458);
			match(OPENED_BRACES);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(459);
				declaration();
				}
				break;
			case 2:
				{
				{
				setState(460);
				assignment();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(461);
					match(COMMA);
					setState(462);
					assignment();
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(470);
			match(SEMICOLON);
			setState(471);
			logicalOperation();
			setState(472);
			match(SEMICOLON);
			{
			setState(473);
			binaryOperation();
			}
			setState(474);
			match(CLOSED_BRACES);
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENED_CURLY_BRACES:
				{
				setState(475);
				block();
				}
				break;
			case SEMICOLON:
				{
				setState(476);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DartParser.WHILE, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public DwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DwhileContext dwhile() throws RecognitionException {
		DwhileContext _localctx = new DwhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(WHILE);
			setState(480);
			match(OPENED_BRACES);
			setState(481);
			logicalOperation();
			setState(482);
			match(CLOSED_BRACES);
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENED_CURLY_BRACES:
				{
				setState(483);
				block();
				}
				break;
			case SEMICOLON:
				{
				setState(484);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassMemberDefinitionContext extends ParserRuleContext {
		public ClassMemberDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDefinition; }
	 
		public ClassMemberDefinitionContext() { }
		public void copyFrom(ClassMemberDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionMemberContext extends ClassMemberDefinitionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode AT_SIGN() { return getToken(DartParser.AT_SIGN, 0); }
		public TerminalNode OVERRIDE() { return getToken(DartParser.OVERRIDE, 0); }
		public FunctionMemberContext(ClassMemberDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionMember(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationMemberContext extends ClassMemberDefinitionContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public DeclarationMemberContext(ClassMemberDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDeclarationMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDeclarationMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDeclarationMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDefinitionContext classMemberDefinition() throws RecognitionException {
		ClassMemberDefinitionContext _localctx = new ClassMemberDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classMemberDefinition);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new DeclarationMemberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				declaration();
				setState(488);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new FunctionMemberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT_SIGN) {
					{
					setState(490);
					match(AT_SIGN);
					setState(491);
					match(OVERRIDE);
					}
				}

				setState(494);
				functionDeclaration();
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

	public static class DclassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DartParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public TerminalNode EXTEND() { return getToken(DartParser.EXTEND, 0); }
		public List<ClassMemberDefinitionContext> classMemberDefinition() {
			return getRuleContexts(ClassMemberDefinitionContext.class);
		}
		public ClassMemberDefinitionContext classMemberDefinition(int i) {
			return getRuleContext(ClassMemberDefinitionContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode STATE() { return getToken(DartParser.STATE, 0); }
		public TerminalNode LESS_THAN() { return getToken(DartParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DartParser.GREATER_THAN, 0); }
		public DclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassContext dclass() throws RecognitionException {
		DclassContext _localctx = new DclassContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dclass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(CLASS);
			setState(498);
			match(IDENTIFIER);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTEND) {
				{
				setState(499);
				match(EXTEND);
				setState(505);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(500);
					match(IDENTIFIER);
					}
					break;
				case STATE:
					{
					setState(501);
					match(STATE);
					setState(502);
					match(LESS_THAN);
					setState(503);
					match(IDENTIFIER);
					setState(504);
					match(GREATER_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(509);
			match(OPENED_CURLY_BRACES);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					classMemberDefinition();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(516);
				constructor();
				}
				break;
			}
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST))) != 0) || _la==IDENTIFIER || _la==AT_SIGN) {
				{
				{
				setState(519);
				classMemberDefinition();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			match(CLOSED_CURLY_BRACES);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(IDENTIFIER);
			setState(528);
			functionVoid();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(OPENED_CURLY_BRACES);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(531);
				statement();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			match(CLOSED_CURLY_BRACES);
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

	public static class ListElementsContext extends ParserRuleContext {
		public TerminalNode OPENED_SQUERE_BRACES() { return getToken(DartParser.OPENED_SQUERE_BRACES, 0); }
		public TerminalNode CLOSED_SQUERE_BRACES() { return getToken(DartParser.CLOSED_SQUERE_BRACES, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ListElementsContext> listElements() {
			return getRuleContexts(ListElementsContext.class);
		}
		public ListElementsContext listElements(int i) {
			return getRuleContext(ListElementsContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ListElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterListElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitListElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitListElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementsContext listElements() throws RecognitionException {
		ListElementsContext _localctx = new ListElementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(OPENED_SQUERE_BRACES);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_SQUERE_BRACES) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL))) != 0) || _la==IDENTIFIER) {
				{
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(540);
					element();
					}
					break;
				case 2:
					{
					setState(541);
					listElements();
					}
					break;
				case 3:
					{
					setState(542);
					literal();
					}
					break;
				case 4:
					{
					setState(543);
					match(IDENTIFIER);
					}
					break;
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(546);
					match(COMMA);
					setState(551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(547);
						element();
						}
						break;
					case 2:
						{
						setState(548);
						listElements();
						}
						break;
					case 3:
						{
						setState(549);
						literal();
						}
						break;
					case 4:
						{
						setState(550);
						match(IDENTIFIER);
						}
						break;
					}
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(560);
			match(CLOSED_SQUERE_BRACES);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public NamedDeclarationContext namedDeclaration() {
			return getRuleContext(NamedDeclarationContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionParameter);
		int _la;
		try {
			int _alt;
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (LIST - 15)) | (1L << (WIDGET - 15)) | (1L << (FUNCTION - 15)) | (1L << (INT - 15)) | (1L << (DOUBLE - 15)) | (1L << (STRING - 15)) | (1L << (BOOLEAN - 15)) | (1L << (VAR - 15)) | (1L << (CONST - 15)) | (1L << (IDENTIFIER - 15)))) != 0)) {
					{
					setState(562);
					declaration();
					setState(567);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(563);
							match(COMMA);
							setState(564);
							declaration();
							}
							} 
						}
						setState(569);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(570);
						match(COMMA);
						setState(571);
						namedDeclaration();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENED_CURLY_BRACES) {
					{
					setState(576);
					namedDeclaration();
					}
				}

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

	public static class NamedDeclarationContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public List<TerminalNode> REQUIRED() { return getTokens(DartParser.REQUIRED); }
		public TerminalNode REQUIRED(int i) {
			return getToken(DartParser.REQUIRED, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public NamedDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNamedDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNamedDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNamedDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedDeclarationContext namedDeclaration() throws RecognitionException {
		NamedDeclarationContext _localctx = new NamedDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_namedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(OPENED_CURLY_BRACES);
			setState(582);
			match(REQUIRED);
			setState(583);
			declaration();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				match(REQUIRED);
				setState(586);
				declaration();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(CLOSED_CURLY_BRACES);
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

	public static class VoidFunctionBlockContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(DartParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public VoidFunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunctionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVoidFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVoidFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVoidFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionBlockContext voidFunctionBlock() throws RecognitionException {
		VoidFunctionBlockContext _localctx = new VoidFunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidFunctionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(OPENED_CURLY_BRACES);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(595);
				statement();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(601);
				match(RETURN);
				setState(602);
				match(SEMICOLON);
				}
			}

			setState(605);
			match(CLOSED_CURLY_BRACES);
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

	public static class TypeFunctionBlockContext extends ParserRuleContext {
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode RETURN() { return getToken(DartParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TypeFunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunctionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFunctionBlockContext typeFunctionBlock() throws RecognitionException {
		TypeFunctionBlockContext _localctx = new TypeFunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeFunctionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(OPENED_CURLY_BRACES);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(608);
				statement();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(RETURN);
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(615);
				expression();
				}
				break;
			case 2:
				{
				setState(616);
				functionCall();
				}
				break;
			case 3:
				{
				setState(617);
				widget();
				}
				break;
			}
			setState(620);
			match(SEMICOLON);
			setState(621);
			match(CLOSED_CURLY_BRACES);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	 
		public FunctionTypeContext() { }
		public void copyFrom(FunctionTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeFunctionContext extends FunctionTypeContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TypeFunctionBlockContext typeFunctionBlock() {
			return getRuleContext(TypeFunctionBlockContext.class,0);
		}
		public TypeFunctionContext(FunctionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionType);
		try {
			_localctx = new TypeFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(OPENED_BRACES);
			setState(624);
			functionParameter();
			setState(625);
			match(CLOSED_BRACES);
			setState(626);
			typeFunctionBlock();
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

	public static class FunctionVoidContext extends ParserRuleContext {
		public FunctionVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionVoid; }
	 
		public FunctionVoidContext() { }
		public void copyFrom(FunctionVoidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VoidFunctionContext extends FunctionVoidContext {
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public VoidFunctionBlockContext voidFunctionBlock() {
			return getRuleContext(VoidFunctionBlockContext.class,0);
		}
		public VoidFunctionContext(FunctionVoidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionVoidContext functionVoid() throws RecognitionException {
		FunctionVoidContext _localctx = new FunctionVoidContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionVoid);
		try {
			_localctx = new VoidFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(OPENED_BRACES);
			setState(629);
			functionParameter();
			setState(630);
			match(CLOSED_BRACES);
			setState(631);
			voidFunctionBlock();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationTypeFunctionContext extends FunctionDeclarationContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WIDGET() { return getToken(DartParser.WIDGET, 0); }
		public TerminalNode STATE() { return getToken(DartParser.STATE, 0); }
		public TerminalNode LESS_THAN() { return getToken(DartParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(DartParser.GREATER_THAN, 0); }
		public DeclarationTypeFunctionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDeclarationTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDeclarationTypeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDeclarationTypeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationVoidFunctionContext extends FunctionDeclarationContext {
		public TerminalNode VOID() { return getToken(DartParser.VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public DeclarationVoidFunctionContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDeclarationVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDeclarationVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDeclarationVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionDeclaration);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case WIDGET:
			case FUNCTION:
			case STATE:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case VAR:
				_localctx = new DeclarationTypeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(633);
					type();
					}
					break;
				case 2:
					{
					setState(634);
					match(WIDGET);
					}
					break;
				case 3:
					{
					setState(635);
					match(STATE);
					setState(636);
					match(LESS_THAN);
					setState(637);
					match(IDENTIFIER);
					setState(638);
					match(GREATER_THAN);
					}
					break;
				}
				setState(641);
				match(IDENTIFIER);
				setState(642);
				functionType();
				}
				break;
			case VOID:
				_localctx = new DeclarationVoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(VOID);
				setState(644);
				match(IDENTIFIER);
				setState(645);
				functionVoid();
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

	public static class SentParameterContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanSideContext booleanSide() {
			return getRuleContext(BooleanSideContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SentParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSentParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSentParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSentParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentParameterContext sentParameter() throws RecognitionException {
		SentParameterContext _localctx = new SentParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sentParameter);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				booleanSide();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				functionType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				functionVoid();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(654);
				widget();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(655);
				element();
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

	public static class NamedParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(DartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DartParser.COLON, i);
		}
		public List<SentParameterContext> sentParameter() {
			return getRuleContexts(SentParameterContext.class);
		}
		public SentParameterContext sentParameter(int i) {
			return getRuleContext(SentParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public NamedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNamedParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNamedParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNamedParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedParameterContext namedParameter() throws RecognitionException {
		NamedParameterContext _localctx = new NamedParameterContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_namedParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(658);
			match(IDENTIFIER);
			setState(659);
			match(COLON);
			setState(660);
			sentParameter();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(661);
				match(COMMA);
				setState(662);
				match(IDENTIFIER);
				setState(663);
				match(COLON);
				setState(664);
				sentParameter();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NonNamedParameterContext extends ParserRuleContext {
		public List<SentParameterContext> sentParameter() {
			return getRuleContexts(SentParameterContext.class);
		}
		public SentParameterContext sentParameter(int i) {
			return getRuleContext(SentParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public NonNamedParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNamedParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNonNamedParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNonNamedParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNonNamedParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonNamedParameterContext nonNamedParameter() throws RecognitionException {
		NonNamedParameterContext _localctx = new NonNamedParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nonNamedParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(670);
			sentParameter();
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(671);
					match(COMMA);
					setState(672);
					sentParameter();
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	public static class ParametersToSendContext extends ParserRuleContext {
		public NonNamedParameterContext nonNamedParameter() {
			return getRuleContext(NonNamedParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public NamedParameterContext namedParameter() {
			return getRuleContext(NamedParameterContext.class,0);
		}
		public ParametersToSendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersToSend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterParametersToSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitParametersToSend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitParametersToSend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersToSendContext parametersToSend() throws RecognitionException {
		ParametersToSendContext _localctx = new ParametersToSendContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parametersToSend);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << LISTVIEW) | (1L << ROW) | (1L << COLUMN) | (1L << TEXTWIDGET) | (1L << CONTAINER) | (1L << BUTTON) | (1L << IMAGE_I) | (1L << MATERIALAPP) | (1L << SCAFFOLD) | (1L << TEXTFIELD) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << STRING_LITERAL))) != 0) || _la==IDENTIFIER || _la==NOT) {
					{
					setState(678);
					nonNamedParameter();
					setState(681);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(679);
						match(COMMA);
						setState(680);
						namedParameter();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(685);
					namedParameter();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public ParametersToSendContext parametersToSend() {
			return getRuleContext(ParametersToSendContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(IDENTIFIER);
			setState(691);
			match(OPENED_BRACES);
			setState(692);
			parametersToSend();
			setState(693);
			match(CLOSED_BRACES);
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
	public static class BinaryExpressionContext extends ExpressionContext {
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public BitwiseOperationContext bitwiseOperation() {
			return getRuleContext(BitwiseOperationContext.class,0);
		}
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBitwiseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new BitwiseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				bitwiseOperation();
				}
				break;
			case 2:
				_localctx = new BinaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				binaryOperation();
				}
				break;
			case 3:
				_localctx = new LogicalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				logicalOperation();
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

	public static class DswitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(DartParser.SWITCH, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode OPENED_CURLY_BRACES() { return getToken(DartParser.OPENED_CURLY_BRACES, 0); }
		public TerminalNode CLOSED_CURLY_BRACES() { return getToken(DartParser.CLOSED_CURLY_BRACES, 0); }
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public DswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDswitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DswitchContext dswitch() throws RecognitionException {
		DswitchContext _localctx = new DswitchContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dswitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(SWITCH);
			setState(701);
			match(OPENED_BRACES);
			setState(702);
			expression();
			setState(703);
			match(CLOSED_BRACES);
			setState(704);
			match(OPENED_CURLY_BRACES);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(705);
				switchCase();
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(711);
				defaultCase();
				}
			}

			setState(714);
			match(CLOSED_CURLY_BRACES);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DartParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(CASE);
			setState(717);
			expression();
			setState(718);
			match(COLON);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(719);
				statement();
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(725);
				breakStatement();
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

	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DartParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(DEFAULT);
			setState(729);
			match(COLON);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENED_BRACES) | (1L << FOR) | (1L << WHILE) | (1L << LIST) | (1L << WIDGET) | (1L << FUNCTION) | (1L << STATE) | (1L << NAVIGATOR) | (1L << SETSTATE) | (1L << INTEGER_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << VAR) | (1L << CONST) | (1L << SWITCH))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IF - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (NOT - 67)))) != 0)) {
				{
				{
				setState(730);
				statement();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(736);
				breakStatement();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(DartParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(DartParser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(BREAK);
			setState(740);
			match(SEMICOLON);
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

	public static class WidgetContext extends ParserRuleContext {
		public ListViewContext listView() {
			return getRuleContext(ListViewContext.class,0);
		}
		public TextWidgetContext textWidget() {
			return getRuleContext(TextWidgetContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public MaterialAppContext materialApp() {
			return getRuleContext(MaterialAppContext.class,0);
		}
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_widget);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTVIEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				listView();
				}
				break;
			case TEXTWIDGET:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				textWidget();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				container();
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				button();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				row();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				column();
				}
				break;
			case IMAGE_I:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				image();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				scaffold();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				materialApp();
				}
				break;
			case TEXTFIELD:
				enterOuterAlt(_localctx, 10);
				{
				setState(751);
				textField();
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

	public static class ListViewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW() { return getToken(DartParser.LISTVIEW, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public ListViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterListView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitListView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitListView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewContext listView() throws RecognitionException {
		ListViewContext _localctx = new ListViewContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_listView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LISTVIEW);
			setState(755);
			match(OPENED_BRACES);
			setState(756);
			property();
			setState(757);
			match(CLOSED_BRACES);
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

	public static class TextWidgetContext extends ParserRuleContext {
		public TerminalNode TEXTWIDGET() { return getToken(DartParser.TEXTWIDGET, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TextWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textWidget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextWidgetContext textWidget() throws RecognitionException {
		TextWidgetContext _localctx = new TextWidgetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_textWidget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(TEXTWIDGET);
			setState(760);
			match(OPENED_BRACES);
			setState(761);
			literal();
			setState(762);
			match(CLOSED_BRACES);
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

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(DartParser.CONTAINER, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode CHILD() { return getToken(DartParser.CHILD, 0); }
		public List<TerminalNode> COLON() { return getTokens(DartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DartParser.COLON, i);
		}
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public TerminalNode WIDTH() { return getToken(DartParser.WIDTH, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode HEIGHT() { return getToken(DartParser.HEIGHT, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(CONTAINER);
			setState(765);
			match(OPENED_BRACES);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(766);
				match(CHILD);
				setState(767);
				match(COLON);
				setState(768);
				widget();
				setState(769);
				match(COMMA);
				}
			}

			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIDTH) {
				{
				setState(773);
				match(WIDTH);
				setState(774);
				match(COLON);
				setState(775);
				element();
				setState(776);
				match(COMMA);
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEIGHT) {
				{
				setState(780);
				match(HEIGHT);
				setState(781);
				match(COLON);
				setState(782);
				element();
				setState(783);
				match(COMMA);
				}
			}

			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR) {
				{
				setState(787);
				color();
				}
			}

			setState(790);
			match(CLOSED_BRACES);
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

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode BUTTON() { return getToken(DartParser.BUTTON, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CHILD() { return getToken(DartParser.CHILD, 0); }
		public List<TerminalNode> COLON() { return getTokens(DartParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(DartParser.COLON, i);
		}
		public TextWidgetContext textWidget() {
			return getRuleContext(TextWidgetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public TerminalNode ONPRESSED() { return getToken(DartParser.ONPRESSED, 0); }
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(BUTTON);
			setState(793);
			match(OPENED_BRACES);
			setState(794);
			match(CHILD);
			setState(795);
			match(COLON);
			setState(796);
			textWidget();
			setState(797);
			match(COMMA);
			setState(798);
			match(ONPRESSED);
			setState(799);
			match(COLON);
			setState(800);
			functionVoid();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(801);
				match(COMMA);
				setState(802);
				color();
				}
			}

			setState(805);
			match(CLOSED_BRACES);
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

	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(DartParser.ROW, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(ROW);
			setState(808);
			match(OPENED_BRACES);
			setState(809);
			property();
			setState(810);
			match(CLOSED_BRACES);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(DartParser.COLUMN, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(COLUMN);
			setState(813);
			match(OPENED_BRACES);
			setState(814);
			property();
			setState(815);
			match(CLOSED_BRACES);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(DartParser.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode OPENED_SQUERE_BRACES() { return getToken(DartParser.OPENED_SQUERE_BRACES, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TerminalNode CLOSED_SQUERE_BRACES() { return getToken(DartParser.CLOSED_SQUERE_BRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(CHILDREN);
			setState(818);
			match(COLON);
			setState(819);
			match(OPENED_SQUERE_BRACES);
			setState(820);
			widget();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				widget();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			match(CLOSED_SQUERE_BRACES);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DartParser.COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode COLOR_C() { return getToken(DartParser.COLOR_C, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode COLOR_START() { return getToken(DartParser.COLOR_START, 0); }
		public TerminalNode COLOR_HEX() { return getToken(DartParser.COLOR_HEX, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(COLOR);
			setState(831);
			match(COLON);
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case DOUBLE_LITERAL:
			case IDENTIFIER:
				{
				setState(832);
				element();
				}
				break;
			case COLOR_C:
				{
				setState(833);
				match(COLOR_C);
				setState(834);
				match(OPENED_BRACES);
				setState(835);
				match(COLOR_START);
				setState(836);
				match(COLOR_HEX);
				setState(837);
				match(CLOSED_BRACES);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE_I() { return getToken(DartParser.IMAGE_I, 0); }
		public List<TerminalNode> OPENED_BRACES() { return getTokens(DartParser.OPENED_BRACES); }
		public TerminalNode OPENED_BRACES(int i) {
			return getToken(DartParser.OPENED_BRACES, i);
		}
		public List<TerminalNode> CLOSED_BRACES() { return getTokens(DartParser.CLOSED_BRACES); }
		public TerminalNode CLOSED_BRACES(int i) {
			return getToken(DartParser.CLOSED_BRACES, i);
		}
		public TerminalNode IMAGE() { return getToken(DartParser.IMAGE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ASSETIMAGE() { return getToken(DartParser.ASSETIMAGE, 0); }
		public TerminalNode NETWORKIMAGE() { return getToken(DartParser.NETWORKIMAGE, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(IMAGE_I);
			setState(841);
			match(OPENED_BRACES);
			{
			setState(842);
			match(IMAGE);
			setState(843);
			match(COLON);
			setState(844);
			_la = _input.LA(1);
			if ( !(_la==ASSETIMAGE || _la==NETWORKIMAGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(845);
			match(OPENED_BRACES);
			setState(846);
			literal();
			setState(847);
			match(CLOSED_BRACES);
			}
			setState(849);
			match(CLOSED_BRACES);
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

	public static class MaterialAppContext extends ParserRuleContext {
		public TerminalNode MATERIALAPP() { return getToken(DartParser.MATERIALAPP, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode HOME() { return getToken(DartParser.HOME, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public MaterialAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMaterialApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMaterialApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMaterialApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialAppContext materialApp() throws RecognitionException {
		MaterialAppContext _localctx = new MaterialAppContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_materialApp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(MATERIALAPP);
			setState(852);
			match(OPENED_BRACES);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HOME) {
				{
				setState(853);
				match(HOME);
				setState(854);
				match(COLON);
				setState(855);
				functionCall();
				setState(856);
				match(COMMA);
				}
			}

			setState(860);
			match(CLOSED_BRACES);
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

	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(DartParser.SCAFFOLD, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TerminalNode BODY() { return getToken(DartParser.BODY, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitScaffold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_scaffold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(SCAFFOLD);
			setState(863);
			match(OPENED_BRACES);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY) {
				{
				setState(864);
				match(BODY);
				setState(865);
				match(COLON);
				setState(866);
				widget();
				setState(867);
				match(COMMA);
				}
			}

			setState(871);
			match(CLOSED_BRACES);
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

	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD() { return getToken(DartParser.TEXTFIELD, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public OnChangedContext onChanged() {
			return getRuleContext(OnChangedContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_textField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(TEXTFIELD);
			setState(874);
			match(OPENED_BRACES);
			setState(875);
			onChanged();
			setState(876);
			match(CLOSED_BRACES);
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

	public static class OnChangedContext extends ParserRuleContext {
		public TerminalNode ONCHANGED() { return getToken(DartParser.ONCHANGED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public VoidFunctionBlockContext voidFunctionBlock() {
			return getRuleContext(VoidFunctionBlockContext.class,0);
		}
		public OnChangedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onChanged; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOnChanged(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOnChanged(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOnChanged(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnChangedContext onChanged() throws RecognitionException {
		OnChangedContext _localctx = new OnChangedContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_onChanged);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(ONCHANGED);
			setState(879);
			match(COLON);
			setState(880);
			match(OPENED_BRACES);
			setState(881);
			declaration();
			setState(882);
			match(CLOSED_BRACES);
			setState(883);
			voidFunctionBlock();
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

	public static class SetStateContext extends ParserRuleContext {
		public TerminalNode SETSTATE() { return getToken(DartParser.SETSTATE, 0); }
		public TerminalNode OPENED_BRACES() { return getToken(DartParser.OPENED_BRACES, 0); }
		public FunctionVoidContext functionVoid() {
			return getRuleContext(FunctionVoidContext.class,0);
		}
		public TerminalNode CLOSED_BRACES() { return getToken(DartParser.CLOSED_BRACES, 0); }
		public SetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateContext setState() throws RecognitionException {
		SetStateContext _localctx = new SetStateContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_setState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(SETSTATE);
			setState(886);
			match(OPENED_BRACES);
			setState(887);
			functionVoid();
			setState(888);
			match(CLOSED_BRACES);
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
		"\u0004\u0001n\u037b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0088"+
		"\b\u0000\n\u0000\f\u0000\u008b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0093\b\u0000\n\u0000"+
		"\f\u0000\u0096\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u009e\b\u0001\n\u0001\f\u0001\u00a1"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00c2\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00d3\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0003\u0005\u00e0\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00e5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00ea\b\u0005\u0005\u0005\u00ec\b\u0005\n\u0005\f\u0005\u00ef\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00f7\b\u0005\u0003\u0005\u00f9\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00fe\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0105\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u010c\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0113\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u011a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0120\b\u0006\u0003\u0006\u0122\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012a\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\n\u0130\b\n\n\n\f\n\u0133\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u013b\b\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u013f\b\u000b\n\u000b\f\u000b\u0142\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0148\b\u000b\n\u000b\f\u000b"+
		"\u014b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0151\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015d\b\u000e\u0003\u000e"+
		"\u015f\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0165\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u016f\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u0177\b\u0013\u000b\u0013\f\u0013\u0178\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u017f\b\u0013\u000b\u0013\f\u0013\u0180"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0189\b\u0013\n\u0013\f\u0013\u018c\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0194"+
		"\b\u0013\n\u0013\f\u0013\u0197\t\u0013\u0003\u0013\u0199\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01a3\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01a9\b\u0016\n\u0016\f\u0016\u01ac\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01b5\b\u0017\n\u0017\f\u0017\u01b8\t\u0017\u0001"+
		"\u0017\u0003\u0017\u01bb\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01c3\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01c8\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01d0\b\u001a\n"+
		"\u001a\f\u001a\u01d3\t\u001a\u0003\u001a\u01d5\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01de\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01e6\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01ed\b\u001c\u0001\u001c\u0003"+
		"\u001c\u01f0\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01fa\b\u001d\u0003"+
		"\u001d\u01fc\b\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0200\b\u001d"+
		"\n\u001d\f\u001d\u0203\t\u001d\u0001\u001d\u0003\u001d\u0206\b\u001d\u0001"+
		"\u001d\u0005\u001d\u0209\b\u001d\n\u001d\f\u001d\u020c\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0215\b\u001f\n\u001f\f\u001f\u0218\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0221\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0228\b \u0005 \u022a\b \n \f \u022d\t "+
		"\u0003 \u022f\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u0236\b!\n"+
		"!\f!\u0239\t!\u0001!\u0001!\u0003!\u023d\b!\u0003!\u023f\b!\u0001!\u0003"+
		"!\u0242\b!\u0003!\u0244\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u024c\b\"\n\"\f\"\u024f\t\"\u0001\"\u0001\"\u0001#\u0001#\u0005"+
		"#\u0255\b#\n#\f#\u0258\t#\u0001#\u0001#\u0003#\u025c\b#\u0001#\u0001#"+
		"\u0001$\u0001$\u0005$\u0262\b$\n$\f$\u0265\t$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u026b\b$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0280\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0287\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0291\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u029a"+
		"\b)\n)\f)\u029d\t)\u0001*\u0001*\u0001*\u0005*\u02a2\b*\n*\f*\u02a5\t"+
		"*\u0001+\u0001+\u0001+\u0003+\u02aa\b+\u0003+\u02ac\b+\u0001+\u0003+\u02af"+
		"\b+\u0003+\u02b1\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0003-\u02bb\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u02c3"+
		"\b.\n.\f.\u02c6\t.\u0001.\u0003.\u02c9\b.\u0001.\u0001.\u0001/\u0001/"+
		"\u0001/\u0001/\u0005/\u02d1\b/\n/\f/\u02d4\t/\u0001/\u0003/\u02d7\b/\u0001"+
		"0\u00010\u00010\u00050\u02dc\b0\n0\f0\u02df\t0\u00010\u00030\u02e2\b0"+
		"\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u02f1\b2\u00013\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u0304\b5\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u030b\b5\u00015\u00015\u00015\u00015\u00015\u00035\u0312\b5\u00015\u0003"+
		"5\u0315\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u0324\b6\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00059\u0338\b9\n9\f9\u033b\t9\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0347"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u035b"+
		"\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003"+
		"=\u0366\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0000\b\u0003\u0000\u000f\u001169<<\u0001\u0000"+
		"/0\u0002\u0000RRTT\u0001\u0000VY\u0001\u0000Z_\u0003\u0000aacceg\u0002"+
		"\u0000bbdd\u0001\u0000\"#\u03c5\u0000\u0089\u0001\u0000\u0000\u0000\u0002"+
		"\u0097\u0001\u0000\u0000\u0000\u0004\u00c1\u0001\u0000\u0000\u0000\u0006"+
		"\u00d2\u0001\u0000\u0000\u0000\b\u00d4\u0001\u0000\u0000\u0000\n\u00f8"+
		"\u0001\u0000\u0000\u0000\f\u0121\u0001\u0000\u0000\u0000\u000e\u0123\u0001"+
		"\u0000\u0000\u0000\u0010\u0129\u0001\u0000\u0000\u0000\u0012\u012b\u0001"+
		"\u0000\u0000\u0000\u0014\u013a\u0001\u0000\u0000\u0000\u0016\u0150\u0001"+
		"\u0000\u0000\u0000\u0018\u0152\u0001\u0000\u0000\u0000\u001a\u0155\u0001"+
		"\u0000\u0000\u0000\u001c\u015e\u0001\u0000\u0000\u0000\u001e\u0160\u0001"+
		"\u0000\u0000\u0000 \u0164\u0001\u0000\u0000\u0000\"\u016e\u0001\u0000"+
		"\u0000\u0000$\u0170\u0001\u0000\u0000\u0000&\u0198\u0001\u0000\u0000\u0000"+
		"(\u019a\u0001\u0000\u0000\u0000*\u01a2\u0001\u0000\u0000\u0000,\u01af"+
		"\u0001\u0000\u0000\u0000.\u01b1\u0001\u0000\u0000\u00000\u01bc\u0001\u0000"+
		"\u0000\u00002\u01c4\u0001\u0000\u0000\u00004\u01c9\u0001\u0000\u0000\u0000"+
		"6\u01df\u0001\u0000\u0000\u00008\u01ef\u0001\u0000\u0000\u0000:\u01f1"+
		"\u0001\u0000\u0000\u0000<\u020f\u0001\u0000\u0000\u0000>\u0212\u0001\u0000"+
		"\u0000\u0000@\u021b\u0001\u0000\u0000\u0000B\u0243\u0001\u0000\u0000\u0000"+
		"D\u0245\u0001\u0000\u0000\u0000F\u0252\u0001\u0000\u0000\u0000H\u025f"+
		"\u0001\u0000\u0000\u0000J\u026f\u0001\u0000\u0000\u0000L\u0274\u0001\u0000"+
		"\u0000\u0000N\u0286\u0001\u0000\u0000\u0000P\u0290\u0001\u0000\u0000\u0000"+
		"R\u0292\u0001\u0000\u0000\u0000T\u029e\u0001\u0000\u0000\u0000V\u02b0"+
		"\u0001\u0000\u0000\u0000X\u02b2\u0001\u0000\u0000\u0000Z\u02ba\u0001\u0000"+
		"\u0000\u0000\\\u02bc\u0001\u0000\u0000\u0000^\u02cc\u0001\u0000\u0000"+
		"\u0000`\u02d8\u0001\u0000\u0000\u0000b\u02e3\u0001\u0000\u0000\u0000d"+
		"\u02f0\u0001\u0000\u0000\u0000f\u02f2\u0001\u0000\u0000\u0000h\u02f7\u0001"+
		"\u0000\u0000\u0000j\u02fc\u0001\u0000\u0000\u0000l\u0318\u0001\u0000\u0000"+
		"\u0000n\u0327\u0001\u0000\u0000\u0000p\u032c\u0001\u0000\u0000\u0000r"+
		"\u0331\u0001\u0000\u0000\u0000t\u033e\u0001\u0000\u0000\u0000v\u0348\u0001"+
		"\u0000\u0000\u0000x\u0353\u0001\u0000\u0000\u0000z\u035e\u0001\u0000\u0000"+
		"\u0000|\u0369\u0001\u0000\u0000\u0000~\u036e\u0001\u0000\u0000\u0000\u0080"+
		"\u0375\u0001\u0000\u0000\u0000\u0082\u0088\u0003:\u001d\u0000\u0083\u0088"+
		"\u0003N\'\u0000\u0084\u0085\u0003\n\u0005\u0000\u0085\u0086\u0005m\u0000"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000\u0000"+
		"\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0094\u0003\u0002\u0001"+
		"\u0000\u008d\u0093\u0003:\u001d\u0000\u008e\u0093\u0003N\'\u0000\u008f"+
		"\u0090\u0003\n\u0005\u0000\u0090\u0091\u0005m\u0000\u0000\u0091\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0001\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u00055\u0000\u0000\u0098\u0099\u0005"+
		"E\u0000\u0000\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u009b\u0005\u0003"+
		"\u0000\u0000\u009b\u009f\u0005\u0004\u0000\u0000\u009c\u009e\u0003\u0004"+
		"\u0002\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000\u00a3\u0003\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0003\u0006\u0003\u0000\u00a5\u00a6\u0005m\u0000"+
		"\u0000\u00a6\u00c2\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000"+
		"\u00a8\u00a9\u0005m\u0000\u0000\u00a9\u00c2\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0003\f\u0006\u0000\u00ab\u00ac\u0005m\u0000\u0000\u00ac\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af\u0005"+
		"m\u0000\u0000\u00af\u00c2\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\""+
		"\u0011\u0000\u00b1\u00b2\u0005m\u0000\u0000\u00b2\u00c2\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0003,\u0016\u0000\u00b4\u00b5\u0005m\u0000\u0000\u00b5"+
		"\u00c2\u0001\u0000\u0000\u0000\u00b6\u00c2\u00036\u001b\u0000\u00b7\u00c2"+
		"\u00034\u001a\u0000\u00b8\u00c2\u0003N\'\u0000\u00b9\u00ba\u0003X,\u0000"+
		"\u00ba\u00bb\u0005m\u0000\u0000\u00bb\u00c2\u0001\u0000\u0000\u0000\u00bc"+
		"\u00c2\u0003\\.\u0000\u00bd\u00c2\u0003.\u0017\u0000\u00be\u00bf\u0003"+
		"\u0080@\u0000\u00bf\u00c0\u0005m\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00a4\u0001\u0000\u0000\u0000\u00c1\u00a7\u0001\u0000\u0000"+
		"\u0000\u00c1\u00aa\u0001\u0000\u0000\u0000\u00c1\u00ad\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b0\u0001\u0000\u0000\u0000\u00c1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b6\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b8\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u0005\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005$\u0000\u0000\u00c4\u00c5\u0005\u0001\u0000\u0000"+
		"\u00c5\u00c6\u0005%\u0000\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000\u00c7"+
		"\u00c8\u0005M\u0000\u0000\u00c8\u00c9\u0005k\u0000\u0000\u00c9\u00ca\u0003"+
		"\b\u0004\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005$\u0000\u0000\u00cd\u00ce\u0005\u0001\u0000"+
		"\u0000\u00ce\u00cf\u0005&\u0000\u0000\u00cf\u00d0\u0005\u0002\u0000\u0000"+
		"\u00d0\u00d1\u0005M\u0000\u0000\u00d1\u00d3\u0005\u0003\u0000\u0000\u00d2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d3"+
		"\u0007\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005(\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0002\u0000\u0000\u00d6\u00d7\u0005\'\u0000\u0000\u00d7\u00d8\u0005"+
		"l\u0000\u0000\u00d8\u00d9\u0005\u0002\u0000\u0000\u00d9\u00da\u0003P("+
		"\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0003H$\u0000\u00dc"+
		"\u00dd\u0005\u0003\u0000\u0000\u00dd\t\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0005=\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4\u0003"+
		"\u000e\u0007\u0000\u00e2\u00e5\u0005M\u0000\u0000\u00e3\u00e5\u0003\f"+
		"\u0006\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e9\u0005k\u0000"+
		"\u0000\u00e7\u00ea\u0005M\u0000\u0000\u00e8\u00ea\u0003\f\u0006\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f9\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005M\u0000\u0000\u00f1"+
		"\u00f6\u0005M\u0000\u0000\u00f2\u00f3\u0005Q\u0000\u0000\u00f3\u00f4\u0005"+
		"M\u0000\u0000\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u00f7\u0005\u0003"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00df\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f9\u000b\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0005M\u0000\u0000\u00fb\u00fc\u0005\u0001\u0000"+
		"\u0000\u00fc\u00fe\u0005M\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005Q\u0000\u0000\u0100\u0122\u0003\u0010\b\u0000\u0101"+
		"\u0104\u0005M\u0000\u0000\u0102\u0103\u0005\u0001\u0000\u0000\u0103\u0105"+
		"\u0005M\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"Q\u0000\u0000\u0107\u0122\u0003Z-\u0000\u0108\u010b\u0005M\u0000\u0000"+
		"\u0109\u010a\u0005\u0001\u0000\u0000\u010a\u010c\u0005M\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005Q\u0000\u0000\u010e\u0122"+
		"\u0003@ \u0000\u010f\u0112\u0005M\u0000\u0000\u0110\u0111\u0005\u0001"+
		"\u0000\u0000\u0111\u0113\u0005M\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005Q\u0000\u0000\u0115\u0122\u0003d2\u0000\u0116"+
		"\u0119\u0005M\u0000\u0000\u0117\u0118\u0005\u0001\u0000\u0000\u0118\u011a"+
		"\u0005M\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011f\u0005"+
		"Q\u0000\u0000\u011c\u0120\u0003X,\u0000\u011d\u0120\u0003J%\u0000\u011e"+
		"\u0120\u0003L&\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u00fa\u0001\u0000\u0000\u0000\u0121\u0101\u0001"+
		"\u0000\u0000\u0000\u0121\u0108\u0001\u0000\u0000\u0000\u0121\u010f\u0001"+
		"\u0000\u0000\u0000\u0121\u0116\u0001\u0000\u0000\u0000\u0122\r\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0007\u0000\u0000\u0000\u0124\u000f\u0001\u0000"+
		"\u0000\u0000\u0125\u012a\u0005/\u0000\u0000\u0126\u012a\u00050\u0000\u0000"+
		"\u0127\u012a\u00052\u0000\u0000\u0128\u012a\u00051\u0000\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u0011"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0007\u0001\u0000\u0000\u012c\u0013"+
		"\u0001\u0000\u0000\u0000\u012d\u0131\u0003\u0016\u000b\u0000\u012e\u0130"+
		"\u0003\u0018\f\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u013b\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0003\u001c\u000e\u0000\u0135\u0136\u0005"+
		"S\u0000\u0000\u0136\u013b\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u001c"+
		"\u000e\u0000\u0138\u0139\u0005U\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u012d\u0001\u0000\u0000\u0000\u013a\u0134\u0001\u0000\u0000"+
		"\u0000\u013a\u0137\u0001\u0000\u0000\u0000\u013b\u0015\u0001\u0000\u0000"+
		"\u0000\u013c\u0140\u0003\u001c\u000e\u0000\u013d\u013f\u0003\u001a\r\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0151\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005\u0002\u0000\u0000\u0144\u0145\u0003\u0014\n\u0000\u0145"+
		"\u0149\u0005\u0003\u0000\u0000\u0146\u0148\u0003\u001a\r\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0151"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\u0002\u0000\u0000\u014d\u014e\u0003\u0016\u000b\u0000\u014e\u014f"+
		"\u0005\u0003\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u013c"+
		"\u0001\u0000\u0000\u0000\u0150\u0143\u0001\u0000\u0000\u0000\u0150\u014c"+
		"\u0001\u0000\u0000\u0000\u0151\u0017\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0007\u0002\u0000\u0000\u0153\u0154\u0003\u0016\u000b\u0000\u0154\u0019"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0007\u0003\u0000\u0000\u0156\u0157"+
		"\u0003\u0016\u000b\u0000\u0157\u001b\u0001\u0000\u0000\u0000\u0158\u015f"+
		"\u0003\u0012\t\u0000\u0159\u015c\u0005M\u0000\u0000\u015a\u015b\u0005"+
		"\u0001\u0000\u0000\u015b\u015d\u0005M\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000"+
		"\u0000\u0000\u015e\u0158\u0001\u0000\u0000\u0000\u015e\u0159\u0001\u0000"+
		"\u0000\u0000\u015f\u001d\u0001\u0000\u0000\u0000\u0160\u0161\u0007\u0004"+
		"\u0000\u0000\u0161\u001f\u0001\u0000\u0000\u0000\u0162\u0165\u0003\u001c"+
		"\u000e\u0000\u0163\u0165\u0003\u0014\n\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165!\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0003 \u0010\u0000\u0167\u0168\u0003\u001e\u000f\u0000\u0168"+
		"\u0169\u0003 \u0010\u0000\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0005\u0002\u0000\u0000\u016b\u016c\u0003\"\u0011\u0000\u016c\u016d\u0005"+
		"\u0003\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0166\u0001"+
		"\u0000\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016f#\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0007\u0005\u0000\u0000\u0171%\u0001\u0000\u0000"+
		"\u0000\u0172\u0176\u0003 \u0010\u0000\u0173\u0174\u0003$\u0012\u0000\u0174"+
		"\u0175\u0003 \u0010\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0173"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0199"+
		"\u0001\u0000\u0000\u0000\u017a\u017e\u0003 \u0010\u0000\u017b\u017c\u0003"+
		"$\u0012\u0000\u017c\u017d\u0003&\u0013\u0000\u017d\u017f\u0001\u0000\u0000"+
		"\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0199\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0002\u0000"+
		"\u0000\u0183\u0184\u0003&\u0013\u0000\u0184\u018a\u0005\u0003\u0000\u0000"+
		"\u0185\u0186\u0003$\u0012\u0000\u0186\u0187\u0003 \u0010\u0000\u0187\u0189"+
		"\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000\u0000\u0189\u018c"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u0199\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0002\u0000\u0000\u018e\u018f"+
		"\u0003&\u0013\u0000\u018f\u0195\u0005\u0003\u0000\u0000\u0190\u0191\u0003"+
		"$\u0012\u0000\u0191\u0192\u0003&\u0013\u0000\u0192\u0194\u0001\u0000\u0000"+
		"\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000"+
		"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0172\u0001\u0000\u0000\u0000\u0198\u017a\u0001\u0000\u0000"+
		"\u0000\u0198\u0182\u0001\u0000\u0000\u0000\u0198\u018d\u0001\u0000\u0000"+
		"\u0000\u0199\'\u0001\u0000\u0000\u0000\u019a\u019b\u0007\u0006\u0000\u0000"+
		"\u019b)\u0001\u0000\u0000\u0000\u019c\u01a3\u0003\"\u0011\u0000\u019d"+
		"\u019e\u0005\u0002\u0000\u0000\u019e\u019f\u0003,\u0016\u0000\u019f\u01a0"+
		"\u0005\u0003\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u00051\u0000\u0000\u01a2\u019c\u0001\u0000\u0000\u0000\u01a2\u019d\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3+\u0001\u0000"+
		"\u0000\u0000\u01a4\u01aa\u0003*\u0015\u0000\u01a5\u01a6\u0003(\u0014\u0000"+
		"\u01a6\u01a7\u0003*\u0015\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01b0\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005`\u0000\u0000\u01ae\u01b0\u0003,\u0016\u0000\u01af\u01a4\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0-\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b6\u00030\u0018\u0000\u01b2\u01b3\u0005D\u0000\u0000"+
		"\u01b3\u01b5\u00030\u0018\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u00032\u0019\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb/\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0005C\u0000\u0000\u01bd\u01be\u0005\u0002"+
		"\u0000\u0000\u01be\u01bf\u0003,\u0016\u0000\u01bf\u01c2\u0005\u0003\u0000"+
		"\u0000\u01c0\u01c3\u0003>\u001f\u0000\u01c1\u01c3\u0003\u0004\u0002\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c31\u0001\u0000\u0000\u0000\u01c4\u01c7\u0005D\u0000\u0000\u01c5\u01c8"+
		"\u0003>\u001f\u0000\u01c6\u01c8\u0003\u0004\u0002\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c83\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005\u000b\u0000\u0000\u01ca\u01d4\u0005\u0002"+
		"\u0000\u0000\u01cb\u01d5\u0003\n\u0005\u0000\u01cc\u01d1\u0003\f\u0006"+
		"\u0000\u01cd\u01ce\u0005k\u0000\u0000\u01ce\u01d0\u0003\f\u0006\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d4\u01cb\u0001\u0000\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0005m\u0000\u0000\u01d7\u01d8\u0003,\u0016\u0000\u01d8\u01d9"+
		"\u0005m\u0000\u0000\u01d9\u01da\u0003\u0014\n\u0000\u01da\u01dd\u0005"+
		"\u0003\u0000\u0000\u01db\u01de\u0003>\u001f\u0000\u01dc\u01de\u0005m\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de5\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\f\u0000\u0000"+
		"\u01e0\u01e1\u0005\u0002\u0000\u0000\u01e1\u01e2\u0003,\u0016\u0000\u01e2"+
		"\u01e5\u0005\u0003\u0000\u0000\u01e3\u01e6\u0003>\u001f\u0000\u01e4\u01e6"+
		"\u0005m\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e67\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003\n"+
		"\u0005\u0000\u01e8\u01e9\u0005m\u0000\u0000\u01e9\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0005i\u0000\u0000\u01eb\u01ed\u0005G\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0003N\'\u0000\u01ef\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000\u01f09\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0005\n\u0000\u0000\u01f2\u01fb\u0005M"+
		"\u0000\u0000\u01f3\u01f9\u0005F\u0000\u0000\u01f4\u01fa\u0005M\u0000\u0000"+
		"\u01f5\u01f6\u0005\u0012\u0000\u0000\u01f6\u01f7\u0005Z\u0000\u0000\u01f7"+
		"\u01f8\u0005M\u0000\u0000\u01f8\u01fa\u0005\\\u0000\u0000\u01f9\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u0201"+
		"\u0005\u0004\u0000\u0000\u01fe\u0200\u00038\u001c\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0205\u0001"+
		"\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0206\u0003"+
		"<\u001e\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u0206\u020a\u0001\u0000\u0000\u0000\u0207\u0209\u00038\u001c"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005\u0005\u0000\u0000\u020e;\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0005M\u0000\u0000\u0210\u0211\u0003L&\u0000\u0211=\u0001"+
		"\u0000\u0000\u0000\u0212\u0216\u0005\u0004\u0000\u0000\u0213\u0215\u0003"+
		"\u0004\u0002\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001"+
		"\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005\u0005\u0000\u0000\u021a?\u0001\u0000"+
		"\u0000\u0000\u021b\u022e\u0005\u0006\u0000\u0000\u021c\u0221\u0003\u001c"+
		"\u000e\u0000\u021d\u0221\u0003@ \u0000\u021e\u0221\u0003\u0010\b\u0000"+
		"\u021f\u0221\u0005M\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0220"+
		"\u021d\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u021f\u0001\u0000\u0000\u0000\u0221\u022b\u0001\u0000\u0000\u0000\u0222"+
		"\u0227\u0005k\u0000\u0000\u0223\u0228\u0003\u001c\u000e\u0000\u0224\u0228"+
		"\u0003@ \u0000\u0225\u0228\u0003\u0010\b\u0000\u0226\u0228\u0005M\u0000"+
		"\u0000\u0227\u0223\u0001\u0000\u0000\u0000\u0227\u0224\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0222\u0001\u0000\u0000"+
		"\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000"+
		"\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0220\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0005\u0007\u0000\u0000\u0231A\u0001\u0000\u0000\u0000"+
		"\u0232\u0237\u0003\n\u0005\u0000\u0233\u0234\u0005k\u0000\u0000\u0234"+
		"\u0236\u0003\n\u0005\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u023c\u0001\u0000\u0000\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005k\u0000\u0000\u023b\u023d\u0003"+
		"D\"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000"+
		"\u0000\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u0232\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0244\u0001\u0000"+
		"\u0000\u0000\u0240\u0242\u0003D\"\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000"+
		"\u0000\u0243\u023e\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0244C\u0001\u0000\u0000\u0000\u0245\u0246\u0005\u0004\u0000\u0000"+
		"\u0246\u0247\u0005H\u0000\u0000\u0247\u024d\u0003\n\u0005\u0000\u0248"+
		"\u0249\u0005k\u0000\u0000\u0249\u024a\u0005H\u0000\u0000\u024a\u024c\u0003"+
		"\n\u0005\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000"+
		"\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0005\u0005\u0000\u0000\u0251E\u0001\u0000\u0000"+
		"\u0000\u0252\u0256\u0005\u0004\u0000\u0000\u0253\u0255\u0003\u0004\u0002"+
		"\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000"+
		"\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000"+
		"\u0000\u0257\u025b\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0005B\u0000\u0000\u025a\u025c\u0005m\u0000\u0000\u025b"+
		"\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0005\u0005\u0000\u0000\u025e"+
		"G\u0001\u0000\u0000\u0000\u025f\u0263\u0005\u0004\u0000\u0000\u0260\u0262"+
		"\u0003\u0004\u0002\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262\u0265"+
		"\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0263"+
		"\u0001\u0000\u0000\u0000\u0266\u026a\u0005B\u0000\u0000\u0267\u026b\u0003"+
		"Z-\u0000\u0268\u026b\u0003X,\u0000\u0269\u026b\u0003d2\u0000\u026a\u0267"+
		"\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u0269"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005m\u0000\u0000\u026d\u026e\u0005\u0005\u0000\u0000\u026eI\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\u0005\u0002\u0000\u0000\u0270\u0271\u0003B!\u0000"+
		"\u0271\u0272\u0005\u0003\u0000\u0000\u0272\u0273\u0003H$\u0000\u0273K"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0005\u0002\u0000\u0000\u0275\u0276"+
		"\u0003B!\u0000\u0276\u0277\u0005\u0003\u0000\u0000\u0277\u0278\u0003F"+
		"#\u0000\u0278M\u0001\u0000\u0000\u0000\u0279\u0280\u0003\u000e\u0007\u0000"+
		"\u027a\u0280\u0005\u0010\u0000\u0000\u027b\u027c\u0005\u0012\u0000\u0000"+
		"\u027c\u027d\u0005Z\u0000\u0000\u027d\u027e\u0005M\u0000\u0000\u027e\u0280"+
		"\u0005\\\u0000\u0000\u027f\u0279\u0001\u0000\u0000\u0000\u027f\u027a\u0001"+
		"\u0000\u0000\u0000\u027f\u027b\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u0005M\u0000\u0000\u0282\u0287\u0003J%"+
		"\u0000\u0283\u0284\u00055\u0000\u0000\u0284\u0285\u0005M\u0000\u0000\u0285"+
		"\u0287\u0003L&\u0000\u0286\u027f\u0001\u0000\u0000\u0000\u0286\u0283\u0001"+
		"\u0000\u0000\u0000\u0287O\u0001\u0000\u0000\u0000\u0288\u0291\u0003\u0010"+
		"\b\u0000\u0289\u0291\u0003X,\u0000\u028a\u0291\u0003Z-\u0000\u028b\u0291"+
		"\u0003*\u0015\u0000\u028c\u0291\u0003J%\u0000\u028d\u0291\u0003L&\u0000"+
		"\u028e\u0291\u0003d2\u0000\u028f\u0291\u0003\u001c\u000e\u0000\u0290\u0288"+
		"\u0001\u0000\u0000\u0000\u0290\u0289\u0001\u0000\u0000\u0000\u0290\u028a"+
		"\u0001\u0000\u0000\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u028c"+
		"\u0001\u0000\u0000\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291Q\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0005M\u0000\u0000\u0293\u0294\u0005l\u0000"+
		"\u0000\u0294\u029b\u0003P(\u0000\u0295\u0296\u0005k\u0000\u0000\u0296"+
		"\u0297\u0005M\u0000\u0000\u0297\u0298\u0005l\u0000\u0000\u0298\u029a\u0003"+
		"P(\u0000\u0299\u0295\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029cS\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000"+
		"\u029e\u02a3\u0003P(\u0000\u029f\u02a0\u0005k\u0000\u0000\u02a0\u02a2"+
		"\u0003P(\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a4U\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a9\u0003T*\u0000\u02a7\u02a8\u0005k\u0000\u0000\u02a8"+
		"\u02aa\u0003R)\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a6\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02b1\u0001"+
		"\u0000\u0000\u0000\u02ad\u02af\u0003R)\u0000\u02ae\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ab\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000"+
		"\u0000\u02b1W\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005M\u0000\u0000\u02b3"+
		"\u02b4\u0005\u0002\u0000\u0000\u02b4\u02b5\u0003V+\u0000\u02b5\u02b6\u0005"+
		"\u0003\u0000\u0000\u02b6Y\u0001\u0000\u0000\u0000\u02b7\u02bb\u0003&\u0013"+
		"\u0000\u02b8\u02bb\u0003\u0014\n\u0000\u02b9\u02bb\u0003,\u0016\u0000"+
		"\u02ba\u02b7\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000"+
		"\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb[\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0005>\u0000\u0000\u02bd\u02be\u0005\u0002\u0000\u0000\u02be\u02bf"+
		"\u0003Z-\u0000\u02bf\u02c0\u0005\u0003\u0000\u0000\u02c0\u02c4\u0005\u0004"+
		"\u0000\u0000\u02c1\u02c3\u0003^/\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003`0\u0000\u02c8\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\u0005\u0000\u0000\u02cb]\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0005?\u0000\u0000\u02cd\u02ce\u0003Z-"+
		"\u0000\u02ce\u02d2\u0005l\u0000\u0000\u02cf\u02d1\u0003\u0004\u0002\u0000"+
		"\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d7\u0003b1\u0000\u02d6\u02d5\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d7_\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005"+
		"@\u0000\u0000\u02d9\u02dd\u0005l\u0000\u0000\u02da\u02dc\u0003\u0004\u0002"+
		"\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000"+
		"\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000"+
		"\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e2\u0003b1\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e2a\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0005A\u0000\u0000\u02e4\u02e5\u0005m\u0000\u0000\u02e5c\u0001\u0000"+
		"\u0000\u0000\u02e6\u02f1\u0003f3\u0000\u02e7\u02f1\u0003h4\u0000\u02e8"+
		"\u02f1\u0003j5\u0000\u02e9\u02f1\u0003l6\u0000\u02ea\u02f1\u0003n7\u0000"+
		"\u02eb\u02f1\u0003p8\u0000\u02ec\u02f1\u0003v;\u0000\u02ed\u02f1\u0003"+
		"z=\u0000\u02ee\u02f1\u0003x<\u0000\u02ef\u02f1\u0003|>\u0000\u02f0\u02e6"+
		"\u0001\u0000\u0000\u0000\u02f0\u02e7\u0001\u0000\u0000\u0000\u02f0\u02e8"+
		"\u0001\u0000\u0000\u0000\u02f0\u02e9\u0001\u0000\u0000\u0000\u02f0\u02ea"+
		"\u0001\u0000\u0000\u0000\u02f0\u02eb\u0001\u0000\u0000\u0000\u02f0\u02ec"+
		"\u0001\u0000\u0000\u0000\u02f0\u02ed\u0001\u0000\u0000\u0000\u02f0\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1e\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0005\u0013\u0000\u0000\u02f3\u02f4\u0005"+
		"\u0002\u0000\u0000\u02f4\u02f5\u0003r9\u0000\u02f5\u02f6\u0005\u0003\u0000"+
		"\u0000\u02f6g\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005\u0018\u0000\u0000"+
		"\u02f8\u02f9\u0005\u0002\u0000\u0000\u02f9\u02fa\u0003\u0010\b\u0000\u02fa"+
		"\u02fb\u0005\u0003\u0000\u0000\u02fbi\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0005\u0019\u0000\u0000\u02fd\u0303\u0005\u0002\u0000\u0000\u02fe\u02ff"+
		"\u0005\u0015\u0000\u0000\u02ff\u0300\u0005l\u0000\u0000\u0300\u0301\u0003"+
		"d2\u0000\u0301\u0302\u0005k\u0000\u0000\u0302\u0304\u0001\u0000\u0000"+
		"\u0000\u0303\u02fe\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000"+
		"\u0000\u0304\u030a\u0001\u0000\u0000\u0000\u0305\u0306\u0005\u001a\u0000"+
		"\u0000\u0306\u0307\u0005l\u0000\u0000\u0307\u0308\u0003\u001c\u000e\u0000"+
		"\u0308\u0309\u0005k\u0000\u0000\u0309\u030b\u0001\u0000\u0000\u0000\u030a"+
		"\u0305\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b"+
		"\u0311\u0001\u0000\u0000\u0000\u030c\u030d\u0005\u001b\u0000\u0000\u030d"+
		"\u030e\u0005l\u0000\u0000\u030e\u030f\u0003\u001c\u000e\u0000\u030f\u0310"+
		"\u0005k\u0000\u0000\u0310\u0312\u0001\u0000\u0000\u0000\u0311\u030c\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0314\u0001"+
		"\u0000\u0000\u0000\u0313\u0315\u0003t:\u0000\u0314\u0313\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0005\u0003\u0000\u0000\u0317k\u0001\u0000\u0000\u0000"+
		"\u0318\u0319\u0005\u001c\u0000\u0000\u0319\u031a\u0005\u0002\u0000\u0000"+
		"\u031a\u031b\u0005\u0015\u0000\u0000\u031b\u031c\u0005l\u0000\u0000\u031c"+
		"\u031d\u0003h4\u0000\u031d\u031e\u0005k\u0000\u0000\u031e\u031f\u0005"+
		"\u001d\u0000\u0000\u031f\u0320\u0005l\u0000\u0000\u0320\u0323\u0003L&"+
		"\u0000\u0321\u0322\u0005k\u0000\u0000\u0322\u0324\u0003t:\u0000\u0323"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0005\u0003\u0000\u0000\u0326"+
		"m\u0001\u0000\u0000\u0000\u0327\u0328\u0005\u0016\u0000\u0000\u0328\u0329"+
		"\u0005\u0002\u0000\u0000\u0329\u032a\u0003r9\u0000\u032a\u032b\u0005\u0003"+
		"\u0000\u0000\u032bo\u0001\u0000\u0000\u0000\u032c\u032d\u0005\u0017\u0000"+
		"\u0000\u032d\u032e\u0005\u0002\u0000\u0000\u032e\u032f\u0003r9\u0000\u032f"+
		"\u0330\u0005\u0003\u0000\u0000\u0330q\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0005\u0014\u0000\u0000\u0332\u0333\u0005l\u0000\u0000\u0333\u0334\u0005"+
		"\u0006\u0000\u0000\u0334\u0339\u0003d2\u0000\u0335\u0336\u0005k\u0000"+
		"\u0000\u0336\u0338\u0003d2\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338"+
		"\u033b\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b"+
		"\u0339\u0001\u0000\u0000\u0000\u033c\u033d\u0005\u0007\u0000\u0000\u033d"+
		"s\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u001e\u0000\u0000\u033f\u0346"+
		"\u0005l\u0000\u0000\u0340\u0347\u0003\u001c\u000e\u0000\u0341\u0342\u0005"+
		"\u001f\u0000\u0000\u0342\u0343\u0005\u0002\u0000\u0000\u0343\u0344\u0005"+
		"I\u0000\u0000\u0344\u0345\u0005K\u0000\u0000\u0345\u0347\u0005\u0003\u0000"+
		"\u0000\u0346\u0340\u0001\u0000\u0000\u0000\u0346\u0341\u0001\u0000\u0000"+
		"\u0000\u0347u\u0001\u0000\u0000\u0000\u0348\u0349\u0005 \u0000\u0000\u0349"+
		"\u034a\u0005\u0002\u0000\u0000\u034a\u034b\u0005!\u0000\u0000\u034b\u034c"+
		"\u0005l\u0000\u0000\u034c\u034d\u0007\u0007\u0000\u0000\u034d\u034e\u0005"+
		"\u0002\u0000\u0000\u034e\u034f\u0003\u0010\b\u0000\u034f\u0350\u0005\u0003"+
		"\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0005\u0003"+
		"\u0000\u0000\u0352w\u0001\u0000\u0000\u0000\u0353\u0354\u0005)\u0000\u0000"+
		"\u0354\u035a\u0005\u0002\u0000\u0000\u0355\u0356\u0005*\u0000\u0000\u0356"+
		"\u0357\u0005l\u0000\u0000\u0357\u0358\u0003X,\u0000\u0358\u0359\u0005"+
		"k\u0000\u0000\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u0355\u0001\u0000"+
		"\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0005\u0003\u0000\u0000\u035dy\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0005+\u0000\u0000\u035f\u0365\u0005\u0002\u0000\u0000"+
		"\u0360\u0361\u0005\u000e\u0000\u0000\u0361\u0362\u0005l\u0000\u0000\u0362"+
		"\u0363\u0003d2\u0000\u0363\u0364\u0005k\u0000\u0000\u0364\u0366\u0001"+
		"\u0000\u0000\u0000\u0365\u0360\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0005"+
		"\u0003\u0000\u0000\u0368{\u0001\u0000\u0000\u0000\u0369\u036a\u0005,\u0000"+
		"\u0000\u036a\u036b\u0005\u0002\u0000\u0000\u036b\u036c\u0003~?\u0000\u036c"+
		"\u036d\u0005\u0003\u0000\u0000\u036d}\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0005-\u0000\u0000\u036f\u0370\u0005l\u0000\u0000\u0370\u0371\u0005\u0002"+
		"\u0000\u0000\u0371\u0372\u0003\n\u0005\u0000\u0372\u0373\u0005\u0003\u0000"+
		"\u0000\u0373\u0374\u0003F#\u0000\u0374\u007f\u0001\u0000\u0000\u0000\u0375"+
		"\u0376\u0005.\u0000\u0000\u0376\u0377\u0005\u0002\u0000\u0000\u0377\u0378"+
		"\u0003L&\u0000\u0378\u0379\u0005\u0003\u0000\u0000\u0379\u0081\u0001\u0000"+
		"\u0000\u0000^\u0087\u0089\u0092\u0094\u009f\u00c1\u00d2\u00df\u00e4\u00e9"+
		"\u00ed\u00f6\u00f8\u00fd\u0104\u010b\u0112\u0119\u011f\u0121\u0129\u0131"+
		"\u013a\u0140\u0149\u0150\u015c\u015e\u0164\u016e\u0178\u0180\u018a\u0195"+
		"\u0198\u01a2\u01aa\u01af\u01b6\u01ba\u01c2\u01c7\u01d1\u01d4\u01dd\u01e5"+
		"\u01ec\u01ef\u01f9\u01fb\u0201\u0205\u020a\u0216\u0220\u0227\u022b\u022e"+
		"\u0237\u023c\u023e\u0241\u0243\u024d\u0256\u025b\u0263\u026a\u027f\u0286"+
		"\u0290\u029b\u02a3\u02a9\u02ab\u02ae\u02b0\u02ba\u02c4\u02c8\u02d2\u02d6"+
		"\u02dd\u02e1\u02f0\u0303\u030a\u0311\u0314\u0323\u0339\u0346\u035a\u0365";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}