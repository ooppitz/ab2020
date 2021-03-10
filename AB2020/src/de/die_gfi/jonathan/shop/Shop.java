		package de.die_gfi.jonathan.shop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {
	public ProductCollection storage = new ProductCollection();
	ArrayList<Customer> user = new ArrayList<>();
	Demo d =new Demo(storage, user);

	// vereinfacht die das einkaufen ist aber nicht notwendig
	public void buy(int index, Customer kunde) {
		kunde.addPurchaseItem(index, storage);
	}

//die Bedinoberfläche
	public void output() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		do {

			Customer c;
			String account = sc.next();
			if (account == "Admin") {
				// TODO hinzufügen
				System.out.println("coming soon");
			} else {

				c = find(account);
				boolean login = true;
				do {

					String input = sc.next();
					if (input.equalsIgnoreCase("index")) {
						storage.giveIndex();
					} else if (input.equalsIgnoreCase("buy")) {
						
						try {
							buy(sc.nextInt(), c);
						} catch (InputMismatchException e) {
								System.out.println("Falsce eingabe kauf vorgang abgebrochen");
						}catch (IndexOutOfBoundsException e) {
							System.out.println("Das Produkt existirt nicht");
						}}
						else if (input.equalsIgnoreCase("buymult")) {
						int ram =sc.nextInt();
							System.out.println("wie viel stück wollen sie kaufen");
							int timer=sc.nextInt();
							for (int i = 0; i < timer; i++) {
						try {
							
							buy(ram, c);
						} catch (InputMismatchException e) {
							System.out.println("Falsce eingabe kauf vorgang abgebrochen");
						} catch (IndexOutOfBoundsException e) {
							System.out.println("Das Produkt existirt nicht");
						}}
					}
					 else if (input.equalsIgnoreCase("logout")) {
						login = false;
					} else if (input.equalsIgnoreCase("search")) {
						storage.search(sc.next());
					} else if (input.equalsIgnoreCase("print")) {
						c.printPurchase();
					} else if (input.equalsIgnoreCase("bill")) {
						c.createBill();
					} else if (input.equalsIgnoreCase("exit")) {
						login = false;
						running = false;
						break;
					}
				} while (login == true);
			}

		} while (running == true);
	}

	
	// suchalgoritmus für die Kunden liste
	public Customer find(String suche) {
		for (Customer customer : user) {

			if (customer.account.equalsIgnoreCase(suche)) {
				return customer;
			}
		}
		System.out.println("Suche nicht erlogreich");
		return null;
	}

}