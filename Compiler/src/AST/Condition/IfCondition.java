package AST.Condition;

import AST.Node.Node;
import java.util.ArrayList;

public class IfCondition extends Node {
    private ArrayList<IfExpression> ifExpressions;
    private ElseExpression elseExpression;

    public IfCondition(){
        ifExpressions = new ArrayList<>();
    }

    public void addIfExpression(IfExpression expression){
        this.ifExpressions.add(expression);
        this.addNodeChild(expression);
    }

    public ElseExpression getElseExpression() {
        return elseExpression;
    }

    public void setElseExpression(ElseExpression elseExpression) {
        this.elseExpression = elseExpression;
        this.addNodeChild(elseExpression);
    }

    @Override
    public String toString() {
        return "IfCondition{" +
                "ifExpressions=" + ifExpressions +
                ", elseExpression=" + elseExpression +
                '}';
    }
}
