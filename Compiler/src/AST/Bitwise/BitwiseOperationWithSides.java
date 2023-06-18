package AST.Bitwise;

import AST.Compare.Side;
import AST.Node.Node;

import java.util.ArrayList;

public class BitwiseOperationWithSides extends Node implements IBitwiseOperation {
    private ArrayList<Side> sides;
    private ArrayList<BitwiseOperator> operators;
    private IBitwiseOperation bitwiseOperation;

    public BitwiseOperationWithSides() {
        sides = new ArrayList<>();
        operators = new ArrayList<>();
    }

    public void addOperator(BitwiseOperator operator) {
        this.operators.add(operator);
        this.addNodeChild(operator);
    }

    public IBitwiseOperation getBitwiseOperation() {
        return this.bitwiseOperation;
    }

    public void setBitwiseOperation(IBitwiseOperation operation) {
        this.bitwiseOperation = operation;
        this.addNodeChild((Node) operation);
    }

    public void addSide(Side side) {
        this.sides.add(side);
        this.addNodeChild(side);
    }

    @Override
    public String generate() {
        String s = "";
        s += "(";
        s += bitwiseOperation.generate();
        s += ")";
        for (int i = 0; i < sides.size(); i++) {
            s += operators.get(i).generate();
            s += sides.get(i).generate();
        }
        return s;
    }

    public String toString() {
        return "SideWithBitwiseOperation{" +
                "sides=" + sides +
                ", operators=" + operators +
                ", bitwiseOperation=" + bitwiseOperation +
                '}';
    }
}
