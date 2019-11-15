package say20;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ChooseDifficultyController implements Initializable {
    GameplayController game = new GameplayController();

    @FXML
    private AnchorPane choose_difficulty, choose_turn;

    @FXML
    private void GoBackButtonPushed() throws IOException{

        AnchorPane go_back= FXMLLoader.load(getClass().getResource("resources/Home.fxml"));
        choose_difficulty.getChildren().setAll(go_back);
    }

    @FXML
    private void EasyButtonPushed() throws IOException {
        game.mode='e';
        choose_turn = FXMLLoader.load(getClass().getResource("resources/ChooseTurn.fxml"));
        choose_difficulty.getChildren().setAll(choose_turn);
    }

    @FXML
    private void HardButtonPushed() throws IOException {
        game.mode='h';
        choose_turn = FXMLLoader.load(getClass().getResource("resources/ChooseTurn.fxml"));
        choose_difficulty.getChildren().setAll(choose_turn);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
