package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.Section;

public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;
    private double purchasePrice;
    private double sellPrice;

    public Guitar(String type, String material, Section section, int noOfStrings) {
        super(type, material, section);
        this.noOfStrings = noOfStrings;
        this.purchasePrice = 100;
        this.sellPrice = 200;
    }

    public String play() {
        return "twang";
    }

    public int getNoOfStrings() {
        return noOfStrings;
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
