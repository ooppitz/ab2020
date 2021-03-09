package de.die_gfi.philipp.shop.products;

public class ExpirableProduct extends Product{

    protected final String bestByDate;

    public ExpirableProduct(long articleNumber, String name, String manufacturer, double price, String bestByDate) {
        super(articleNumber, name, manufacturer, price);
        this.bestByDate = bestByDate;
    }

    public ExpirableProduct(long articleNumber, String name, String manufacturer, double price, String bestByDate, int maxDiscountPercent) {
        super(articleNumber, name, manufacturer, price, maxDiscountPercent);
        this.bestByDate = bestByDate;
    }

    public static Product parseString(String[] elements) {
        if (elements.length == 6) {
            return new ExpirableProduct(Long.parseLong(elements[1]), elements[2],
                    elements[3], Double.parseDouble(elements[4]), elements[5]);
        }
        if (elements.length == 7) {
            return new ExpirableProduct(Long.parseLong(elements[1]), elements[2], elements[3],
                    Double.parseDouble(elements[4]), elements[5], Integer.parseInt(elements[6]));
        }

        return null;
    }
}
