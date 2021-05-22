package src;

import src.athletes.AthletesViews;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

public class FileManager {
    public void listLoader(LinkedList<AthletesViews> atViews, int numAthlets, String filePath) throws FileNotFoundException {
        int i;
        FileReader fileReader=new FileReader(filePath);

        for (i=0;i<numAthlets;i++){
            //atViews.get(i).content.
        }
    }
}
