package AST.Function;

import AST.Node.Node;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class FunctionCall extends Node {
    private String ID;
    private PrarametersToSend prarameters;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public PrarametersToSend getPrarameters() {
        return prarameters;
    }

    public void setPrarameters(PrarametersToSend prarameters) {
        this.prarameters = prarameters;
        this.addNodeChild(prarameters);
    }

    @Override
    public String generate() {
        String s=ID +prarameters.generate();
        return s;

    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "ID='" + ID + '\'' +
                ", prarameters=" + prarameters +
                '}';
    }
}
