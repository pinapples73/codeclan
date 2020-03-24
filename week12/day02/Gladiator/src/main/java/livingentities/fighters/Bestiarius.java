package livingentities.fighters;

import behaviours.IFight;

public class Bestiarius extends Fighter implements IFight {

    private String fightingClass;
    private String weapons;

    public Bestiarius(String name, int strength, int health, int speed, String fightingClass, String weapons){
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
        result += ". He throws his net over the beast and finished it with his pike.";
        return result;

    }
}
