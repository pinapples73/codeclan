import carparts.Doors;
import carparts.Lights;
import carparts.Seats;
import carparts.Tyres;
import cars.carTypes.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    private Petrol demon;
    private Doors doors;
    private Lights lights;
    private Seats seats;
    private Tyres tyres;

    @Before
    public void before(){
        doors = new Doors(2);
        lights = new Lights("Halogen");
        seats = new Seats("Leather");
        tyres = new Tyres("new");

        demon = new Petrol(250000,"Demon", "Ferrari", 2020, "Red", doors, lights, seats, tyres) {
        };
    };

    @Test
    public void hasPrice(){
        assertEquals(250000, demon.getPrice(),0.01);
    }

    @Test
    public void hasModel(){
        assertEquals("Demon", demon.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Ferrari", demon.getMake());
    }

    @Test
    public void hasYear(){
        assertEquals(2020, demon.getYear());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", demon.getColour());
    }

    @Test
    public void hasDoors(){
        assertEquals(2, demon.getDoors().getNumberOfDoors());
    }

    @Test
    public void hasLights(){
        assertEquals("Halogen", demon.getLights().getLightType());
    }

    @Test
    public void hasSeats(){
        assertEquals("Leather", demon.getSeats().getMaterial());
    }

    @Test
    public void hasTyres(){
        assertEquals("new", demon.getTyres().getTyreQuality());
    }

    @Test
    public void testHasDamage(){
        demon.setDamage(10);
        assertEquals(10, demon.getDamage());
    }

    @Test
    public void checkCostAfterDamage(){
        demon.setDamage(10);
        assertEquals(225000, demon.getPrice(), 0.01);
    }

    @Test
    public void checkCostOfDamage(){
        demon.setDamage(10);
        assertEquals(25000, demon.costOfDamage(), 0.01);
    }

}
