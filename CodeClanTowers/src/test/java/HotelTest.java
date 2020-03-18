import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleRoom;
    private Bedroom doubleRoom;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    @Before
    public void before(){
        singleRoom = new Bedroom(1,1,"single");
        doubleRoom = new Bedroom(2,2,"double");

        conferenceRoom1 = new ConferenceRoom("Alderaan Suite", 4);
        conferenceRoom2 = new ConferenceRoom("Tatooine Suite", 5);

    }

    @Test
    public void testAddBedroom(){
        hotel.addBedroom(singleRoom);
        assertEquals(singleRoom, hotel.getBedroomList().get(0));
    }

}
