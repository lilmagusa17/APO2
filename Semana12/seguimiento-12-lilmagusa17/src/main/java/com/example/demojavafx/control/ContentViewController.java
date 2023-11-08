package com.example.demojavafx.control;

import com.example.demojavafx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

//TODO fixed by avillota
public class ContentViewController implements Initializable {

    @FXML
    private TextArea textArea;


    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    public ContentViewController() {
        //textArea = new TextArea();

    }


    @FXML
    public void changePassword(ActionEvent actionEvent) {
        HelloApplication.openWindow("changePassword-view.fxml");
        Stage stage = (Stage) btn1.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void close(ActionEvent actionEvent) {

        String content = this.textArea.getText();
        PasswordController.getInstance().setContent(content);

        Stage stage = (Stage) btn2.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textArea.setText(PasswordController.getInstance().getContent());
    }
}
