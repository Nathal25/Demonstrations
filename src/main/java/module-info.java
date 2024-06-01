module com.example.demostraciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demostraciones to javafx.fxml;
    opens com.example.demostraciones.controller to javafx.fxml;
    exports com.example.demostraciones;
}