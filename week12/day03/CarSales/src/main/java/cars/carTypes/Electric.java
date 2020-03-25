package cars.carTypes;

import carparts.*;
import cars.Car;

public class Electric extends Car {

    private Engine engine;

    public Electric(double price, String model, String make, int year, String colour, Doors doors, Lights lights, Seats seats, Tyres tyres) {
        super(price, model, make, year, colour, doors, lights, seats, tyres);
        this.engine = new Engine("Electric");
    }

    public Engine getEngine() {
        return engine;
    }



}
