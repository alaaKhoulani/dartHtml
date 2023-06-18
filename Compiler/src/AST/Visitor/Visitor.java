package AST.Visitor;

import AST.BinaryOperation.*;
import AST.Bitwise.*;
import AST.Block.Block;
import AST.Block.TypeFunctionBlock;
import AST.Block.VoidFunctionBlock;
import AST.Break;
import AST.Class.*;
import AST.Class.Class;
import AST.Compare.*;
import AST.Condition.*;
import AST.Declare.*;
import AST.Element.Element;
import AST.Element.IElement;
import AST.Element.Identifier;
import AST.Element.Number;
import AST.Expression.*;
import AST.Function.*;
import AST.Literal.*;
import AST.LogicalOperation.LogicalOperator;
import AST.Loop.For;
import AST.Loop.While;
import AST.MainFunction;
import AST.Navigation.MaterialPageRoute;
import AST.Navigation.Navigator;
import AST.Node.Node;
import AST.Program;
import AST.Statement;
import AST.Switch.DefaultCase;
import AST.Switch.Switch;
import AST.Switch.SwitchCase;
import AST.Widgets.*;
import ErrorCheck.ErrorCheck;
import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import grammars.DartParser;
import grammars.DartParserBaseVisitor;

public class Visitor extends DartParserBaseVisitor {
    Node lastParent;
    boolean isParameter = false;
    boolean namedOrNot = false;
    boolean isStateClass = false;

    public void addDClass(DartParser.DclassContext ctx) {
        SymbolTable.addClass(ctx.IDENTIFIER(0).getText());
    }

    @Override
    public Program visitProgram(DartParser.ProgramContext ctx) {
        System.out.println("Program From Visitor");
        Scope.createScope("Program Scope");

        Program program = new Program();
        String nodeName = ctx.getClass().getSimpleName();
        program.setAstNode(null, 0, nodeName.substring(0, nodeName.length() - 7));
        lastParent = program;

        for (int i = 0; i < ctx.dclass().size(); i++) {
            addDClass(ctx.dclass(i));
        }

        for (int i = 0; i < ctx.dclass().size(); i++) {
            lastParent = program;
            program.addClass((Class) visit(ctx.dclass(i)));
        }

        for (int i = 0; i < ctx.functionDeclaration().size(); i++) {
            lastParent = program;
            program.addFunction((IFunction) visit(ctx.functionDeclaration(i)));
        }

        for (int i = 0; i < ctx.declaration().size(); i++) {
            lastParent = program;
            program.addDeclaration((Declaration) visit(ctx.declaration(i)));
        }

        lastParent = program;
        program.setMain((MainFunction) visit(ctx.initFunction()));
        Symbol.createSymbol(Scope.getCurrentScope().getId(), "Function", "void", "main", isParameter, false, ctx.start.getLine());
        Scope.removeScope("Program Scope");
        System.out.println("PPPPPPPPPPPRRRRRRRRRRRRRRRRRRRRRROOOgram");
//        program.generate();
        return program;
    }

