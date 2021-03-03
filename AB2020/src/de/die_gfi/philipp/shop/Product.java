package de.die_gfi.philipp.shop;

/**
 * The objects of this class represent a generic product in an online shop.
 */
public class Product {

    protected final long articleNumber;
    protected final String name;
    protected double price;
    protected int packagingUnit;

    /**
     * Constructs a Product object with all necessary data for a generic product.
     *
     * @param articleNumber Article number of this product
     * @param name Name of this product
     * @param price Price of this product
     */
    public Product(long articleNumber, String name, double price) {
        this.articleNumber = articleNumber;
        this.name = name;
        this.price = price;
        this.packagingUnit = 1;
    }

    /**
     * Construct a Product object with all necessary data for a generic product and additionally defines the amount of
     * units per package
     *
     * @param articleNumber Article number of this product
     * @param name Name of this product
     * @param price Price of this product
     * @param packagingUnit How many units of the product are included per package
     */
    public Product(long articleNumber, String name, double price, int packagingUnit) {
        this.articleNumber = articleNumber;
        this.name = name;
        this.price = price;
        this.packagingUnit = packagingUnit;
    }

    /**
     * Sets a new price for this product
     *
     * @param newPrice new price of this product
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Sets a new amount of product per unit
     *
     * @param newPackagingUnit new amount per unit
     */
    public void setPackagingUnit(int newPackagingUnit) {
        this.packagingUnit = newPackagingUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", articleNumber=" + articleNumber +
                ", packagingUnit=" + packagingUnit +
                '}';
    }
}
