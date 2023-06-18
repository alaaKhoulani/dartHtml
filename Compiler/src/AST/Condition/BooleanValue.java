package AST.Condition;

import AST.Literal.BooleanLiteral;
import AST.Node.Node;

public class BooleanValue extends Node implements IBoolean{
    private boolean value;

    public boolean getValue() {
        return value;
    }
    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String generate() {
        String s ="";
        s+=Boolean.toString(value);
        return s;
    }

    @Override
    public String toString() {
        return "BooleanValue{" +
                "value=" + value +
                '}';
    }
}
