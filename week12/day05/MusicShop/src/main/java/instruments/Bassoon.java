package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Bassoon extends Instrument implements IPlay, ISell {
    // Buffet 22 keys or Heckel 17 keys

    private int keys;
    private double purchasePrice;
    private double sellPrice;

    public Bassoon(String type, String material, String section, int keys){
        super(type, material, section);
        this.keys = keys;
        this.purchasePrice = 500;
        this.sellPrice = 1000;
    }


    public String play() {
        return "toot";
    }

    public int getKeys() {
        return keys;
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
