package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class ProductCollection {

	ArrayList<Product> sortiment;

	public ProductCollection(ArrayList<Product> listOfProducts) {

		this.sortiment = listOfProducts;

	}

	/**
	 * @param ProductCollection c
	 * @return Product[] from ArrayList<Product>
	 */
	public Product[] toArray() {

		Product[] arr = new Product[this.sortiment.size()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sortiment.get(i);

		}

		return arr;
	}

	/**
	 * 
	 * @param Product[] arr
	 * @return length of the Product[]
	 */
	public static int laenge(ProductCollection collection) {

		int counter = 0;

		for (int i = 0; i < collection.toArray().length; i++) {

			counter = counter + 1;

		}

		return counter;
	}

	public String toString() {

		String ausgabe = "";

		for (int i = 0; i < ProductCollection.laenge(this); i++) {

			ausgabe = ausgabe + sortiment.get(i).toString();

		}
		return ausgabe;
	}

	public String auswahlKategorie() {
		
		System.out.println("Unsere Kategorien: \n");

		System.out.println("Bücher \nGetränke \nLebensmittel");

		String ausgabe = "";

		
			System.out.println("\nBitte eine Kategorie wählen");

			switch (App.scannerApp.next()) {
			case "Bücher":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (sortiment.get(i) instanceof Book) {

						ausgabe = ausgabe + sortiment.get(i).toString() + "\n";
					}
				}

				System.out.println("Bitte Artikel durch Artikelnummer auswählen \n");

				break;

			case "Getränke":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (sortiment.get(i) instanceof Getraenke) {

						ausgabe = ausgabe + sortiment.get(i).toString() + "\n";

					}
				}

				break;

			case "Lebensmittel":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (sortiment.get(i) instanceof Nahrung) {

						ausgabe = ausgabe + sortiment.get(i).toString() + "\n";

					}
				}

				break;

			default:

				ausgabe = "\nKategorie nicht vorhanden";

				break;
			}
	

		
		return ausgabe;
	}

	public String auswahlArtikel() {

		int chosenArticle = App.scannerApp.nextInt();

		String ausgabeTest = "";

		for (int i = 0; i < ProductCollection.laenge(this); i++) {

			if (sortiment.get(i).artikelnummer == chosenArticle) {

				ausgabeTest = "Ihr gewählter Artikel ist " + sortiment.get(i).name;

			}

		}

		return ausgabeTest;
	}

	public Product artikelNummerToProduct() {

		int chosenArticle = App.scannerApp.nextInt();

		Product chosenProduct = new Product("ungültiges Produkt", 0, 0);

		for (int i = 0; i < ProductCollection.laenge(this); i++) {

			if (sortiment.get(i).artikelnummer == chosenArticle) {

				chosenProduct = sortiment.get(i);

			}

		}
		return chosenProduct;
	}
}
