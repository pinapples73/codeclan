package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.Section;

public class Drum extends Instrument implements IPlay, ISell {

    private double purchasePrice;
    private double sellPrice;
    private int noOfDrums;

    public Drum(String type, String material, Section section, int noOfDrums) {
        super(type, material, section);
        this.purchasePrice = 200;
        this.sellPrice = 400;
        this.noOfDrums = noOfDrums;
    }

    public String play() {
        return "boom";
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }

    public double calculateMarkup() {
        return sellPrice - purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
