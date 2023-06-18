package AST.Element;

import AST.Node.Node;

public class Number extends Node implements IElement {
    private String type;
    private int intNumber;
    private double doubleNumber;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getIntNumber() {
        return this.intNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;

    }

    public double getDoubleNumber() {
        return this.doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    @Override
    public String generate() {
        String s = "";
        if(type.equals("int")) {
            s += Integer.toString(intNumber);
        }
        if(type.equals("double")){
            s+= Double.toString(doubleNumber);
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number{");
//        if (getType().equals("int")) {
//            stringBuilder.append("value=" + getIntNumber());
//        } else {
//            stringBuilder.append("value=" + getDoubleNumber());
//        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
