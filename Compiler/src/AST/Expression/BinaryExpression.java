package AST.Expression;

import AST.BinaryOperation.IBinaryOperation;
import AST.Node.Node;

public class BinaryExpression extends Node implements IExpression{
    private IBinaryOperation operation;

    public IBinaryOperation getOperation() {
        return operation;
    }

    public void setOperation(IBinaryOperation operation) {
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
        return "BinaryExpression{" +
                "operation=" + operation +
                '}';
    }
}
