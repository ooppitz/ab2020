package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.products.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Objects of this class represent a purchase.
 */
public class Purchase {

    protected ArrayList<PurchaseItem> items;
    protected static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

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

    /**
     * Prints the bill for this {@link Purchase}
     *
     * @param shop The {@link Shop} for which the bill is printed
     */
    public void printBill(Shop shop, Customer customer) {
        LocalDateTime now = LocalDateTime.now();

        String billNumString = "Bill number: " + shop.getSalesNumber() + 1;
        String dateString = dtf.format(now);

        double totalSum = 0;

        // Prints the data of the shop
        System.out.println(shop.getShopName());
        System.out.println(shop.getShopAddress() + "\n");
        String ovString = "Owner: " + shop.getOwnerName() + " ".repeat(25) + "VAT Number: " + shop.getVatNumber();
        System.out.println(ovString);

        // Prints the customer data
        System.out.println("\n #" + customer.getCustomerNumber()+ " " + customer.getName());
        System.out.println(customer.getAddress() + "\n");

        // Prints the bill number, date and a spacer
        System.out.println(billNumString +
                " ".repeat(ovString.length() - (billNumString.length() + dateString.length())) + dateString);
        System.out.println("-".repeat(ovString.length()));

        // Prints each item in the order amount, manufacturer, product name, and subtotal
        for (PurchaseItem p : items) {
            double itemPrice = p.getTotalPrice();
            String itemString = String.format("%4d: %s", p.getAmount(),p.getProductString());
            String priceString = String.format("%.2f", itemPrice);
            System.out.println(itemString +
                    " ".repeat(ovString.length() - (priceString.length() + itemString.length())) + priceString);
            totalSum += itemPrice;
        }

        // Prints a spacer
        System.out.println("-".repeat(ovString.length()));

        // Prints the total
        String totalString = "Total: " + String.format("%.2f", totalSum);
        System.out.println(" ".repeat(ovString.length()-totalString.length()) + totalString);

    }
}
