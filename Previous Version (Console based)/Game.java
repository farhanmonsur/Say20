        import java.util.Scanner;
        import java.util.Random;
        public class Game {
            private Scanner sc= new Scanner(System.in);
            private Random faru= new Random();
            private int user, pc;
            private char yOrn;

            public void instructions(){
                System.out.println("Here's how to play!");
                System.out.println("One may count upto one or two  numbers per turn, and the numbers must be in counting order.");
                System.out.println("One must start with the number after the last one that the other one said.");
                System.out.println("For example, the first person can say '1' or '1', '2'");
                System.out.println("If the first person says '1','2', then the second person could say '3' or '3','4' and so on.");
                System.out.println("The first one to say '20' will win the game.");
                System.out.println(" ");
            } // prints out instructions to play

            public void easyMode(char yOrn){
                this.yOrn= yOrn;
                for(int i=1; ;i++) {
                    if (i>1){
                        this.yOrn='n';
                    }
                    randomPlay();
                }
            }

            public void hardMode(char yOrn){
                this.yOrn= yOrn;
                for(int i=1; ;i++) {
                    if (user==2||user==5||user==8||user==11||user==14||user==17||user==20||user==0){
                        if (i>1){
                            this.yOrn='n';
                        }
                        randomPlay();
                    } else {
                        pcSureWin(user, pc);
                    }

                }
            }

            private void pcSureWin(int user, int pc){
                if (user==pc+2){
                    this.pc=user+2;
                } else {
                    this.pc=user+1;
                }
                for(int i=1; ;i++) {
                    if(this.pc==20) {
                        System.out.println("My answer: "+this.pc);
                        System.out.println("I Win!!!");
                        System.exit(0);
                    }
                    System.out.println("My answer: "+this.pc);
                    System.out.println((this.pc+1)+" or "+(this.pc+2)+" ?");
                    System.out.print("Your answer: ");
                    user=sc.nextInt();
                    if(user==this.pc+1) {
                        this.pc=user+2;
                    }else if(user==this.pc+2) {
                        this.pc=user+1;
                    }else {
                        System.out.println("!!!Wrong answer!!!");
                    }
                }
            } // pc will answer following winning pattern

            private void randomPlay(){
                int pc=random_pc();
                if (user==19) {
                    System.out.println("My answer: 20");
                    System.out.println("I Win!!!");
                    System.exit(0);
                }
                if (user==20) {
                    System.out.println("You Win!!!");
                    System.exit(0);
                }
                if (user==21) {
                    System.out.println("None said \"20\"");
                    System.out.println("It's a Draw!!!");
                    System.exit(0);
                }
                if(pc==20) {
                    System.out.println("My answer: "+pc);
                    System.out.println("I Win!!!");
                    System.exit(0);
                }
                if (yOrn=='n'){
                    System.out.println("My answer: "+pc);
                } else {
                    pc=0;
                }
                System.out.println((pc+1)+" or "+(pc+2)+" ?");
                System.out.print("Your answer: ");
                user=wrongAnswerCheck(sc.nextInt(), pc);
            } // the game continues randomly

            private int random_pc(){
                    int random_choice = faru.nextInt(2);
                    int[] pc_answers = {user + 1, user + 2};
                    this.pc = pc_answers[random_choice];
                    return pc;
                } // generates a random answer for pc

            private int wrongAnswerCheck(int user, int pc){
                for(int i=1; ;i++) {
                    if(user==pc+1||user==pc+2) {
                        break;
                    }
                    System.out.println("!!!Wrong answer!!!");
                    System.out.println("My answer: "+this.pc);
                    System.out.println((this.pc+1)+" or "+(this.pc+2)+" ?");
                    System.out.print("Your answer: ");
                    user = sc.nextInt();
                }
                return user;
            } // in case user gives wrong answer multiple times

        }