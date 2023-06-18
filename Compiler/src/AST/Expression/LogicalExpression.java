package AST.Expression;

import AST.Condition.ICondition;
import AST.Node.Node;

public class LogicalExpression extends Node implements IExpression{
    private ICondition logicalOperation;

    public ICondition getLogicalOperation() {
        return logicalOperation;
    }

    public void setLogicalOperation(ICondition logicalOperation) {
        this.logicalOperation = logicalOperation;
        this.addNodeChild((Node) logicalOperation);
    }

    @Override
    public String generate() {
        String s = "";
        s += logicalOperation.generate();
        return s;
    }

    @Override
    public String toString() {
        return "LogicalExpression{" +
                "logicalOperation=" + logicalOperation +
                '}';
    }
}
