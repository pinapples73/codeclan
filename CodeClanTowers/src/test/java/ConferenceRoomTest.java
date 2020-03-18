import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private Guest guest7;
    private Guest guest8;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Alderaan Suite", 4);
        conferenceRoom2 = new ConferenceRoom("Tatooine Suite", 5);
        guest1 = new Guest("Rod");
        guest2 = new Guest("Jane");
        guest3 = new Guest("Freddy");
        guest4 = new Guest("Matthew");
        guest5 = new Guest("Hannibal");
        guest6 = new Guest("BA");
        guest7 = new Guest("Face");
        guest8 = new Guest("Murdock");
    }

    @Test
    public void hasName(){
        assertEquals("Alderaan Suite", conferenceRoom1.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, conferenceRoom2.getCapacity());
    }

    @Test
    public void addGuestToConferenceRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(guest1, conferenceRoom1.getGuestList().get(0));
    }

    @Test
    public void testRemoveGuestFromConferenceRoom(){
        conferenceRoom2.addGuest(guest5);
        conferenceRoom2.removeGuest(guest5);
        assertEquals(0, conferenceRoom2.getGuestList().size());
    }

}
