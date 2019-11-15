import java.util.Scanner;

public class Main {
            public static void main(String []args) {
                Game game= new Game();
                Scanner sc = new Scanner(System.in);
                game.instructions();
                System.out.println("Choose Difficulty");
                System.out.print("Type \"e\" for easy or \"h\" for hard difficulty here: ");
                if(sc.next().charAt(0)=='e') {
                    System.out.println("Do you want to start?");
                    System.out.print("Type \"y\" or \"n\" here: ");
                    char yOrn = sc.next().charAt(0);
                        game.easyMode(yOrn);
                } else {
                    System.out.println("Do you want to start?");
                    System.out.print("Type \"y\" or \"n\" here: ");
                    char yOrn= sc.next().charAt(0);
                    game.hardMode(yOrn);
                }
            }
        }