package src.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import src.athlets.AthletsViews;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

//In this class all the events triggered in the mainPage.fxml are coded
public class Controller implements Initializable {

    @FXML
    public Tab fileLoaderTab;
    @FXML
    public Label fileLoaderLab;
    @FXML
    public ToggleButton fileLoaderBut;
    @FXML
    public Tab athletesViewsTab;
    @FXML
    public AnchorPane ancPaneViews;
    @FXML
    public ScrollPane scrollPaneViews;
    @FXML
    public Accordion accViews;


    public static Tab static_fileLoaderTab;
    public static Label static_fileLoaderLab;
    public static ToggleButton static_fileLoaderBut;
    public static Tab static_athletesViewsTab;
    public static AnchorPane static_ancPaneViews;
    public static ScrollPane static_scrollPaneViews;
    public static Accordion static_accViews;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        static_fileLoaderTab=fileLoaderTab;
        static_fileLoaderLab=fileLoaderLab;
        static_fileLoaderBut=fileLoaderBut;
        static_athletesViewsTab=athletesViewsTab;
        static_ancPaneViews=ancPaneViews;
        static_scrollPaneViews=scrollPaneViews;
        static_accViews=accViews;

        accordionInitializer(static_accViews);
        LinkedList<AthletsViews> atView = new LinkedList<>();

        int i;

        for(i=0;i<50;i++){
            String s = new String(Integer.toString(i));
            atView.add(new AthletsViews());

            static_accViews.getPanes().add(atView.get(i).TabCreator(s,"Sono figo e me ne vanto!"));
        }
    }

    public void accordionInitializer(Accordion acc){
        acc.prefWidthProperty().bind(static_scrollPaneViews.widthProperty());
    }
}
