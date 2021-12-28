import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    public void play(){
        try{
            boolean playAgain = true;

            Scanner scan = new Scanner(System.in);
            System.out.println("What Is Your Name!");
            String setName = scan.nextLine().trim();

            Human humanPlayer = new Human(setName);

            while (playAgain) {
                Land outerLand = new Land(6, 6);

                ArrayList<String> gobNames = new ArrayList<>();

                gobNames.add("Dobbins");
                gobNames.add("Sunder");
                gobNames.add("Bumble");
                gobNames.add("Nok");
                gobNames.add("Gop");
                gobNames.add("Dragan");
                gobNames.add("Ole Scratch");
                gobNames.add("Draco");


                if (humanPlayer.inventory.contains("Lucky Horse Shoe")){
                    humanPlayer.setLuck(4);
                }
                if (humanPlayer.inventory.contains("Great Sword of Death")){
                    humanPlayer.setAttack(10);
                }

                if (humanPlayer.inventory.contains("Shield of Unyielding Vigor")){
                    humanPlayer.setDefense(11);
                }


                int randomNumber = RandomNum.generator(0, (gobNames.size() - 1));

                Goblin goblinOne = new Goblin(gobNames.get(randomNumber));

                goblinOne.setLevel(humanPlayer.getLevel() + 1);

                System.out.println(goblinOne);
                System.out.println(humanPlayer);

                int firstGoblin = 5;
                int secondGoblin = RandomNum.generator(0, 5);
                int firstHuman = 0;
                int secondHuman = RandomNum.generator(0, 5);

                System.out.println(goblinOne.getName() + " begins on 'x': " + (firstGoblin + 1) + " 'y': " + (secondGoblin + 1) + ".");
                System.out.println(humanPlayer.getName() + " begins on 'x': " + (firstHuman + 1) + " 'y': " + (secondHuman + 1) + ".");

                outerLand.setPlayer(firstHuman, secondHuman);
                outerLand.setDead(firstGoblin, secondGoblin);
                outerLand.printBoard();

                while ((!Objects.equals(firstGoblin, firstHuman)) || (!Objects.equals(secondGoblin, secondHuman))) {
                    Land land = new Land(6, 6);
                    Land combat = new Land(6, 6);

                    if(humanPlayer.getHealth() < 900){

                        humanPlayer.setHealth((int) (humanPlayer.getHealth() + (900 * .20)));

                        if(humanPlayer.getHealth() >= 900){
                            System.out.println(humanPlayer.getName() + " is now at full health.");
                        }else{
                            System.out.println(humanPlayer.getName() + " regains " + ((int) (900 * .20)) + " health, and now has "
                                    + humanPlayer.getHealth() + " health.");
                        }
                    }

                    if(humanPlayer.getHealth() > 900){
                        humanPlayer.setHealth(900);
                    }

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("If there is a goblin next to your position you may press (f) to initiate combat.");
                    System.out.println("Otherwise, will you go North (n), East (e), South (s), or West (w)? ");
                    String playerInput = scanner.nextLine();

                    if (!Objects.equals(firstGoblin, firstHuman)) {
                        if (firstGoblin > firstHuman) {
                            firstGoblin = firstGoblin - 1;
                        } else {
                            firstGoblin = firstGoblin + 1;
                        }
                    } else {
                        if (secondGoblin > secondHuman) {
                            secondGoblin = secondGoblin - 1;
                        } else {
                            secondGoblin = secondGoblin + 1;
                        }
                    }

                    if (Objects.equals(playerInput, "e") || Objects.equals(playerInput, "w")) {
                        if (playerInput.equals("e")) {
                            firstHuman = firstHuman - 1;
                        } else {
                            firstHuman = firstHuman + 1;
                        }
                    } else if (Objects.equals(playerInput, "n") || Objects.equals(playerInput, "s")) {
                        if (playerInput.equals("n")) {
                            secondHuman = secondHuman - 1;
                        } else {
                            secondHuman = secondHuman + 1;
                        }
                    } else if (playerInput.equals("f")) {
                        System.out.println("You have forfeited your move and prepare for combat.");
                    } else {
                        System.out.println("Invalid choice. You lose a turn");
                    }

                    System.out.println(goblinOne.getName() + " chose 'x': " + (firstGoblin + 1) + " 'y': " + (secondGoblin + 1) + ".");
                    System.out.println(humanPlayer.getName() + " chose 'x': " + (firstHuman + 1) + " 'y': " + (secondHuman + 1) + ".");

                    if (!Objects.equals(firstHuman, firstGoblin) || !Objects.equals(secondHuman, secondGoblin)) {
                        land.setPlayer(firstHuman, secondHuman);
                        land.setDead(firstGoblin, secondGoblin);
                        land.printBoard();
                    } else if (Objects.equals(firstHuman, firstGoblin) && Objects.equals(secondHuman, secondGoblin)) {
                        combat.setCombat(firstHuman, secondHuman);
                        combat.printBoard();
                    }
                }
                humanPlayer.combat(goblinOne);

                if (humanPlayer.getHealth() <= 0){
                    break;
                }

                if(!goblinOne.inventory.contains("Empty")){
                    if (humanPlayer.inventory.contains("Empty")){
                        humanPlayer.inventory.remove(0);
                        humanPlayer.inventory.add(goblinOne.inventory.get(0));

                        System.out.println(goblinOne.getName() + " drops a " + goblinOne.inventory.get(0) + ".");
                        System.out.println("You pick it up and place it in your bag.");
                    }else if (humanPlayer.inventory.contains(goblinOne.inventory.get(0))){
                        System.out.println(goblinOne.getName() + " drops nothing useful. However, you find " + goblinOne.getGold() + " gold.");
                        humanPlayer.setGold(humanPlayer.getGold() + goblinOne.getGold());
                        System.out.println("You place it into your coin purse, and now have " + humanPlayer.getGold() + " gold.");
                    }else{
                        humanPlayer.inventory.add(goblinOne.inventory.get(0));
                        System.out.println(goblinOne.getName() + " drops a " + goblinOne.inventory.get(0) + ".");
                        System.out.println("You pick it up and place it in your bag.");
                    }

                }else {
                    System.out.println(goblinOne.getName() + " drops nothing useful. However, you find " + goblinOne.getGold() + " gold.");
                    humanPlayer.setGold(humanPlayer.getGold() + goblinOne.getGold());
                    System.out.println("You place it into your coin purse, and now have " + humanPlayer.getGold() + " gold.");
                }

                System.out.println("You gain a level.");
                humanPlayer.setLevel(humanPlayer.getLevel() + 1);
                System.out.println("You are now level " + humanPlayer.getLevel() + "!");

                Scanner keepPlaying = new Scanner(System.in);
                System.out.println("Would you like to play again? (y or n)");
                String again = keepPlaying.nextLine();

                if(Objects.equals(again, "n")){
                    playAgain = false;
                }else if(!Objects.equals(again, "y")){
                    System.out.println("Invalid choice. Game over.");
                    playAgain = false;
                }
            }
        }catch (Exception e){
            System.out.println("Failed to initialize game.");
            System.out.println(e.getMessage());
        }
    }
}