package de.die_gfi.felix.shop;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Shop felixOnlineShop = new Shop("Felix Fröhlicher Online Shop",
				"Kaiser Wilhelm Alee 12, 77777 Hinter-Pusemuckel, Deutschland", 777888999);
		Customer kunde1 = new Customer("Harald", "Harald(at)Harald(dot)com",
				"Haraldstrasse 1, 77777 Haraldstadt, Schweden");

		Product produkt1 = new Product("Haralds Radiowecker", 12, "77777");
		Book produkt2 = new Book("Harald Töpfer und der Stein der Weisen", 13, "88888", "JK Rollen", "Fantasy Roman");
		Food produkt3 = new Food("Haralds Vegane Glutenfreie Mettwurst mit Zwibeln", 14, "99999", 500, true);

		ArrayList<Product> kollecktionListe = new ArrayList<Product>();
		kollecktionListe.add(produkt1);
		kollecktionListe.add(produkt2);
		kollecktionListe.add(produkt3);
		
		ArrayList<CounterTest> kollecktionListe2 = new ArrayList<CounterTest>();
		kollecktionListe2.add(produkt1);
		kollecktionListe2.add(produkt2);
		kollecktionListe2.add(produkt3);

		ProductCollection produktPallette = new ProductCollection(kollecktionListe);

		Purchase einkauf = einkaufDurchfueren(sc, felixOnlineShop, produktPallette);

		kunde1.addPurchase(einkauf);
		felixOnlineShop.addCustumer(kunde1);

		System.out.println("Folgende Artikl werden bestellt:");
		System.out.println(einkauf);
		System.out.println("Rechnung wird Erstellt");
		System.out.println(einkauf.erstellenRechnung(kunde1, felixOnlineShop));
		System.out.println("\n");
		sc.close();
		printCounter(kollecktionListe2);
	}

	private static Purchase einkaufDurchfueren(Scanner sc, Shop felixOnlineShop, ProductCollection produktPallete) {
		ArrayList<PurchaseItem> einkaufswagen = new ArrayList<PurchaseItem>();

		System.out.println("Herzlich Willkommen bei " + felixOnlineShop.name + "/n");
		System.out.println(produktPallete);
		System.out.println(
				"Möchten Sie eines Der Produkte Kaufen? Geben Sie die Produktnummer ein. Wenn Sie fertig sind: \"xxxNein\" eingeben");
		
		boolean schalter = true;
		boolean schalter2 = true;
		
		while (schalter) {
			String eingabe = sc.next();
			if (eingabe.equals("xxxNein")) {
				schalter = false;
				break;
			}
			int produktIndex = produktPallete.returnProduktIndexVonNummer(eingabe);
			if(produktIndex == -1) {
				System.out.println("Produkt wurde nicht gefunden. Bitte versuchen Sie es erneut");
			}
			
			int anzahl = -1;
			
			while(schalter2 == true) {
				System.out.println("Wie viele Stück dieses Artikels möchten Sie kaufen?");
				anzahl = sc.nextInt();
				if(anzahl <= 0) {
					System.out.println("die eingegebene Anzhal ist zu klein. Versuchen Sie es erneut");
				} else {
					break;
				}
			}
		
			PurchaseItem kauf1 = new PurchaseItem(produktPallete.produktListe.get(produktIndex), anzahl);
			einkaufswagen.add(kauf1);
			System.out.println("möchten Sie noch etwas Kaufen?");
		}

		Purchase einkauf = new Purchase(einkaufswagen);
		return einkauf;
	}
	
	public static void printCounter(ArrayList<CounterTest> kollecktionsListe) {
		for(CounterTest x : kollecktionsListe) {
			System.out.println(x);
			System.out.println(x.getCounter());
		}
	}

}
