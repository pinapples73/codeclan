import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleRoom;
    private Bedroom doubleRoom;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;


    @Before
    public void before(){
        hotel = new Hotel();
        singleRoom = new Bedroom(1,1,"single");
        doubleRoom = new Bedroom(2,2,"double");

        conferenceRoom1 = new ConferenceRoom("Alderaan Suite", 4);
        conferenceRoom2 = new ConferenceRoom("Tatooine Suite", 5);

        guest1 = new Guest("Rod");
        guest2 = new Guest("Jane");
        guest3 = new Guest("Freddy");
        guest4 = new Guest("Matthew");


        hotel.addBedroom(singleRoom);
        hotel.addBedroom(doubleRoom);

        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);

    }

    @Test
    public void testAddBedroom(){
        assertEquals(singleRoom, hotel.getBedroomList().get(0));
    }

    @Test
    public void testAddConfRoom(){
        assertEquals(conferenceRoom1, hotel.getConferenceRoomList().get(0));
    }

    @Test
    public void testBedroomGuestCheckIn(){
        assertEquals(guest1, hotel.checkInBedroomGuest(guest1, singleRoom));
    }

    @Test
    public void testConfGuestCheckIn(){
        assertEquals(guest2, hotel.checkInConferenceRoomGuest(guest2, conferenceRoom1));
    }

    @Test
    public void testBedroomCheckOut(){
        hotel.checkInBedroomGuest(guest3, singleRoom);
        hotel.checkOutBedroomGuest(guest3, singleRoom);
        assertEquals(0, singleRoom.getGuestList().size());
    }

    @Test
    public void testConfRoomCheckOut(){
        hotel.checkInConferenceRoomGuest(guest4, conferenceRoom1);
        hotel.checkOutConferenceRoomGuest(guest4, conferenceRoom1);
        assertEquals(0, conferenceRoom1.getGuestList().size());
    }

    @Test
    public void testBookRoom(){
        Booking booking = hotel.bookRoom(singleRoom, 14);
        assertEquals(singleRoom, booking.getBedroom());
        assertEquals(14, booking.getNightsBooked());
        assertEquals(700, booking.getTotalBookingCost());
    }

}
