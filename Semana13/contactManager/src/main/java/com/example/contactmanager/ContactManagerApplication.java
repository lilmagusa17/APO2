package com.example.contactmanager;

import com.example.contactmanager.control.ContactManagerController;
import com.example.contactmanager.control.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactManagerApplication extends Application {
    private MainWindowController viewController;

    public ContactManagerApplication(){
        viewController= new MainWindowController();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ContactManagerApplication.class.getResource("mainWindow.fxml"));
        //fxmlLoader.setController(viewController);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Contact Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}