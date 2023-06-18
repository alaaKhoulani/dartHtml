package AST.Class;

import AST.Function.DeclarationTypeFunction;
import AST.Function.DeclarationVoidFunctoin;
import AST.Function.IFunction;
import AST.Node.Node;

public class FunctionMember extends Node implements IMember{
    private IFunction function;
    private boolean isOverride;

    public IFunction getFunction() {
        return function;
    }

    public void setFunction(IFunction function) {
        this.function = function;
        this.addNodeChild((Node) function);
    }

    public boolean isOverride() {
        return isOverride;
    }

    public void setOverride(boolean override) {
        isOverride = override;
    }

    @Override
    public String generate() {
        String s= "";
        if (function instanceof DeclarationTypeFunction){
            s+=((DeclarationTypeFunction) function).getID()+((DeclarationTypeFunction) function).getFunction().generate();
        }
        else if (function instanceof DeclarationVoidFunctoin){
            s+=((DeclarationVoidFunctoin) function).getID()+((DeclarationVoidFunctoin) function).getFunction().generate();
        }

        return s;
    }

    @Override
    public String toString() {
        return "FunctionMember{" +
                "function=" + function +
                '}';
    }
}
