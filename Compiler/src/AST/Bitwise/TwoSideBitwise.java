package AST.Bitwise;

import AST.Compare.Side;
import AST.Node.Node;

import java.util.ArrayList;

public class TwoSideBitwise extends Node implements IBitwiseOperation {
    private ArrayList<Side> sides;
    private ArrayList<BitwiseOperator> operators;

    public TwoSideBitwise() {
        sides = new ArrayList<>();
        operators = new ArrayList<>();
    }

    public void addOperator(BitwiseOperator operator) {
        this.operators.add(operator);
        this.addNodeChild(operator);
    }

    public void addSide(Side side) {
        this.sides.add(side);
        this.addNodeChild(side);
    }

    @Override
    public String generate() {
        String s = "";
        for (int i = 0; i < sides.size(); i++) {
            s += sides.get(i).generate();
            if (i < operators.size()) {
                s += operators.get(i).generate();
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "TwoSideBitwise{" +
                "sides=" + sides +
                ", operators=" + operators +
                '}';
    }

}
