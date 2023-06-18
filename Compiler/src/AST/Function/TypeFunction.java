package AST.Function;

import AST.Block.TypeFunctionBlock;
import AST.Node.Node;

import java.util.ArrayList;

public class TypeFunction  extends Node implements IFunctionReturn{

    private DeclerationParameter declerationParameters;
    private TypeFunctionBlock block;




    public TypeFunctionBlock getBlock() {
        return block;
    }



    public void setBlock(TypeFunctionBlock block) {
        this.block = block;
        this.addNodeChild(block);
    }

    public DeclerationParameter getDeclerationParameters() {
        return declerationParameters;
    }

    public void setDeclerationParameters(DeclerationParameter declerationParameters) {
        this.declerationParameters = declerationParameters;
        this.addNodeChild(declerationParameters);
    }

    @Override
    public String generate() {
        String s=declerationParameters.generate()+block.generate();
        return s;
    }

    @Override
    public String toString() {
        return "TypeFunction{" +
                " parameters=" + declerationParameters +
                ", block=" + block +
                '}';
    }
}
