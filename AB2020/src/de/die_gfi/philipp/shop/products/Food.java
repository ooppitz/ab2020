package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent Food with all associated info
 *
 * @see Product
 */
public class Food extends Product{
    protected final String bestByDate;
    protected int weight;

    /**
     * This constructor is mostly used by the subclass {@link Beverage}, puts the weight to -1
     *
     * @param name Name of this Food
     * @param price Price of this Food
     * @param articleNumber Article number of this Food
     * @param bestByDate Best by Date of this Food
     */
    public Food(long articleNumber, String name, String manufacturer, double price, String bestByDate) {
        super(articleNumber, name, manufacturer, price);
        this.bestByDate = bestByDate;
        this.weight = -1;

    }

    /**
     *
     *
     * @param name Name of this Food
     * @param price Price of this Food
     * @param articleNumber Article number of this Food
     * @param bestByDate Best by Date of this Food
     * @param weight Weight of this Food
     */
    public Food(long articleNumber, String name, String manufacturer, double price, String bestByDate, int weight) {
        super(articleNumber, name, manufacturer, price);
        this.bestByDate = bestByDate;
        this.weight = weight;

    }

    /**
     * Sets the weight of this Food
     *
     * @param weight New weight of the food product
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Food: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price + "; weight: " + weight + " g";
    }

    public int getWeight() {
        return weight;
    }

    public String getBestByDate() {
        return bestByDate;
    }
}