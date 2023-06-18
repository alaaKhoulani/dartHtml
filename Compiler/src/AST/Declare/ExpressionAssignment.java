package AST.Declare;

import AST.Element.Identifier;
import AST.Expression.IExpression;
import AST.Node.Node;

public class ExpressionAssignment extends Node implements IAssignment {
    private IExpression expression;
    private Identifier ID;

    public IExpression getExpression() {
        return expression;
    }

    public void setExpression(IExpression expression) {
        this.expression = expression;
        this.addNodeChild((Node) expression);
    }


    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier ID) {
        this.ID = ID;
    }

    @Override
    public String generate() {
        String s=ID.generate()+" = "+expression.generate();
        return s;
    }

    @Override
    public String toString() {
        return "ExpressionAssignment{" +
                "expression=" + expression +
                ", ID='" + ID + '\'' +
                '}';
    }
}
