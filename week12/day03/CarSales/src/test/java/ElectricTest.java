import carparts.Doors;
import carparts.Lights;
import carparts.Seats;
import carparts.Tyres;
import cars.carTypes.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    private Electric timid;
    private Doors doors;
    private Lights lights;
    private Seats seats;
    private Tyres tyres;

    @Before
    public void before(){
        doors = new Doors(2);
        lights = new Lights("LED");
        seats = new Seats("Hemp");
        tyres = new Tyres("new");

        timid = new Electric(10000,"Timid", "Lexus", 2019, "Red", doors, lights, seats, tyres) {
        };
    };

    @Test
    public void hasPrice(){
        assertEquals(10000, timid.getPrice(), 0.01);
    }

    @Test
    public void hasModel(){
        assertEquals("Timid", timid.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Lexus", timid.getMake());
    }

    @Test
    public void hasYear(){
        assertEquals(2019, timid.getYear());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", timid.getColour());
    }

    @Test
    public void hasDoors(){
        assertEquals(2, timid.getDoors().getNumberOfDoors());
    }

    @Test
    public void hasLights(){
        assertEquals("LED", timid.getLights().getLightType());
    }

    @Test
    public void hasSeats(){
        assertEquals("Hemp", timid.getSeats().getMaterial());
    }

    @Test
    public void hasTyres(){
        assertEquals("new", timid.getTyres().getTyreQuality());
    }

    @Test
    public void testHasDamage(){
        timid.setDamage(10);
        assertEquals(10, timid.getDamage());
    }

    @Test
    public void checkCostAfterDamage(){
        timid.setDamage(10);
        assertEquals(9000, timid.getPrice(), 0.01);
    }

    @Test
    public void checkCostOfDamage(){
        timid.setDamage(10);
        assertEquals(1000, timid.costOfDamage(), 0.01);
    }
}
