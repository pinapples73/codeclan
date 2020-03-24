import livingentities.fighters.Hoplomachus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoplomachusTest {

    private Hoplomachus hoplomachus;

    @Before
    public void before(){
        hoplomachus = new Hoplomachus("Stabbius Defensius", 8,10,2,"Hoplomachus", "sword and shield");
    }

    @Test
    public void hasFightingClass(){
        assertEquals("Hoplomachus", hoplomachus.getFightingClass());
    }

    @Test
    public void hasWeapons(){
        assertEquals("Hoplomachus", hoplomachus.getFightingClass());
    }

    @Test
    public void testFight(){
        String expected = "Stabbius Defensius the Hoplomachus attacks with sword and shield. She Deflects the first attack with her shield then follows up with a blow to the head with her sword.";
        assertEquals(expected, hoplomachus.fight());
    }
}
