package misc;

import behaviours.IBuy;
import cars.Car;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private double till;
    private ArrayList<Car> carStock;

    public Dealership(double till, ArrayList<Car> carStock){
        this.till = till;
        this.carStock = carStock;
    }

    public double getTill() {
        return till;
    }

    public void getModelFromStock(){
        for(Car car: carStock){
            System.out.println(car.getModel());
        }
    }

    public ArrayList<Car> getCarStock() {
        return carStock;
    }

    public void removeCarFromStock(Car car){
        carStock.remove(car);
    }

    public void buy(Car car) {
        if(car.getPrice() <= till) {
            carStock.add(car);
        } else {
            System.out.println("The Dealership does not have enough money for this car.");
        }
    }

    public void sell(Car carToSell, Customer customer){
        Boolean carSold = false;
        for(Car car: carStock){
            if(carToSell == car){
                if(carToSell.getPrice() <= customer.getCash()){
                    customer.buy(carToSell);
                    carSold = true;
                    break;
                } else {
                    System.out.println("Car is in stock but Customer does not have the funds.");
                }
            }
        }
        if(carSold){
            removeCarFromStock(carToSell);
        }
    }

    public void repairCar(Car carToRepair){
        double cost = carToRepair.costOfDamage();
        if(till >= cost){
            carToRepair.setDamage(0);
            till -= cost;
        } else {
            System.out.println("You do not have the funds to carry out the repair");
        }
    }
}
