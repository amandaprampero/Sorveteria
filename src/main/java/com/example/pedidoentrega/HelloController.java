package com.example.pedidoentrega;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Classe controller da tela inicial.
 */
public class HelloController {
    @FXML
    private Button botao_login;

    @FXML
    private Button botao_cadastrar;

    @FXML
    private Button botao_cardapio;

    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Método para mudar para a tela de login.
     * @param e ActionEvent login
     */
    public void lidarLoginButton(ActionEvent e) {
        InterfaceUtil.chanceScenes(e,"log-in.fxml","Login");
    }

    /**
     * Método para mudar para a tela de cadastro.
     * @param e ActionEvent cadastrar
     */
    public void lidarCadastroButton(ActionEvent e) {
        InterfaceUtil.chanceScenes(e,"sign-up.fxml", "Cadastro");
    }

    /**
     * Método para mudar para a tela do cardápio.
     * @param e ActionEvent cardapio
     * @throws IOException
     */
    public void lidarCardapioButton(ActionEvent e) throws IOException {
        InterfaceUtil.chanceScenes(e,"cardapio.fxml", "Cardápio");
    }
}