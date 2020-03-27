package accessories;

public abstract class Accessories {

    private String type;
    private double purchasePrice;
    private double sellingPrice;

    public Accessories(String type, double purchasePrice, double sellingPrice){
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

}
