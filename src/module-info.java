module src{
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens graziatiDiego to javafx.graphics;

    exports graziatiDiego;
    exports graziatiDiego.controllers;
    opens graziatiDiego.controllers to javafx.graphics;
}