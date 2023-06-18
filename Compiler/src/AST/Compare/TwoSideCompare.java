package AST.Compare;

import AST.Node.Node;

public class TwoSideCompare extends Node implements IRelationalCompare {
    Side side1;
    Side side2;
    RelationalOperator operator;

    public RelationalOperator getOperator() {
        return this.operator;
    }

    public void setOperator(RelationalOperator operator) {
        this.operator = operator;
        this.addNodeChild(operator);
    }

    public Side getSide1() {
        return this.side1;
    }

    public void setSide1(Side side) {
        this.side1 = side;
        this.addNodeChild(side);
    }

    public Side getSide2() {
        return this.side2;
    }

    public void setSide2(Side side) {
        this.side2 = side;
        this.addNodeChild(side);
    }

    @Override
    public String generate() {
        String s = "";
        s += side1.generate();
        s += operator.generate();
        s += side2.generate();
        return s;
    }

    @Override
    public String toString() {
        return "TwoSideCompare{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", operator=" + operator +
                '}';
    }
}
