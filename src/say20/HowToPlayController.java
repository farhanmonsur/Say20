package say20;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class HowToPlayController implements Initializable {

    @FXML
    private AnchorPane howtoplay;

    @FXML
    private void GoBackButtonPushed() throws IOException{
        AnchorPane go_back= FXMLLoader.load(getClass().getResource("resources/Home.fxml"));
        howtoplay.getChildren().setAll(go_back);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) { }

}
