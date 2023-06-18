package AST.Function;

import AST.Block.VoidFunctionBlock;
import AST.Node.Node;

import java.util.ArrayList;

public class VoidFunction extends Node implements IFunctionReturn {
    private DeclerationParameter declerationParameter;
    private VoidFunctionBlock block;




    public VoidFunctionBlock getBlock() {
        return block;
    }

    public void setBlock(VoidFunctionBlock block) {
        this.block = block;
        this.addNodeChild(block);
    }

    public void setParameter(DeclerationParameter declerationParameter){
        this.declerationParameter=(declerationParameter);
        this.addNodeChild(declerationParameter);
    }

    public DeclerationParameter getDeclerationParameter() {
        return declerationParameter;
    }

    @Override
    public String generate() {
        String s=declerationParameter.generate()+"{\n"+block.generate()+"}\n";
        return  s;
    }

    @Override
    public String toString() {
        return "Function{" +
                " parameters=" + declerationParameter+
                ", block=" + block +
                '}';
    }
}

