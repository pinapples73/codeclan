package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private double purchasePrice;
    private double sellPrice;

    public Piano(String type, String material, String section) {
        super(type, material, section);
        this.purchasePrice = 1000;
        this.sellPrice = 2000;
    }

    public String play() {
        return "tinkle";
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
