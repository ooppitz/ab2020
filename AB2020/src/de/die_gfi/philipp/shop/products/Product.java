package de.die_gfi.philipp.shop.products;

/**
 * The objects of this class represent a generic product in an online shop.
 */
public class Product implements CounterInterface{

    protected final long articleNumber;
    protected final String name;
    protected final String manufacturer;
    protected double price;
    protected int packagingUnit;
    static int counter;

    /**
     * Constructs a Product object with all necessary data for a generic product.
     *  @param articleNumber Article number of this product
     * @param name Name of this product
     * @param manufacturer Manufacturer of this product
     * @param price Price of this product
     */
    public Product(long articleNumber, String name, String manufacturer, double price) {
        this.articleNumber = articleNumber;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.packagingUnit = 1;
        Product.counter++;
    }

    /**
     * Construct a Product object with all necessary data for a generic product and additionally defines the amount of
     * units per package
     *  @param articleNumber Article number of this product
     * @param name Name of this product
     * @param manufacturer manufacturer of this product
     * @param price Price of this product
     * @param packagingUnit How many units of the product are included per package
     */
    public Product(long articleNumber, String name, String manufacturer, double price, int packagingUnit) {
    	
    	this(articleNumber, name, manufacturer, price);
 
        this.packagingUnit = packagingUnit;
    }

    public static Product parseString(String[] elements) {
        if (elements.length == 5) {
            return new Product(Long.parseLong(elements[1]), elements[2],
                    elements[3], Double.parseDouble(elements[4]));
        }
        if (elements.length == 6)
            return new Product(Long.parseLong(elements[1]), elements[2], elements[3],
                    Double.parseDouble(elements[4]), Integer.parseInt(elements[5]));

        return null;
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

    public long getArticleNumber() {
        return articleNumber;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPackagingUnit() {
        return packagingUnit;
    }

    public double getPrice() {
        return price;
    }

    public String getProductString() {
        return manufacturer + " " + name;
    }

    public int getCount() {
        return Product.counter;
    }

    @Override
    public String toString() {
        return "Product: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price + "; packaging unit: " + packagingUnit;
    }
}
