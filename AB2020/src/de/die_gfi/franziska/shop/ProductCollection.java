package de.die_gfi.franziska.shop;

import java.util.ArrayList;

import java.util.Scanner;

public class ProductCollection {

	ArrayList<Product> productCollection;

	public ProductCollection(ArrayList<Product> listOfProducts) {

		this.productCollection = listOfProducts;

	}

	public static void main(String[] args) {

	}

	/**
	 * @param ProductCollection c
	 * @return Product[] from ArrayList<Product>
	 */
	public Product[] toArray() {

		Product[] arr = new Product[this.productCollection.size()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = productCollection.get(i);

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

			ausgabe = ausgabe + productCollection.get(i).toString();

		}
		return ausgabe;
	}

	public String auswahlTreffen() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unsere Kategorien: \n");

		System.out.println("Bücher \nGetränke \nLebensmittel");

		String ausgabe = "";

		
			System.out.println("\nBitte eine Kategorie wählen");

			switch (scanner.nextLine()) {
			case "Bücher":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (productCollection.get(i) instanceof Book) {

						ausgabe = ausgabe + productCollection.get(i).toString() + "\n";
					}
				}

				System.out.println("Bitte Artikel durch Artikelnummer auswählen \n");

				break;

			case "Getränke":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (productCollection.get(i) instanceof Getraenke) {

						ausgabe = ausgabe + productCollection.get(i).toString() + "\n";

					}
				}

				break;

			case "Lebensmittel":

				for (int i = 0; i < ProductCollection.laenge(this); i++) {
					if (productCollection.get(i) instanceof Nahrung) {

						ausgabe = ausgabe + productCollection.get(i).toString() + "\n";

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

		Scanner scanner = new Scanner(System.in);

		int chosenArticle = scanner.nextInt();

		String ausgabeTest = "";

		for (int i = 0; i < ProductCollection.laenge(this); i++) {

			if (productCollection.get(i).artikelnummer == chosenArticle) {

				ausgabeTest = "Ihr gewählter Artikel ist " + productCollection.get(i).name;

			}

		}

		return ausgabeTest;
	}

	public Product auswahlArtikelAlsProduct() {

		Scanner scanner = new Scanner(System.in);

		int chosenArticle = scanner.nextInt();

		Product chosenProduct = new Product("filler", 99, 99);

		for (int i = 0; i < ProductCollection.laenge(this); i++) {

			if (productCollection.get(i).artikelnummer == chosenArticle) {

				chosenProduct = productCollection.get(i);

			}

		}
		return chosenProduct;
	}
}
