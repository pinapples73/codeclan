package misc;

import behaviours.IBuy;
import cars.Car;

import java.util.ArrayList;

public class Customer implements IBuy {

    private double cash;
    private ArrayList<Car> carCollection;

    public Customer(double cash, ArrayList<Car> carCollection){
        this.carCollection = carCollection;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public ArrayList<Car> getCarCollection() {
        return carCollection;
    }

    public void getModelFromCollection(){
        for(Car car: carCollection){
            System.out.println(car.getModel());
        }
    }

    public void buy(Car car) {
        carCollection.add(car);
    }

}
