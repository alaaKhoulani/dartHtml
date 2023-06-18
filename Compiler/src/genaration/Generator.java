package genaration;

import AST.Class.Class;
import AST.Declare.Declaration;
import AST.Function.IFunction;
import AST.Program;

import java.util.ArrayList;

public class Generator {
    private static int pageNumber = 1;
    public static Page currentPage;
    private ArrayList<Page> pages = new ArrayList<>();
    private static Class currentClass;
    public void createHTMLPage(String name) {
        Page page = new Page(name + ".html");
        currentPage = page;
        pages.add(page);
        pageNumber++;
    }

    public void createJSPage(String name) {
        Page page = new Page(name + ".js");
        currentPage = page;
        pages.add(page);
    }


    public Page getCurrentPage() {
        return currentPage;
    }

    public void startGenerate(Program program) {
        this.createJSPage("dataGlobal");
        currentPage.writeOnFile(currentPage.getDataGlobal());
        currentPage.closeFile();

        this.createJSPage("stateGlobal");
        currentPage.writeOnFile(currentPage.getStateGlobal());
        currentPage.closeFile();

        this.createJSPage("global");

        String mainCode = program.getMain().generate() + "\n";
        System.out.println(mainCode);
        currentPage.writeOnFile(mainCode);

        String declarations = "";
        for (Declaration declaration : program.getDeclarations()) {
            declarations += declaration.generate() + "\n";
        }
        currentPage.writeOnFile(declarations);

        String functions = "";
        for (IFunction function : program.getFunctions()) {
            functions += function.generate() + "\n";
        }
        currentPage.writeOnFile(functions);

        for (Class clas : program.getClasses()) {
            String normalClass = "";
            if (!clas.isStateClass()) {
                normalClass += clas.generate();
                currentPage.writeOnFile(normalClass);
            }
        }
        currentPage.closeFile();

        for (Class clas : program.getClasses()) {
            if (clas.isStateClass()) {
                currentClass=clas;
                this.createHTMLPage(clas.getID());

                String scriptString = "<script src=\"./dataGlobal.js\"></script>\n<script src=\"./stateGlobal.js\"></script>";
                scriptString += "\t\t<script src=\"./global.js\">";
                scriptString += "</script>\n ";

                scriptString += "\t\t<script> ";
                scriptString += clas.generateScriptForStateClass();

                String bodyString = "";
                bodyString += "\t\t<body>\n";
                bodyString += "\t\t<center>\n";

                bodyString += clas.generateBodyForStateClass() + "\n";
                bodyString += "\t\t</center>\n";
                bodyString += "\t\t</body>\n";

                scriptString+=currentPage.getScript()+"\n";
                scriptString += currentPage.getOnLoad();
                scriptString += "}";
                scriptString += "</script>\n ";

                String classCode = "<!DOCTYPE html>\n";
                classCode += "<html lang=\"en\">\n";
                classCode += "\t <head>\n";
                classCode += scriptString;
                classCode += "\t </head>\n";
                classCode += bodyString;
                classCode += "</html>\n";
                currentPage.writeOnFile(classCode);
                currentPage.closeFile();
            }
        }
    }

    public static Class getCurrentClass() {
        return currentClass;
    }
}
