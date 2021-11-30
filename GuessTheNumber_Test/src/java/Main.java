import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public  class Main {
        public static Scanner scan = new Scanner(System.in);
        static int generateRandomNum() {
            return ThreadLocalRandom.current().nextInt(1, 20);
        }
        static boolean isRespond(int guess, int realNum){
            if(guess < realNum){
                System.out.println("Your Guess is too Low!");
            }
            else if (guess > realNum){
                System.out.println("Your Guess is too High!");
            }
            else{
                System.out.println("Congratulation You Won The Game!");
                return true;
            }
            return false;
        }
        static String getUsername(){
            System.out.println("Hello! What is your name?");
            return scan.nextLine();
        }
        static Integer guessTheNumber(){
            System.out.println("Take a guess.");
            return scan.nextInt();
        }
        static boolean playAgainTheGame(){
            System.out.println("Do you want to play again");
            return isPlayAgain(scan.nextLine());

        }
        static boolean isPlayAgain(String yes){
            if(yes.startsWith("y")){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            String name = getUsername();
            System.out.println("Hello," + name + ", I am thinking of a number between 1 and 20");
            int secNumber = generateRandomNum();
            while (true){
                if(isRespond(guessTheNumber(),secNumber)){

                    if(!playAgainTheGame()){
                        break;
                    }
                    secNumber = generateRandomNum();
                }
            }

        }
    }


