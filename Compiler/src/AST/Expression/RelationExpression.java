package AST.Expression;

import AST.Compare.IRelationalCompare;
import AST.Node.Node;

public class RelationExpression extends Node implements IExpression{
    private IRelationalCompare operation;

    public IRelationalCompare getOperation() {
        return operation;
    }

    public void setOperation(IRelationalCompare operation) {
        this.operation = operation;
        this.addNodeChild((Node) operation);
    }

    @Override
    public String toString() {
        return "RelationExpression{" +
                "operation=" + operation +
                '}';
    }
}
