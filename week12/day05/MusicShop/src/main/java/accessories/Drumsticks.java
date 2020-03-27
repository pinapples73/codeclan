package accessories;

import behaviours.ISell;

public class Drumsticks extends Accessories implements ISell {

    public Drumsticks(String type, double purchasePrice, double sellingPrice) {
        super(type, purchasePrice, sellingPrice);
    }


    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
