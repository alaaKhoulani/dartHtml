package AST.Function;

import AST.Declare.Declaration;
import AST.Node.Node;

import java.util.ArrayList;

public class NamedDeclerationParameters extends Node {
    private ArrayList<Declaration> declarations=new ArrayList<>();

    public void addDeclaration(Declaration declaration){
        this.declarations.add(declaration);
        this.addNodeChild(declaration);
    }

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    @Override
    public String generate() {
        String s="{";
        for (int i=0;i<declarations.size();i++){
            s+= declarations.get(i).generateWithoutType();
            if(i<declarations.size()-1) s+=" , ";
        }
        s+="}";
        return s;
    }

    @Override
    public String toString() {
        return "NamedDeclerationParameters{" +
                "declarations=" + declarations +
                '}';
    }
}
/**
 * list li=[5,4,7]
 *
 */
