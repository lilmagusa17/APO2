package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.model.Password;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StartViewController{

    @FXML
    private TextField p1;

    @FXML
    private TextField p2;

    @FXML
    private TextField p3;

    @FXML
    private TextField p4;

    @FXML
    private TextField p5;

    @FXML
    private TextField p6;

    @FXML
    private Button btn;

    @FXML
    public void abrirCaja(ActionEvent actionEvent) {
        String p1 = this.p1.getText();
        String p2 = this.p2.getText();
        String p3 = this.p3.getText();
        String p4 = this.p4.getText();
        String p5 = this.p5.getText();
        String p6 = this.p6.getText();

        if (PasswordController.getInstance().abrirCaja(p1, p2, p3, p4, p5, p6)) {
            HelloApplication.openWindow("content-view.fxml");

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("CAJA FUERTE");
            alert.setHeaderText("Error");
            alert.setContentText("Contraseña incorrecta");
            alert.showAndWait();
        }

    }



}