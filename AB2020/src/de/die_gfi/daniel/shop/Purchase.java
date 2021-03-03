package de.die_gfi.daniel.shop;

import java.util.ArrayList;

/**
 * Represents on purchase e.g. one cart full of good
 */
public class Purchase {

	ArrayList<PurchaseItem> items;

	public Purchase() {
		items = new ArrayList<PurchaseItem>();
	}

	/**
	 * Adds a PurchaseItem to the cart i.e. specifies a product and the numer that
	 * is added
	 * 
	 * @param item
	 */
	public void add(PurchaseItem item) {

		items.add(item);

	}

	/** Generates a bill for this purchase 
	 * 
	 * @return a string representing the purchase
	 */
	public String generatBill() {

		String bill = "Rechnung";
		bill += "\n";

		for (PurchaseItem i : this.items) {

			// 3 x "Die Bibel" 99.5 Euro

			String articleName = i.product.name;
			double articlePrice = i.product.preis;
			int count = i.count;

			bill += count + " x " + articleName + " " + count * articlePrice + "\n";

		}

		return bill;
	}

	@Override
	public String toString() {
		return "";
	}

	public static void main(String[] args) {

		Purchase cart = new Purchase();

		Book b = new Book("Die Bibel", 10, "Spirituelle Literatur", 3438942, "Vatikan Verlag", "Die Evangelisten",
				"4237842378");
		PurchaseItem p = new PurchaseItem(b, 3);
		cart.add(p);

		Book b2 = new Book("Der Name der Rose", 10, "Krimi", 34111942, "Gribaldi", "Umberto Ecco", "42322444378");
		PurchaseItem p2 = new PurchaseItem(b2, 1);
		cart.add(p2);
		
		Book b3 = new Book("I am that", 10, "Spirituelle Literatur", 34111942, "Random House", "Sri N.", "224378");
		PurchaseItem p3 = new PurchaseItem(b3, 1);
		cart.add(p3);
		
		String bill = cart.generatBill();
		System.out.println(bill);

	}

}
