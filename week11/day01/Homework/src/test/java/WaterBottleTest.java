import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void testDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void testEmpty(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void testFill(){
        waterBottle.volume = 50;
        assertEquals(100, waterBottle.fill());

    }

}
