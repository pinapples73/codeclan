
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departingAirport;
    private LocalDateTime departureTime;

    public Flight(ArrayList<Passenger> passengerList, Plane plane, String flightNumber, String destination, String departingAirport, String departureTime){
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departingAirport = departingAirport;
        this.departureTime = LocalDateTime.parse(departureTime);

    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public PlaneType getPlane() {
        return plane.getType();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    public int getPassengerListSize() {
        return passengerList.size();
    }

    public int checkAvailableSeats(){
        int passengerAmount = getPassengerListSize();
        int capacity = plane.getCapacity();
        int result = capacity - passengerAmount;
        return result;
    }

    public void bookFlight(Passenger newPassenger){
        if(checkAvailableSeats() > 0){
            passengerList.add(newPassenger);
            newPassenger.addToFlight(this);
        }
    }

}
