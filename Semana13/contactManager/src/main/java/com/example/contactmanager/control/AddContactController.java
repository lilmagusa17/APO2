package com.example.contactmanager.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddContactController {
    @FXML
    private TextField txtName;

    @FXML
    private TextField txtEmail;
    @FXML
    private Label labMsg;

    @FXML
    public void addContact(ActionEvent event) {
        //add contact in the model
        ContactManagerController.getContactManagerController().contactManagerController.addContact(txtName.getText(),txtEmail.getText());

        //clean the fields in the gui
        txtName.setText("");
        txtEmail.setText("");

        //show the success message
        labMsg.setText("The contact was added succesfully!");
    }
}
