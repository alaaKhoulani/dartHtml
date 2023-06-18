package AST.Function;

import AST.Condition.IBoolean;
import AST.Element.IElement;
import AST.Expression.IExpression;
import AST.Literal.ILiteral;
import AST.Node.Node;
import AST.Widgets.Widget;

public class   SentParameter extends Node {
    private  ILiteral literal;
    private IExpression expression;
    private IBoolean iBoolean;
    private FunctionCall FunctionCall;
    private TypeFunction typeFunction;
    private VoidFunction voidFunction;
    private IElement element;
    private Widget widget;


    public FunctionCall getFunctionCall() {
        return FunctionCall;
    }

    public void setFunctionCall(FunctionCall FunctionCall) {
        this.FunctionCall = FunctionCall;
        this.addNodeChild((Node) FunctionCall);
    }

    public ILiteral getLiteral() {
        return literal;
    }

    public void setLiteral(ILiteral literal) {
        this.literal = literal;
        this.addNodeChild((Node) literal);
    }

    public IExpression getExpression() {
        return expression;
    }

    public void setExpression(IExpression expression) {
        this.expression = expression;
        this.addNodeChild((Node) expression);
    }

    public IBoolean getiBoolean() {
        return iBoolean;
    }

    public void setiBoolean(IBoolean iBoolean) {
        this.iBoolean = iBoolean;
        this.addNodeChild((Node) iBoolean);
    }


    public TypeFunction getTypeFunction() {
        return typeFunction;
    }

    public void setTypeFunction(TypeFunction typeFunction) {
        this.typeFunction = typeFunction;
        this.addNodeChild(typeFunction);
    }

    public VoidFunction getVoidFunction() {
        return voidFunction;
    }

    public void setVoidFunction(VoidFunction voidFunction) {
        this.voidFunction = voidFunction;
        this.addNodeChild(voidFunction);
    }

    public IElement getElement() {
        return element;
    }

    public void setElement(IElement element) {
        this.element = element;
        this.addNodeChild((Node) element);
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
        this.addNodeChild(widget);
    }

    @Override
    public String generate() {
        if(literal!=null){
            return literal.generate();
        }else if(expression!=null){
            return expression.generate();
        }else if(iBoolean!=null){
            return iBoolean.generate();
        }else if(FunctionCall!=null){
            return FunctionCall.generate();
        }else if (typeFunction!=null){
            return typeFunction.generate();
        }else if (voidFunction!=null){
            return voidFunction.generate();
        }else if (element!=null){
            return element.generate();
        }else if (widget!=null){
            return widget.generate();
        }
        return "";
    }

    @Override
    public String toString() {
        return "SentParameter{" +
                "literal=" + literal +
                ", expression=" + expression +
                ", iBoolean=" + iBoolean +
                '}';
    }
}
