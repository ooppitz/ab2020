package de.die_gfi.oppitz.shop;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Customer c = new Customer("Maria Grazia Parisi", "mpg@gmail.com", "Viale Lombardia 34", "87474", "Milano",
				"Italien");
		System.out.println(c);
		
		ArrayList<Product> products;
		
		Product book = new Book("Guarisci il tuo passato - cambia il tuo futuro", "Libro di auto-aiuto", 19.90, "Maria Grazia Parisi", "Sperling & Kupfer", 2013);
		Product book2 = new Product("Die Bibel", "Religiöse Literatur", 15.5);
		Product book3 = new Book("Der Name der Rose", "Belletristik", 10.0, "Umberto Ecco", " La nave di Teseo", 2019);
		Product computer = new Computer("MacBook Pro", "Apple Silicon", 1300.0);

		products = new ArrayList<Product>(Arrays.asList(book, book2, book3, computer));
		
		System.out.println("Available Products:");
		for(Product p : products) {
			System.out.println(p);
		}
		
		
		Purchase p = new Purchase(c);
		p.add(book, 3);
		p.add(book2, 1);
		p.add(book3, 1);

		
		System.out.println(p.toString());
		
		System.out.println("Total amount = " + p.calculateTotal());
		
		System.out.println();
		String bill = p.generateBill();
		System.out.println(bill);
		
		
	}
}
