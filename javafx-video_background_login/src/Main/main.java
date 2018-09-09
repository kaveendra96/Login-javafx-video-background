/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nipun
 */
public class main extends Application {
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws IOException {
       this.stage=primaryStage;
       mainWindow();
    }
    
    private void mainWindow() throws IOException{
        FXMLLoader loder=new FXMLLoader(main.class.getResource("../View/login.fxml"));
        AnchorPane pane=loder.load();
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
