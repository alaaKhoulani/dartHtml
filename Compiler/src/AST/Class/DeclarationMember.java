package AST.Class;

import AST.Declare.Declaration;
import AST.Node.Node;

public class DeclarationMember extends Node implements IMember{
    private Declaration declaration;

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
        this.addNodeChild(declaration);
    }

    @Override
    public String generate() {
        String s="";
        for(int i = 0; i<declaration.getIDs().size(); i++){
            s += declaration.getIDs().get(i)+";\n";
        }
        for(int i = 0; i<declaration.getAssignments().size(); i++){
            s += declaration.getAssignments().get(i).generate()+";\n";
        }
        if (declaration.getBaseClassID()!= null){
            s+=declaration.getObjetID() + " = new "+declaration.getBaseClassID() +"();\n";
        }
        return s;
    }

    @Override
    public String toString() {
        return "DeclarationMember{" +
                "declaration=" + declaration +
                '}';
    }
}
