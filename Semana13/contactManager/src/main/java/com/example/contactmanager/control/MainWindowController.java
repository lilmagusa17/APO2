package com.example.contactmanager.control;

import com.example.contactmanager.ContactManagerApplication;
import com.example.contactmanager.model.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private BorderPane mainPanel;

    @FXML
    private TableView<Contact> tvContactList;

    @FXML
    private TableColumn<Contact, String> tcName;

    @FXML
    private TableColumn<Contact, String> tcEmail;



    private ContactManagerController contactManagerController;

    public MainWindowController() {
        contactManagerController = ContactManagerController.getContactManagerController();
    }



    @FXML
    public void loadAddContact(ActionEvent event) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add-contact.fxml"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ContactManagerApplication.class.getResource("add-contact.fxml"));

        BorderPane addContactPane = (BorderPane) loader.load();
        mainPanel.getChildren().clear();
        mainPanel.setTop(addContactPane);
    }

    @FXML
    public void loadContactList(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ContactManagerApplication.class.getResource("contact-list.fxml"));

        BorderPane addContactPane = (BorderPane) loader.load();
        mainPanel.getChildren().clear();
        mainPanel.setTop(addContactPane);

    }



    @FXML
    public void showAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Contact Manager");
        alert.setHeaderText("Credits");
        alert.setContentText("Juan Reyes\nAlgorithms II");

        alert.showAndWait();
    }
}