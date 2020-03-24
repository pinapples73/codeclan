import livingentities.crowd.Emperor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmperorTest {

    private Emperor emperor;

    @Before
    public void before(){
        emperor = new Emperor("Julius Caeser", true);
    }

    @Test
    public void hasName(){
        assertEquals("Julius Caeser", emperor.getName());
    }

    @Test
    public void checkSatisfaction(){
        assertEquals( true, emperor.getSatisfied());
    }

    @Test
    public void testChangeInSatisfaction(){
        emperor.changeSatisfied();
        assertEquals(false, emperor.getSatisfied());
    }

}
