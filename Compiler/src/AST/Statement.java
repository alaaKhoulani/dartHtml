package AST;

import AST.Declare.Declaration;
import AST.Declare.IAssignment;
import AST.Node.Node;

public class Statement extends Node {
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
        this.addNodeChild(node);
    }

    @Override
    public String generate() {
        String s = "";
        s += node.generate();
        s += ";";
        return s;
    }
    @Override
    public String toString() {
        return "Statement{" +
                "Statement=" + node +
                '}';
    }
}
