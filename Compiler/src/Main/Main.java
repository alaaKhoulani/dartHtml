package Main;

import AST.Node.Node;
import AST.Program;
import AST.Visitor.Visitor;
import ErrorCheck.ErrorCheck;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import genaration.Generator;
import grammars.DartLexer;
import grammars.DartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static Logger logger = Logger.getLogger("MyLog");

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static SymbolTable symbolTable = new SymbolTable();
    public static int errorCount = 0;


    public static ErrorCheck errorCheck = new ErrorCheck();

    public static void main(String[] args) throws IOException {

        FileHandler fh;
        try {
            fh = new FileHandler("ErrorsLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
//            Genarator g=new Genarator();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
//        String source = "Files/newTest.txt";
        String source = "Files/sample1.txt";
        CharStream cs = fromFileName(source);
        DartLexer lexer = new DartLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        DartParser parser = new DartParser(token);
        ParseTree tree = parser.program();
        Visitor firstScan = new Visitor();
        Program program = (Program) firstScan.visit(tree);

        File directory = new File("E:\\University\\Fourth\\term 2\\compiler\\Compiler\\output");
        File[] files = directory.listFiles();
        for (File file : files) {
            file.delete();
        }

        Generator generator = new Generator();
        generator.startGenerate(program);
        System.out.println("================================");
        DFS_print(program);
        System.out.println("*****************************************************");
//        BFS_print(program);
        //-------------------------- Symbol Table -------------------------------------
        System.out.println("=========================================================");
        System.out.println("Number of Scopes in the program : " + Scope.getContId());
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                symbol.print();
                System.out.println();
            }
        }
        System.out.println("=========================================================");
    }

    public static void BFS_print(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(Main.TEXT_PURPLE + "_________________________________________________________________________________");
            System.out.println(Main.ANSI_YELLOW + "Parent: ");
            currentNode.printNode();
            System.out.println(Main.TEXT_PURPLE + "_________________________________________________________________________________");

            ArrayList<Node> children = currentNode.getChildren();
            System.out.println(Main.TEXT_BLUE + "Children Number: " + children.size());
            for (int i = 0; i < children.size(); i++) {
                children.get(i).printNode();
                queue.add(children.get(i));
            }
        }
    }

    public static void DFS_print(Node node) {
        node.printNode();
        ArrayList<Node> children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            DFS_print(children.get(i));
        }
    }
}