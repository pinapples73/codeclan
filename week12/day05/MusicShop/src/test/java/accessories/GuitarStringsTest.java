package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings("guitar accessory", 2, 10);
    }

    @Test
    public void getType() {
        assertEquals("guitar accessory", guitarStrings.getType());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(2, guitarStrings.getPurchasePrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(10, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(8, guitarStrings.calculateMarkup(), 0.01);
    }
}