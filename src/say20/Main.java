package say20;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage homeStage) throws Exception {
        Parent homeParent = FXMLLoader.load(getClass().getResource("resources/Home.fxml"));
        Scene homeScene = new Scene(homeParent);
        homeStage.setTitle("Say20");
        homeStage.setScene(homeScene);
        homeStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
