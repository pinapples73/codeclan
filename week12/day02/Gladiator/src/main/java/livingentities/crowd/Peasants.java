package livingentities.crowd;

import behaviours.ICheer;
import livingentities.Participant;

public class Peasants extends Participant implements ICheer {

    private Boolean rebellious;

    public Peasants(String name) {
        super(name);
        this.rebellious = true;
    }

    public Boolean getRebellious() {
        return rebellious;
    }

    public void changeRebellious(){
        rebellious = !rebellious;
    }

    public String cheer(){
        return "The peasants cheers for the underdog.";
    }
}
