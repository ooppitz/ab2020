package de.die_gfi.philipp.shop.products;

/**
 * The objects of this class represent a generic product in an online shop.
 */
public class Product implements CounterInterface, Discount{

    protected final long articleNumber;
    protected final String name;
    protected final String manufacturer;
    protected double price;
    static int counter;
    protected boolean isDiscountable = false;
    protected int maxDiscountPercent = 0;

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
        Product.counter++;
    }

    /**
     * Construct a Product object with all necessary data for a generic product and additionally defines a discount
     *
     *  @param articleNumber Article number of this product
     * @param name Name of this product
     * @param manufacturer manufacturer of this product
     * @param price Price of this product
     * @param maxDiscountPercent The maximum discount that can be given in percent (e.g. 15 % would be 15)
     */
    public Product(long articleNumber, String name, String manufacturer, double price, int maxDiscountPercent) {
    	
    	this(articleNumber, name, manufacturer, price);
    	this.isDiscountable = true;
    	this.maxDiscountPercent = maxDiscountPercent;

    }

    /**
     * Parses a String array to a Product object <br>
     * The stored String has a format of either
     * <p>type|article number|name|manufacturer|price</p>
     * or
     * <p>type|article number|name|manufacturer|price|max discount in percent</p>
     *
     * @param elements A String array, which represents the elements for the constructor
     * @return an object initialized from the values in the elements array
     */
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

    public long getArticleNumber() {
        return articleNumber;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
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
    public boolean isDiscountPossible() {
        return isDiscountable;
    }

    @Override
    public int getMaximumDiscount() {
        return maxDiscountPercent;
    }

    @Override
    public int getDiscountForAmount(int amount) {
        if (amount > 25) {
            return maxDiscountPercent;
        }
        if (amount > 10) {
            return maxDiscountPercent/2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Product: " + articleNumber + "; " + manufacturer + " " + name +
                "; price: " + price;
    }
}
