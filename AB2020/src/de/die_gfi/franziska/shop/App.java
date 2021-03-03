package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ProductCollection p = App.createProductCollection();

		Product[] products = p.toArray();

		Customer kurt = new Customer("Kurt Maier", "Landau", "kurt@maier.de");

		Purchase k = simulatePurchase(kurt, p);

		System.out.println(k.toString(k));

	}

	/**
	 * 
	 * @param Customer c
	 * @return creates Purchase object which contains multiple Products
	 */
	public static Purchase simulatePurchase(Customer c, ProductCollection p) {

		ArrayList<PurchaseItem> purchasedItems = new ArrayList<PurchaseItem>();

		Product erstesShort = p.toArray()[0];
		Product zweitesShort = p.toArray()[4];

		PurchaseItem erstes = new PurchaseItem(erstesShort, erstesShort.anzahl, erstesShort.preis);

		PurchaseItem zweites = new PurchaseItem(zweitesShort, zweitesShort.anzahl, zweitesShort.preis);

		purchasedItems.add(erstes);
		purchasedItems.add(zweites);

		Purchase purchase = new Purchase(c, purchasedItems);

		return purchase;
	}

	/**
	 * Experiment um zu überprüfen, ob das ausgewählte Produkt in einem bestimmten
	 * Sortiment vorhanden ist.
	 * 
	 * @param p
	 * @param product
	 * @return
	 */
	public boolean isPartOfProductLine(ProductCollection p, Product product) {

		int indexStorage = 0;

		for (int j = 0; j < p.toArray().length; j++) {

			String gesuchterName = p.toArray()[j].name;

			@SuppressWarnings("unused")
			Product gekauftesProdukt = p.toArray()[indexStorage];

			for (int i = 0; i < p.toArray().length; i++) {

				if (p.toArray()[i].name == gesuchterName) {

					indexStorage = i;
				}

			}
		}

		return true;
	}

	/**
	 * @return array in form of an ArrayList with predefined content
	 */
	public static ProductCollection createProductCollection() {

		Book b = new Book("Gulaschsuppe für Fortgeschrittene", 9.99, 1, 347);
		Book o = new Book("Stricken lernen", 67.00, 2, 345578);
		Getraenke g = new Getraenke("Erdbeerlimo", 1, 3, "22.08.2023");
		Nahrung n = new Nahrung("Sandwich", 2, 4, "04.03.2021");
		Nahrung a = new Nahrung("Babybrei", 8, 5, "01.01.2030");

		ArrayList<Product> produkte = new ArrayList<Product>();

		produkte.add(b);
		produkte.add(o);
		produkte.add(g);
		produkte.add(n);
		produkte.add(a);

		ProductCollection collection = new ProductCollection(produkte);

		return collection;

	}

	/**
	 * 
	 * @param arr
	 * @return Primitive array out of the ArrayList
	 */

	public String[] toStringArray(Product[] arr) {

		String[] strings = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {

			strings[i] = arr[i].toString();

		}

		return strings;

	}

}
