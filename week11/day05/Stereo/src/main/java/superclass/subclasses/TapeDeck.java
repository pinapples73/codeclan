package superclass.subclasses;

import behaviours.IPlay;
import superclass.Component;

public class TapeDeck extends Component implements IPlay {

    private int numberOfTapeDecks;
    private String tapeLoaded;
    private Boolean isInUse;

    public TapeDeck(String make, String model, String colour, int numberOfTapeDecks){
        super(make, model, colour);
        this.numberOfTapeDecks = numberOfTapeDecks;
        this.tapeLoaded = tapeLoaded;
        this.isInUse = false;
    }

    public void play(){
       isInUse = true;
    }

}
