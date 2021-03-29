package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.PathGetter;
import de.die_gfi.philipp.shop.products.Product;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Objects of this class represent a purchase.
 */
public class Purchase {

	protected final ArrayList<PurchaseItem> items;

	/** Print String Formatter */
	protected static final DateTimeFormatter psf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	/** File String Formatter */
	protected static final DateTimeFormatter fsf = DateTimeFormatter.ofPattern("yyyyMMdd");

	/**
	 * Constructs a Purchase Object with empty ArrayList
	 */
	public Purchase() {
		this.items = new ArrayList<>();
	}

	/**
	 * Adds a {@link Product} with a specified amount to the {@link Purchase}
	 *
	 * @param prod   {@link Product} object
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
	 * @return true if the product in the PurchaseItem is already contained,
	 *         otherwise false
	 */
	public boolean checkContained(PurchaseItem item) {
		for (PurchaseItem pI : items) {
			if (pI.getArticleNumber() == item.getArticleNumber()) {
				return true;
			}
		}

		return false;
	}

	/**
	 *
	 * @return Index of a specific {@link PurchaseItem} in items, if the item wasn't
	 *         found returns -1
	 */
	public int getIndexOfProduct(PurchaseItem item) {
		for (int i = 0; i < items.size(); i++) {
			if (item.getArticleNumber() == items.get(i).getArticleNumber()) {
				return i;
			}
		}
		return -1;
	}

	public int getIndexOfProduct(long articleNumber) {
		for (int i = 0; i < items.size(); i++) {
			if (articleNumber == items.get(i).getArticleNumber()) {
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
	 *
	 * @return items in the purchase as a basket (eg. 2x Manufacturer Product)
	 */
	public String getAsBasket() {
		StringBuilder builder = new StringBuilder();
		if (items.size() > 0) {
			for (PurchaseItem item : items) {
				String entry = item.getAmount() + "x " + item.getManufacturer() + " " + item.getName();
				builder.append(entry).append("\n");
			}

		} else {
			builder.append("Basket empty.\n");
		}

		return builder.toString();
	}

	/**
	 * Prints the bill for this {@link Purchase} and saves it to a file.
	 *
	 * @param shop The {@link Shop} for which the bill is printed
	 */
	public void printBill(Shop shop, Customer customer) {
		int billNumber = shop.getSalesNumber() + 1;
		LocalDateTime now = LocalDateTime.now();
		String billNumString = "Bill number: " + billNumber;
		String dateString = psf.format(now);

		File billFile = new File(PathGetter.getDataPath() + "bills/" + billNumber + "-" + customer.getCustomerNumber()
				+ "-" + fsf.format(now) + ".bill");

		StringBuilder billBuilder = new StringBuilder();
		StringBuilder billMachineReadable = new StringBuilder();

		double totalSum = 0;

		// Adds the data of the shop
		billBuilder.append(shop.getShopName()).append("\n");
		billBuilder.append(shop.getShopAddress()).append("\n\n");
		String ovString = "Owner: " + shop.getOwnerName() + " ".repeat(25) + "VAT Number: " + shop.getVatNumber();
		billBuilder.append(ovString).append("\n\n");

		// Adds the customer data
		billBuilder.append("Customer Nr.:").append(customer.getCustomerNumber()).append("\n");
		billBuilder.append(customer.getName()).append("\n");
		String fullAddress = customer.getStreetHouseNumber() + "," + customer.getPostCode() + " " + customer.getCity()
				+ "\n" + customer.getCountry();
		billBuilder.append(fullAddress).append("\n\n");

		// Adds the bill number, date and a spacer
		billBuilder.append(billNumString);
		billBuilder.append(" ".repeat(ovString.length() - (billNumString.length() + dateString.length())));
		billBuilder.append(dateString).append("\n");
		billBuilder.append("-".repeat(ovString.length())).append("\n");

		// Adds each item in the order amount, manufacturer, product name, and subtotal
		for (PurchaseItem p : items) {
			double itemPrice = p.getTotalPrice();

			String itemString = String.format("%4d: %s", p.getAmount(), p.getProductString());
			String priceString = String.format("%.2f", itemPrice);

			billBuilder.append(itemString);
			billBuilder.append(" ".repeat(ovString.length() - (priceString.length() + itemString.length())));
			billBuilder.append(priceString).append("\n");

			totalSum += itemPrice;
			billMachineReadable.append(p.getArticleNumber()).append("§").append(p.getAmount()).append("|");
		}
		billMachineReadable.deleteCharAt(billMachineReadable.length() - 1).append("\n");

		// Adds a spacer
		billBuilder.append("-".repeat(ovString.length())).append("\n");

		// Adds the total
		String totalString = "Total: " + String.format("%.2f", totalSum);

		billBuilder.append(" ".repeat(ovString.length() - totalString.length()));
		billBuilder.append(totalString);

		// Prints the bill
		System.out.print(billBuilder);

		// Writes the bill in human readable and machine readable form to the disk
		try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(billFile))){
			fileWriter.write(billMachineReadable.toString());
			fileWriter.write(billBuilder.toString());
			fileWriter.flush();
			fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("File couldn't be found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Bill couldn't be written, does the application have access to the folder?");
			e.printStackTrace();
		}

	}
}
