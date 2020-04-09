package superclass.subclasses;

import behaviours.ILoadMedia;
import behaviours.IPlay;
import behaviours.IStop;
import superclass.Component;

public class Radio extends Component implements IPlay, IStop {

    private Boolean isInUse;
    private String channel;

    public Radio(String make, String model, String colour){
        super(make, model, colour);
        this.isInUse = false;
        this.channel = null;
    }


    public String tune(String channel){
        this.channel = channel;
        return "You are tuned to " + channel + "!";
    }

    public void play(){
        isInUse = true;
    }

    public void stop(){
        isInUse = false;
    }



}


