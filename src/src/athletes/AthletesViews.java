package src.athletes;

import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

import java.util.LinkedList;

//In this class I set up the the whole "Athletes' views" tab environment. It is meant to be used dynamically
public class AthletesViews {

    private static GridPane static_content;

    public String name;
    public String surname;
    public int numVal=0;

    static TableView<Measurements> tableView = new TableView();

    //Here I create a single TitledPane and set it up
    public TitledPane TabCreator(){
        TitledPane tp = new TitledPane();
        TabContent(tp,this.static_content);
        tp.setText(this.name);

        return tp;
    }

    //Here I set up the content of a single TitledPane
    private void TabContent(TitledPane tp,GridPane content){

        tp.setContent(content);
    }

    //Here I create the table of values where all data are going to be displaced
    public static void setStatic_content() {

        AthletesViews.static_content.add(tableView,0,0,2,1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TableView<Measurements> getTableView() {
        return tableView;
    }

    public static void setTableView(TableView<Measurements> tableView) {
        AthletesViews.tableView = tableView;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumVal() {
        return numVal;
    }

    public void setNumVal(int numVal) {
        this.numVal = numVal;
    }
}
