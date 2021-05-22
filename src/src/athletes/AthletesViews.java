package src.athletes;

import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

//In this class I set up the the whole "Athletes' views" tab environment. It is meant to be used dynamically
public class AthletesViews {

    public String name;

    private static GridPane static_content;

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
        AthletesViews.static_content.add(new TableView<Measurements>(),0,0,2,1);
    }

}
