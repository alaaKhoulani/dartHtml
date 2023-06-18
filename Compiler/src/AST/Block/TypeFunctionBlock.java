package AST.Block;

import AST.Expression.IExpression;
import AST.Function.FunctionCall;
import AST.Node.Node;
import AST.Widgets.Widget;

import java.util.ArrayList;

public class TypeFunctionBlock extends Node {


    private ArrayList<Node> statements;
    private IExpression returnExepression;

    private FunctionCall functionCall;
    private Widget returnWidget;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public ArrayList<Node> getStatements() {
        return statements;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
        this.addNodeChild((Node) functionCall);
    }

    public TypeFunctionBlock(){
        statements=new ArrayList<>();
    }

    public IExpression getReturnExepression() {
        return returnExepression;
    }

    public void setReturnExepression(IExpression returnExepression) {
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
        this.returnExepression = returnExepression;
        this.addNodeChild((Node) returnExepression);
    }

    public  void addStatement(Node statement){
        this.statements.add(statement);
        this.addNodeChild(statement);
    }

    public Widget getReturnWidget() {
        return returnWidget;
    }

    public void setReturnWidget(Widget returnWidget) {

        this.returnWidget = returnWidget;
        this.addNodeChild(returnWidget);
    }

    @Override
    public String generate() {
        String s= "{";
        for (Node node : statements){
            s+=node.generate()+"\n";
        }
        s+="return ";
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss   "+s);
        if(returnExepression!= null) s+= returnExepression.generate()+" ;";
        else if (returnWidget!=null) s+= returnWidget.generate()+" ;";
        else if (functionCall!=null) s+=functionCall.generate();
        System.out.println(returnExepression+"SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss   "+s);

        s+="}";
        return s;
    }

    @Override
    public String toString() {
        return "TypeFunctionBody{" +
                "statements=" + statements +
                ", returnExepression=" + returnExepression +
                '}';
    }
}
