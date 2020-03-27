package shopping;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop (ArrayList<ISell> stock){
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }
}
