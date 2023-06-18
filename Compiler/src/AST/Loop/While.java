package AST.Loop;
import AST.Block.Block;
import AST.Condition.ICondition;
import AST.Node.Node;

public class While extends Node {
    private ICondition condition;

    private Block block;

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
    public String generate() {
        String s="while ("+condition.generate()+")";
        s+=block.generate();
        return s;
    }

    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", block=" + block +
                '}';
    }
}
