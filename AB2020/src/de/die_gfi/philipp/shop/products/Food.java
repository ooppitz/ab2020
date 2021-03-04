package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent Food with all associated info
 *
 * @see Product
 */
public class Food extends ExpirableProduct{
    protected int weightInGramm;

    /**
     * @param articleNumber Article number of this Food
     * @param name Name of this Food
     * @param price Price of this Food
     * @param weight Weight of this Food
     * @param bestByDate Best by Date of this Food
     */
    public Food(long articleNumber, String name, String manufacturer, double price, int weight, String bestByDate) {
        super(articleNumber, name, manufacturer, price, bestByDate);
        this.weightInGramm = weight;

    }

    public static Product parseString(String[] elements) {
        if (elements.length == 7)
            return new Food(Long.parseLong(elements[1]), elements[2], elements[3],
                    Double.parseDouble(elements[4]), Integer.parseInt(elements[5]), elements[6]);
        return null;
    }

    /**
     * Sets the weight of this Food
     *
     * @param weight New weight of the food product
     */
    public void setWeight(int weight) {
        this.weightInGramm = weight;
    }

    public int getWeight() {
        return weightInGramm;
    }

    public String getBestByDate() {
        return bestByDate;
    }

    @Override
    public String toString() {
        return "Food: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price + "; weight: " + weightInGramm + " g";
    }
}
