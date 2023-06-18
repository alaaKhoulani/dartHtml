package AST.Declare;

import AST.Element.Identifier;
import AST.Function.FunctionCall;
import AST.Function.IFunctionReturn;
import AST.Node.Node;

public class FunctionAssignment extends Node implements IAssignment{
    private FunctionCall funactionCall;
    private IFunctionReturn function;
    private Identifier ID;
//    private Identifier ID2;

    public FunctionCall getFunactionCall() {
        return funactionCall;
    }

    public void setFunactionCall(FunctionCall funactionCall) {
        this.funactionCall = funactionCall;
        this.addNodeChild((Node) funactionCall);
    }

    public IFunctionReturn getFunction() {
        return function;
    }

    public void setFunction(IFunctionReturn function) {
        this.function = function;
        this.addNodeChild((Node) function);
    }

    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier Id) {
        this.ID= Id;


    }

//    public Identifier getID2() {
//        return ID2;
//    }
//
//    public void setID2(Identifier ID2) {
//        this.ID2 = ID2;
//        this.addNodeChild(ID2);
//    }


    @Override
    public String generate() {
        String s=ID+" = ";
        if (function!=null) s+=function.generate()+"\n";
        if (funactionCall!=null) s+=funactionCall.generate()+"\n";

        return s;
    }

    @Override
    public String toString() {
        return "FunctionAssignment{" +
                "funactionCall=" + funactionCall +
                ", function=" + function +
                ", ID='" + ID + '\'' +
                '}';
    }
}
