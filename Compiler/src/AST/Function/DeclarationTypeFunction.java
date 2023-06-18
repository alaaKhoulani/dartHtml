package AST.Function;

import AST.Declare.Type;
import AST.Node.Node;

/*
*  void fu(int i, string s,iny y){}
* */

public class DeclarationTypeFunction extends Node implements IFunction{
    private String ID;
    private Type type;
    private TypeFunction function;
    private String classReturnType;

    private boolean isBuild;

    public String getClassReturnType() {
        return classReturnType;
    }

    public boolean isBuild() {
        return isBuild;
    }

    public void setBuild(boolean build) {
        isBuild = build;
    }

    public void setClassReturnType(String classReturnType) {
        this.classReturnType = classReturnType;
    }

    public TypeFunction getFunction() {
        return function;
    }

    public void setFunction(TypeFunction function) {
        this.function = function;
        this.addNodeChild(function);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
        this.addNodeChild(type);
    }

    @Override
    public String generate() {
        String s= "function "+ID+ function.generate();
        return s;
    }

    @Override
    public String toString() {
        return "DeclarationTypeFunction{" +
                "ID='" + ID + '\'' +
                ", type=" + type +
                '}';
    }
}
