package AST.Block;

import AST.Node.Node;
import AST.Statement;

import java.util.ArrayList;

public class VoidFunctionBlock extends Node {
    private ArrayList<Statement> statements=new ArrayList<>();
    public  void addStatement(Statement statement){
        this.statements.add(statement);
        this.addNodeChild(statement);
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    @Override
    public String generate() {
        String s="";
        for (Node node : statements){
            s+=node.generate()+"\n";
        }

        return s;
    }

    @Override
    public String toString() {
        return "VoidFunctionBody{" +
                "statements=" + statements +
                '}';
    }
}
