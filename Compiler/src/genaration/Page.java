package genaration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {
    private String pageName;
    protected FileWriter myWriter;
    private String script="";
    private String onLoad="window.onload = () => {";
    private String dataGlobal="let map;\n" +
            "if (localStorage.getItem(\"map\") != null) {\n" +
            "  const storedMap = localStorage.getItem(\"map\");\n" +
            "  map = new Map(JSON.parse(storedMap ));\n" +
            "}\n" +
            "else{\n" +
            "// if (map != null) {\n" +
            "  map = new Map();\n" +
            "  localStorage.setItem(\"map\", JSON.stringify(Array.from(map)));\n" +
            "}\n" +
            "\n" +
            "function setData(key, value) {\n" +
            "  console.log(\"key: \", key, value);\n" +
            "  let exist = false;\n" +
            "  map.forEach(function (value1, key1) {\n" +
            "    if (key === key1) {\n" +
            "      console.log(\"keyyyyyyyyyyyy: \", key, value);\n" +
            "      map.delete(key);\n" +
            "      console.log(\"valllllllllll\", value1);\n" +
            "      exist = true;\n" +
            "    }\n" +
            "  });\n" +
            "  // if (!exist) {\n" +
            "  map.set(key, value);\n" +
            "  // }\n" +
            "\n" +
            "  localStorage.setItem(\"map\", JSON.stringify(Array.from(map)));\n" +
            "  console.log(\"set func :\", localStorage.getItem(\"map\"));\n" +
            "}\n" +
            "  localStorage.setItem(\"map\", JSON.stringify(Array.from(map)));\n" +
            "  console.log(\"set func :\", localStorage.getItem(\"map\"));\n" +
            "\n" +
            "\n" +
            "function getData(key) {\n" +
            "  const storedMap = localStorage.getItem(\"map\");\n" +
            "  console.log(\"storedMap :\", storedMap);\n" +
            "  let map1 = new Map(JSON.parse(storedMap || \"[]\"));\n" +
            "  let arr = [];\n" +
            "  map1.forEach(function (value1, key1) {\n" +
            "    if (key === key1) {\n" +
            "      arr = value1;\n" +
            "      return;\n" +
            "    }\n" +
            "  });\n" +
            "  return arr;\n" +
            "}\n";

    private String stateGlobal="let mapState;\n" +
            "if (localStorage.getItem(\"mapState\") != null) {\n" +
            "  const storedMap = localStorage.getItem(\"mapState\");\n" +
            "  mapState = new Map(JSON.parse(storedMap ));\n" +
            "}\n" +
            "else{\n" +
            "// if (map != null) {\n" +
            "  mapState = new Map();\n" +
            "  localStorage.setItem(\"mapState\", JSON.stringify(Array.from(mapState)));\n" +
            "}\n" +
            "\n" +
            "function setState(key, value) {\n" +
            "  console.log(\"key: \", key);\n" +
            "  let exist = false;\n" +
            "  mapState.forEach(function (value1, key1) {\n" +
            "    if (key === key1) {\n" +
            "      let ok=false;\n" +
            "      value1.forEach((v ,i)=>{\n" +
            "          if(v==value){\n" +
            "            ok=true;\n" +
            "            return;\n" +
            "          }\n" +
            "      })\n" +
            "      if(!ok){\n" +
            "        value1.push(value);\n" +
            "      }      \n" +
            "      exist = true;\n" +
            "    }\n" +
            "  });\n" +
            "  if (!exist) {\n" +
            "    mapState.set(key, [value]);\n" +
            "  }\n" +
            "  \n" +
            "\n" +
            "  const keys = mapState.keys();\n" +
            "  const values = mapState.values();\n" +
            "  console.log(\"set func :\",keys, values,  JSON.stringify(Array.from(mapState)));\n" +
            "  localStorage.setItem(\"mapState\", JSON.stringify(Array.from(mapState)));\n" +
            "}\n" +
            "\n" +
            "function getState(key) {\n" +
            "  const storedMap = localStorage.getItem(\"mapState\");\n" +
            "  console.log(\"storedMap :\", storedMap);\n" +
            "  let map1 = new Map(JSON.parse(storedMap || \"[]\"));\n" +
            "  let arr = [];\n" +
            "  map1.forEach(function (value1, key1) {\n" +
            "    console.log(\"frome set state valu1 : \" ,value1)\n" +
            "    if (key === key1) {\n" +
            "      arr =value1;\n" +
            "      return;\n" +
            "    }\n" +
            "  });\n" +
            "  return arr;\n" +
            "}\n";
    private File file;


    public String getScript() {
        return script;
    }
    public void addToScript(String code){
        this.script+=code+"\n";
    }

    public Page(String pageName ){
        this.pageName=pageName;
        try {
            String filePath = "output/"+pageName;

            // Create a File object
            file = new File(filePath);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            myWriter=  new FileWriter("output\\"+pageName);
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public String getDataGlobal() {
        return dataGlobal;
    }

    public String getStateGlobal() {
        return stateGlobal;
    }

    public void addToOnLoad(String code){
        onLoad+=code;
    }

    public void writeOnFile(String code){
        try {
            System.out.println(file.isFile());
            System.out.println(file.getName());
            myWriter.write(code);
            System.out.println("test write on file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void closeFile(){
        try {
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getOnLoad() {
        return onLoad;
    }
}
