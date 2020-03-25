import carparts.Seats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {

    private Seats seats;

    @Test
    public void hasSeats(){
        seats = new Seats("Leather");
        assertEquals("Leather", seats.getMaterial());
    }

}
