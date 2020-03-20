import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane boeing747;

    @Before
    public void before(){
        boeing747 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testGetPlaneType(){
        assertEquals(PlaneType.BOEING747, boeing747.getType());
    }

    @Test
    public void testPlaneCapacity(){
        assertEquals(467, boeing747.getCapacity());
    }

    @Test
    public void testPlaneWeight(){
        assertEquals(333394, boeing747.getWeight());
    }
}
