package superclass.subclasses;

import behaviours.ILoadMedia;
import behaviours.IPlay;
import behaviours.IStop;
import superclass.Component;

public class CDPlayer extends Component implements IPlay, IStop, ILoadMedia {

    private String diskLoaded;
    private Boolean isInUse;

    public CDPlayer(String make, String model, String colour){
        super(make, model, colour);
        this.isInUse = false;
        this.diskLoaded = null;
    }


    public void play(){
        this.isInUse = true;
    }

    public void stop(){
        isInUse = false;
    }

    public void loadMedia(String mediaName, String mediaType){
        if(mediaType == "CD"){
            diskLoaded = mediaName;
        }
    }


}
