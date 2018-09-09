/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author nipun
 */
public class LoginController implements Initializable {

    @FXML
    private MediaView mediaView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Media media;
        media = new Media(this.getClass().getResource("/Video/bg.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.play();
    }    
    
}
