package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.control.UserController;
import com.example.demojavafx.model.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private UserController userController;


    @FXML
    private TableView<User>  userTableView;


    @FXML
    private TableColumn<User, String> nameTC;

    @FXML
    private TableColumn<User, String> idTC;

    @FXML
    private TableColumn<User, Integer> ageTC;

    @FXML
    private Button addUserBtn;

    @FXML
    protected void onAddUser() {

        HelloApplication.openWindow("table-window.fxml");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nameTC.setCellValueFactory(new PropertyValueFactory<>("name")); //patron factory method
        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        ageTC.setCellValueFactory(new PropertyValueFactory<>("age"));

        userTableView.setItems(userController.getInstance().getUsers());

    }
}