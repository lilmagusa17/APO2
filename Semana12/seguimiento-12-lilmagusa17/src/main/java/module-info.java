module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demojavafx to javafx.fxml;
    exports com.example.demojavafx;
    exports com.example.demojavafx.control;
    exports com.example.demojavafx.model;

    opens com.example.demojavafx.control to javafx.fxml;
}