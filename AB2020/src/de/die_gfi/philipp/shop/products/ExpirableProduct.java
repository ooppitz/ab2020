package de.die_gfi.philipp.shop.products;

public class ExpirableProduct extends Product{

    protected String bestByDate;

    public ExpirableProduct(long articleNumber, String name, String manufacturer, double price, String bestByDate) {
        super(articleNumber, name, manufacturer, price);
        this.bestByDate = bestByDate;
    }

    public ExpirableProduct(long articleNumber, String name, String manufacturer, double price, int packagingUnit, String bestByDate) {
        super(articleNumber, name, manufacturer, price, packagingUnit);
        this.bestByDate = bestByDate;
    }
}
