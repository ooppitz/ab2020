package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class Product implements Discount {

	String name;
	double preis;
	int artikelnummer;

	public static int counter = 0;

	public static void main(String[] args) {

		Book proG = new Book("Gulaschsuppe für Fortgeschrittene", 9.99, 1, 347);
		Book sLernen = new Book("Stricken lernen", 67.00, 2, 345578);
		Getraenke eLimo = new Getraenke("Erdbeerlimo", 1.00, 3, "22.08.2023");
		Getraenke bier = new Getraenke("Bier", 1.86, 4, "nächster Tag bis 4 Uhr");
		Nahrung sandwich = new Nahrung("Sandwich", 2.00, 5, "04.03.2021");
		Nahrung brei = new Nahrung("Babybrei", 10.00, 6, "01.01.2030");
		Nahrung mGulasch = new Nahrung("Minderwertiges Gulasch", 28, 7, "jetzt");
		Nahrung erbsen = new Nahrung("N' Batzen Bohnen", 3, 8, "wahrscheinlich noch ne gute Zeit entfernt");
		Nahrung mettIgel = new Nahrung("Mettigel", 9, 9, "unbekannt");

		ArrayList<Product> produkte = new ArrayList<Product>();

		produkte.add(proG);
		produkte.add(sLernen);
		produkte.add(eLimo);
		produkte.add(bier);
		produkte.add(sandwich);
		produkte.add(brei);
		produkte.add(mGulasch);
		produkte.add(erbsen);
		produkte.add(mettIgel);

		for (Product product : produkte) {
			if (product instanceof Book) {

				System.out.println("Anzahl Bücher: " + product.getCount());

			} else if (product instanceof Nahrung) {

				System.out.println("Anzahl Lebensmittel: " + product.getCount());

			} else {

				System.out.println("Anzahl Getränke: " + product.getCount());

			}
		}

	}

	public Product(String n, double p, int nr) {

		this.name = n;
		this.preis = p;
		this.artikelnummer = nr;

		Product.counter++;

	}

	public String toString() {

		return "Name: " + name + "\nPreis: " + preis + "\nArtikelnummer: " + artikelnummer;

	}

	public int getCount() {

		return Product.counter;

	}

	@Override
	public boolean isDiscountPossible() {
		
		return true;
	}

	@Override
	public int getMaximumDiscount() {
		
		
		return 30;
	}

	@Override
	public int getDiscountForAmount(int count) {
		
		return 10;
	}
}
