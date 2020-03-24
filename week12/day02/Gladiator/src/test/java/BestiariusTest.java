import livingentities.fighters.Bestiarius;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestiariusTest {

    private Bestiarius bestiarius;

    @Before
    public void before(){
        bestiarius = new Bestiarius("Catchius Pokius", 6,10,5,"Bestiarius", "pike and net");
    }

    @Test
    public void hasFightingClass(){
        assertEquals("Bestiarius", bestiarius.getFightingClass());
    }

    @Test
    public void hasWeapons(){
        assertEquals("Bestiarius", bestiarius.getFightingClass());
    }

    @Test
    public void testFight(){
        String expected = "Catchius Pokius the Bestiarius attacks with pike and net. He throws his net over the beast and finished it with his pike.";
        assertEquals(expected, bestiarius.fight());
    }

}
