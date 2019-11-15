package say20;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ChooseTurnController implements Initializable {
    GameplayController game = new GameplayController();

    @FXML
    private AnchorPane choose_turn;

    @FXML
    private void GoBackButtonPushed() throws IOException{
        AnchorPane go_back= FXMLLoader.load(getClass().getResource("resources/ChooseDifficulty.fxml"));
        choose_turn.getChildren().setAll(go_back);
    }

    @FXML
    private void YesButtonPushed() throws IOException {
        game.pc=0;
        AnchorPane gameplay= FXMLLoader.load(getClass().getResource("resources/Gameplay.fxml"));
        choose_turn.getChildren().setAll(gameplay);
    }

    @FXML
    private void NoButtonPushed() throws IOException {
        game.random_pc();
        AnchorPane Gameplay= FXMLLoader.load(getClass().getResource("resources/Gameplay.fxml"));
        choose_turn.getChildren().setAll(Gameplay);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) { }

}
