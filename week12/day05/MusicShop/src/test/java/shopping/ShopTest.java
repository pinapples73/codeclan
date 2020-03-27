package shopping;

import accessories.Drumsticks;
import accessories.GuitarStrings;
import behaviours.ISell;
import instruments.Bassoon;
import instruments.Drum;
import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private ArrayList<ISell> stock = new ArrayList<ISell>();

    private ISell drumsticks;
    private ISell guitarStrings;
    private ISell sheetMusic;

    private ISell bassoon;
    private ISell drum;
    private ISell guitar;
    private ISell piano;

    @Before
    public void before() {
        drumsticks = new Drumsticks("drum accessory", 5,15);
        guitarStrings = new GuitarStrings("guitar accessory", 2,10);
        sheetMusic = new Drumsticks("book", 10,30);

        bassoon = new Bassoon("Heckel", "wood","wood wind", 17);
        guitar = new Guitar("acoustic", "wood", "string", 6);
        drum = new Drum("bass", "pig skin", "percussion", 2);
        piano = new Piano("grand", "ebony and ivory", "keys");

        stock.add(drumsticks);
        stock.add(sheetMusic);
        stock.add(guitar);
        stock.add(piano);

        shop = new Shop(stock);
    }

    @Test
    public void getStock() {
        assertEquals(4, shop.getStock().size());
    }

    @Test
    public void addToStock() {
        shop.addToStock(drum);
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void removeFromStock() {
        shop.removeFromStock(drumsticks);
        assertEquals(3, shop.getStock().size());
    }
}