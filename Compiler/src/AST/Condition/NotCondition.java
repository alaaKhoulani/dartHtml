package AST.Condition;

import AST.Node.Node;

public class NotCondition extends Node implements ICondition {
    private String operator="!";
    private ICondition condition;

    public ICondition getCondition() {
        return condition;
    }

    public void setCondition(ICondition condition) {
        this.condition = condition;
        this.addNodeChild((Node) condition);
    }

    @Override
    public String generate() {
        String s = "!";
        s += condition.generate();
        return s;
    }

    @Override
    public String toString() {
        return "NotCondition{" +
                "operator='" + operator + '\'' +
                ", condition=" + condition +
                '}';
    }
}
