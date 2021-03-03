package de.die_gfi.philipp.shop;

public class Food extends Product{
    private final String bestByDate;

    public Food(String name, double price, long articleNumber, String bestByDate) {
        super(name, price, articleNumber);
        this.bestByDate = bestByDate;

    }
}
