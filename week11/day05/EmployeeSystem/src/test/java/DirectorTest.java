import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Bill Big Boots", "01", 1000000,"The Board", 10000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000, director.getBudget(), 0.1);
    }

    @Test
    public void testPayBonus(){
        assertEquals(20000, director.payBonus());
    }
}
