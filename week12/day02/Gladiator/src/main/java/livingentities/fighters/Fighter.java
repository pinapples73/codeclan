package livingentities.fighters;

import livingentities.Participant;

public class Fighter extends Participant {

    private int strength;
    private int health;
    private int speed;



    public Fighter(String name, int strength, int health, int speed) {
        super(name);
        this.strength = strength;
        this.health = health;
        this.speed = speed;

    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }


}
