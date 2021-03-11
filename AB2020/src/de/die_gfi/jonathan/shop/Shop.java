package de.die_gfi.jonathan.shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

	ProductCollection storage = new ProductCollection();

	ArrayList<Customer> users = new ArrayList<>();

	// vereinfacht die das einkaufen ist aber nicht notwendig
	public void buy(int index, Customer kunde) {
		kunde.addPurchaseItem(index, storage);
	}

	// die Bedinoberfläche
	public void userInterface() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		do {

			String account = sc.next();
			if (account.equalsIgnoreCase("admin")) {
				boolean login = true;
				do {

					String input = sc.next().toLowerCase();

					switch (input) {

					case "addc":
						try {
							System.out.println("Bitte Nachnahmen und Vornahmen angeben");
							users.add(new Customer(sc.next(), sc.next()));
						} catch (InputMismatchException e) {
							System.err.println("falsche Eingabe!");
						}
						break;
					case "addp":
						try {
						System.out.println("Bitte Produktnamen Preis und Anzahl angben");
						storage.addToCollection(new Product(sc.next(), sc.nextDouble()), sc.nextInt());
						} catch (InputMismatchException e) {
							System.err.println("falsche Eingabe!");
						}
						break;
					case "addb":
						try {
						System.out.println("Bitte Author Titel Sprache preis und anzahl der exemplare angeben");
						storage.addToCollection(new Book(sc.nextLine(), sc.nextLine(), sc.next(), sc.nextDouble()),
								sc.nextInt());
						} catch (InputMismatchException e) {
							System.err.println("falsche Eingabe!");
						}
						break;
					case "addt":
						try {
						System.out.println("Bite Name Preis Beschreibung und Anzahl angeben");
						storage.addToCollection(new Trinket(sc.next(), sc.nextDouble(), sc.nextLine()), sc.nextInt());
						} catch (InputMismatchException e) {
							System.err.println("falsche Eingabe!");
						}
						break;
					case "index":
						storage.giveIndex();
						break;
					case "logout":
						login = false;
						break;
					case "search":
						storage.search(sc.next());
						break;
					case "exit":
						login = false;
						running = false;
						break;
					default:
						break;
					}
				} while (login == true);
			} else {

				running = customerInterface(sc, running, account);
			}

		} while (running == true);
		sc.close();
	}

	public boolean customerInterface(Scanner sc, boolean running, String account) {
		Customer c;
		c = find(account);
		boolean login = true;
		System.out.println("Mögliche Eingaben: print search index logout buy buymult exit bill adress");
		do {

			String input = sc.next().toLowerCase();
			switch (input) {
			case "buy": {

				try {
					buy(sc.nextInt(), c);
				} catch (InputMismatchException e) {
					System.err.println("Falsche Eingabe Kaufvorgang abgebrochen");
				} catch (IndexOutOfBoundsException e) {
					System.err.println("Das Produkt existiert nicht");
				}
				break;
			}
			case "buymult":
				int ram = sc.nextInt();
				System.out.println("wie viel stück wollen sie kaufen");
				int timer = sc.nextInt();
				for (int i = 0; i < timer; i++) {
					try {

						buy(ram, c);
					} catch (InputMismatchException e) {
						System.err.println("Falsce eingabe kauf vorgang abgebrochen");
					} catch (IndexOutOfBoundsException e) {
						System.err.println("Das Produkt existirt nicht");
					}
				}
				break;
			case "adress":
				c.setAdress(sc.next(), sc.next(), sc.next(), sc.nextInt());
				break;
			case "print":
				c.printPurchase();
				break;
			case "bill":
				c.createBill();
				break;
			case "index":
				storage.giveIndex();
				break;
			case "logout":
				login = false;
				break;
			case "search":
				storage.search(sc.next());
				break;
			case "exit":
				login = false;
				running = false;
				break;
			default:
				System.out.println("Mögliche Eingaben: print search index logout buy buymult exit bill");
			}

		} while (login == true);
		return running;
	}

	// suchalgoritmus für die Kunden liste
	public Customer find(String suche) {
		for (Customer customer : users) {

			if (customer.account.equalsIgnoreCase(suche)) {
				return customer;
			}
		}
		System.out.println("Suche nicht erlogreich");
		return null;
	}

}