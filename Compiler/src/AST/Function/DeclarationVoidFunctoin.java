package AST.Function;

import AST.Node.Node;

public class DeclarationVoidFunctoin extends Node implements IFunction {
    private String ID;
    private VoidFunction function;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public VoidFunction getFunction() {
        return function;
    }

    public void setFunction(VoidFunction function) {
        this.function = function;
        this.addNodeChild(function);
    }

    @Override
    public String generate() {
        String s= "\n function "+ ID +" "+function.generate();
        return s;
    }

    @Override
    public String toString() {
        return "DeclarationVoidFunctoin{" +
                "ID='" + ID + '\'' +
                ", function=" + function +
                '}';
    }
}
