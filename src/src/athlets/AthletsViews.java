package src.athlets;

import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;

public class AthletsViews {

    public TitledPane TabCreator(String name, String content){
        TitledPane tp = new TitledPane();
        TabContent(tp,content);
        tp.setText(name);

        return tp;
    }

    public void TabContent(TitledPane tp,String content){
        tp.setContent(new Label("Sono figo e me ne vanto!"));
    }
}
