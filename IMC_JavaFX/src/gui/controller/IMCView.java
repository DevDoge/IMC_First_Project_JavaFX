/*
Autor: Lucas Ribeiro de Pádua
*/
package gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class IMCView implements Initializable {

    @FXML
    private TextField MassaID;

    @FXML
    private TextField AlturaID;

    @FXML
    private Label ResultadoID;

    @FXML
    private ImageView ImageID;

    @FXML
    private Button BotaoID;

    @FXML
    public void onButtonAction(){

        double massa = Double.parseDouble(MassaID.getText());
        double altura = Double.parseDouble(AlturaID.getText());

        double calculo = massa/Math.pow(altura,2);

        ResultadoID.setText(String.valueOf(calculo));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("/gui/imagem.jpg"));
        ImageID.setImage(image);
    }
}
