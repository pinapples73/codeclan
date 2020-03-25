package cars;

import carparts.*;

public abstract class Car {

    private Doors doors;
    private Lights lights;
    private Seats seats;
    private Tyres tyres;

    private String model;
    private String make;
    private int year;
    private String colour;
    private double price;

    private int damage;
    private double originalPrice;

   public Car(double price, String model, String make, int year, String colour, Doors doors, Lights lights, Seats seats, Tyres tyres){
        this.doors = doors;
        this.lights = lights;
        this.seats = seats;
        this.tyres = tyres;

        this.price = price;
        this.model = model;
        this.make = make;
        this.year = year;
        this.colour = colour;

        this.damage = 0;
        this.originalPrice = price;
    }

    public Doors getDoors() {
        return doors;
    }

    public Lights getLights() {
        return lights;
    }

    public Seats getSeats() {
        return seats;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int newDamage) {
        this.damage = newDamage;
        this.costAfterDamage();
    }

    public void costAfterDamage(){
       int undamaged = 100 - damage;
       double multiplier = ((double)undamaged)/100;
       price = price * multiplier;
    }

    public double costOfDamage(){
       return originalPrice - price;
    }
}
