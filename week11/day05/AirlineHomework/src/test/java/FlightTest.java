import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    private ArrayList<Passenger> passengerList;

    private Plane plane;



    @Before
    public void before(){
        plane = new Plane(PlaneType.WEEPLANE1);

        passenger1 = new Passenger("Gordon Mitchell", 1);
        passenger2 = new Passenger("Carol Mitchell", 5);
        passenger3 = new Passenger("John McLean", 1);


        passengerList = new ArrayList<Passenger>();
            passengerList.add(passenger1);

        flight1 = new Flight(passengerList, plane, "TJ001","GLA", "EDI", "12:00");
    }

    @Test
    public void testHasPassengers(){
        assertEquals(1, flight1.getPassengerListSize());
    }

    @Test
    public void testGetPlane(){
        assertEquals(PlaneType.WEEPLANE1, flight1.getPlane());
    }

    @Test
    public void testFlightNumber(){
        assertEquals("TJ001", flight1.getFlightNumber());
    }

    @Test
    public void testGetDestination(){
        assertEquals("GLA", flight1.getDestination());
    }

    @Test
    public void testGetDepartingAitport(){
        assertEquals("EDI", flight1.getDepartingAirport());
    }

    @Test
    public void testGetDepartureTime(){
        assertEquals("12:00", flight1.getDepartureTime());
    }

    @Test
    public void testCheckSeatsLeft(){
        assertEquals(1, flight1.checkAvailableSeats());
    }

    @Test
    public void testFlightBookingWithAvailableSeats(){
        flight1.bookFlight(passenger2);
        assertEquals(2, flight1.getPassengerListSize());
    }

    @Test
    public void testFlightBookingWithNoAvailableSeats(){
        flight1.bookFlight(passenger2);
        flight1.bookFlight(passenger3);
        assertEquals(2, flight1.getPassengerListSize());
    }

}
