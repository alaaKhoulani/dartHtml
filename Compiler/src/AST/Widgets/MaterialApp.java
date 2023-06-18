package AST.Widgets;

import AST.Function.FunctionCall;
import AST.Node.Node;

public class MaterialApp extends Widget {
//    Widget child;
    FunctionCall child;
    public FunctionCall getChild() {
        return child;
    }

    public void setChild(FunctionCall child) {
        this.child = child;
        this.addNodeChild((Node)child);
    }

    @Override
    public String generate() {
        return "";
    }

    @Override
    public String toString() {
        return "MaterialApp{" +
                "function=" + child +
                '}';
    }
}
