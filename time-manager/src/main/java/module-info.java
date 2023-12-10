module com.example.timemanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;

    opens com.example.timemanager to javafx.fxml;
    exports com.example.timemanager;
}