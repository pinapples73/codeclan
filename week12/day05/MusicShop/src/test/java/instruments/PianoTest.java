package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("grand", "ebony and ivory", "keys");
    }

    @Test
    public void testGetType() {
        assertEquals("grand", piano.getType());
    }

    @Test
    public void testGetMaterial() {
        assertEquals("ebony and ivory", piano.getMaterial());
    }

    @Test
    public void testGetSection() {
        assertEquals("keys", piano.getSection());
    }

    @Test
    public void testPlay() {
        assertEquals("tinkle", piano.play());
    }


    @Test
    public void testCalculateMarkup() {
        assertEquals(1000, piano.calculateMarkup(), 0.01);
    }
}