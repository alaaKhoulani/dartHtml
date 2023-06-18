package AST.Node;

import java.util.ArrayList;

public class Node {
    private String nodeType;
    private Node Parent;
    private ArrayList<Node> children;
    private int lineNumber;
    private static int classID=1;

    public static String getClassID() {
        return "id_"+classID++;
    }

    public Node getParent() {
        return Parent;
    }

    public void setParent(Node parent) {
        Parent = parent;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }


    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Node(){
        children=new ArrayList<>();
    }

    public Node(Node parent, int lineNumber, String nodeType) {
        Parent = parent;
        this.children = new ArrayList<>();
        this.lineNumber = lineNumber;
        this.nodeType = nodeType;
    }

    public void addNodeChild(Node node){
        this.children.add(node);
    }
    public void setAstNode(Node parent, int lineNumber, String type){
        setParent(parent);
        setNodeType(type);
        setLineNumber(lineNumber);
    }
    public String generate(){return  "";}

    public void printNode(){
        if (this.Parent!= null)
        System.out.println(this.lineNumber+"-       Node Type: "+this.nodeType+"        Parent "+this.Parent.getNodeType());
        else
            System.out.println(this.lineNumber+"-       Node Type: "+this.nodeType+"        Parent: null");
    }
}
