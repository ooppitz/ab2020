package de.die_gfi.felix.shop;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Shop felixOnlineShop = new Shop("Felix Fröhlicher Online Shop", "Kaiser Wilhelm Alee 12, 77777 Hinter-Pusemuckel, Deutschland", 777888999);
		Customer kunde1 = new Customer("Harald", "Harald(at)Harald(dot)com", "Haraldstrasse 1, 77777 Haraldstadt, Schweden");
		
		Product produkt1 = new Product("Haralds Radiowecker", 12, 77777);
		Book produkt2 = new Book("Harald Töpfer und der Stein der Weisen", 13, 88888, "JK Rollen", "Fantasy Roman");
		Food produkt3 = new Food("Haralds Vegane Glutenfreie Mettwurst mit Zwibeln", 14, 99999, 500, true);
		
		ArrayList<Product> kollecktionListe = new ArrayList<Product>();
		kollecktionListe.add(produkt1);
		kollecktionListe.add(produkt2);
		kollecktionListe.add(produkt3);
		
		Purchase einkauf = einkaufDurchfueren(sc, felixOnlineShop, kollecktionListe);
		
		System.out.println("Folgende Artikl werden bestellt:");
		System.out.println(einkauf);
		System.out.println("Rechnung wird Erstellt");
		System.out.println(einkauf.erstellenRechnung(kunde1, felixOnlineShop));
		
		sc.close();
	}

	private static Purchase einkaufDurchfueren(Scanner sc, Shop felixOnlineShop, ArrayList<Product> kollecktionListe) {
		ArrayList<PurchaseItem> einkaufswagen = new ArrayList<PurchaseItem>();
		
		System.out.println("Herzlich Willkommen bei " + felixOnlineShop.name);
		for(int i = 0; i < kollecktionListe.size(); i++) {
			kollecktionListe.get(i).displayInformation();
			System.out.println("Moechten Sie diesen Artikel Kaufen? Wenn Ja: xxxJa, Wenn Nein: xxxNein");
			String eingabe = sc.next();
			if(eingabe.equals("xxxJa")) {
				System.out.println("Wie viele von diesm Artiekl möchten Sie kaufen?");
				int anzahl = sc.nextInt();
				PurchaseItem posten = new PurchaseItem(kollecktionListe.get(i), anzahl);
				einkaufswagen.add(posten);
			}
		}
		Purchase einkauf = new Purchase(einkaufswagen);
		return einkauf;
	}

}
