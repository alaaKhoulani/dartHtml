package AST.Condition;

import AST.Block.Block;
import AST.Node.Node;

public class IfExpression extends Node {
    private ICondition condition;
    private Block block;
    private Node statement;

    public Node getStatement() {
        return statement;
    }

    public void setStatement(Node statement) {
        this.statement = statement;
        this.addNodeChild(statement);
    }

    public ICondition getCondition() {
        return condition;
    }

    public void setCondition(ICondition condition) {
        this.condition = condition;
        this.addNodeChild((Node) condition);
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
        this.addNodeChild(block);
    }

    @Override
    public String toString() {
        return "IfExpression{" +
                "condition=" + condition +
                ", block=" + block +
                ", statement=" + statement +
                '}';
    }
}
