package AST.Declare;

import AST.Node.Node;

import java.util.ArrayList;

public class Declaration extends Node {
	private Type type;
	private ArrayList<String> IDs;
	private ArrayList<IAssignment> assignments;
	private boolean isConst;

	private String baseClassID, objetID,deffinationClassID;
	public Declaration() {
		this.IDs = new ArrayList<>();
		this.assignments = new ArrayList<>();
	}

	public String getObjetID() {
		return objetID;
	}

	public ArrayList<String> getIDs() {
		return IDs;
	}

	public ArrayList<IAssignment> getAssignments() {
		return assignments;
	}

	public void setObjetID(String objetID) {
		this.objetID = objetID;
	}

	public void setType(Type type) {
		this.type = type;
		this.addNodeChild(type);
	}
	
	public Type getType() {
		return this.type;
	}

	public boolean isConst() {
		return isConst;
	}

	public void setConst(boolean aConst) {
		isConst = aConst;
	}
	public void addID(String ID){
		this.IDs.add(ID);
	}

	public void addAssignment(IAssignment assignment){
		this.assignments.add(assignment);
		this.addNodeChild((Node) assignment);
	}

	public String getBaseClassID() {
		return baseClassID;
	}

	public void setBaseClassID(String baseClassID) {
		this.baseClassID = baseClassID;
	}

	public String getDeffinationClassID() {
		return deffinationClassID;
	}

	public void setDeffinationClassID(String deffinationClassID) {
		this.deffinationClassID = deffinationClassID;
	}

	@Override
	public String generate() {
		System.out.println("declaration generate");
		String s = "";
		if(isConst){
			s+="const ";
		} else {
			s+= "let ";
			if (type==null){
				s += objetID + " = new " + baseClassID + " ();\n";
				System.out.println("Declaration " + objetID +" = "+ baseClassID);
			}
		}
		for(int i = 0; i<IDs.size(); i++){
			s += IDs.get(i);
			if(i < IDs.size() -1) s += ",";
		}
		if(assignments.size() > 0 && IDs.size()>0) s += ",";
		for(int i = 0; i<assignments.size(); i++){
			s += assignments.get(i).generate();
			if(i < assignments.size() -1) s += ",";
		}
		return s;
	}

	public String generateWithoutType() {
		String s="";
			if (type==null)
				 s+=objetID;

		for(int i = 0; i<IDs.size(); i++){
			s += IDs.get(i);
			if(i < IDs.size() -1) s += ",";
		}
		if(assignments.size() > 0 && IDs.size()>0) s += ",";
		for(int i = 0; i<assignments.size(); i++){
			s += assignments.get(i).generate();
			if(i < assignments.size() -1) s += ",";
		}
		return s;
	}

	@Override
	public String toString() {
		return "Declaration{" +
				"type=" + type +
				", IDs=" + IDs +
				", assignments=" + assignments +
				", isConst=" + isConst +
				", baseClassID='" + baseClassID + '\'' +
				", objetID='" + objetID + '\'' +
				", deffinationClassID='" + deffinationClassID + '\'' +
				'}';
	}
}
