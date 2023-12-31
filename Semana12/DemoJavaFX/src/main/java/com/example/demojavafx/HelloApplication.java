package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        openWindow("hello-view.fxml");

    }

    public static void openWindow(String fxml){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
            Scene scene = new Scene(fxmlLoader.load(), 683, 384);
            Stage stage = new Stage();
            stage.setTitle("USER'S MANAGER APP");
            stage.setScene(scene);
              /*
                stage.setX(0);
                stage.setY(0);
               */
            stage.show();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch();
    }
}