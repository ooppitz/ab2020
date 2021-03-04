package de.die_gfi.oppitz.shop;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductCollection {

	private ArrayList<Product> stock;

	static ProductCollection instance;

	/**
	 * Initialises the stock by creating objects for all existing products
	 */
	private ProductCollection() {

		stock = fillStock();
	}

	/**
	 * Returns the only instance of ProductCollection
	 * 
	 * @return the singleton for ProductCollection
	 */
	static ProductCollection getInstance() {

		if (instance == null) {
			instance = new ProductCollection();
		}

		return instance;
	}

	/**
	 * Returns a list of the stocked products
	 * 
	 * @return the stocked products
	 */
	ArrayList<Product> getStock() {
		return stock;
	}

	/**
	 * Returns a list of the products in stock
	 * 
	 * @return
	 */
	ArrayList<Product> fillStock() {

		// TODO: extend for handling a finite number of stocked items

		ArrayList<Product> products;

		Product book = new Book("Guarisci il tuo passato - cambia il tuo futuro", "Libro di auto-aiuto", 19.90,
				"Maria Grazia Parisi", "Sperling & Kupfer", 2013);
		Product book2 = new Product("Die Bibel", "Religiöse Literatur", 15.5);
		Product book3 = new Book("Der Name der Rose", "Belletristik", 10.0, "Umberto Ecco", " La nave di Teseo", 2019);
		Product computer = new Computer("MacBook Pro", "Apple Silicon", 1300.0);

		products = new ArrayList<Product>(Arrays.asList(book, book2, book3, computer));

		return products;

	}

}
