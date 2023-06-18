package AST.Condition;

import AST.Block.Block;
import AST.Node.Node;

public class ElseExpression extends Node {
    private Block block;
    private Node statement;

    public Node getStatement() {
        return statement;
    }

    public void setStatement(Node statement) {
        this.statement = statement;
        this.addNodeChild(statement);
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
        return "ElseExpression{" +
                "block=" + block +
                ", statement=" + statement +
                '}';
    }
}
