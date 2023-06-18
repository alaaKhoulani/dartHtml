package AST.Condition;

import AST.LogicalOperation.LogicalOperator;
import AST.Node.Node;

import java.util.ArrayList;

public class Condition extends Node implements ICondition {
    private ArrayList<IBoolean> booleanSides;
    private ArrayList<LogicalOperator> logicalOperators;

    public Condition() {
        booleanSides = new ArrayList<>();
        logicalOperators = new ArrayList<>();
    }

    public void addOperator(LogicalOperator logicalOperator) {
        this.logicalOperators.add(logicalOperator);
        this.addNodeChild(logicalOperator);
    }

    public void addBooleanSide(IBoolean iBoolean) {
        this.booleanSides.add(iBoolean);
        this.addNodeChild((Node) iBoolean);
    }

    @Override
    public String generate() {
        String s = "";
        for (int i = 0; i < booleanSides.size(); i++) {
            s += booleanSides.get(i).generate();
            if(i < logicalOperators.size()){
                s += logicalOperators.get(i).generate();
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "TwoCondition{" +
                "booleanSides=" + booleanSides +
                ", logicalOperators=" + logicalOperators +
                '}';
    }
}
