package com.example.demojavafx.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TableWindowController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField ageTextField;

    @FXML
    private Button btn;

    public void onAddUser(ActionEvent actionEvent) {

        String name = nameTextField.getText();
        String id = idTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());

        UserController.getInstance().addUser(name, id, age);

        Stage stage = (Stage) btn.getParent().getScene().getWindow();

        //btn.getScene().getWindow().hide();

        stage.close();



    }


}
