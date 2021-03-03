package de.die_gfi.philipp.shop;

public class Beverage extends Food{

    protected int containerSize;

    public Beverage(String name, double price, long articleNumber, String bestByDate, int containerSize) {
        super(name, price, articleNumber, bestByDate);
        this.containerSize = containerSize;
    }

    public void setContainerSize(int containerSize) {
        this.containerSize = containerSize;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "containerSize=" + containerSize +
                ", bestByDate='" + bestByDate + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", articleNumber=" + articleNumber +
                ", packagingUnit=" + packagingUnit +
                '}';
    }
}
