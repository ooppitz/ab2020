package de.die_gfi.philipp.shop;

public class PurchaseItem {
    protected Product prod;
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
        return prod.articleNumber;
    }

    /**
     * Adds the specified amount to this {@link PurchaseItem}
     *
     * @param amount Amount to be added
     */
    public void addAmount(int amount) {
        this.amount += amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
