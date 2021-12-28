public class Humanoid {

    private String name;
    private int health, attack, defense, luck, gold, level;

    public Humanoid() {

    }

    public String getName() {
        try{
            return name;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Failed to get name.";
        }
    }

    public void setName(String name) {
        try{
            this.name = name;
        }catch (Exception e){
            System.out.println("Failed to set name.");
            System.out.println(e.getMessage());
        }
    }

    public int getHealth() {
        try{
            return health;
        }catch (Exception e){
            System.out.println("Failed to get health.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setHealth(int health) {
        try{
            this.health = health;
        }catch (Exception e){
            System.out.println("Failed to set health.");
            System.out.println(e.getMessage());
        }
    }

    public int getAttack() {
        try{
            return attack;
        }catch (Exception e){
            System.out.println("Failed to get Attack.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setAttack(int attack) {
        try{
            this.attack = attack;
        }catch (Exception e){
            System.out.println("Failed to set attack.");
            System.out.println(e.getMessage());
        }
    }

    public int getDefense() {
        try{
            return defense;
        }catch (Exception e){
            System.out.println("Failed to get defence.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setDefense(int defense) {
        try{
            this.defense = defense;
        }catch (Exception e){
            System.out.println("Failed to set defense.");
            System.out.println(e.getMessage());
        }
    }

    public int getLuck() {
        try{
            return luck;
        }catch (Exception e){
            System.out.println("Failed to get luck.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setLuck(int luck) {
        try{
            this.luck = luck;
        }catch (Exception e){
            System.out.println("Failed to set luck.");
            System.out.println(e.getMessage());
        }
    }

    public int getGold() {
        try{
            return gold;
        }catch (Exception e){
            System.out.println("Failed to get gold.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setGold(int gold) {
        try{
            this.gold = gold;
        }catch (Exception e){
            System.out.println("Failed to set gold.");
            System.out.println(e.getMessage());
        }
    }

    public int getLevel(){
        try{
            return level;
        }catch (Exception e){
            System.out.println("Failed to get level.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void setLevel(int level){
        try{
            this.level = level;
        }catch (Exception e){
            System.out.println("Failed to set level.");
            System.out.println(e.getMessage());
        }
    }

    public void combat(Humanoid defender) {

        try{
            System.out.println("Combat initiated between " + this.getName() + " and " + defender.getName());
            System.out.println(this.getName() + " begins the fight with " + this.getHealth() + " health.");
            System.out.println(defender.getName() + " begins the fight with " + defender.getHealth() + " health.");

            while (defender.getHealth() > 0 && this.getHealth() > 0) {

                int thisAttack = 10 * (RandomNum.generator(1, 6) * ((this.getAttack() / defender.getDefense()) * this.getLuck()));
                int defAttack = 10 * (RandomNum.generator(1, 6) * ((defender.getAttack() / this.getDefense()) * defender.getLuck()));

                if (thisAttack <= 0){
                    thisAttack = RandomNum.generator(2, 4) * (10 * this.getLuck());
                }
                if (defAttack <= 0){
                    defAttack = RandomNum.generator(2, 4) * (10 * defender.getLuck());
                }
                if(this.getHealth() > 0){
                    defender.setHealth(defender.getHealth() - thisAttack);
                    if (defender.getHealth() > 0) {
                        System.out.println(this.getName() + " attacked " + defender.getName() + " for " + thisAttack + " damage. "
                                + defender.getName()
                                + " now has " + defender.getHealth() + " health");
                    } else {
                        System.out.println(this.getName() + " attacked " + defender.getName() + " for " + thisAttack + " damage.");
                        System.out.println(defender.getName() + " has no health left.");
                        System.out.println(this.getName() + " has defeated " + defender.getName() + " in combat.");
                    }
                }
                if(defender.getHealth() > 0){
                    this.setHealth(this.getHealth() - defAttack);

                    if (defender.getHealth() > 0) {
                        System.out.println(defender.getName() + " attacked " + this.getName() + " for " + defAttack + " damage. "
                                + this.getName()
                                + " now has " + this.getHealth() + " health");
                    } else {
                        System.out.println(defender.getName() + " attacked " + this.getName() + " for " + defAttack + " damage.");
                        System.out.println(this.getName() + " has no health left.");
                        System.out.println(defender.getName() + " has defeated " + this.getName() + " in combat.");
                    }
                }
            }
            if (defender.getHealth() <= 0 || this.getHealth() <= 0) {
                if (defender.getHealth() <= 0) {
                    System.out.println(defender.getName() + " has died, you are victorious!.");
                } else {
                    System.out.println(this.getName() + " has died. Game over.");
                }
            }
        }catch (Exception e){
            System.out.println("Failed to initiate combat.");
            System.out.println(e.getMessage());
        }
    }
}