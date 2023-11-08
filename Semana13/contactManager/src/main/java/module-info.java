module com.example.contactmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contactmanager to javafx.fxml;
    exports com.example.contactmanager;

    //Actualizaciones del módulo
    exports com.example.contactmanager.control;
    exports com.example.contactmanager.model;

    opens com.example.contactmanager.control to javafx.fxml;
}