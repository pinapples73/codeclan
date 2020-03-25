import carparts.*;
import cars.carTypes.Hybrid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    private Hybrid pincer;
    private Doors doors;
    private Lights lights;
    private Seats seats;
    private Tyres tyres;

    @Before
    public void before(){
        doors = new Doors(4);
        lights = new Lights("Xenon");
        seats = new Seats("Cloth");
        tyres = new Tyres("new");

        pincer = new Hybrid(15000,"Pincer", "Ford", 1973, "Beige", doors, lights, seats, tyres);
    };

    @Test
    public void hasPrice(){
        assertEquals(15000, pincer.getPrice(),0.01);
    }

    @Test
    public void hasModel(){
        assertEquals("Pincer", pincer.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", pincer.getMake());
    }

    @Test
    public void hasYear(){
        assertEquals(1973, pincer.getYear());
    }

    @Test
    public void hasColour(){
        assertEquals("Beige", pincer.getColour());
    }

    @Test
    public void hasDoors(){
        assertEquals(4, pincer.getDoors().getNumberOfDoors());
    }

    @Test
    public void hasLights(){
        assertEquals("Xenon", pincer.getLights().getLightType());
    }

    @Test
    public void hasSeats(){
        assertEquals("Cloth", pincer.getSeats().getMaterial());
    }

    @Test
    public void hasTyres(){
        assertEquals("new", pincer.getTyres().getTyreQuality());
    }

    @Test
    public void testHasDamage(){
        pincer.setDamage(10);
        assertEquals(10, pincer.getDamage());
    }

    @Test
    public void checkCostAfterDamage(){
        pincer.setDamage(10);
        assertEquals(13500, pincer.getPrice(), 0.01);
    }

    @Test
    public void checkCostOfDamage(){
        pincer.setDamage(10);
        assertEquals(1500, pincer.costOfDamage(), 0.01);
    }

}
