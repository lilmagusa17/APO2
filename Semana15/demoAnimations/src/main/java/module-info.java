module com.demoanimations.demoanimations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demoanimations.demoanimations to javafx.fxml;
    exports com.demoanimations.demoanimations;
    exports com.demoanimations.demoanimations.control;
    opens com.demoanimations.demoanimations.control to javafx.fxml;
}