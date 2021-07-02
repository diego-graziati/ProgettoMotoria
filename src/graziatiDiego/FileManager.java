package graziatiDiego;

import graziatiDiego.athletes.AthletesViews;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileManager {
    //final int arrayInitializer=2000;
    final int numParameters=26;

    String filePath;

    //Class constructor
    public FileManager(String filePath){
        this.filePath=filePath;
    }

    //It completely loads the entire atViews list
    public int listLoader(LinkedList<AthletesViews> atViews) throws IOException, InterruptedException {
        System.out.println("Data reading has started!");

        int numAthletes,j, countAthletes, k, actualRow;
        final String regex = ",";
        countAthletes=0;
        numAthletes=0;
        String row;
        final String noData="nd";

        System.out.println("Actual start!");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String[] data;
        k=0;
        System.out.println("First initialization!");
        while((row=bufferedReader.readLine())!=null){
            data = row.split(regex);

            //k here symbolizes the first CSV line, which is useless, so I skip it and I don't store what is inside it.
            if(k!=0) {
                //checks if the athlete is already registered. Otherwise, it stores it
                if (!existenceChecker(String.valueOf(data[0]), String.valueOf(data[1]), atViews, numAthletes)) {
                    atViews.add(new AthletesViews());
                    atViews.get(numAthletes).setName(String.valueOf(data[0]));
                    atViews.get(numAthletes).setSurname(String.valueOf(data[1]));
                    atViews.get(numAthletes).setNumVal(1);
                    System.out.println("New athlete initialized.");
                    atViews.get(numAthletes).measurements.testTypology.add("");
                    atViews.get(numAthletes).measurements.date.add("");
                    atViews.get(numAthletes).measurements.hour.add("");
                    atViews.get(numAthletes).measurements.impulse.add("");
                    atViews.get(numAthletes).measurements.leftRight.add("");
                    atViews.get(numAthletes).measurements.flyTime.add(0.0);
                    atViews.get(numAthletes).measurements.contactPhase.add(0.0);
                    atViews.get(numAthletes).measurements.height.add(0.0);
                    atViews.get(numAthletes).measurements.rhythm.add(0.0);
                    atViews.get(numAthletes).measurements.steps.add(0);
                    atViews.get(numAthletes).measurements.speed.add(0.0);
                    atViews.get(numAthletes).measurements.acceleration.add(0.0);
                    atViews.get(numAthletes).measurements.distance.add(0);
                    atViews.get(numAthletes).measurements.lope.add(0);
                    atViews.get(numAthletes).measurements.stanceTime.add(0.0);
                    atViews.get(numAthletes).measurements.stanceTimePerc.add(0.0);
                    atViews.get(numAthletes).measurements.contactPhase.add(0.0);
                    atViews.get(numAthletes).measurements.contactPhasePerc.add(0.0);
                    atViews.get(numAthletes).measurements.footFlat.add(0.0);
                    atViews.get(numAthletes).measurements.footFlatPerc.add(0.0);
                    atViews.get(numAthletes).measurements.propulsivePhase.add(0.0);
                    atViews.get(numAthletes).measurements.propulsivePhasePerc.add(0.0);
                    atViews.get(numAthletes).measurements.contactTimePerc.add(0.0);
                    atViews.get(numAthletes).measurements.note.add("");
                    numAthletes++;
                    System.out.println("Athlete's parameters initialized as well.");
                } else {
                    //initialization
                    atViews.get(numAthletes-1).setNumVal(atViews.get(numAthletes-1).getNumVal() + 1);
                    atViews.get(numAthletes-1).measurements.testTypology.add("");
                    atViews.get(numAthletes-1).measurements.date.add("");
                    atViews.get(numAthletes-1).measurements.hour.add("");
                    atViews.get(numAthletes-1).measurements.impulse.add("");
                    atViews.get(numAthletes-1).measurements.leftRight.add("");
                    atViews.get(numAthletes-1).measurements.flyTime.add(0.0);
                    atViews.get(numAthletes-1).measurements.contactPhase.add(0.0);
                    atViews.get(numAthletes-1).measurements.height.add(0.0);
                    atViews.get(numAthletes-1).measurements.rhythm.add(0.0);
                    atViews.get(numAthletes-1).measurements.steps.add(0);
                    atViews.get(numAthletes-1).measurements.speed.add(0.0);
                    atViews.get(numAthletes-1).measurements.acceleration.add(0.0);
                    atViews.get(numAthletes-1).measurements.distance.add(0);
                    atViews.get(numAthletes-1).measurements.lope.add(0);
                    atViews.get(numAthletes-1).measurements.stanceTime.add(0.0);
                    atViews.get(numAthletes-1).measurements.stanceTimePerc.add(0.0);
                    atViews.get(numAthletes-1).measurements.contactPhase.add(0.0);
                    atViews.get(numAthletes-1).measurements.contactPhasePerc.add(0.0);
                    atViews.get(numAthletes-1).measurements.footFlat.add(0.0);
                    atViews.get(numAthletes-1).measurements.footFlatPerc.add(0.0);
                    atViews.get(numAthletes-1).measurements.propulsivePhase.add(0.0);
                    atViews.get(numAthletes-1).measurements.propulsivePhasePerc.add(0.0);
                    atViews.get(numAthletes-1).measurements.contactTimePerc.add(0.0);
                    atViews.get(numAthletes-1).measurements.note.add("");
                    System.out.println("New row of parameters for the same athlete initialized. Num Val: "+atViews.get(numAthletes-1).getNumVal());
                }
            }else{
                k=1;
            }
            System.out.println("Num Athletes: "+numAthletes);
            Thread.sleep(5000);
        }

        numAthletes++;

        //this cycle register each data
        for(;countAthletes<numAthletes;countAthletes++) {
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath));
            //k is the position of the cursor in the csv file, while actualRow is the position of the cursor inside the LinkedList of the "countAthletes".
            for (k = 0, actualRow=0; k < atViews.get(countAthletes).numVal; k++) {
                row=bufferedReader1.readLine();
                data = row.split(regex);

                //This control checks whether the row pointed by k actually contains data of that athlete, or not. To check that, I compare both the name and surname saved in the "countAthletes"
                //position of the LinkedList "atViews" with the 0 and 1 position of the row examined.
                if(k>0 && ((atViews.get(countAthletes).getName().equals(data[1])) && (atViews.get(countAthletes).getSurname().equals(data[0])))) {
                    for (j = 2; j < numParameters; j++) {
                        int intData;
                        double dData;

                        switch (j) {
                            case 2://testTypology
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.testTypology.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.testTypology.get(actualRow).replaceAll("",null);
                                break;
                            case 3://date
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.date.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.date.get(actualRow).replaceAll("",null);
                                break;
                            case 4://hour
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.hour.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.hour.get(actualRow).replaceAll("",null);
                                break;
                            case 5://impulse
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.impulse.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.impulse.get(actualRow).replaceAll("",null);
                                break;
                            case 6://leftRight
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.leftRight.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.leftRight.get(actualRow).replaceAll("",null);
                                break;
                            case 7://flyTime
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.flyTime.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.flyTime.set(actualRow,null);
                                }
                                break;
                            case 8://contTime
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.contTime.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.contTime.set(actualRow,null);
                                }
                                break;
                            case 9://height
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.height.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.height.set(actualRow,null);
                                }
                                break;
                            case 10://rhythm
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.rhythm.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.rhythm.set(actualRow,null);
                                }
                                break;
                            case 11://steps
                                if (!data[j].equals(noData)){
                                    intData = Integer.parseInt(data[j]);
                                    atViews.get(countAthletes).measurements.steps.set(actualRow,intData);
                                }else{
                                    atViews.get(countAthletes).measurements.steps.set(actualRow,null);
                                }
                                break;
                            case 12://speed
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.speed.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.speed.set(actualRow,null);
                                }
                                break;
                            case 13://acceleration
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.acceleration.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.acceleration.set(actualRow,null);
                                }
                                break;
                            case 14://distance
                                if (!data[j].equals(noData)){
                                    intData = Integer.parseInt(data[j]);
                                    atViews.get(countAthletes).measurements.distance.set(actualRow,intData);
                                }else{
                                    atViews.get(countAthletes).measurements.distance.set(actualRow,null);
                                }
                                break;
                            case 15://lope
                                if (data[j].equals(noData)){
                                    intData = Integer.parseInt(data[j]);
                                    atViews.get(countAthletes).measurements.lope.set(actualRow,intData);
                                }else{
                                    atViews.get(countAthletes).measurements.lope.set(actualRow,null);
                                }
                                break;
                            case 16://stanceTime
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.stanceTime.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.stanceTime.set(actualRow,null);
                                }
                                break;
                            case 17://stanceTimePerc
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.stanceTimePerc.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.stanceTimePerc.set(actualRow,null);
                                }
                                break;
                            case 18://contactPhase
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.contactPhase.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.contactPhase.set(actualRow,null);
                                }
                                break;
                            case 19://contactPhasePerc
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.contactPhasePerc.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.contactPhasePerc.set(actualRow,null);
                                }
                                break;
                            case 20://footFlat
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.footFlat.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.footFlat.set(actualRow,null);
                                }
                                break;
                            case 21://footFlatPerc
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.footFlatPerc.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.footFlatPerc.set(actualRow,null);
                                }
                                break;
                            case 22://propulsivePhase
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.propulsivePhase.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.propulsivePhase.set(actualRow,null);
                                }
                                break;
                            case 23://propulsivePhasePerc
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.propulsivePhasePerc.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.propulsivePhasePerc.set(actualRow,null);
                                }
                                break;
                            case 24://contactTimePerc
                                if (!data[j].equals(noData)){
                                    dData = Double.parseDouble(data[j]);
                                    atViews.get(countAthletes).measurements.contactTimePerc.set(actualRow,dData);
                                }else{
                                    atViews.get(countAthletes).measurements.contactTimePerc.set(actualRow,null);
                                }
                                break;
                            case 25://note
                                if (!data[j].equals(noData))
                                    atViews.get(countAthletes).measurements.note.get(actualRow).replaceAll("",data[j]);
                                else
                                    atViews.get(countAthletes).measurements.note.get(actualRow).replaceAll("",null);
                                break;
                        }
                    }

                    actualRow++;
                }
            }
        }

        System.out.println("Caricamento dati atleti completato!");

        return numAthletes;
    }

    public boolean existenceChecker(String name, String surname,LinkedList<AthletesViews> atViews, int numAthletes){
        int i;

        if(numAthletes!=0){
            for (i=0;i<numAthletes;i++){
                if((name.equals(atViews.get(i).getName()))&&(surname.equals(atViews.get(i).getSurname()))){
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }

    //setters
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
