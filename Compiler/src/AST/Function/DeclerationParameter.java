package AST.Function;

import AST.Declare.Declaration;
import AST.Node.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DeclerationParameter extends Node {
    private final ArrayList<Declaration> declarations = new ArrayList<>();
    private NamedDeclerationParameters namedDeclaration ;

//    private Map<Integer, Node> totalParameters = new HashMap<>();

    public ArrayList<Declaration> getDeclarations() {
        return declarations;
    }

    public void addDeclaration(Declaration declaration) {
        this.declarations.add(declaration);
        this.addNodeChild(declaration);
//        this.totalParameters.put(index, declaration);
    }

    public void setNamedDeclaration(NamedDeclerationParameters declaration) {
        this.namedDeclaration=declaration;
        this.addNodeChild(declaration);
//        this.totalParameters.put(index, declaration);
    }

    public NamedDeclerationParameters getNamedDeclaration() {
        return namedDeclaration;
    }
    //    public ArrayList<NamedDeclerationParameters> getNamedDeclaration() {
//        return namedDeclaration;
//    }

    @Override
    public String generate() {
        String s = "(";
            for (int i=0;i<declarations.size();i++){
                s+=declarations.get(i).generateWithoutType();
                if(i<declarations.size()-1) s+=" , ";
            }
            if(namedDeclaration!= null){
                if(declarations.size()>0) s+=" , ";
                s+=namedDeclaration.generate()+"={}";
            }
        s+=")";
        return s;
    }

    @Override
    public String toString() {
        return "DeclerationParameter{" +
                "declarations=" + declarations +
                ", namedDeclaration=" + namedDeclaration +
                '}';
    }
}
