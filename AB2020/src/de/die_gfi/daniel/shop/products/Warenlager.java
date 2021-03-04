package de.die_gfi.daniel.shop.products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.die_gfi.daniel.shop.Book;
import de.die_gfi.daniel.shop.Lebensmittel;
import de.die_gfi.daniel.shop.Product;

public class Warenlager {

	/** Helfermethode, welche Produkte anlegt und als ArrayList zurückgibt
	 * 
	 * @return List von Produkten
	 */
	public static ArrayList<Product> createWarenlager() {

		ArrayList<Product> lager = new ArrayList<Product>();

		/* Product Test */
		Product wecker = new Product("Analogwecker", 10.0, "Made in Germany", 4189325);
		System.out.println(wecker);
		
		// TODO : remove println()

		Product nudeln = new Product("Fusilli Nudeln", 0.49, "500 gramm", 7928195);
		System.out.println(nudeln);

		/* Book Test */
		Book buch = new Book("Javainsel", 49.90, "15. Auflage", 9783836377372L, "Rheinwerk Verlag",
				"Christian Ullenboom", "978-3-8362-7737-2");
		System.out.println(buch);

		/* Lebensmittel Test */
		Lebensmittel brot = new Lebensmittel("Vierkornbrot", 10.0, "Scheibenstaerke 12", 4803460, "5 Tage");
		System.out.println(brot);

		/* Zuweisungstest */
		Product zutat = new Lebensmittel("Eier", 2.0, "Bodenhaltung", 4803465, "30. Februar");
		System.out.println(zutat);
		
		List<Product> list = Arrays.asList(wecker, nudeln, buch, brot, zutat);
		lager.addAll(list);
		
		return lager;

	}
	
	/** Diese Methode könnte in Zukunft Produkte aus einer echten DB lesen
	 * 
	 * @return eine Liste der Produkte, die in der DB gespeichert sind
	 */
	public static ArrayList<Product> leseWarenlagerAusDB() {
		
		// DB- Zugriff
		
		return null;
	}

}
