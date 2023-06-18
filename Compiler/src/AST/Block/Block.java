package AST.Block;

import AST.Node.Node;

import java.util.ArrayList;

public class Block extends Node {
    private ArrayList<Node> statements;
    public Block(){
        statements=new ArrayList<>();
    }
    public  void addStatement(Node statement){
        this.statements.add(statement);
        this.addNodeChild(statement);
    }

    @Override
    public String generate() {
        String s="{";
        for (Node node:statements){
            s+=node.generate();
            s+="\n";
        }
        s+="}";
        return s;
    }

    @Override
    public String toString() {
        return "AST.Body{" +
                "statements=" + statements +
                '}';
    }
}
