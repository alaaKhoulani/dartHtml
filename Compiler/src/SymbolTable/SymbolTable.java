package SymbolTable;

import Main.Main;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    private ArrayList<Scope> scopes = new ArrayList<>();
    private static ArrayList<String> classess=new ArrayList<>();

    private static ArrayList<String> specialFunction = new ArrayList<>();
    private Stack<Scope> scopeStack = new Stack<>();
    private Scope requiredScope=null;
    private boolean ok=true;

    public SymbolTable(){
        specialFunction.add("setState");
        specialFunction.add("runApp");
    }

    public static void addClass(String clas){
        classess.add(clas);
    }
    public static ArrayList<String> getClassess(){
        return classess;
    }

    public static boolean searchForClass(String clas){
        return classess.contains(clas);
    }

    public static boolean searchInSpecialFuncations(String function){
        return specialFunction.contains(function);
    }
    public static ArrayList getSpecialFunction(){
        return specialFunction;
    }
    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }
    public Scope getScopeByName(String string){
        ok=true;
        requiredScope=null;
        getScopeByName1( string);
        return requiredScope;
    }
    public void getScopeByName1(String name){
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (s.empty()){
            return;
        }
        Scope x = s.pop();
        if(x.getName().equals(name) && ok){
            ok=false;
            requiredScope =x;
        }
        s.push(x);
//        Stack <Scope> temp=new Stack<>();
//        Stack <Scope> myStack=new Stack<>();
//       while (!scopeStack.isEmpty()){
//           Scope scope=scopeStack.pop();
//           temp.push(scope);
//           myStack.push(scope);
//       }
//       while (!temp.isEmpty()){
//           scopeStack.push(temp.pop());
//       }
//       System.out.println("size: "+myStack.size());
//       while (!myStack.isEmpty()){
//           Scope scope=myStack.pop();
//           System.out.println(scope.getName());
//           if ((scope.getName().equals(name))){
//               System.out.println("done");
//               return scope;
//           }
//       }
//       return null;
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

}
