package AST.Expression;

import AST.Bitwise.IBitwiseOperation;
import AST.Node.Node;

public class BitwiseExpression extends Node implements IExpression {
    private IBitwiseOperation operation;

    public IBitwiseOperation getOperation() {
        return operation;
    }

    public void setOperation(IBitwiseOperation operation) {
        this.operation = operation;
        this.addNodeChild((Node) operation);
    }

    @Override
    public String generate() {
        String s = "";
        s += operation.generate();
        return s;
    }

    @Override
    public String toString() {
        return "BitwiseExpression{" +
                "operation=" + operation +
                '}';
    }
}
