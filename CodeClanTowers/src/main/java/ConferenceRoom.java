import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guestList;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public void removeGuest(Guest guest){
        Boolean guestInRoom = guestList.contains(guest);
        if(guestInRoom){
            guestList.remove(guest);
        }

    }



}
