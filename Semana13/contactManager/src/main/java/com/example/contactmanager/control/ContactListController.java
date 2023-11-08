package com.example.contactmanager.control;

import com.example.contactmanager.model.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.contactmanager.control.ContactManagerController.contactManagerController;

public class ContactListController implements Initializable {

    @FXML
    private TableView<Contact> tvContactList;

    @FXML
    private TableColumn<Contact, String> tcName;

    @FXML
    private TableColumn<Contact, String> tcEmail;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Contact> observableList;
        observableList = FXCollections.observableArrayList(contactManagerController.getContacts());

        tvContactList.setItems(observableList);
        tcName.setCellValueFactory(new PropertyValueFactory<Contact,String>("name")); //the tableview search for a method called getName
        tcEmail.setCellValueFactory(new PropertyValueFactory<Contact,String>("email")); //the tableview search for a method called getEmail
    }
}
