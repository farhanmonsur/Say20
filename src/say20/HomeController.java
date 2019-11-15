package say20;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable {

    @FXML
    private AnchorPane home;

    @FXML
    private void HowToPlayButtonPushed() throws IOException{
        AnchorPane HowToPlay=FXMLLoader.load(getClass().getResource("resources/HowToPlay.fxml"));
        home.getChildren().setAll(HowToPlay);
    }

    @FXML
    private void StartGameButtonPushed() throws IOException{
        AnchorPane choose_difficulty= FXMLLoader.load(getClass().getResource("resources/ChooseDifficulty.fxml"));
        home.getChildren().setAll(choose_difficulty);

    }

    @FXML
    private void ExitButtonPushed() {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
