package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent a Beverage with all associated info.
 *
 * @see Food
 * @see Product
 */
public class Beverage extends ExpirableProduct{

    protected int containerSizeInMl;

    /**
     * @param articleNumber Article number of this Beverage
     * @param name Name of this Beverage
     * @param price Price of this Beverage
     * @param bestByDate Best by Date of this Beverage
     * @param containerSizeInMl Size of the container of the Beverage in ml
     */
    public Beverage(long articleNumber, String name, String manufacturer,double price, String bestByDate, int containerSizeInMl) {
        super(articleNumber, name, manufacturer, price, bestByDate);
        this.containerSizeInMl = containerSizeInMl;
    }

    /**
     * Sets the container size of this Beverage
     *
     * @param containerSizeInMl The new container size
     */
    public void setContainerSizeInMl(int containerSizeInMl) {
        this.containerSizeInMl = containerSizeInMl;
    }

    @Override
    public String toString() {
        return "Beverage: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price + "; container size: " + containerSizeInMl + " ml";
    }

    public int getContainerSizeInMl() {
        return containerSizeInMl;
    }
}
