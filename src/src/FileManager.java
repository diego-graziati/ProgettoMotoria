package src;

import src.athletes.AthletesViews;
import src.athletes.Measurements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileManager {
    final int numParameters=26;

    //It completely loads the entire atViews list
    public int listLoader(LinkedList<AthletesViews> atViews, String filePath) throws IOException {
        int i=0, numAthletes,j, numRows, countAthletes, k;
        countAthletes=0;
        numRows=0;
        numAthletes=0;
        String row;

        FileReader fileReader=new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        LinkedList<Measurements> measurements = new LinkedList<>();

        row=bufferedReader.readLine();
        String[] name = row.split(",");
        String[] surname = row.split(",",i+1);
        atViews.add(new AthletesViews());
        atViews.get(numAthletes).setName(new String(String.valueOf(name)));
        atViews.get(numAthletes).setSurname(new String(String.valueOf(surname)));
        System.out.print(name);
        System.out.print(surname);
        i++;
        numAthletes++;
        for (;(row=bufferedReader.readLine())!=null;i+=numParameters,numRows++){
            name = row.split(",");
            surname = row.split(",",i+1);
            System.out.print(name);
            System.out.print(surname);

            //checks if the athlete is already registered. Otherwise, it stores it
            if(!existenceChecker(new String(String.valueOf(name)), new String(String.valueOf(surname)),atViews,numAthletes)){
                atViews.add(new AthletesViews());
                atViews.get(numAthletes).setName(new String(String.valueOf(name)));
                atViews.get(numAthletes).setSurname(new String(String.valueOf(surname)));
                numAthletes++;
            }else{
                atViews.get(numAthletes).setNumVal(atViews.get(numAthletes).getNumVal()+1);
            }
        }

        //this cycle register each data
        for (i=1;i<numRows;i+=numParameters){
            for(k=0;k<atViews.get(countAthletes).numVal;k++, countAthletes++){
                measurements.add(new Measurements());

                for(j=2;j<numParameters;j++){
                    String regex=",";
                    String[] data;
                    int intData;
                    double dData;

                    switch (j){
                        case 2://testTypology
                            data = row.split(regex);
                            measurements.get(k).testTypology.add(new String(String.valueOf(data)));
                            break;
                        case 3://date
                            data = row.split(regex);
                            measurements.get(k).date.add(new String(String.valueOf(data)));
                            break;
                        case 4://hour
                            //it needs a special method for time conversion!
                            break;
                        case 5://impulse
                            data = row.split(regex);
                            measurements.get(k).impulse.add(new String(String.valueOf(data)));
                            break;
                        case 6://leftRight
                            data = row.split(regex);
                            measurements.get(k).leftRight.add(new String(String.valueOf(data)));
                            break;
                        case 7://flyTime
                            data = row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).flyTime.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 8://contTime
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).contTime.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 9://height
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).height.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 10://rhythm
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).rhythm.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 11://steps
                            data=row.split(regex);
                            try{
                                intData=Integer.parseInt(String.valueOf(data));
                                measurements.get(k).steps.add(intData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 12://speed
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).speed.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 13://acceleration
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).acceleration.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 14://distance
                            data=row.split(regex);
                            try{
                                intData=Integer.parseInt(String.valueOf(data));
                                measurements.get(k).distance.add(intData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 15://lope
                            data=row.split(regex);
                            try{
                                intData=Integer.parseInt(String.valueOf(data));
                                measurements.get(k).lope.add(intData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 16://stanceTime
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).stanceTime.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 17://stanceTimePerc
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).stanceTimePerc.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 18://contactPhase
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).contactPhase.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 19://contactPhasePerc
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).contactPhasePerc.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 20://footFlat
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).footFlat.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 21://footFlatPerc
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).footFlatPerc.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 22://propulsivePhase
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).propulsivePhase.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 23://propulsivePhasePerc
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).propulsivePhasePerc.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 24://contactTimePerc
                            data=row.split(regex);
                            try{
                                dData=Double.parseDouble(String.valueOf(data));
                                measurements.get(k).contactTimePerc.add(dData);
                            }catch(NumberFormatException nfe){
                                System.out.println("NumberFormatException: "+nfe.getMessage());
                            }
                            break;
                        case 25://note
                            data = row.split(regex);
                            measurements.get(k).note.add(new String(String.valueOf(data)));
                            break;
                    }
                }
            }
        }

        return numAthletes+1;
    }

    public boolean existenceChecker(String name, String surname,LinkedList<AthletesViews> atViews, int numAthletes){
        int i;

        if(numAthletes!=0){
            for (i=0;i<numAthletes;i++){
                if((atViews.get(i).getName().equals(name))&&(atViews.get(i).getSurname().equals(surname))){
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }
}
