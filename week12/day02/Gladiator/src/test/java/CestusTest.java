import livingentities.fighters.Cestus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CestusTest {

    private Cestus cestus;

    @Before
    public void before(){
        cestus = new Cestus("Punchius Faceous", 8,10,2,"Cestus", "knuckledusters");
    }

    @Test
    public void hasFightingClass(){
        assertEquals("Cestus", cestus.getFightingClass());
    }

    @Test
    public void hasWeapons(){
        assertEquals("Cestus", cestus.getFightingClass());
    }

    @Test
    public void testFight(){
        String expected = "Punchius Faceous the Cestus attacks with knuckledusters. He punches with his right then his left. His opponent falls to the floor.";
        assertEquals(expected, cestus.fight());
    }
}
