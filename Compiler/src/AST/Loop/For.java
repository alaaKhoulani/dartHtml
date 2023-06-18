package AST.Loop;

import AST.BinaryOperation.IBinaryOperation;
import AST.Block.Block;
import AST.Condition.ICondition;
import AST.Declare.LiteralAssignment;
import AST.Declare.Declaration;
import AST.Node.Node;

import java.util.ArrayList;

public class For extends Node {
    private Declaration initWithDeclare;
    private ArrayList< LiteralAssignment > initWithAssignment;
    private ICondition condition;
    private IBinaryOperation operation;
    private Block block;

    public void setInitWithDeclare(Declaration initWithDeclare) {
        this.initWithDeclare = initWithDeclare;
        this.addNodeChild(initWithDeclare);
    }

//    public void setInitWithAssignment(LiteralAssignment initWithAssignment) {
//        this.initWithAssignment = initWithAssignment;
//        this.addNodeChild(initWithAssignment);
//    }

    public Declaration getInitWithDeclare() {
        return initWithDeclare;
    }

//    public LiteralAssignment getInitWithAssignment() {
//        return initWithAssignment;
//    }

    public ArrayList<LiteralAssignment> getInitWithAssignment() {
        return initWithAssignment;
    }

    public void addInitWithAssignment(LiteralAssignment initWithAssignment) {
        this.initWithAssignment.add(initWithAssignment);
    }

    public ICondition getCondition() {
        return condition;
    }

    public void setCondition(ICondition condition) {
        this.condition = condition;
        this.addNodeChild((Node) condition);
    }

    public IBinaryOperation getOperation() {
        return operation;
    }

    public void setOperation(IBinaryOperation operation) {
        this.operation = operation;
        this.addNodeChild((Node) operation);
    }

    public Block getBlock() {
        return block;
    }

    public void setBody(Block block) {
        this.block = block;
        this.addNodeChild(block);
    }

    @Override
    public String generate() {
        String s="for(";
        if (initWithDeclare!=null){
            s+=initWithDeclare.generate();
        }
        for (int i=0;i<initWithAssignment.size();i++){
            s+=initWithAssignment.get(i).generate();
            if(i<initWithAssignment.size()-1) s+=" , ";
        }
        s+=";"+condition.generate()+";"+ operation.generate()+")" ;
        s+=block.generate();

        return s;

    }

    @Override
    public String toString() {
        return "For{" +
                "initWithDeclare=" + initWithDeclare +
                ", initWithAssignment=" + initWithAssignment +
                ", condition=" + condition +
                ", operation=" + operation +
                ", block=" + block +
                '}';
    }
}
