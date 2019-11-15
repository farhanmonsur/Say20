package say20;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ResultController implements Initializable {

    GameplayController game= new GameplayController();

    @FXML
    private Label result;

    @FXML
    private Label answer;

    @FXML
    private AnchorPane resultpane;

    @FXML
    private void GoBackButtonPushed() throws IOException{
        game.pc=0;
        game.user=0;
        game.trap=0;
        AnchorPane go_home= FXMLLoader.load(getClass().getResource("resources/Home.fxml"));
        resultpane.getChildren().setAll(go_home);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        answer.setText(game.answer);
        result.setText(game.result);
    }

}
