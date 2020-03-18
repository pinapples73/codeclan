import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom singleRoom;
    private Bedroom doubleRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){
        singleRoom = new Bedroom(1,1,"single");
        doubleRoom = new Bedroom(2,2,"double");
        guest1 = new Guest("Rod");
        guest2 = new Guest("Jane");
        guest3 = new Guest("Freddy");
        guest4 = new Guest("Matthew");
    }

    @Test
    public void testHasRoomNumber(){
        assertEquals(1, singleRoom.getRoomNumber());
    }

    @Test
    public void testHasRoomCapacity(){
        assertEquals(2,doubleRoom.getCapacity());
    }

    @Test
    public void testHasRoomType(){
        assertEquals("double", doubleRoom.getType());
    }

    @Test
    public void testAddGuestToBedroom(){
        singleRoom.addGuest(guest1);
        assertEquals(guest1, singleRoom.getGuestList().get(0));
    }



}
