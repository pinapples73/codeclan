import carparts.Doors;
import carparts.Lights;
import carparts.Seats;
import carparts.Tyres;
import cars.Car;
import cars.carTypes.Electric;
import cars.carTypes.Hybrid;
import cars.carTypes.Petrol;
import misc.Customer;
import misc.Dealership;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership arnoldCodeClan;
    private Customer customer;

    private ArrayList<Car> carStock;
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

        carStock = new ArrayList<Car>();
        for(int i = 1; i <= 2; i++){
            carStock.add(pincer);
            carStock.add(demon);
            carStock.add(timid);
        }
        carCollection = new ArrayList<Car>();

        arnoldCodeClan = new Dealership(500000, carStock);
        customer = new Customer(12000, carCollection);
    }

    @Test
    public void hasTill(){
        assertEquals(500000,arnoldCodeClan.getTill(), 0.01);
    }

    @Test
    public void testCarStock(){
        assertEquals(6, arnoldCodeClan.getCarStock().size());
    }

    @Test
    public void testRemoveCarFromStock(){
        arnoldCodeClan.removeCarFromStock(demon);
        assertEquals(5, arnoldCodeClan.getCarStock().size());
    }

    @Test
    public void testBuyCar(){
        arnoldCodeClan.buy(demon);
        assertEquals(7, arnoldCodeClan.getCarStock().size());
    }

    @Test
    public void testSellCarToCustomer(){
        arnoldCodeClan.sell(timid, customer);
        assertEquals(1,customer.getCarCollection().size());
        assertEquals(5, arnoldCodeClan.getCarStock().size());
    }

    @Test
    public void testRepairCar(){
        pincer.setDamage(10);
        arnoldCodeClan.repairCar(pincer);
        assertEquals(0, pincer.getDamage());
        assertEquals(498500, arnoldCodeClan.getTill(), 0.01);
    }

}
