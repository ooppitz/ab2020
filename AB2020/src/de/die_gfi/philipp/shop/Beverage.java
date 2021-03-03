package de.die_gfi.philipp.shop;

/**
 * Objects of this class represent a Beverage with all associated info.
 *
 * @see de.die_gfi.philipp.shop.Food
 * @see de.die_gfi.philipp.shop.Product
 */
public class Beverage extends Food{

    protected int containerSize;

    /**
     * @param articleNumber Article number of this Beverage
     * @param name Name of this Beverage
     * @param price Price of this Beverage
     * @param bestByDate Best by Date of this Beverage
     * @param containerSize Size of the container of the Beverage in ml
     */
    public Beverage(long articleNumber, String name, String manufacturer,double price, String bestByDate, int containerSize) {
        super(articleNumber, name, manufacturer,price, bestByDate);
        this.containerSize = containerSize;
    }

    /**
     * Sets the container size of this Beverage
     *
     * @param containerSize The new container size
     */
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

    public int getContainerSize() {
        return containerSize;
    }
}
