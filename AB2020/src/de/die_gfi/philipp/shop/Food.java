package de.die_gfi.philipp.shop;

/**
 *
 */
public class Food extends Product{
    protected final String bestByDate;
    protected int weight;

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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "bestByDate='" + bestByDate + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", articleNumber=" + articleNumber +
                ", packagingUnit=" + packagingUnit +
                '}';
    }
}
