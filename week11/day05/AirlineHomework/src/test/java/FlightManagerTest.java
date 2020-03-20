import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager1;

    private Flight flight1;

    private Passenger passenger1;
    private Passenger passenger2;

    private ArrayList<Passenger> passengerList;

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.WEEPLANE1);

        passenger1 = new Passenger("Gordon Mitchell", 1);
        passenger2 = new Passenger("Carol Mitchell", 5);

        passengerList = new ArrayList<Passenger>();
        passengerList.add(passenger1);
        passengerList.add(passenger2);

        flight1 = new Flight(passengerList, plane, "TJ001","GLA", "EDI", "12:00");

        flightManager1 = new FlightManager(flight1);

    }

    @Test
    public void testGetBaggageWeightLimit(){
        assertEquals(500, flightManager1.getBaggageWeightLimit());
    }

    @Test
    public void testGetBaggageWeightLimitPerPassenger(){
        assertEquals(250, flightManager1.getBaggageWeightLimitPerPassenger());
    }

    @Test
    public void testGetTotalBags(){
        assertEquals(6, flightManager1.getTotalBags());
    }

    @Test
    public void testRemainingBaggageWeight(){
        assertEquals(200, flightManager1.getRemainingBaggageWeight());
    }

}
