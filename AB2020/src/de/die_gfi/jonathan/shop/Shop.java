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

    //die Bedinoberfläche
	public void userInterface() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		do {

			String account = sc.next();
			if (account == "Admin") {
				String input = sc.next().toLowerCase();
				switch (input) {
				case "addC":

					break;

				default:
					break;
				}
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
		System.out.println("Mögliche Eingaben: print search index logout buy buymult exit bill");
		do {

			String input = sc.next().toLowerCase();
			switch (input) {
			case "buy": {

				try {
					buy(sc.nextInt(), c);
				} catch (InputMismatchException e) {
					System.out.println("Falsche Eingabe Kaufvorgang abgebrochen");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Das Produkt existiert nicht");
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
						System.out.println("Falsce eingabe kauf vorgang abgebrochen");
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Das Produkt existirt nicht");
					}
				}
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