public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;
    private int nightlyRate;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
        this.nightlyRate = 50;

    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public int getTotalBookingCost(){
        return (nightlyRate * nightsBooked);
    }
}
