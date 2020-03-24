package superclass.subclasses;

import behaviours.IPlay;
import superclass.Component;

public class CDPlayer extends Component implements IPlay {

    private int numberOfDisks;
    private int disksLoaded;
    private Boolean isInUse;

    public CDPlayer(String make, String model, String colour, int numberOfDisks){
        super(make, model, colour);
        this.numberOfDisks = numberOfDisks;
        this.isInUse = false;
    }

    public void play(){
        this.isInUse = true;
    }




}
