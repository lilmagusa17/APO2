package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import com.example.demojavafx.model.Password;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChangePasswordViewController {


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
    private TextField c1;

    @FXML
    private TextField c2;

    @FXML
    private TextField c3;

    @FXML
    private TextField c4;

    @FXML
    private TextField c5;

    @FXML
    private TextField c6;

    @FXML
    private Button btnCambiar;

    @FXML
    private Button btnClose;

    public void cambiarContra(ActionEvent actionEvent) {
        String actual = this.p1.getText()+this.p2.getText()+this.p3.getText()+this.p4.getText()+this.p5.getText()+this.p6.getText();
        String nueva = this.c1.getText()+this.c2.getText()+this.c3.getText()+this.c4.getText()+this.c5.getText()+this.c6.getText();

       //logica: si la contraseña actual es correcta,
        // que sea diferente a la nueva y si lo es, cambiarla,
        // volver a la Start window y
        // poder acceder con la nueva contraseña (setKeyKord)

        if(PasswordController.getInstance().getPassword().equals(actual) && !PasswordController.getInstance().getPassword().equals(nueva)){
            PasswordController.getInstance().setPassword(nueva);
            cerrarCaja(actionEvent);

        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("CAJA FUERTE");
            alert.setHeaderText("Error");
            alert.setContentText("Contraseña incorrecta");
            alert.showAndWait();
        }

    }

    public void cerrarCaja(ActionEvent actionEvent) {

        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
