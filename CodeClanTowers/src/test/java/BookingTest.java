import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1,1,"single");
        booking1 = new Booking(bedroom1, 7);
    }

    @Test
    public void testCalculateHourlyRate(){
        assertEquals(350, booking1.getTotalBookingCost());
    }

}
