package livingentities.fighters;

public class Hoplomachus extends Fighter{

    private String fightingClass;
    private String weapons;

    public Hoplomachus(String name, int strength, int health, int speed, String fightingClass, String weapons){
        super(name, strength, health, speed);
        this.fightingClass = fightingClass;
        this.weapons = weapons;
    }

    public String getFightingClass() {
        return fightingClass;
    }

    public String getWeapons() {
        return weapons;

    }

    public String fight(){
        String result = getName() + " the " + getFightingClass() + " attacks with " + getWeapons();
        result += ". She Deflects the first attack with her shield then follows up with a blow to the head with her sword.";
        return result;

    }
}
