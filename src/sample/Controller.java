package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class Controller {

    @FXML
    private Label labelHello;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtEmail;

    @FXML
    void onHelloButton(ActionEvent event) {
        String userName = txtName.getText();
        String hello = userName.isEmpty()? "Привет!":String.format("Привет, %s", userName);
        labelHello.setText(hello);
    }

    @FXML
    void onRegistration(ActionEvent event) {
        String err = "";
        if (txtName.getText().isEmpty()) err += "Имя не указано";
        if (txtEmail.getText().isEmpty()) err += "Email не указан";
        if (!err.isEmpty()) {
            labelHello.setText(err);
            labelHello.setTextFill(Color.RED);
        } else{
            labelHello.setText("Вы зарегистрированы");
            labelHello.setTextFill(Color.BLACK);
        }
    }

}
