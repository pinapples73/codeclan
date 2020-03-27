package instruments;

import enums.Section;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("acoustic", "wood", Section.STRING, 6);
    }

    @Test
    public void getType() {
        assertEquals("acoustic", guitar.getType());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void getSection() {
        assertEquals("string", guitar.getSection());
    }

    @Test
    public void play() {
        assertEquals("twang", guitar.play());
    }

    @Test
    public void getNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(100, guitar.calculateMarkup(), 0.01);

    }
}