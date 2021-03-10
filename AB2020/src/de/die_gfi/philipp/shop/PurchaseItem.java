package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.products.Product;

public class PurchaseItem {
    protected final Product prod;
    protected int amount;

    /**
     * Constructs a {@link PurchaseItem} with a given amount
     *
     * @param prod A {@link Product}
     * @param amount amount of units in the {@link Purchase}
     */
    public PurchaseItem(Product prod, int amount) {
        this.prod = prod;
        this.amount = amount;
    }

    /**
     *
     * @param prod A {@link Product}
     */
    public PurchaseItem(Product prod) {
        this.prod = prod;
        this.amount = 1;
    }

    /**
     *
     * @return the article number of the {@link Product} of this {@link PurchaseItem}
     */
    public long getArticleNumber() {
        return prod.getArticleNumber();
    }

    public String getName() {
        return prod.getName();
    }

    /**
     * Adds the specified amount to this {@link PurchaseItem}
     *
     * @param amount Amount to be added
     */
    public void addAmount(int amount) {
        this.amount += amount;
    }

    /**
     *
     * @return The amount saved
     */
    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        String formattedName = String.format("%-60s", getName());
        return "" + getArticleNumber() + ": " + formattedName + " | Amount: "
                + getAmount();
    }

    public double getTotalPrice() {
        double total = prod.getPrice() * amount;
        if (prod.isDiscountPossible()) {
            double discount = (double) prod.getDiscountForAmount(amount) / 100.00;
            total = total - (discount * amount);
        }
        return total;
    }

    public String getManufacturer() {
        return prod.getManufacturer();
    }

    public String getProductString() {
        return prod.getProductString();
    }
}
