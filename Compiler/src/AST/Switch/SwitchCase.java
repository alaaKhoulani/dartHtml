package AST.Switch;

import AST.Break;
import AST.Expression.IExpression;
import AST.Node.Node;

import java.util.ArrayList;

public class SwitchCase extends Node {
    private IExpression expressions;
    private ArrayList<Node> statements;

    private Break aBreak;

    public SwitchCase() {
//        expressions = new ArrayList<>();
        statements = new ArrayList<>();
    }

    public void addStatement(Node statement) {
        statements.add(statement);
        this.addNodeChild(statement);
    }

    public IExpression getExpressions() {
        return expressions;
    }

    public void setExpressions(IExpression expressions) {
        this.expressions = expressions;
    }


    public Break getaBreak() {
        return aBreak;
    }

    public void setaBreak(Break aBreak) {
        this.aBreak = aBreak;
    }

    @Override
    public String generate() {
        String s="case "+ expressions.generate() +":\n";
        for (Node node : statements){
            s+=node.generate();
        }
        s+=aBreak.generate();
        return s;
    }

    @Override
    public String toString() {
        return "SwitchCase{" +
                "expressions=" + expressions +
                ", statements=" + statements +
                '}';
    }
}
