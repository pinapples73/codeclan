import carparts.Doors;
import carparts.Lights;
import carparts.Seats;
import carparts.Tyres;
import cars.Car;
import cars.carTypes.Electric;
import cars.carTypes.Hybrid;
import cars.carTypes.Petrol;
import misc.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    private ArrayList<Car> carCollection;

    private Hybrid pincer;
    private Electric timid;
    private Petrol demon;

    private Doors doors;
    private Lights lights;
    private Seats seats;
    private Tyres tyres;

    @Before
    public void before(){
        pincer = new Hybrid( 15000,"Pincer", "Ford", 1973, "Beige", doors, lights, seats, tyres);
        demon = new Petrol(250000,"Demon", "Ferrari", 2020, "Red", doors, lights, seats, tyres);
        timid = new Electric(10000,"Timid", "Lexus", 2019, "Green", doors, lights, seats, tyres);

        carCollection = new ArrayList<Car>();
        carCollection.add(pincer);
        carCollection.add(demon);

        customer = new Customer(50000, carCollection);

    }

    @Test
    public void hasCash(){
        assertEquals(50000, customer.getCash(), 0.01);
    }

    @Test
    public void testCarCollection(){
        customer.getModelFromCollection();
        assertEquals(2, customer.getCarCollection().size());
    }

    @Test
    public void testBuyCar(){
        customer.buy(timid);
        assertEquals(3, customer.getCarCollection().size());
    }

}
