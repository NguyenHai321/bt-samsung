module com.example.t6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.t6 to javafx.fxml;
    exports com.example.t6;
}