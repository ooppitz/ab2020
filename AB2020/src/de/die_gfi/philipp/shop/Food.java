package de.die_gfi.philipp.shop;

public class Food extends Product{
    private final String bestByDate;
    private int weight;

    public Food(String name, double price, long articleNumber, String bestByDate) {
        super(name, price, articleNumber);
        this.bestByDate = bestByDate;
        this.weight = -1;

    }

    public Food(String name, double price, long articleNumber, String bestByDate, int weight) {
        super(name, price, articleNumber);
        this.bestByDate = bestByDate;
        this.weight = weight;

    }
}
