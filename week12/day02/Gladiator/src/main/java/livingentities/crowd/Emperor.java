package livingentities.crowd;

import livingentities.Participant;

public class Emperor extends Participant {

    private Boolean satisfied;

    public Emperor(String name, Boolean satisfied){
        super(name);
        this.satisfied = satisfied;
    }

    public Boolean getSatisfied() {
        return satisfied;
    }

    public void changeSatisfied(){
        satisfied = !satisfied;
    }
}
