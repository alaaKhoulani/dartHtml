package AST.Element;

import AST.Node.Node;

public class Element extends Node implements IElement {
    private Identifier ID;
    private Number number;

    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier ID) {
        this.ID = ID;
        this.addNodeChild(ID);
    }


    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
        this.addNodeChild(number);
    }

    @Override
    public String generate() {
        String s = "";
        if(number != null){
            s+= number.generate();
        }
        if(ID != null){
            s+= ID.generate();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Element{" +
                "ID=" + ID +
                ", number=" + number +
                '}';
    }
}
