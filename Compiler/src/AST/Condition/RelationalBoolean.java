package AST.Condition;

import AST.Compare.IRelationalCompare;
import AST.Node.Node;

public class RelationalBoolean extends Node implements IBoolean {
    IRelationalCompare relationalCompare;

    public IRelationalCompare getRelationalCompare() {
        return this.relationalCompare;
    }

    public void setRelationalCompare(IRelationalCompare relationalCompare) {
        this.relationalCompare = relationalCompare;
        this.addNodeChild((Node) relationalCompare);
    }

    @Override
    public String generate() {
        String s = "";
        s += relationalCompare.generate();
        return s;
    }

    @Override
    public String toString() {
        return "RelationalBoolean{" +
                "relationalCompare=" + relationalCompare +
                '}';
    }
}
