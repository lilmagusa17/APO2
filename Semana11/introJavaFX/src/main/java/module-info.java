module com.example.introjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.introjavafx to javafx.fxml;
    exports com.example.introjavafx;
}