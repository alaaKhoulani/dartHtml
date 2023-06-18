// Generated from E:/University/Fourth/term 2/compiler/Compiler/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DartParser}.
 */
public interface DartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#initFunction}.
	 * @param ctx the parse tree
	 */
	void enterInitFunction(DartParser.InitFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#initFunction}.
	 * @param ctx the parse tree
	 */
	void exitInitFunction(DartParser.InitFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DartParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DartParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigation(DartParser.NavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigation(DartParser.NavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#materialPageRoue}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRoue(DartParser.MaterialPageRoueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#materialPageRoue}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRoue(DartParser.MaterialPageRoueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterLiteralAssignment(DartParser.LiteralAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitLiteralAssignment(DartParser.LiteralAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignment(DartParser.ExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignment(DartParser.ExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterListAssignment(DartParser.ListAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitListAssignment(DartParser.ListAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widgetAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterWidgetAssignment(DartParser.WidgetAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widgetAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitWidgetAssignment(DartParser.WidgetAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAssignment(DartParser.FunctionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAssignment(DartParser.FunctionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DartParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DartParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(DartParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(DartParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DartParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DartParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(DartParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(DartParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DartParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DartParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationSideWithPlusOrMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterOperationSideWithPlusOrMinusOperation(DartParser.OperationSideWithPlusOrMinusOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationSideWithPlusOrMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitOperationSideWithPlusOrMinusOperation(DartParser.OperationSideWithPlusOrMinusOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusPlusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPlusPlusOperation(DartParser.PlusPlusOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusPlusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPlusPlusOperation(DartParser.PlusPlusOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code miusMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterMiusMinusOperation(DartParser.MiusMinusOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code miusMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitMiusMinusOperation(DartParser.MiusMinusOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementWithMultiOrDivOrRemOperation}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void enterElementWithMultiOrDivOrRemOperation(DartParser.ElementWithMultiOrDivOrRemOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementWithMultiOrDivOrRemOperation}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void exitElementWithMultiOrDivOrRemOperation(DartParser.ElementWithMultiOrDivOrRemOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperationInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationInBraces(DartParser.BinaryOperationInBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperationInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationInBraces(DartParser.BinaryOperationInBracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperationSideInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationSideInBraces(DartParser.BinaryOperationSideInBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperationSideInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationSideInBraces(DartParser.BinaryOperationSideInBracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#plusOrMinusOperation}.
	 * @param ctx the parse tree
	 */
	void enterPlusOrMinusOperation(DartParser.PlusOrMinusOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#plusOrMinusOperation}.
	 * @param ctx the parse tree
	 */
	void exitPlusOrMinusOperation(DartParser.PlusOrMinusOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#multiOrDivOrRemOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultiOrDivOrRemOperation(DartParser.MultiOrDivOrRemOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#multiOrDivOrRemOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultiOrDivOrRemOperation(DartParser.MultiOrDivOrRemOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(DartParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(DartParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#side}.
	 * @param ctx the parse tree
	 */
	void enterSide(DartParser.SideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#side}.
	 * @param ctx the parse tree
	 */
	void exitSide(DartParser.SideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code twoSideComapre}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 */
	void enterTwoSideComapre(DartParser.TwoSideComapreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code twoSideComapre}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 */
	void exitTwoSideComapre(DartParser.TwoSideComapreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalCompareInBraces}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 */
	void enterRelationalCompareInBraces(DartParser.RelationalCompareInBracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalCompareInBraces}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 */
	void exitRelationalCompareInBraces(DartParser.RelationalCompareInBracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOperator(DartParser.BitwiseOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOperator(DartParser.BitwiseOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code towSideBitwise}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void enterTowSideBitwise(DartParser.TowSideBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code towSideBitwise}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void exitTowSideBitwise(DartParser.TowSideBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sideWithBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void enterSideWithBitwiseOperation(DartParser.SideWithBitwiseOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sideWithBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void exitSideWithBitwiseOperation(DartParser.SideWithBitwiseOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOperationWithSides}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOperationWithSides(DartParser.BitwiseOperationWithSidesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOperationWithSides}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOperationWithSides(DartParser.BitwiseOperationWithSidesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code twoBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void enterTwoBitwiseOperation(DartParser.TwoBitwiseOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code twoBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 */
	void exitTwoBitwiseOperation(DartParser.TwoBitwiseOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicOperator(DartParser.LogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicOperator(DartParser.LogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void enterRelationalBooleanSide(DartParser.RelationalBooleanSideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void exitRelationalBooleanSide(DartParser.RelationalBooleanSideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBooleanSide(DartParser.LogicalBooleanSideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBooleanSide(DartParser.LogicalBooleanSideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBooleanSide(DartParser.BooleanBooleanSideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBooleanSide(DartParser.BooleanBooleanSideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DartParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DartParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(DartParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(DartParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(DartParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(DartParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(DartParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(DartParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#elseExpression}.
	 * @param ctx the parse tree
	 */
	void enterElseExpression(DartParser.ElseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#elseExpression}.
	 * @param ctx the parse tree
	 */
	void exitElseExpression(DartParser.ElseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#dfor}.
	 * @param ctx the parse tree
	 */
	void enterDfor(DartParser.DforContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#dfor}.
	 * @param ctx the parse tree
	 */
	void exitDfor(DartParser.DforContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#dwhile}.
	 * @param ctx the parse tree
	 */
	void enterDwhile(DartParser.DwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#dwhile}.
	 * @param ctx the parse tree
	 */
	void exitDwhile(DartParser.DwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationMember(DartParser.DeclarationMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationMember(DartParser.DeclarationMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMember(DartParser.FunctionMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMember(DartParser.FunctionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#dclass}.
	 * @param ctx the parse tree
	 */
	void enterDclass(DartParser.DclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#dclass}.
	 * @param ctx the parse tree
	 */
	void exitDclass(DartParser.DclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listElements}.
	 * @param ctx the parse tree
	 */
	void enterListElements(DartParser.ListElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listElements}.
	 * @param ctx the parse tree
	 */
	void exitListElements(DartParser.ListElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(DartParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(DartParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamedDeclaration(DartParser.NamedDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamedDeclaration(DartParser.NamedDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#voidFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionBlock(DartParser.VoidFunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#voidFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionBlock(DartParser.VoidFunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#typeFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunctionBlock(DartParser.TypeFunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#typeFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunctionBlock(DartParser.TypeFunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFunction}
	 * labeled alternative in {@link DartParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(DartParser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFunction}
	 * labeled alternative in {@link DartParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(DartParser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link DartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(DartParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link DartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(DartParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationTypeFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationTypeFunction(DartParser.DeclarationTypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationTypeFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationTypeFunction(DartParser.DeclarationTypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationVoidFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationVoidFunction(DartParser.DeclarationVoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationVoidFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationVoidFunction(DartParser.DeclarationVoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#sentParameter}.
	 * @param ctx the parse tree
	 */
	void enterSentParameter(DartParser.SentParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#sentParameter}.
	 * @param ctx the parse tree
	 */
	void exitSentParameter(DartParser.SentParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#nonNamedParameter}.
	 * @param ctx the parse tree
	 */
	void enterNonNamedParameter(DartParser.NonNamedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#nonNamedParameter}.
	 * @param ctx the parse tree
	 */
	void exitNonNamedParameter(DartParser.NonNamedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#parametersToSend}.
	 * @param ctx the parse tree
	 */
	void enterParametersToSend(DartParser.ParametersToSendContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#parametersToSend}.
	 * @param ctx the parse tree
	 */
	void exitParametersToSend(DartParser.ParametersToSendContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpression(DartParser.BitwiseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpression(DartParser.BitwiseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(DartParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(DartParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(DartParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(DartParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#dswitch}.
	 * @param ctx the parse tree
	 */
	void enterDswitch(DartParser.DswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#dswitch}.
	 * @param ctx the parse tree
	 */
	void exitDswitch(DartParser.DswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(DartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(DartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#listView}.
	 * @param ctx the parse tree
	 */
	void enterListView(DartParser.ListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#listView}.
	 * @param ctx the parse tree
	 */
	void exitListView(DartParser.ListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textWidget}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textWidget}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(DartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(DartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(DartParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(DartParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(DartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(DartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DartParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DartParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(DartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(DartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(DartParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(DartParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#onChanged}.
	 * @param ctx the parse tree
	 */
	void enterOnChanged(DartParser.OnChangedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#onChanged}.
	 * @param ctx the parse tree
	 */
	void exitOnChanged(DartParser.OnChangedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DartParser#setState}.
	 * @param ctx the parse tree
	 */
	void enterSetState(DartParser.SetStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DartParser#setState}.
	 * @param ctx the parse tree
	 */
	void exitSetState(DartParser.SetStateContext ctx);
}