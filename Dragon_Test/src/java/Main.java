import java.util.Scanner;

public class Main {
    public static int pick = 0;
    public static void main(String[] args) {
        // write your code here
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragons is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which cave will you go into? (1 or 2)");

            pick = scan.nextInt();

            if(pick==1 || pick == 2){
//                System.out.println("You approach the cave..\n\n"+
//                        "It is dark and spooky..\n\n" + "A large dragon jumps out in front of you! he opens his jaws and..\n\n" +
//                        "Gobbles you down in one bit!");
//            }else if(pick==2) {
//                System.out.println("you approach the cave..\n\n" + "Give you his treasure");
                getAnswer(pick);

            }
            else {
//                System.out.println("Game is over");
                getAnswer(pick);
                throw new Exception();
            }
        }catch (Exception e) {

            System.out.println("Your Entry is out of Range please write 1 or 2");
        }

    }
    public static String getAnswer(int num){
        switch (num){
            case 1:
              return "You approach the cave..\n\n"+
                      "It is dark and spooky..\n\n" + "A large dragon jumps out in front of you! he opens his jaws and..\n\n" +
                      "Gobbles you down in one bit!";
            case 2:
                return "you approach the cave..\n\n" + "Give you his treasure";

            default:
                return "Game is over";

        }
    }

}
