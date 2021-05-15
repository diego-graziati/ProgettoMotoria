package src.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//The purpose of this class is to analyze a json file, and understand what's written inside.
//Everything MUST follow strict convention rules, so DO NOT change anything if you don't even know what this file is about!
public class JsonAnalyzer {

    public int fileOpener(String fileName){
        try{
            File inFile = new File(fileName);
            Scanner reader = new Scanner(inFile);
            return 1;
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return 0;
        }
    }

    public int fileNameComposer(String lang){
        String fullFileName=lang;

        fullFileName.concat(".json");
        System.out.print(fullFileName);

        return fileOpener(fullFileName);
    }
}
