package AST;

import java.util.ArrayList;
import AST.Class.Class;
import AST.Declare.Declaration;
import AST.Function.IFunction;
import AST.Node.Node;
import SymbolTable.SymbolTable;

public class Program extends Node{
	private MainFunction main;
	private ArrayList<Class> classes;
	private ArrayList<IFunction> functions;
	private ArrayList<Declaration> declarations;

	public Program() {
		classes = new ArrayList<>();
		functions = new ArrayList<>();
		declarations = new ArrayList<>();
	}
	public void addClass(Class c) {
		classes.add(c);
		this.addNodeChild(c);
	}

	public void addFunction(IFunction c) {
		functions.add(c);
		this.addNodeChild((Node) c);
	}

	public void addDeclaration(Declaration c) {
		declarations.add(c);
		this.addNodeChild(c);
	}
	public void setMain(MainFunction main){
		this.main = main;
//		}
		this.addNodeChild(main);
	}
	public MainFunction getMain(){
		return this.main;
	}

	@Override
	public String generate() {
		String s=main.generate()+"\n";
		String sD="";
		for (Declaration declaration : declarations){
			sD+=declaration.generate()+"\n";
		}
		String StringClassrs="";
		for (Class classs:classes){
			StringClassrs+=classs.generate()+"\n";
		}
		String fu="";
		for (IFunction function :functions){
			fu+=function.generate()+"\n";
		}
		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDEEEEEEEEEEEEEEEECCCCCCCCCCCLLLLLLLLLLLLLLLLLLLLLLLLLL");
		System.out.println(sD);
		System.out.println("MAAAAAAAINNNNNNNNNNNNNNNNNNNNNN");
		System.out.println(s);
		System.out.println("CCCCCCCCCCCCCCCCCCCCCLLLLLLLLLLLLLLLLLLLAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println(StringClassrs);
		System.out.println("FFFFFFFFFFFFFUUUUUUUUUUUUUNNNNNNNNNNNNNNNNNCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCc");
		System.out.println(fu);
		return s;

	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public ArrayList<IFunction> getFunctions() {
		return functions;
	}

	public ArrayList<Declaration> getDeclarations() {
		return declarations;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(main);
		stringBuilder.append("\n");
		for (Class c : classes) {
			stringBuilder.append(c);
			stringBuilder.append("\n");
		}
		for (IFunction c : functions) {
			stringBuilder.append(c);
			stringBuilder.append("\n");
		}
		for (Declaration c : declarations) {
			stringBuilder.append(c);
			stringBuilder.append("\n");
		}
        return stringBuilder.toString();
	}

}
