module src{
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens src to javafx.graphics;

    exports src;
    exports src.controllers;
    opens src.controllers to javafx.graphics;
}