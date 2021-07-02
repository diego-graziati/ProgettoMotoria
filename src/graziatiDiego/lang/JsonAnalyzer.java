package graziatiDiego.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//The purpose of this class is to analyze a json file, and understand what's written inside.
//Everything MUST follow strict convention rules, so DO NOT change anything if you don't even know what this file is about!
public class JsonAnalyzer {

    private boolean fileOpener(String fileName){
        try{
            File inFile = new File(fileName);
            Scanner reader = new Scanner(inFile);
            return true;
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return false;
        }
    }

    public String fileNameComposer(String lang){
        String fullFileName=lang;

        fullFileName.concat(".json");
        System.out.print(fullFileName);

        if(fileOpener(fullFileName)){
            return fullFileName;
        }else{
            return "NULL";
        }
    }
}
