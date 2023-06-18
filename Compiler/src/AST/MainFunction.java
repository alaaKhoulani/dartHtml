package AST;

import AST.Class.Class;
import AST.Node.Node;

import java.util.ArrayList;

public class MainFunction extends Node {
    private final ArrayList<Statement> statements;

    public MainFunction() {
        statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
        this.addNodeChild(statement);
    }

    @Override
    public String generate() {
        String s= "function main (){";
        for (Statement statement :statements){
            s+=statement.generate()+"\n";
        }
        s+="}";
        return s;
    }

    @Override
    public String toString() {
        return "MainFunction{" +
                "statements=" + statements +
                '}';
    }
}
