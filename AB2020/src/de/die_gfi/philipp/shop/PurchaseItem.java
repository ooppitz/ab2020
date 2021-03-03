package de.die_gfi.philipp.shop;

public class PurchaseItem {
    Product prod;
    int amount;

    public PurchaseItem(Product prod, int amount) {
        this.prod = prod;
        this.amount = amount;
    }
}
