package AST.Condition;

import AST.Node.Node;

public class LogicalBoolean extends Node implements IBoolean{
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
        String s = "(";
        s += logicalOperation.generate();
        s += ")";
        return s;
    }

    @Override
    public String toString() {
        return "LogicalBoolean{" +
                "logicalOperation=" + logicalOperation +
                '}';
    }
}
