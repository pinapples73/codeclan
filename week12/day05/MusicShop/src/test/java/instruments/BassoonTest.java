package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BassoonTest {

    private Bassoon bassoon;

    @Before
    public void before() {
        bassoon = new Bassoon("buffet", "wood", "wood wind", 22);
    }

    @Test
    public void testGetType() {
        assertEquals("buffet", bassoon.getType());
    }

    @Test
    public void testGetMaterial() {
        assertEquals("wood", bassoon.getMaterial());
    }

    @Test
    public void testGetSection() {
        assertEquals("wood wind", bassoon.getSection());
    }

    @Test
    public void testPlay() {
        assertEquals("toot", bassoon.play());
    }

    @Test
    public void testGetKeys() {
        assertEquals(22, bassoon.getKeys());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(500, bassoon.calculateMarkup(), 0.01);
    }
}