package de.die_gfi.philipp.shop;

public class Beverage extends Food{

    int containerSize;

    public Beverage(String name, double price, long articleNumber, String bestByDate, int containerSize) {
        super(name, price, articleNumber, bestByDate);
        this.containerSize = containerSize;
    }
}
