package cars.carTypes;

import carparts.*;
import cars.Car;

public class Petrol extends Car {

    private Engine engine;

    public Petrol(double price, String model, String make, int year, String colour, Doors doors, Lights lights, Seats seats, Tyres tyres) {
        super(price, model, make, year, colour, doors, lights, seats, tyres);
        this.engine = new Engine("Petrol");
    }

    public Engine getEngine() {
        return engine;
    }

}
