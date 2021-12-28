import java.util.ArrayList;

public class Human extends Humanoid{
    ArrayList<String> inventory;

    public Human(String name){
        try {
            setName(name);
            setHealth(900);
            setAttack(8);
            setDefense(10);
            setLuck(3);
            setGold(0);
            setLevel(1);
            inventory = new ArrayList<>();
            inventory.add("Empty");
        }catch (Exception e){
            System.out.println("Failed to create Human Object.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        try{
            return "Human: {" +
                    " Name: " + this.getName() +
                    ", Level: " + this.getLevel() +
                    ", Health: " + this.getHealth() +
                    ", Attack: " + this.getAttack() +
                    ", Defense: " + this.getDefense()+
                    ", Luck: " + this.getLuck() +
                    ", Inventory: " + this.inventory +
                    ", Gold: " + this.getGold() +
                    "}";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Failed to print Human object.";
        }
    }
}