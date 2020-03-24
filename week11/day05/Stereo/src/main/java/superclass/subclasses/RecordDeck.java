package superclass.subclasses;

import behaviours.ILoadMedia;
import behaviours.IPlay;
import behaviours.IStop;
import superclass.Component;

public class RecordDeck extends Component implements IPlay, IStop, ILoadMedia {

    private int playSpeed;
    private String recordOnDeck;
    private Boolean isInUse;

    public RecordDeck(String make, String model, String colour){
        super(make, model, colour);
        this.playSpeed = playSpeed;
        this.recordOnDeck = null;
        this.isInUse = false;
    }

    public void play(){
        isInUse = true;
    }

    public void stop(){
        isInUse = false;
    }

    public void loadMedia(String mediaName, String mediaType, int mediaSpeed){
        recordOnDeck = mediaName;

    }

}
