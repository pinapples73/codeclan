import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 28, 95.62);
    }

    @Test
    public void hasName() {
//        Bear bear = new Bear("Baloo");
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
//        Bear balooBear = new Bear("Baloo", 28);
        assertEquals(28, bear.getAge());
    }

    @Test
    public void hasWeight() {
//        Bear bear = new Bear("Baloo", 28, 95.62);
        assertEquals(95.62, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void readyToHibernateIfLessThan80 (){
        Bear skinnyBear = new Bear("Booboo", 34, 65.30);
        assertEquals(false, skinnyBear.readyToHibernate());
    }
}
