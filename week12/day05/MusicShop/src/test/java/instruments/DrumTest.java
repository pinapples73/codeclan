package instruments;

import enums.Section;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumTest {

    private Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum("bass", "pig skin", Section.PERCUSSION, 2);
    }

    @Test
    public void testGetType() {
        assertEquals("bass", drum.getType());
    }

    @Test
    public void testGetMaterial() {
        assertEquals("pig skin", drum.getMaterial());
    }

    @Test
    public void testGetSection() {
        assertEquals("percussion", drum.getSection());
    }

    @Test
    public void testPlay() {
        assertEquals("boom", drum.play());
    }

    @Test
    public void testGetNoOfDrums() {
        assertEquals(2, drum.getNoOfDrums());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(200, drum.calculateMarkup(), 0.01);
    }
}