package AST.Switch;

import AST.Break;
import AST.Node.Node;

import java.util.ArrayList;

public class DefaultCase extends Node {
    private ArrayList<Node> statements;
    private  Break aBreak;

    public DefaultCase() {
        statements = new ArrayList<>();
    }

    public void addStatement(Node statement) {
        statements.add(statement);
        this.addNodeChild(statement);
    }

    public Break getaBreak() {
        return aBreak;
    }

    public void setaBreak(Break aBreak) {
        this.aBreak = aBreak;
    }

    @Override
    public String generate() {
        String s="default :\n";
        for (Node node :statements){
            s+=node.generate();
        }
        if (aBreak!=null){
            s+=aBreak.generate();
        }
        return  s;
    }

    @Override
    public String toString() {
        return "DefaultCase{" +
                "statements=" + statements +
                '}';
    }
}
