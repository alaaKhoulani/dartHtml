package AST;

import AST.Node.Node;

public class Break extends Node {
    private String br = "break";

    @Override
    public String generate() {
        return "break;";
    }

    @Override
    public String toString() {
        return "Break{" +
                "br='" + br + '\'' +
                '}';
    }
}
