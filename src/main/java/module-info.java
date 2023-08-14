module com.example.shapy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapy to javafx.fxml;
    exports com.example.shapy;
}