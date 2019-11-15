package say20;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class GameplayController implements Initializable {
    private Random faru= new Random();
    public static int user, pc, trap;
    public static String answer;
    public static String result;
    public static char mode;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pc_label.setText(Integer.toString(pc));
        buttonOne.setText(Integer.toString(pc+1));
        buttonTwo.setText(Integer.toString(pc+2));

    }

    @FXML
    AnchorPane gameplay;
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Label pc_label;

    @FXML
    private void ButtonOnePushed() throws IOException {
        if(mode=='e'){
            easyMode(1);
        }else {
            hardMode(1);
        }
        endGame();
        setText();
    }

    @FXML
    private void ButtonTwoPushed() throws IOException {
        if(mode=='e'){
            easyMode(2);
        }else {
            hardMode(2);
        }
        endGame();
        setText();
    }

    private void easyMode(int button) {
        user = pc+button;
        random_pc();
    }

    private void hardMode(int button) {
        user = pc+button;
        if(pc==2){
            trap++;
        }
        if(trap==0){
            if (user==2||user==5||user==8||user==11||user==14||user==17||user==20||user==0){
                random_pc();
            }else {
                trap(user, pc);
                trap++;
            }
        }else{
            if(button==1){
                pc= user+2;
            }else{
                pc= user+1;
            }
        }
    }

    private void endGame() throws IOException {
        if (user==19) {
            answer= "My Answer: 20";
            result= "I WIN!!!";
            result();
        }
        if (user==20) {
            answer= "";
            result= "YOU WIN!!!";
            result();
        }
        if (user==21) {
            answer= "None said \"20\"";
            result= "It's a Draw!!!";
            result();
        }
        if(pc==20) {
            answer= "My Answer: 20";
            result= "I WIN!!!";
            result();
        }
    }

    private void setText(){
        pc_label.setText(Integer.toString(pc));
        buttonOne.setText(Integer.toString(pc+1));
        buttonTwo.setText(Integer.toString(pc+2));
    }

    private void result() throws IOException{
        AnchorPane result= FXMLLoader.load(getClass().getResource("resources/Result.fxml"));
        gameplay.getChildren().setAll(result);
    }

    public void random_pc(){
        int random_choice = faru.nextInt(2);
        int[] pc_answers = {user + 1, user + 2};
        pc = pc_answers[random_choice];
    } // generates a random answer for pc

    private void trap(int user, int pc){
        if (user==pc+2){
            this.pc=user+2;
        } else {
            this.pc=user+1;
        }
    }

}