    @Override
    public MainFunction visitInitFunction(DartParser.InitFunctionContext ctx) {
        System.out.println("Main Function from Visitor");
        Scope.createScope("Main Scope");

        MainFunction main = new MainFunction();
        String nodeName = ctx.getClass().getSimpleName();
        main.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = main;
            main.addStatement((Statement) visit(ctx.statement(i)));
        }
        Scope.removeScope("Main Scope");
        return main;
    }

    @Override
    public Statement visitStatement(DartParser.StatementContext ctx) {
        System.out.println("Statement From Visitor");
        Statement statement = new Statement();
        String nodeName = ctx.getClass().getSimpleName();
        statement.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = statement;
        statement.setNode((Node) visit(ctx.getChild(0)));
        return statement;
    }

    @Override
    public Type visitType(DartParser.TypeContext ctx) {
        System.out.println("Type From Visitor");
        Type type = new Type();
        String nodeName = ctx.getClass().getSimpleName();
        String value = ctx.getChild(0).getText();
        type.setType(value);
        type.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return type;
    }

    @Override
    public ILiteral visitIntegerLiteral(DartParser.IntegerLiteralContext ctx) {
        System.out.println("Integer Literal From Visitor");
        IntegerLiteral integerLiteral = new IntegerLiteral();
        String nodeName = ctx.getClass().getSimpleName();
        int value = Integer.parseInt(ctx.getChild(0).getText());
        integerLiteral.setValue(value);
        integerLiteral.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return integerLiteral;
    }

    @Override
    public ILiteral visitDoubleLiteral(DartParser.DoubleLiteralContext ctx) {
        System.out.println("Double Literal From Visitor");
        DoubleLiteral doubleLiteral = new DoubleLiteral();
        String nodeName = ctx.getClass().getSimpleName();
        double value = Double.parseDouble(ctx.getChild(0).getText().toString());
        doubleLiteral.setValue(value);
        doubleLiteral.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return doubleLiteral;
    }

    @Override
    public ILiteral visitBooleanLiteral(DartParser.BooleanLiteralContext ctx) {
        System.out.println("Boolean Literal From Visitor");
        BooleanLiteral booleanLiteral = new BooleanLiteral();
        String nodeName = ctx.getClass().getSimpleName();
        boolean value = Boolean.parseBoolean(ctx.getChild(0).getText().toString());
        booleanLiteral.setValue(value);
        booleanLiteral.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return booleanLiteral;
    }

    @Override
    public ILiteral visitStringLiteral(DartParser.StringLiteralContext ctx) {
        System.out.println("String Literal From Visitor");
        StringLiteral stringLiteral = new StringLiteral();
        String nodeName = ctx.getClass().getSimpleName();
        stringLiteral.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        if (ctx.STRING_LITERAL().getText().contains("$")){
            Identifier id=new Identifier();
            String s= ctx.STRING_LITERAL().getText();
            s = s.substring(s.indexOf("{") + 1);
            s = s.substring(0, s.indexOf("}"));

            if(ctx.STRING_LITERAL().getText().contains(".")){
                id.setID(s.substring(0,s.indexOf('.')));
                id.setDotID(s.substring(s.indexOf('.')+1));
            }
            else{
                id.setID(s);
            }
            stringLiteral.setIdentifier(id);
        }
        else  {
            String value = ctx.getChild(0).getText();
            stringLiteral.setValue(value);
        }
        return stringLiteral;
    }

    @Override
    public IElement visitNumber(DartParser.NumberContext ctx) {
        Number number = new Number();
        String nodeName = ctx.getClass().getSimpleName();
        String s = ctx.getChild(0).getText();
        boolean isDouble = s.contains(".");
        if (isDouble) {
            System.out.println("number double element from visitor");
            double value = Double.parseDouble(s);
            number.setDoubleNumber(value);
            number.setType("double");
        } else {
            System.out.println("number integer element from visitor");
            int value = Integer.parseInt(s);
            number.setIntNumber(value);
            number.setType("int");
        }

        number.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return number;
    }

    @Override
    public IAssignment visitListAssignment(DartParser.ListAssignmentContext ctx) {
        System.out.println("List from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        ListAssignment list = new ListAssignment();
        list.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = list;
        list.setListElement((ListElement) visit(ctx.listElements()));
        Identifier ID = new Identifier();
        ID.setID(ctx.IDENTIFIER().get(0).getText());
        if (ctx.DOT() != null) {
            ID.setDotID(ctx.IDENTIFIER().get(1).getText());
            list.setID(ID);
        }
        if (ctx.DOT() == null) {
            list.setID(ID);
            ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER().get(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
        }
        return list;
    }

    @Override
    public ListElement visitListElements(DartParser.ListElementsContext ctx) {
        System.out.println("List Element from visitor");
        ListElement list = new ListElement();
        String nodeName = ctx.getClass().getSimpleName();
        list.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.element().size(); i++) {
            lastParent = list;
            for (int j = 0; j < ctx.children.size(); j++) {
                if (ctx.children.get(j).equals(ctx.element().get(i))) {
                    list.addElement((IElement) visit(ctx.element(i)), j / 2);
                }
            }
        }
        for (int i = 0; i < ctx.listElements().size(); i++) {
            lastParent = list;
            for (int j = 0; j < ctx.children.size(); j++) {
                if (ctx.children.get(j).equals(ctx.listElements().get(i))) {
                    list.addListElement((ListElement) visit(ctx.listElements(i)), j / 2);
                }
            }
        }

        for (int i = 0; i < ctx.literal().size(); i++) {
            lastParent = list;
            for (int j = 0; j < ctx.children.size(); j++) {
                if (ctx.children.get(j).equals(ctx.literal().get(i))) {
                    list.addString((ILiteral) visit(ctx.literal(i)), j / 2);
                }
            }
        }

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            lastParent = list;
            for (int j = 0; j < ctx.children.size(); j++) {
                if (ctx.children.get(j).equals(ctx.IDENTIFIER().get(i))) {
                    list.addIdentifier((Identifier) visit(ctx.IDENTIFIER(i)), j / 2);
                }
            }

        }
        return list;
    }

    @Override
    public IAssignment visitLiteralAssignment(DartParser.LiteralAssignmentContext ctx) {
        System.out.println("Literal Assignment From Visitor");
        LiteralAssignment assignment = new LiteralAssignment();
        String nodeName = ctx.getClass().getSimpleName();
        assignment.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        Identifier ID = new Identifier();
        ID.setID(ctx.IDENTIFIER().get(0).getText());//
        //        assignment.setID(ctx.IDENTIFIER().get(0).getText());
        lastParent = assignment;
        assignment.setLiteral((ILiteral) visit(ctx.literal()));
        if (ctx.DOT() != null) {
            ID.setDotID(ctx.IDENTIFIER().get(1).getText());
            assignment.setID(ID);
            ErrorCheck.checkClassAttributeType(assignment.getID().getID(), assignment.getID().getDotID(), (Node) assignment.getLiteral(), ctx.start.getLine());
        }

        if (ctx.DOT() == null) {
            assignment.setID(ID);
            ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER().get(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
            Scope scop = Scope.getCurrentScope().searchForSymbolInParents(assignment.getID().getID());
            if (scop != null) {
                Symbol sy = scop.searchForSymbol(assignment.getID().getID());
                if (sy != null) {
                    ErrorCheck.checktypes(sy, (Node) assignment.getLiteral(), ctx.start.getLine());
                }
            }
        }
        return assignment;
    }

    @Override
    public IAssignment visitExpressionAssignment(DartParser.ExpressionAssignmentContext ctx) {
        System.out.println("Expression Assignment From Visitor");
        ExpressionAssignment assignment = new ExpressionAssignment();
        String nodeName = ctx.getClass().getSimpleName();
        assignment.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        Identifier ID = new Identifier();
        ID.setID(ctx.IDENTIFIER().get(0).getText());
        lastParent = assignment;
        assignment.setExpression((IExpression) visit(ctx.expression()));
        if (ctx.DOT() != null) {
            ID.setDotID(ctx.IDENTIFIER().get(1).getText());
            assignment.setID(ID);
            ErrorCheck.checkClassAttributeType(assignment.getID().getID(), assignment.getID().getDotID(), (Node) assignment.getExpression(), ctx.start.getLine());
        }
        if (ctx.DOT() == null) {
            assignment.setID(ID);
            ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER().get(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
            Scope scop = Scope.getCurrentScope().searchForSymbolInParents(assignment.getID().getID());
            if (scop != null) {
                Symbol sy = scop.searchForSymbol(assignment.getID().getID());
                if (sy != null) {
                    ErrorCheck.checktypes(sy, (Node) assignment.getExpression(), ctx.start.getLine());
                }
            }

        }
        return assignment;
    }

    @Override
    public WidgetAssignment visitWidgetAssignment(DartParser.WidgetAssignmentContext ctx) {
        WidgetAssignment assignment = new WidgetAssignment();
        String nodeName = ctx.getClass().getSimpleName();
        assignment.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

       Identifier identifier=new Identifier();
        identifier.setID(ctx.IDENTIFIER().get(0).getText());
        if (ctx.DOT() != null) {
            identifier.setDotID(ctx.IDENTIFIER().get(0).getText());
        }
        assignment.setID(identifier);
        lastParent = assignment;
        assignment.setWidget((Widget) visit(ctx.widget()));
        if (ctx.DOT() == null) {
            ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER().get(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
        }
        return assignment;
    }

    @Override
    public FunctionAssignment visitFunctionAssignment(DartParser.FunctionAssignmentContext ctx) {
        FunctionAssignment assignment = new FunctionAssignment();
        String nodeName = ctx.getClass().getSimpleName();
        assignment.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        Identifier id = new Identifier();
        id.setID(ctx.IDENTIFIER().get(0).getText());
        if (ctx.DOT() != null) {
            id.setDotID(ctx.IDENTIFIER().get(1).getText());
        }
        assignment.setID(id);

        if (ctx.functionCall() != null) {
            lastParent = assignment;
            assignment.setFunactionCall((FunctionCall) visit(ctx.functionCall()));
        } else if (ctx.functionType() != null) {
            lastParent = assignment;
            assignment.setFunction((TypeFunction) visit(ctx.functionType()));
        } else if (ctx.functionVoid() != null) {
            lastParent = assignment;
            assignment.setFunction((VoidFunction) visit(ctx.functionVoid()));
        }

        return assignment;
    }

    @Override
    public Declaration visitDeclaration(DartParser.DeclarationContext ctx) {
        System.out.println("Declaration From Visitor");
        String nodeName = ctx.getClass().getSimpleName();
        Declaration declaration = new Declaration();
        declaration.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = declaration;

        if (ctx.type() != null) {
            declaration.setType((Type) visit(ctx.type()));
            declaration.setConst(ctx.CONST() != null);
            for (int i = 0; i < ctx.assignment().size(); i++) {
                lastParent = declaration;
                Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Variable", declaration.getType().getValue(), ctx.assignment(i).getChild(0).getText(), isParameter, namedOrNot, ctx.start.getLine());
                declaration.addAssignment((IAssignment) visit(ctx.assignment(i)));
                ErrorCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());
            }
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                lastParent = declaration;
                Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Variable", declaration.getType().getValue(), ctx.IDENTIFIER(i).getText(), isParameter, namedOrNot, ctx.start.getLine());
                declaration.addID(ctx.IDENTIFIER(i).getText());
                ErrorCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());
            }
        } else {

            declaration.setBaseClassID(ctx.IDENTIFIER(0).getText());
            declaration.setObjetID(ctx.IDENTIFIER(1).getText());
            Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Object", declaration.getBaseClassID(), declaration.getObjetID(), isParameter, namedOrNot, ctx.start.getLine());
            if (ctx.EQUAL() != null) {

                declaration.setDeffinationClassID(ctx.IDENTIFIER().get(2).getText());
                ErrorCheck.CorrectObjectDefination(symbol, declaration.getDeffinationClassID(), ctx.start.getLine(), Scope.getCurrentScope());
            } else {
                ErrorCheck.CorrectObjectDefination(symbol, null, ctx.start.getLine(), Scope.getCurrentScope());
            }
        }

        return declaration;
    }

    @Override
    public IElement visitElement(DartParser.ElementContext ctx) {
        String nodeName = ctx.getClass().getSimpleName();
        Element element = new Element();
        element.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = element;

        if (ctx.IDENTIFIER().size() > 0) {
            Identifier ID = new Identifier();
            ID.setID(ctx.IDENTIFIER(0).getText());
            if (ctx.IDENTIFIER().size() > 1) ID.setDotID(ctx.IDENTIFIER(1).getText());
            element.setID(ID);
            ID.setAstNode(lastParent, ctx.start.getLine(), "Identifier");
            ErrorCheck.NotDefineInCurrentScope(ctx.IDENTIFIER(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
            return element;
        } else {
            Number number = new Number();
            number = (Number) visitNumber(ctx.number());
            element.setNumber(number);
            return element;
        }
    }

    @Override
    public IBinaryOperation visitOperationSideWithPlusOrMinusOperation(DartParser.OperationSideWithPlusOrMinusOperationContext ctx) {
        System.out.println("Operation Side With PlusOrMinus Operation from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        OperationSideWithPlusOrMinusOperation opr = new OperationSideWithPlusOrMinusOperation();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setOperationSide((IOperationSide) visit(ctx.binaryOperationSide()));
        for (int i = 0; i < ctx.plusOrMinusOperation().size(); i++) {
            lastParent = opr;
            opr.addBinaryOperation((BinaryOperation) visit(ctx.plusOrMinusOperation(i)));
        }
        return opr;
    }

    @Override
    public IBinaryOperation visitPlusPlusOperation(DartParser.PlusPlusOperationContext ctx) {
        System.out.println("PlusPlus Operation from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        PostOperations opr = new PostOperations();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setElement((IElement) visit(ctx.element()));
        opr.setOperator("++");
        return opr;
    }

    @Override
    public IBinaryOperation visitMiusMinusOperation(DartParser.MiusMinusOperationContext ctx) {
        System.out.println("MinusMinus Operation from visitor");
        PostOperations opr = new PostOperations();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setElement((IElement) visit(ctx.element()));
        opr.setOperator("--");
        return opr;
    }

    @Override
    public IOperationSide visitElementWithMultiOrDivOrRemOperation(DartParser.ElementWithMultiOrDivOrRemOperationContext ctx) {
        System.out.println("Element With MultiOrDivOrRem Operation from visitor");
        ElementWithMultiOrDivOrRemOperation opr = new ElementWithMultiOrDivOrRemOperation();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setElement((IElement) visit(ctx.element()));
        for (int i = 0; i < ctx.multiOrDivOrRemOperation().size(); i++) {
            lastParent = opr;
            opr.addBinaryOperation((BinaryOperation) visit(ctx.multiOrDivOrRemOperation(i)));
        }
        return opr;
    }

    @Override
    public IOperationSide visitBinaryOperationInBraces(DartParser.BinaryOperationInBracesContext ctx) {
        System.out.println("Binary Operation In Braces from visitor");
        BinaryOperationInBraces opr = new BinaryOperationInBraces();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setBinaryOperation((IBinaryOperation) visit(ctx.binaryOperation()));
        for (int i = 0; i < ctx.multiOrDivOrRemOperation().size(); i++) {
            lastParent = opr;
            opr.addBinaryOperation((BinaryOperation) visit(ctx.multiOrDivOrRemOperation(i)));
        }
        return opr;
    }

    @Override
    public IOperationSide visitBinaryOperationSideInBraces(DartParser.BinaryOperationSideInBracesContext ctx) {
        System.out.println("Binary Operation Side In Braces from visitor");
        BinaryOperationSideInBraces opr = new BinaryOperationSideInBraces();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setOperationSide((IOperationSide) visit(ctx.binaryOperationSide()));
        return opr;
    }

    @Override
    public BinaryOperation visitPlusOrMinusOperation(DartParser.PlusOrMinusOperationContext ctx) {
        String operator = ctx.getChild(0).getText();
        BinaryOperation opr = new BinaryOperation();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setOperationSide((IOperationSide) visit(ctx.binaryOperationSide()));
        switch (operator) {
            case "+":
                System.out.println("Plus Operation Side from visitor");
                opr.setOperator("+");
                break;
            case "-":
                System.out.println("Minus Operation Side from visitor");
                opr.setOperator("-");
                break;
        }
        return opr;
    }

    @Override
    public BinaryOperation visitMultiOrDivOrRemOperation(DartParser.MultiOrDivOrRemOperationContext ctx) {
        String operator = ctx.getChild(0).getText();
        BinaryOperation opr = new BinaryOperation();
        String nodeName = ctx.getClass().getSimpleName();
        opr.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = opr;
        opr.setOperationSide((IOperationSide) visit(ctx.binaryOperationSide()));
        switch (operator) {
            case "*":
                System.out.println("Multi Operation Side from visitor");
                opr.setOperator("*");
                break;
            case "/":
                System.out.println("DoubleDivide Operation Side from visitor");
                opr.setOperator("/");
                break;
            case "~/":
                System.out.println("IntDivide Operation Side from visitor");
                opr.setOperator("~/");
                break;
            case "%":
                System.out.println("Remain Operation Side from visitor");
                opr.setOperator("%");
                break;
        }
        return opr;
    }

    @Override
    public RelationalOperator visitRelationalOperator(DartParser.RelationalOperatorContext ctx) {
        RelationalOperator operator = new RelationalOperator();
        System.out.println("Relational Operator from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operator.setOperator(ctx.getChild(0).getText());
        operator.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        return operator;
    }

    @Override
    public Side visitSide(DartParser.SideContext ctx) {
        Side side = new Side();
        String nodeName = ctx.getClass().getSimpleName();
        System.out.println("Side from visitor");
        side.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = side;
        side.setElement((IElement) visit(ctx.element()));

        return side;
    }

    @Override
    public IRelationalCompare visitTwoSideComapre(DartParser.TwoSideComapreContext ctx) {
        TwoSideCompare compare = new TwoSideCompare();
        System.out.println("Two Side Comapre from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        System.out.println("Side from visitor");
        compare.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = compare;
        compare.setSide1((Side) visit(ctx.side(0)));
        lastParent = compare;
        compare.setOperator((RelationalOperator) visit(ctx.relationalOperator()));
        lastParent = compare;
        compare.setSide2((Side) visit(ctx.side(1)));
        return compare;
    }

    @Override
    public IRelationalCompare visitRelationalCompareInBraces(DartParser.RelationalCompareInBracesContext ctx) {
        RelationalCompareInBraces relationalCompare = new RelationalCompareInBraces();
        System.out.println("Relational Compare In Braces from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        relationalCompare.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = relationalCompare;
        relationalCompare.setRelationalCompare((IRelationalCompare) visit(ctx.relationalCompare()));
        return relationalCompare;
    }

    @Override
    public BitwiseOperator visitBitwiseOperator(DartParser.BitwiseOperatorContext ctx) {
        BitwiseOperator operator = new BitwiseOperator();
        System.out.println("Bitwise Operator from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operator.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        operator.setOperator(ctx.getChild(0).getText());
        return operator;
    }

    @Override
    public IBitwiseOperation visitTowSideBitwise(DartParser.TowSideBitwiseContext ctx) {
        TwoSideBitwise operation = new TwoSideBitwise();
        System.out.println("Two Side Bitwise from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operation.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.bitwiseOperator().size(); i++) {
            lastParent = operation;
            operation.addOperator((BitwiseOperator) visit(ctx.bitwiseOperator(i)));
        }
        for (int i = 0; i < ctx.side().size(); i++) {
            lastParent = operation;
            operation.addSide((Side) visit(ctx.side(i)));
        }
        return operation;
    }

    @Override
    public IBitwiseOperation visitSideWithBitwiseOperation(DartParser.SideWithBitwiseOperationContext ctx) {
        SideWithBitwiseOperation operation = new SideWithBitwiseOperation();
        System.out.println("Side With Bitwise Operations from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operation.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = operation;
        operation.setSide((Side) visit(ctx.side()));
        for (int i = 0; i < ctx.bitwiseOperator().size(); i++) {
            lastParent = operation;
            operation.addOperator((BitwiseOperator) visit(ctx.bitwiseOperator(i)));
        }

        for (int i = 0; i < ctx.bitwiseOperation().size(); i++) {
            lastParent = operation;
            operation.addBitwiseOperation((IBitwiseOperation) visit(ctx.bitwiseOperation(i)));
        }
        return operation;
    }

    @Override
    public BitwiseOperationWithSides visitBitwiseOperationWithSides(DartParser.BitwiseOperationWithSidesContext ctx) {
        BitwiseOperationWithSides operation = new BitwiseOperationWithSides();
        System.out.println("Bitwise Operation With Sides from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operation.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = operation;
        operation.setBitwiseOperation((IBitwiseOperation) visit(ctx.bitwiseOperation()));
        for (int i = 0; i < ctx.bitwiseOperator().size(); i++) {
            lastParent = operation;
            operation.addOperator((BitwiseOperator) visit(ctx.bitwiseOperator(i)));
        }

        for (int i = 0; i < ctx.side().size(); i++) {
            lastParent = operation;
            operation.addSide((Side) visit(ctx.side(i)));
        }
//        System.out.println("Bitwise Operation With Sides  generateeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
//        System.out.println(operation.generate());
        return operation;
    }

    @Override
    public IBitwiseOperation visitTwoBitwiseOperation(DartParser.TwoBitwiseOperationContext ctx) {
        TwoBitwiseOperation operation = new TwoBitwiseOperation();
        System.out.println("Two Bitwise Operation from visitor");
        String nodeName = ctx.getClass().getSimpleName();
        operation.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        for (int i = 0; i < ctx.bitwiseOperation().size(); i++) {
            lastParent = operation;
            operation.addBitwiseOperation((IBitwiseOperation) visit(ctx.bitwiseOperation(i)));
        }
        for (int i = 0; i < ctx.bitwiseOperator().size(); i++) {
            lastParent = operation;
            operation.addBitwiseOperator((BitwiseOperator) visit(ctx.bitwiseOperator(i)));
        }
        return operation;
    }

    @Override
    public LogicalOperator visitLogicOperator(DartParser.LogicOperatorContext ctx) {
        System.out.println("Logical Operator from visitor");
        LogicalOperator operator = new LogicalOperator();
        String nodeName = ctx.getClass().getSimpleName();
        operator.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        operator.setOperator(ctx.getChild(0).getText());
        return operator;
    }

    @Override
    public IBoolean visitRelationalBooleanSide(DartParser.RelationalBooleanSideContext ctx) {
        System.out.println("Relational Boolean Side from visitor");
        RelationalBoolean bool = new RelationalBoolean();
        String nodeName = ctx.getClass().getSimpleName();
        bool.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = bool;
        bool.setRelationalCompare((IRelationalCompare) visit(ctx.relationalCompare()));
        return bool;
    }

    @Override
    public IBoolean visitLogicalBooleanSide(DartParser.LogicalBooleanSideContext ctx) {
        System.out.println("Logical Boolean Side from visitor");
        LogicalBoolean bool = new LogicalBoolean();
        String nodeName = ctx.getClass().getSimpleName();
        bool.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = bool;
        bool.setLogicalOperation((ICondition) visit(ctx.logicalOperation()));
        return bool;
    }

    @Override
    public IBoolean visitBooleanBooleanSide(DartParser.BooleanBooleanSideContext ctx) {
        System.out.println("Boolean Boolean Side from visitor");
        BooleanValue bool = new BooleanValue();
        String nodeName = ctx.getClass().getSimpleName();
        bool.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        bool.setValue(Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText()));
        return bool;
    }

    @Override
    public ICondition visitCondition(DartParser.ConditionContext ctx) {
        System.out.println("Condition from visitor");
        Condition condition = new Condition();
        String nodeName = ctx.getClass().getSimpleName();
        condition.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        for (int i = 0; i < ctx.booleanSide().size(); i++) {
            lastParent = condition;
            condition.addBooleanSide((IBoolean) visit(ctx.booleanSide(i)));
        }
        for (int i = 0; i < ctx.logicOperator().size(); i++) {
            lastParent = condition;
            condition.addOperator((LogicalOperator) visit(ctx.logicOperator(i)));
        }
        return condition;
    }

    @Override
    public ICondition visitNotCondition(DartParser.NotConditionContext ctx) {
        System.out.println("Not Condition from visitor");
        NotCondition Notcondition = new NotCondition();
        String nodeName = ctx.getClass().getSimpleName();
        Notcondition.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = Notcondition;
        Notcondition.setCondition((ICondition) visit(ctx.logicalOperation()));
        return Notcondition;
    }

    @Override
    public IfCondition visitIfCondition(DartParser.IfConditionContext ctx) {
        System.out.println("If Condition from visitor");
        IfCondition condition = new IfCondition();
        String nodeName = ctx.getClass().getSimpleName();
        condition.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.ifExpression().size(); i++) {
            lastParent = condition;
            condition.addIfExpression((IfExpression) visit(ctx.ifExpression(i)));
        }
        if (ctx.elseExpression() != null) {
            lastParent = condition;
            condition.setElseExpression((ElseExpression) visit(ctx.elseExpression()));
        }
//        System.out.println(condition.generate());
        return condition;
    }

    @Override
    public IfExpression visitIfExpression(DartParser.IfExpressionContext ctx) {
        System.out.println("If Expression from visitor");
        Scope.createScope("If Scope");
        System.out.println("3333333333333");

        IfExpression expression = new IfExpression();
        String nodeName = ctx.getClass().getSimpleName();
        expression.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        lastParent = expression;
        expression.setCondition((ICondition) visit(ctx.logicalOperation()));
        if (ctx.statement() != null) {
            lastParent = expression;
            expression.setStatement((Node) visit(ctx.statement()));
        } else {
            lastParent = expression;
            expression.setBlock((Block) visit(ctx.block()));
        }
        Scope.removeScope("If Scope");
        return expression;
    }

    @Override
    public ElseExpression visitElseExpression(DartParser.ElseExpressionContext ctx) {
        System.out.println("Else Expression from visitor");
        Scope.createScope("Else Scope");
        System.out.println("555555555555555");

        ElseExpression expression = new ElseExpression();
        String nodeName = ctx.getClass().getSimpleName();
        expression.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        if (ctx.statement() != null) {
            lastParent = expression;
            expression.setStatement((Node) visit(ctx.statement()));
        } else {
            lastParent = expression;
            expression.setBlock((Block) visit(ctx.block()));
        }
        Scope.removeScope("Else Scope");
        return expression;
    }

    @Override
    public Block visitBlock(DartParser.BlockContext ctx) {
        System.out.println("Block from visitor");
        Block block = new Block();
        String nodeName = ctx.getClass().getSimpleName();
        block.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = block;
            block.addStatement((Node) visit(ctx.statement(i)));
        }
        return block;
    }

    @Override
    public While visitDwhile(DartParser.DwhileContext ctx) {
        System.out.println("While from visitor");
        Scope.createScope("While Scope");
        System.out.println("666666666666666666");

        While wh = new While();
        String nodeName = ctx.getClass().getSimpleName();
        wh.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = wh;
        wh.setCondition((ICondition) visit(ctx.logicalOperation()));
        lastParent = wh;
        wh.setBlock((Block) visit(ctx.block()));
        Scope.removeScope("While Scope");
        return wh;
    }

    @Override
    public For visitDfor(DartParser.DforContext ctx) {
        System.out.println("For from visitor");
        Scope.createScope("For Scope");

        For fo = new For();
        String nodeName = ctx.getClass().getSimpleName();
        fo.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        if (ctx.declaration() != null) {
            lastParent = fo;
            fo.setInitWithDeclare((Declaration) visit(ctx.declaration()));
        } else if (ctx.assignment() != null) {
            lastParent = fo;
            for (int i = 0; i < ctx.assignment().size(); i++) {
                fo.addInitWithAssignment((LiteralAssignment) visit(ctx.assignment(i)));
            }
        }
        lastParent = fo;
        fo.setCondition((ICondition) visit(ctx.logicalOperation()));

        lastParent = fo;
        fo.setOperation((IBinaryOperation) visit(ctx.binaryOperation()));

        lastParent = fo;
        fo.setBody((Block) visit(ctx.block()));
        Scope.removeScope("For Scope");
        return fo;
    }

    @Override
    public NamedDeclerationParameters visitNamedDeclaration(DartParser.NamedDeclarationContext ctx) {
        NamedDeclerationParameters namedDeclerationParameters = new NamedDeclerationParameters();
        String nodeName = ctx.getClass().getSimpleName();
        namedDeclerationParameters.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        for (int i = 0; i < ctx.declaration().size(); i++) {
            lastParent = namedDeclerationParameters;
            namedDeclerationParameters.addDeclaration((Declaration) visit(ctx.declaration(i)));
        }

        return namedDeclerationParameters;
    }

    @Override
    public DeclerationParameter visitFunctionParameter(DartParser.FunctionParameterContext ctx) {
        System.out.println("Function Parameter from visitor");
        DeclerationParameter declerationParameter = new DeclerationParameter();
        String nodeName = ctx.getClass().getSimpleName();
        declerationParameter.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        isParameter = true;
        for (int i = 0; i < ctx.declaration().size(); i++) {
            for (int j = 0; j < ctx.children.size(); j++) {
                if (ctx.children.get(j).equals(ctx.declaration().get(i))) {
                    lastParent = declerationParameter;
                    declerationParameter.addDeclaration((Declaration) visit(ctx.declaration(i)));
                }
            }
        }
        if (ctx.namedDeclaration() != null) {
            lastParent = declerationParameter;
            namedOrNot = true;
            declerationParameter.setNamedDeclaration((NamedDeclerationParameters) visit(ctx.namedDeclaration()));
            namedOrNot = false;
        }
//        for (int i = 0; i < ctx.namedDeclaration().size(); i++) {
//            for (int j = 0; j < ctx.children.size(); j++) {
//                if (ctx.children.get(j).equals(ctx.namedDeclaration().get(i))) {
//                    lastParent = declerationParameter;
//                    namedOrNot=true;
//                    declerationParameter.addNamedDeclaration((NamedDeclerationParameters) visit(ctx.namedDeclaration(i)), j / 2);
//                    namedOrNot=false;
//                }
//            }
//        }
        isParameter = false;
        return declerationParameter;
    }

    @Override
    public VoidFunctionBlock visitVoidFunctionBlock(DartParser.VoidFunctionBlockContext ctx) {
        System.out.println("Void Function Block from visitor");
        VoidFunctionBlock block = new VoidFunctionBlock();
        String nodeName = ctx.getClass().getSimpleName();
        block.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = block;
            block.addStatement((Statement) visit(ctx.statement(i)));
        }
        return block;
    }

    @Override
    public TypeFunctionBlock visitTypeFunctionBlock(DartParser.TypeFunctionBlockContext ctx) {
        System.out.println("Type Function Block from visitor");
        TypeFunctionBlock block = new TypeFunctionBlock();
        String nodeName = ctx.getClass().getSimpleName();
        block.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        if (ctx.expression() != null) {
            lastParent = block;
            System.out.println("QQQQQQQQQQQQQQQQQQQQQWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
            block.setReturnExepression((IExpression) visit(ctx.expression()));
        }
        if (ctx.functionCall() != null) {
            lastParent = block;
            block.setFunctionCall((FunctionCall) visit(ctx.functionCall()));
        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = block;
            block.addStatement((Node) visit(ctx.statement(i)));
        }
        if (ctx.widget() != null) {
            lastParent = block;
            block.setReturnWidget((Widget) visit(ctx.widget()));
        }
        return block;
    }

    @Override
    public TypeFunction visitTypeFunction(DartParser.TypeFunctionContext ctx) {
        System.out.println("Type Function from visitor");
        TypeFunction function = new TypeFunction();
        String nodeName = ctx.getClass().getSimpleName();
        function.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        boolean ok = !(lastParent instanceof IFunction);
        if (ok) {
            Scope.createScope("Function " + " Scope");

        }
//        for (int i = 0; i < ctx.functionParameter().size(); i++) {
        lastParent = function;
        function.setDeclerationParameters((DeclerationParameter) visit(ctx.functionParameter()));
//        }
        lastParent = function;
        function.setBlock((TypeFunctionBlock) visit(ctx.typeFunctionBlock()));
        if (ok) {
            Scope.removeScope("Function " + " Scope");
        }
        return function;
    }

    @Override
    public VoidFunction visitVoidFunction(DartParser.VoidFunctionContext ctx) {
        System.out.println("Void Function from visitor");
        VoidFunction function = new VoidFunction();
        String nodeName = ctx.getClass().getSimpleName();
        function.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        boolean ok = !(lastParent instanceof IFunction);
        if (ok) {
            Scope.createScope("Function " + " Scope");

        }
//        for (int i = 0; i < ctx.functionParameter().size(); i++) {
        lastParent = function;
        function.setParameter((DeclerationParameter) visit(ctx.functionParameter()));
//        }
        lastParent = function;
        function.setBlock((VoidFunctionBlock) visit(ctx.voidFunctionBlock()));
        if (ok) {
            Scope.removeScope("Function " + " Scope");
        }
        return function;
    }

    @Override
    public DeclarationTypeFunction visitDeclarationTypeFunction(DartParser.DeclarationTypeFunctionContext ctx) {
        System.out.println("Declaration Type Function from visitor");
        DeclarationTypeFunction function = new DeclarationTypeFunction();
        String nodeName = ctx.getClass().getSimpleName();
        System.out.println("Function getId         " + function.getID());
        function.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        if (ctx.type() != null) {
            Symbol.createSymbol(Scope.getCurrentScope().getId(), "Function", ctx.type().getText(), ctx.IDENTIFIER(0).getText(), isParameter, namedOrNot, ctx.start.getLine());
            function.setID(ctx.IDENTIFIER(0).getText());
            Scope.createScope(function.getID());

            lastParent = function;
            function.setType((Type) visit(ctx.type()));
            lastParent = function;
            function.setFunction((TypeFunction) visit(ctx.functionType()));
        } else if (ctx.WIDGET() != null) {
            if (ctx.IDENTIFIER(1).getText() == "build" && isStateClass) function.setBuild(true);
            Symbol.createSymbol(Scope.getCurrentScope().getId(), "Function", "Widget", ctx.IDENTIFIER(0).getText(), isParameter, namedOrNot, ctx.start.getLine());
            function.setID(ctx.IDENTIFIER(0).getText());
            Scope.createScope(function.getID());
            function.setClassReturnType(ctx.WIDGET().getText());
            lastParent = function;
            function.setFunction((TypeFunction) visit(ctx.functionType()));
        } else if (ctx.STATE() != null) {
            Symbol.createSymbol(Scope.getCurrentScope().getId(), "Function", "Widget", ctx.IDENTIFIER(1).getText(), isParameter, namedOrNot, ctx.start.getLine());
            function.setID(ctx.IDENTIFIER(1).getText());
            Scope.createScope(function.getID());
            function.setClassReturnType(ctx.IDENTIFIER(0).getText());
            lastParent = function;
            function.setFunction((TypeFunction) visit(ctx.functionType()));

        }


        Scope.removeScope("Function " + function.getID() + " Scope");
//        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFff");
//        System.out.println(function.generate());
        return function;
    }

    @Override
    public DeclarationVoidFunctoin visitDeclarationVoidFunction(DartParser.DeclarationVoidFunctionContext ctx) {
        System.out.println("Void Function from visitor");
        DeclarationVoidFunctoin function = new DeclarationVoidFunctoin();
        function.setID(ctx.IDENTIFIER().getText());
        Symbol s = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Function", "void", ctx.IDENTIFIER().getText(), isParameter, namedOrNot, ctx.start.getLine());
        Scope.createScope(function.getID());

        String nodeName = ctx.getClass().getSimpleName();
        function.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        lastParent = function;
        function.setFunction((VoidFunction) visit(ctx.functionVoid()));
        Scope.removeScope("Function " + function.getID() + " Scope");
        return function;
    }

    @Override
    public SentParameter visitSentParameter(DartParser.SentParameterContext ctx) {
        System.out.println("Sent Parameter from visitor");
        SentParameter sentParameter = new SentParameter();
        String nodeName = ctx.getClass().getSimpleName();
        sentParameter.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        if (ctx.literal() != null) {
            lastParent = sentParameter;
            sentParameter.setLiteral((ILiteral) visit(ctx.literal()));
        } else if (ctx.functionCall() != null) {
            lastParent = sentParameter;
            sentParameter.setFunctionCall((FunctionCall) visit(ctx.functionCall()));
        } else if (ctx.expression() != null) {
            lastParent = sentParameter;
            sentParameter.setExpression((IExpression) visit(ctx.expression()));
        } else if (ctx.booleanSide() != null) {
            lastParent = sentParameter;
            sentParameter.setiBoolean((IBoolean) visit(ctx.booleanSide()));
        } else if (ctx.functionType() != null) {
            lastParent = sentParameter;
            sentParameter.setTypeFunction((TypeFunction) visit(ctx.functionType()));
        } else if (ctx.functionVoid() != null) {
            lastParent = sentParameter;
            sentParameter.setVoidFunction((VoidFunction) visit(ctx.functionVoid()));
        } else if (ctx.widget() != null) {
            lastParent = sentParameter;
            sentParameter.setWidget((Widget) visit(ctx.widget()));
        } else if (ctx.element() != null) {
            lastParent = sentParameter;
            sentParameter.setElement((IElement) visit(ctx.expression()));
        }

        return sentParameter;
    }

    @Override
    public NamedParameter visitNamedParameter(DartParser.NamedParameterContext ctx) {
        System.out.println("Named Parameter from visitor");
        NamedParameter namedParameter = new NamedParameter();
        String nodeName = ctx.getClass().getSimpleName();
        namedParameter.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            lastParent = namedParameter;
            namedParameter.addID(ctx.IDENTIFIER(i).getText());
        }
        for (int i = 0; i < ctx.sentParameter().size(); i++) {
            lastParent = namedParameter;
            namedParameter.addParameters((SentParameter) visit(ctx.sentParameter(i)));
        }
        return namedParameter;
    }

    @Override
    public NonNamedParameter visitNonNamedParameter(DartParser.NonNamedParameterContext ctx) {
        System.out.println("Non Named Parameter from visitor");
        NonNamedParameter namedParameter = new NonNamedParameter();
        String nodeName = ctx.getClass().getSimpleName();
        namedParameter.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        for (int i = 0; i < ctx.sentParameter().size(); i++) {
            lastParent = namedParameter;
            namedParameter.addParameters((SentParameter) visit(ctx.sentParameter(i)));
        }
        return namedParameter;
    }

    @Override
    public PrarametersToSend visitParametersToSend(DartParser.ParametersToSendContext ctx) {
        PrarametersToSend prarameters = new PrarametersToSend();
        String nodeName = ctx.getClass().getSimpleName();
        prarameters.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));

        if (ctx.nonNamedParameter() != null) {
            lastParent = prarameters;
            prarameters.addNonNamedParameter((NonNamedParameter) visit(ctx.nonNamedParameter()));
        }
        if (ctx.namedParameter() != null) {
            lastParent = prarameters;
            prarameters.addNamedParameter((NamedParameter) visit(ctx.namedParameter()));
        }


        return prarameters;

    }

    @Override
    public FunctionCall visitFunctionCall(DartParser.FunctionCallContext ctx) {
        System.out.println("visit Function Non Named Call from visitor");
        FunctionCall functionCall = new FunctionCall();
        String nodeName = ctx.getClass().getSimpleName();
        functionCall.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        functionCall.setID(ctx.IDENTIFIER().getText());
        lastParent = functionCall;
        if (ctx.parametersToSend()!=null) {
            functionCall.setPrarameters((PrarametersToSend) visit(ctx.parametersToSend()));
            ErrorCheck.checkParametersInCall(functionCall.getPrarameters(), functionCall.getID(), ctx.start.getLine());
        }
        ErrorCheck.NotDefineInCurrentScope(functionCall.getID(), ctx.start.getLine(), Scope.getCurrentScope().getId());
//        System.out.println("CCCCCCCCAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLL");
//        System.out.println(functionCall.generate());
        return functionCall;
    }

    @Override
    public IMember visitDeclarationMember(DartParser.DeclarationMemberContext ctx) {
        System.out.println("Declaration Member from visitor");
        DeclarationMember member = new DeclarationMember();
        String nodeName = ctx.getClass().getSimpleName();
        member.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = member;
        member.setDeclaration((Declaration) visit(ctx.declaration()));
        return member;
    }

    @Override
    public IMember visitFunctionMember(DartParser.FunctionMemberContext ctx) {
        System.out.println("Function Member from visitor");
        FunctionMember member = new FunctionMember();
        String nodeName = ctx.getClass().getSimpleName();
        member.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = member;
        member.setFunction((IFunction) visit(ctx.functionDeclaration()));
        member.setOverride(ctx.OVERRIDE() != null);
        return member;
    }

    @Override
    public Class visitDclass(DartParser.DclassContext ctx) {
        System.out.println("Class from visitor");
        Class clas = new Class();
        clas.setID(ctx.IDENTIFIER(0).getText());
        System.out.println(ctx.IDENTIFIER(0).getText()+"KKKKKKKKKKKKKKKKKK55555555555555555555555555555555555555555555555555555555555555555");
        if (ctx.IDENTIFIER(1) != null){
            clas.setExtendsClass(ctx.IDENTIFIER(1).getText());
            if ( ctx.IDENTIFIER(1).getText().equals("StatelessWidget")){
                clas.setStateClass(true);
                isStateClass = true;
            }else if (ctx.STATE() != null) {
                clas.setStateClass(true);
                isStateClass = true;

            }
            else isStateClass =false;
        }
        String nodeName = ctx.getClass().getSimpleName();
        clas.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        Symbol symbol = Symbol.createSymbol(Scope.getCurrentScope().getId(), "Class", "class", clas.getID(), isParameter, namedOrNot, ctx.start.getLine());
        Scope.createScope(clas.getID());
        if (ctx.constructor()!=null){
            lastParent=clas;
            clas.setConstructor((Constructor) visit(ctx.constructor()));
        }
        for (int i = 0; i < ctx.classMemberDefinition().size(); i++) {
            lastParent = clas;
            clas.addMember((IMember) visit(ctx.classMemberDefinition(i)));
        }
        isStateClass = false;
        ErrorCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());

        Scope.removeScope("Class Scope");
        return clas;
    }

    @Override
    public Constructor visitConstructor(DartParser.ConstructorContext ctx) {
        Constructor constructor=new Constructor();
        String nodeName = ctx.getClass().getSimpleName();
        constructor.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = constructor;
        Identifier id=new Identifier();
        id.setID(ctx.IDENTIFIER().getText());
        constructor.setId(id);
        lastParent=constructor;
        if(ctx.functionVoid()!=null){
            constructor.setVoidFunction((VoidFunction) visit(ctx.functionVoid()));
        }
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCccc" + constructor);
        System.out.println(constructor.generate());
        return constructor;
    }

    @Override
    public IExpression visitBitwiseExpression(DartParser.BitwiseExpressionContext ctx) {
        System.out.println("Bitwise Expression from visitor");
        BitwiseExpression expression = new BitwiseExpression();
        String nodeName = ctx.getClass().getSimpleName();
        expression.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = expression;
        expression.setOperation((IBitwiseOperation) visit(ctx.bitwiseOperation()));
        return expression;
    }

    @Override
    public IExpression visitBinaryExpression(DartParser.BinaryExpressionContext ctx) {
        System.out.println("Binary Expression from visitor");
        BinaryExpression expression = new BinaryExpression();
        String nodeName = ctx.getClass().getSimpleName();
        expression.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = expression;
        expression.setOperation((IBinaryOperation) visit(ctx.binaryOperation()));
        return expression;
    }

    @Override
    public Object visitLogicalExpression(DartParser.LogicalExpressionContext ctx) {
        System.out.println("Logical Expression from visitor");
        LogicalExpression expression = new LogicalExpression();
        String nodeName = ctx.getClass().getSimpleName();
        expression.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = expression;
        expression.setLogicalOperation((ICondition) visit(ctx.logicalOperation()));
        return expression;
    }

    @Override
    public Switch visitDswitch(DartParser.DswitchContext ctx) {
        System.out.println("Switch from visitor");
        Switch sw = new Switch();
        String nodeName = ctx.getClass().getSimpleName();
        sw.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = sw;
        sw.setExpression((IExpression) visit(ctx.expression()));

        if (ctx.defaultCase() != null) {
            lastParent = sw;
            sw.setDefaultCase((DefaultCase) visit(ctx.defaultCase()));
        }
        for (int i = 0; i < ctx.switchCase().size(); i++) {
            lastParent = sw;
            sw.addSwitchCase((SwitchCase) visit(ctx.switchCase(i)));
        }
        return sw;
    }

    @Override
    public SwitchCase visitSwitchCase(DartParser.SwitchCaseContext ctx) {
        System.out.println("Switch Case from visitor");
        Scope.createScope("Switch Case Scope");
        System.out.println("111111111111111112222222222");

        SwitchCase switchCase = new SwitchCase();
        String nodeName = ctx.getClass().getSimpleName();
        switchCase.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
//        for (int i = 0; i < ctx.expression().size(); i++) {
        lastParent = switchCase;
        switchCase.setExpressions((IExpression) visit(ctx.expression()));
//        }
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = switchCase;
            switchCase.addStatement((Node) visit(ctx.getChild(i)));
        }
        if (ctx.breakStatement() != null) {
            lastParent = switchCase;
            switchCase.setaBreak((Break) visit(ctx.breakStatement()));
        }
        Scope.removeScope("Switch Case Scope");
//        System.out.println("GGGenerateeeeeeeeeeeeeeeeeee");
//        System.out.println(switchCase.generate());
        return switchCase;
    }

    @Override
    public DefaultCase visitDefaultCase(DartParser.DefaultCaseContext ctx) {
        System.out.println("Default Case from visitor");
        Scope.createScope("Default Case Scope");
        System.out.println("111111111111333333333333");

        DefaultCase defaultCase = new DefaultCase();
        String nodeName = ctx.getClass().getSimpleName();
        defaultCase.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        for (int i = 0; i < ctx.statement().size(); i++) {
            lastParent = defaultCase;
            defaultCase.addStatement((Node) visit(ctx.getChild(i)));
        }
        if (ctx.breakStatement() != null) {
            defaultCase.setaBreak((Break) visit(ctx.breakStatement()));
        }
        Scope.removeScope("Default Case Scope");
        return defaultCase;
    }

    @Override
    public Break visitBreakStatement(DartParser.BreakStatementContext ctx) {
        System.out.println("Break Statement from visitor");
        Break b = new Break();
        return b;
    }


    @Override
    public Widget visitWidget(DartParser.WidgetContext ctx) {
        Widget widget = new Widget();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = widget;
        System.out.println("last parent " + lastParent.getNodeType());
        System.out.println("from visit widget  " + ctx.getChild(0).getText());
        widget.setWidget((Widget) visit(ctx.getChild(0)));
        return widget;
    }

    @Override
    public ListView visitListView(DartParser.ListViewContext ctx) {
        ListView widget = new ListView();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        System.out.println("from visit list view");
        System.out.println("last parent " + lastParent.getNodeType());
        lastParent = widget;
        widget.setProperty((Property) visit(ctx.property()));
        return widget;
    }

    @Override
    public Property visitProperty(DartParser.PropertyContext ctx) {
        Property p = new Property();
        String nodeName = ctx.getClass().getSimpleName();
        p.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        System.out.println("from visit property");
        System.out.println("last parent " + lastParent.getNodeType());

        for (int i = 0; i < ctx.widget().size(); i++) {
            lastParent = p;
            p.addWidget((Widget) visit(ctx.widget(i)));
        }
        return p;
    }

    @Override
    public Widget visitTextWidget(DartParser.TextWidgetContext ctx) {
        System.out.println("visitor from TextWidget");
        System.out.println("last parent " + lastParent.getNodeType());
        TextWidget textWidget = new TextWidget();
        String nodeName = ctx.getClass().getSimpleName();
        textWidget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        textWidget.setText((StringLiteral) visit(ctx.literal()));
        System.out.println(textWidget.getText());
        return textWidget;
    }

    @Override
    public FlatButton visitButton(DartParser.ButtonContext ctx) {
        System.out.println("visitor from button");
        FlatButton widget = new FlatButton();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = widget;
        widget.setText((TextWidget) visit(ctx.textWidget()));
        lastParent = widget;
        widget.setOnPressed((VoidFunction) visit(ctx.functionVoid()));
        return widget;
    }

    @Override
    public Row visitRow(DartParser.RowContext ctx) {
        Row widget = new Row();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        System.out.println("from visit list Row");
        System.out.println("last parent " + lastParent.getNodeType());
        lastParent = widget;
        widget.setProperty((Property) visit(ctx.property()));
        return widget;
    }

    @Override
    public Column visitColumn(DartParser.ColumnContext ctx) {
        Column widget = new Column();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        System.out.println("from visit list Column");
        System.out.println("last parent " + lastParent.getNodeType());
        lastParent = widget;
        widget.setProperty((Property) visit(ctx.property()));
        return widget;
    }

    @Override
    public Container visitContainer(DartParser.ContainerContext ctx) {
        Container widget = new Container();
        String nodeName = ctx.getClass().getSimpleName();
        widget.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        if (ctx.widget() != null) {
            lastParent = widget;
            widget.setChild((Widget) visit(ctx.widget()));
        }
        if (ctx.WIDTH() != null) {
            lastParent = widget;
            widget.setWidth((IElement) visit(ctx.element(0)));
            if (ctx.HEIGHT() != null) {
                lastParent = widget;
                widget.setHeight((IElement) visit(ctx.element(1)));
            }
        } else if (ctx.HEIGHT() != null) {
            lastParent = widget;
            widget.setHeight((IElement) visit(ctx.element(0)));
        }
        if (ctx.color() != null) {
            lastParent = widget;
            widget.setColor((Color) visit(ctx.color()));
        }
        return widget;
    }

    @Override
    public Color visitColor(DartParser.ColorContext ctx) {
        Color color = new Color();
        String nodeName = ctx.getClass().getSimpleName();
        color.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = color;
        if(ctx.element() != null) {
            color.setColor((IElement) visit(ctx.element()));
        } else {
            color.setHexColor(ctx.COLOR_HEX().getText());
        }
        return color;
    }

    @Override
    public Image visitImage(DartParser.ImageContext ctx) {
        Image image = new Image();
        String nodeName = ctx.getClass().getSimpleName();
        image.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = image;
        StringLiteral sss =(StringLiteral) visit(ctx.literal());
        System.out.println("Immmmmmaaaaaaagggggggggggeeeeeeeeeeeeeeeeeeeeeeeeeeee+  "+ visit(ctx.literal()));

        image.setSrc((StringLiteral) sss);
        return image;
    }

    @Override
    public SetState visitSetState(DartParser.SetStateContext ctx) {
        SetState setState=new SetState();
        String nodeName = ctx.getClass().getSimpleName();
        setState.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = setState;
        setState.setVoidFunction((VoidFunction) visit(ctx.functionVoid()));
        return setState;
    }

    @Override
    public Navigator visitNavigation(DartParser.NavigationContext ctx) {
        Navigator navigator = new Navigator();
        String nodeName = ctx.getClass().getSimpleName();
        navigator.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = navigator;
        if (ctx.PUSH()!=null){
            navigator.setMaterialPageRoute((MaterialPageRoute) visit(ctx.materialPageRoue()));
        }
        else if(ctx.POP()!=null){
            navigator.setPop(true);
        }
//        System.out.println("Navgatioooooooooooooooon"+navigator.getChildren());
        return navigator;
    }

    @Override
    public MaterialPageRoute visitMaterialPageRoue(DartParser.MaterialPageRoueContext ctx) {
        MaterialPageRoute materialPageRoute = new MaterialPageRoute();
        String nodeName = ctx.getClass().getSimpleName();
        materialPageRoute.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = materialPageRoute;
        materialPageRoute.setSentParameter((SentParameter) visit(ctx.sentParameter()));
        lastParent = materialPageRoute;
        materialPageRoute.setFunctionBlock((TypeFunctionBlock) visit(ctx.typeFunctionBlock()));
        return materialPageRoute;
    }

    @Override
    public Object visitMaterialApp(DartParser.MaterialAppContext ctx) {
        MaterialApp materialApp = new MaterialApp();
        String nodeName = ctx.getClass().getSimpleName();
        materialApp.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = materialApp;
        materialApp.setChild((FunctionCall) visit(ctx.functionCall()));
        return materialApp;
    }

    @Override
    public Scaffold visitScaffold(DartParser.ScaffoldContext ctx) {
        Scaffold scaffold = new Scaffold();
        String nodeName = ctx.getClass().getSimpleName();
        scaffold.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        lastParent = scaffold;
        scaffold.setChild((Widget) visit(ctx.widget()));
        return scaffold;
    }

    @Override
    public Object visitTextField(DartParser.TextFieldContext ctx) {
            TextField textField=new TextField();
            String nodeName = ctx.getClass().getSimpleName();
            textField.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
            lastParent=textField;
            textField.setOnChanged((OnChanged) visit(ctx.onChanged()));
            return textField;
    }

    @Override
    public Object visitOnChanged(DartParser.OnChangedContext ctx) {
        OnChanged onChanged=new OnChanged();
        String nodeName = ctx.getClass().getSimpleName();
        onChanged.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
        Scope.createScope("OnChanged Scope");
        lastParent = onChanged;
        onChanged.setDeclaration((Declaration) visit(ctx.declaration()));
        if (!onChanged.getDeclaration().getType().getValue().equals("String")){
            String error = "Error..! You Can't declare non String var " + " in line : " + ctx.start.getLine();
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
        }
            lastParent=onChanged;
        onChanged.setBlock((VoidFunctionBlock) visit(ctx.voidFunctionBlock()));
        Scope.removeScope("OnChanged Scope");
        return onChanged;
    }
}
