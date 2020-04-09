package stereostuff;

import behaviours.IConnect;
import superclass.subclasses.CDPlayer;
import superclass.subclasses.GraphicEQ;
import superclass.subclasses.Radio;
import superclass.subclasses.RecordDeck;

public class Stereo implements IConnect {

    private String stereoName;
    private int volume;
    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;
    private GraphicEQ graphicEQ;

    public Stereo(String stereoName){
        this.stereoName = stereoName;
        this.volume = 5;
    }

    public String connect(){
        return this.stereoName;
    }

    public void addRadio(String make, String model, String colour){
        radio = new Radio(make, model, colour);
    }

    public void addRecordDeck(String make, String model, String colour){
        recordDeck = new RecordDeck(make, model, colour);
    }

    public void addCDPlayer(String make, String model, String colour){
        cdPlayer = new CDPlayer(make, model, colour);
    }

    public void addGraphicEQ(String make, String model, String colour){
        graphicEQ = new GraphicEQ(make, model, colour);
    }

    public void turnUpVolume(){
        if(volume <=11) {
            volume += 1;
        }
    }

    public void turnDownVolume(){
        if(volume > 0){
            volume -= 1;
        }
    }

    public void tuneRadio(String channel){
        if(radio != null) {
            radio.tune(channel);
        }
    }

    public void loadCDPlayer(String mediaName, String mediaType){
        if(cdPlayer != null){
            cdPlayer.loadMedia(mediaName, mediaType);
        }
    }

    public void playCDPlayer(){
        if(cdPlayer != null){
            cdPlayer.play();
        }
    }

    public void stopCDPlayer(){
        if(cdPlayer != null){
            cdPlayer.play();
        }
    }

    // TODO: 24/03/2020 add remaining methods from other components

}
