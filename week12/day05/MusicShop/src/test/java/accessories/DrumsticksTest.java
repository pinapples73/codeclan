package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsticksTest {

    private Drumsticks drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Drumsticks("drum accessory", 10, 20);
    }

    @Test
    public void getType() {
        assertEquals("drum accessory", drumsticks.getType());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(10, drumsticks.getPurchasePrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(20, drumsticks.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(10, drumsticks.calculateMarkup(), 0.01);
    }
}