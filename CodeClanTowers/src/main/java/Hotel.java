import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(){
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();
    }

    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public ArrayList<ConferenceRoom> getConferenceRoomList() {
        return conferenceRoomList;
    }

    public void addBedroom(Bedroom bedroom){
        bedroomList.add(bedroom);
    }
}
