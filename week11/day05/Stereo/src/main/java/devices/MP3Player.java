package devices;

import stereostuff.Stereo;

public class MP3Player {

    private String connectedTo;
    private Stereo stereo;

    public MP3Player(){
        this.connectedTo = null;
    }

    public String connectedDevice(){
        return stereo.connect();
    }
}
