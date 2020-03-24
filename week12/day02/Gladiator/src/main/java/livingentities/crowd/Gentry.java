package livingentities.crowd;

import behaviours.ICheer;
import livingentities.Participant;

public class Gentry extends Participant implements ICheer {

    private Boolean bored;

    public Gentry(String name){
        super(name);
        this.bored = true;
    }

    public Boolean getBored() {
        return bored;
    }

    public void changeBoredom(){
        bored = !bored;
    }

    public String cheer(){
        return "The gentry cheers for the renowned.";
    }
}
