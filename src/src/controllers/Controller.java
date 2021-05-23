package src.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import src.athletes.AthletesViews;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

//In this class all the events triggered in the mainPage.fxml are coded
public class Controller implements Initializable{

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
        LinkedList<AthletesViews> atView = new LinkedList<>();

        int i;

        for(i=0;i<50;i++){
            atView.add(new AthletesViews());
            atView.get(i).name="Ciao";

            static_accViews.getPanes().add(atView.get(i).TabCreator());
        }


    }

    private void accordionInitializer(Accordion acc){
        acc.prefWidthProperty().bind(static_scrollPaneViews.widthProperty());
    }

    public String fLoaderButOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile=fileChooser.showOpenDialog(null);

        if(selectedFile!=null){
            System.out.println("File caricato con successo!");
        }else{
            System.out.println("File non caricato!");
        }

        return selectedFile.getPath();
    }
}
