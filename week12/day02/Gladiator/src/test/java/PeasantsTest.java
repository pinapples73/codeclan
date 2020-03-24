import livingentities.crowd.Peasants;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeasantsTest{

    private Peasants peasants;

    @Before
    public void before(){
       peasants = new Peasants("The lower classes of Rome");
    }

    @Test
    public void hasName(){
        assertEquals("The lower classes of Rome", peasants.getName());
    }

    @Test
    public void checkBoredom(){
        assertEquals(true, peasants.getRebellious());
    }

    @Test
    public void checkChangeInBoredom(){
        peasants.changeRebellious();
        assertEquals(false, peasants.getRebellious());
    }

    @Test
    public void testICanCheer(){
        assertEquals("The peasants cheers for the underdog.", peasants.cheer());
    }
}
