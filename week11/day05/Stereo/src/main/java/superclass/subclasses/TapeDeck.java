package superclass.subclasses;

import behaviours.ILoadMedia;
import behaviours.IPlay;
import behaviours.IStop;
import superclass.Component;

public class TapeDeck extends Component implements IPlay, IStop, ILoadMedia {

    private int numberOfTapeDecks;
    private String tapeLoaded;
    private Boolean isInUse;

    public TapeDeck(String make, String model, String colour, int numberOfTapeDecks){
        super(make, model, colour);
        this.numberOfTapeDecks = numberOfTapeDecks;
        this.tapeLoaded = null;
        this.isInUse = false;
    }

    public void play(){
       isInUse = true;
    }

    public void stop(){
        isInUse = false;
    }

    public void loadMedia(String mediaName, String mediaType){
        if(mediaType == "CD"){
            tapeLoaded = mediaName;
        }
    }

}
