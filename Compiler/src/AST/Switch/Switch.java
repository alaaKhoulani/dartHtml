package AST.Switch;

import AST.Expression.IExpression;
import AST.Node.Node;

import java.util.ArrayList;

public class Switch extends Node {
    private IExpression expression;
    private ArrayList<SwitchCase> switchCases;
    private DefaultCase defaultCase;

    public Switch() {
        switchCases = new ArrayList<>();
    }

    public void addSwitchCase(SwitchCase switchCase) {
        switchCases.add(switchCase);
        this.addNodeChild(switchCase);
    }

    public IExpression getExpression() {
        return expression;
    }

    public void setExpression(IExpression expression) {
        this.expression = expression;
        this.addNodeChild((Node) expression);
    }

    public DefaultCase getDefaultCase() {
        return defaultCase;
    }

    public void setDefaultCase(DefaultCase defaultCase) {
        this.defaultCase = defaultCase;
        this.addNodeChild(defaultCase);
    }

    @Override
    public String generate() {
        String s= "switch ( "+expression.generate()+" ){\n";
        for (SwitchCase switchCase: switchCases){
            s+=switchCase.generate();
        }
        if (defaultCase!=null){
            s+=defaultCase.generate();
        }
        return s;
    }

    //"i=5";
    @Override
    public String toString() {
        return "Switch{" +
                "expression=" + expression +
                ", switchCases=" + switchCases +
                ", defaultCase=" + defaultCase +
                '}';
    }
}
