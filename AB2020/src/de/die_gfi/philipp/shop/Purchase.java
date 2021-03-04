package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.products.Product;

import java.util.ArrayList;

public class Purchase {

    ArrayList<PurchaseItem> items;

    /**
     * Constructs a Purchase Object with empty ArrayList
     */
    public Purchase() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds a {@link Product} with a specified amount to the {@link Purchase}
     *
     * @param prod {@link Product} object
     * @param amount Amount of product to be added
     */
    public void addToPurchase(Product prod, int amount) {
        PurchaseItem item = new PurchaseItem(prod, amount);
        int index = getIndexOfProduct(item);
        if (index == -1) {
            items.add(item);
        } else {
            items.get(index).addAmount(amount);
        }
    }

    /**
     * Adds a {@link PurchaseItem} to the {@link Purchase}
     *
     * @param item a {@link PurchaseItem} object
     */
    public void addToPurchase(PurchaseItem item) {
        int index = getIndexOfProduct(item);
        if (index == -1) {
            items.add(item);
        } else {
            items.get(index).addAmount(item.getAmount());
        }

    }

    /**
     * Checks if a Product is already contained in the PurchaseItems.
     *
     * @param item PurchaseItem for which is checked
     * @return true if the product in the PurchaseItem is already contained, otherwise false
     */
    public boolean checkContained(PurchaseItem item) {
        for (PurchaseItem pI: items) {
            if (pI.getArticleNumber() == item.getArticleNumber()) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @return Index of a specific {@link PurchaseItem} in items, if the item wasn't found returns -1
     */
    public int getIndexOfProduct(PurchaseItem item) {
        for (int i = 0; i < items.size(); i++) {
            if (item.getArticleNumber() == items.get(i).getArticleNumber()) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @return a "prettified" String of the info in this {@link Purchase} object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Purchase consists of ");
        if (items.size() > 0) {
            builder.append(items.size()).append(" different items.\nThe items are as following:\n");

            for (PurchaseItem item : items) {
                String entry = item.toString() + "\n";
                builder.append(entry);
            }

        } else {
            builder.append("no items.");
        }


        return builder.toString();
    }

    public void printBill() {

    }
}
