package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class App {
	
	public static void main(String args[]) {
		Custumer kunde1 = new Custumer("Harald", "Harald(at)Harald(dot)com", "Haraldstrasse 1, 77777 Haraldstadt, Schweden");
		
		System.out.println(kunde1);
		
		
		Product produkt1 = new Product("Haralds Radiowecker", 12, 77777);
		
		System.out.println(produkt1);
		
		produkt1.displayInformation();
		
		
		Book produkt2 = new Book("Harald Töpfer und der Stein der Weisen", 14, 88888, "JK Rollen", "Fantasy Roman");
		System.out.println(produkt2);
		produkt2.displayInformation();
		
		Food produkt3 = new Food("Haralds Vegane Glutenfreie Mettwurst mit Zwibeln", 13, 99999, 500, true);
		System.out.println(produkt3);
		produkt3.displayInformation();
		
		PurchaseItem kauf1 = new PurchaseItem(produkt1, 12);
		PurchaseItem kauf2 = new PurchaseItem(produkt2, 13);
		PurchaseItem kauf3 = new PurchaseItem(produkt3, 14);
		
		System.out.println(kauf1);
		
		ArrayList<PurchaseItem> einkaufswagenListe =new ArrayList<PurchaseItem>();
		einkaufswagenListe.add(kauf1);
		einkaufswagenListe.add(kauf2);
		einkaufswagenListe.add(kauf3);
		
		Purchase einkaufswagen = new Purchase(einkaufswagenListe);
		System.out.println(einkaufswagen);
			
		ArrayList<Product> kollecktionListe = new ArrayList<Product>();
		kollecktionListe.add(produkt1);
		kollecktionListe.add(produkt2);
		kollecktionListe.add(produkt3);
		
		ProductCollection kollecktion = new ProductCollection(kollecktionListe);
		System.out.println(kollecktion);
		
		Shop onlineShop = new Shop("Felix Fröhlicher Onlineshop", "Guenthergasse 2 77777 Haraldsstadt Haraldsland", 777888999);
		System.out.println(onlineShop);
		
		String rechnung = einkaufswagen.erstellenRechnung(kunde1, onlineShop);
		System.out.println(rechnung);
		

	}

}
