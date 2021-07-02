package graziatiDiego.controllers;

import graziatiDiego.FileManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import graziatiDiego.athletes.AthletesViews;

import java.io.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.Objects;
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

    LinkedList<AthletesViews> atView = new LinkedList<>();

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

        fileLoaderBut.isSelected();
    }

    private void accordionInitializer(Accordion acc){
        acc.prefWidthProperty().bind(static_scrollPaneViews.widthProperty());
    }

    public void fLoaderButOnAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile=fileChooser.showOpenDialog(null);

        if(selectedFile!=null){
            System.out.println("File caricato con successo!");
        }else{
            System.out.println("File non caricato!");
        }

        int i, numAthletes, j;

        FileManager fileManager = new FileManager(Objects.requireNonNull(selectedFile).getPath());
        try {
            numAthletes=fileManager.listLoader(atView);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            numAthletes=0;
        }

        for(i=0;i<numAthletes;i++){
            System.out.print(atView.get(i).name+" ");
            System.out.println(atView.get(i).surname);
            for(j=0;j<atView.get(i).getNumVal();j++){
                System.out.println("\t"+atView.get(i).measurements.getAcceleration());
                System.out.println("\t"+atView.get(i).measurements.getSpeed());
                System.out.println("\t"+atView.get(i).measurements.getSteps());
                System.out.println("\t"+atView.get(i).measurements.getContactPhase());
            }

            static_accViews.getPanes().add(atView.get(i).TabCreator());
        }
    }
}
