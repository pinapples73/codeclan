import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guestList;


    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void addGuest(Guest guest){
        // TODO: 18/03/2020  add a capacity check later
        guestList.add(guest);
    }
}
