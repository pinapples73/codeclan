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
        this.bedroomList.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoomList.add(conferenceRoom);
    }

    public Guest checkInBedroomGuest(Guest guest, Bedroom bedroom){
        for(Bedroom room: bedroomList){
            if(room == bedroom){
                bedroom.addGuest(guest);
//                System.out.println("guest added to list");
//                System.out.println("guestlist : " + bedroom.getGuestList().get(0).getName());
                return bedroom.getGuestList().get(0);
            }
        }
        return null;
    }

    public Guest checkInConferenceRoomGuest(Guest guest, ConferenceRoom conferenceRoom){
        for(ConferenceRoom room: conferenceRoomList){
            if(room == conferenceRoom){
                conferenceRoom.addGuest(guest);
//                System.out.println("guest added to list");
//                System.out.println("guestlist : " + conferenceRoom.getGuestList().get(0).getName());
                return conferenceRoom.getGuestList().get(0);
            }
        }
        return null;
    }

    public void checkOutBedroomGuest(Guest guest, Bedroom bedroom){
        for(Bedroom room: bedroomList){
            if(room == bedroom){
                bedroom.removeGuest(guest);
            }
        }
    }

    public void checkOutConferenceRoomGuest(Guest guest, ConferenceRoom conferenceRoom){
        for(ConferenceRoom room: conferenceRoomList){
            if(room == conferenceRoom){
                conferenceRoom.removeGuest(guest);
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked){
        Booking booking = new Booking(bedroom, nightsBooked);
        System.out.println(booking.getBedroom().getType());
        return booking;
    }

}
