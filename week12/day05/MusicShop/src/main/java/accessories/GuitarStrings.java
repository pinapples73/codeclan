package accessories;

import behaviours.ISell;

public class GuitarStrings extends Accessories implements ISell {

    public GuitarStrings(String type, double purchasePrice, double sellingPrice) {
        super(type, purchasePrice, sellingPrice);
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
