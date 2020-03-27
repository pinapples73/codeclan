package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("book", 5, 20);
    }

    @Test
    public void getType() {
        assertEquals("book", sheetMusic.getType());
    }

    @Test
    public void getPurchasePrice() {
        assertEquals(5, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(20, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(15, sheetMusic.calculateMarkup(), 0.01);
    }
}