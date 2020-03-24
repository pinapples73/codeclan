import livingentities.crowd.Gentry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentryTest {

    private Gentry gentry;

    @Before
    public void before(){
        gentry = new Gentry("The Posh Folk Of Rome");
    }

    @Test
    public void hasName(){
        assertEquals("The Posh Folk Of Rome", gentry.getName());
    }

    @Test
    public void checkBoredom(){
        assertEquals(true, gentry.getBored());
    }

    @Test
    public void checkChangeInBoredom(){
        gentry.changeBoredom();
        assertEquals(false, gentry.getBored());
    }

    @Test
    public void testICanCheer(){
        assertEquals("The gentry cheers for the renowned.", gentry.cheer());
    }
}
