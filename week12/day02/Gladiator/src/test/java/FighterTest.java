import livingentities.fighters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    private Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter("Barry", 6,10,5);
    }

    @Test
    public void hasName(){
        assertEquals("Barry", fighter.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(6, fighter.getStrength());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, fighter.getHealth());
    }

    @Test
    public void hasSpeed(){
        assertEquals(5, fighter.getSpeed());
    }

}
