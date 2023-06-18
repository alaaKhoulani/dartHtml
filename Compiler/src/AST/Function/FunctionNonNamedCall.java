//package AST.Function;
//
//import AST.Node.Node;
//
//public class FunctionNonNamedCall extends Node implements IFunactionCall {
//    private String ID;
//    private NonNamedParameter nonNamedParameter;
//
//    public NonNamedParameter getNonNamedParameter() {
//        return nonNamedParameter;
//    }
//
//    public void setNonNamedParameter(NonNamedParameter nonNamedParameter) {
//        this.nonNamedParameter = nonNamedParameter;
//        this.addNodeChild(nonNamedParameter);
//    }
//
//    public String getID() {
//        return ID;
//    }
//
//    public void setID(String ID) {
//        this.ID = ID;
//    }
//
//    @Override
//    public String toString() {
//        return "FunctionNonNamedCall{" +
//                "ID=" + ID +
//                ", nonNamedParameter=" + nonNamedParameter +
//                '}';
//    }
//}
