package livingentities.fighters;

import behaviours.IFight;

public class Cestus extends Fighter implements IFight {

        private String fightingClass;
        private String weapons;

        public Cestus(String name, int strength, int health, int speed, String fightingClass, String weapons){
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
        result += ". He punches with his right then his left. His opponent falls to the floor.";
        return result;

    }
}
