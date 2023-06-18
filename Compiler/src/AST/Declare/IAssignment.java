package AST.Declare;

import AST.Element.Identifier;
import AST.Node.Node;

public interface IAssignment {
    public String generate();

//    Identifier ID =new Identifier();
    public Identifier getID();
    public void setID(Identifier id);
}
