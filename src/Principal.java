

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import visao.Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5725089
 */
public class Principal extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) throws Exception {
        Pane principal = FXMLLoader.load(getClass().getResource("visao/Projeto.fxml"));
        Scene cena = new Scene(principal);
        palco.setScene(cena);
        palco.show();
    }
    
}
