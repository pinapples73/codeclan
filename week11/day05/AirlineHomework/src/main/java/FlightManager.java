import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private int bagWeight;

    public FlightManager(Flight flight){
        this.flight = flight;
        this.bagWeight = 50;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getBaggageWeightLimit(){
        int baggageWeightLimit = flight.getPlane().getWeight() / 2;
        return baggageWeightLimit;
    }

    public int getBaggageWeightLimitPerPassenger(){
        int baggageWeightLimitPerPassenger = getBaggageWeightLimit() / flight.getPlane().getCapacity();
        return baggageWeightLimitPerPassenger;
    }

    public int getTotalBags(){
        int bagTotal = 0;
        ArrayList<Passenger> passengerList = flight.getPassengerList();
        for(Passenger passenger: passengerList){
            bagTotal = bagTotal + passenger.getNumberOfBags();
        }
        return bagTotal;
    }

    public int getRemainingBaggageWeight(){
        int remainingBaggageWeight = getBaggageWeightLimit() - (getTotalBags() * bagWeight);
        return remainingBaggageWeight;
    }

}

