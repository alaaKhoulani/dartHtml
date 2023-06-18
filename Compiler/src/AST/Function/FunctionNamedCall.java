//package AST.Function;
//
//import AST.Node.Node;
//
//public class FunctionNamedCall extends Node implements IFunactionCall {
//    private String ID;
//    private NamedParameter namedParameter;
//
//    public String getID() {
//        return ID;
//    }
//
//    public void setID(String ID) {
//        this.ID = ID;
//    }
//
//    public NamedParameter getNamedParameter() {
//        return namedParameter;
//    }
//
//    public void setNamedParameter(NamedParameter namedParameter) {
//        this.namedParameter = namedParameter;
//        this.addNodeChild(namedParameter);
//    }
//
//    @Override
//    public String toString() {
//        return "FunctionNamedCall{" +
//                "ID=" + ID +
//                ", namedParameter=" + namedParameter +
//                '}';
//    }
//}
