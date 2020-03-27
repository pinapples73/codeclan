package accessories;

import behaviours.ISell;

public class SheetMusic extends Accessories implements ISell {

    public SheetMusic(String type, double purchasePrice, double sellingPrice) {
        super(type, purchasePrice, sellingPrice);
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }

}
