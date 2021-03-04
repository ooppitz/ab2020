package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent Food with all associated info
 *
 * @see Product
 */
public class Food extends ExpirableProduct{
    protected int weightInGramm;

    /**
     * @param name Name of this Food
     * @param price Price of this Food
     * @param articleNumber Article number of this Food
     * @param bestByDate Best by Date of this Food
     * @param weight Weight of this Food
     */
    public Food(long articleNumber, String name, String manufacturer, double price, String bestByDate, int weight) {
        super(articleNumber, name, manufacturer, price, bestByDate);
        this.weightInGramm = weight;

    }

    /**
     * Sets the weight of this Food
     *
     * @param weight New weight of the food product
     */
    public void setWeight(int weight) {
        this.weightInGramm = weight;
    }

    @Override
    public String toString() {
        return "Food: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price + "; weight: " + weightInGramm + " g";
    }

    public int getWeight() {
        return weightInGramm;
    }

    public String getBestByDate() {
        return bestByDate;
    }
}
