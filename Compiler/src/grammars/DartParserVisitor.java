// Generated from E:/University/Fourth/term 2/compiler/Compiler/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#initFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitFunction(DartParser.InitFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DartParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#navigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigation(DartParser.NavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#materialPageRoue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRoue(DartParser.MaterialPageRoueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DartParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralAssignment(DartParser.LiteralAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssignment(DartParser.ExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAssignment(DartParser.ListAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code widgetAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetAssignment(DartParser.WidgetAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionAssignment}
	 * labeled alternative in {@link DartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAssignment(DartParser.FunctionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DartParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DartParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(DartParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DartParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link DartParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(DartParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DartParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationSideWithPlusOrMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSideWithPlusOrMinusOperation(DartParser.OperationSideWithPlusOrMinusOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusPlusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusPlusOperation(DartParser.PlusPlusOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code miusMinusOperation}
	 * labeled alternative in {@link DartParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiusMinusOperation(DartParser.MiusMinusOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementWithMultiOrDivOrRemOperation}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementWithMultiOrDivOrRemOperation(DartParser.ElementWithMultiOrDivOrRemOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperationInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperationInBraces(DartParser.BinaryOperationInBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperationSideInBraces}
	 * labeled alternative in {@link DartParser#binaryOperationSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperationSideInBraces(DartParser.BinaryOperationSideInBracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#plusOrMinusOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOrMinusOperation(DartParser.PlusOrMinusOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#multiOrDivOrRemOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiOrDivOrRemOperation(DartParser.MultiOrDivOrRemOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DartParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(DartParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSide(DartParser.SideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twoSideComapre}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoSideComapre(DartParser.TwoSideComapreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalCompareInBraces}
	 * labeled alternative in {@link DartParser#relationalCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalCompareInBraces(DartParser.RelationalCompareInBracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperator(DartParser.BitwiseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code towSideBitwise}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTowSideBitwise(DartParser.TowSideBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sideWithBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSideWithBitwiseOperation(DartParser.SideWithBitwiseOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOperationWithSides}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperationWithSides(DartParser.BitwiseOperationWithSidesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twoBitwiseOperation}
	 * labeled alternative in {@link DartParser#bitwiseOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoBitwiseOperation(DartParser.TwoBitwiseOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#logicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOperator(DartParser.LogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalBooleanSide(DartParser.RelationalBooleanSideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBooleanSide(DartParser.LogicalBooleanSideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanBooleanSide}
	 * labeled alternative in {@link DartParser#booleanSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBooleanSide(DartParser.BooleanBooleanSideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DartParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link DartParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(DartParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(DartParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(DartParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#elseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpression(DartParser.ElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#dfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfor(DartParser.DforContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#dwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDwhile(DartParser.DwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationMember(DartParser.DeclarationMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionMember}
	 * labeled alternative in {@link DartParser#classMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMember(DartParser.FunctionMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#dclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclass(DartParser.DclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(DartParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElements(DartParser.ListElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(DartParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedDeclaration(DartParser.NamedDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#voidFunctionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunctionBlock(DartParser.VoidFunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#typeFunctionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunctionBlock(DartParser.TypeFunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFunction}
	 * labeled alternative in {@link DartParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(DartParser.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link DartParser#functionVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(DartParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationTypeFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationTypeFunction(DartParser.DeclarationTypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationVoidFunction}
	 * labeled alternative in {@link DartParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationVoidFunction(DartParser.DeclarationVoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#sentParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentParameter(DartParser.SentParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#namedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedParameter(DartParser.NamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#nonNamedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNamedParameter(DartParser.NonNamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#parametersToSend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersToSend(DartParser.ParametersToSendContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DartParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpression(DartParser.BitwiseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(DartParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(DartParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#dswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDswitch(DartParser.DswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(DartParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(DartParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DartParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(DartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(DartParser.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#textWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextWidget(DartParser.TextWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(DartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(DartParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(DartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DartParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(DartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#materialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialApp(DartParser.MaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(DartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(DartParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#onChanged}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnChanged(DartParser.OnChangedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DartParser#setState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetState(DartParser.SetStateContext ctx);
}