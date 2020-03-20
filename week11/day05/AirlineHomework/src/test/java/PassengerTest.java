import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Gordon Mitchell", 2 );
    }

    @Test
    public void testGetName(){
        assertEquals("Gordon Mitchell", passenger1.getName());
    }

    @Test
    public void testGetBags(){
        assertEquals(2, passenger1.getNumberOfBags());
    }

}
