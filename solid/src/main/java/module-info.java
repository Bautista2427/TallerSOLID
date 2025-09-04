module co.edu.uniquindio.solid.solid {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.solid.solid to javafx.fxml;
    exports co.edu.uniquindio.solid.solid;
}