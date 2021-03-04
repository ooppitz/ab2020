package de.die_gfi.jonathan.shop;

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("Julius", "Octavian");
		Customer c2 = new Customer("Claudius", "Nero");
		c1.setAdress("Imperium Romanum", "Rom", "Palatin", 1);
		c2.setAdress("Imperium Romanum", "Rom", "Domus Aurea", 1);
		Customer c3 = new Customer("Shakespear", "William");
		c3.setAdress("England", "Stratford-upon-Avon", "Heneley Street", 12);
		Customer c4 = new Customer("Stuart", "James ");
		c4.setAdress("England", "London", "St. James Palace", 1);
		Customer c5 = new Customer("Plinius", "Gaius");
		c5.setAdress("Imperium Romanum", "Misenum", "Naval Docks", 5);
		//Customer c6 = new Customer("", "");

		
		//System.out.println(c1);
		Book b1 = new Book("Gaius", "Institutonen", "Latein", 20);
		Book b2 = new Book("Gaius Julius Casar", "De Bello Gallico", "Latein", 15);
		Book b3 = new Book("Gaius Plinius Secundus", "Naturae Historium", "Latein", 50);
		Book b4 = new Book("Homer", "Odysee", "Grichisch", 45);
		Book b5 = new Book("Justinian","Corpus iuris civilis","Latein", 60);
		Book b6 = new Book("William I.","Domesday Book","Englisch", 55.5);
		Trinket t1 = new Trinket("feurio 500", 7, "Feuerzeug");
		Trinket t2 = new Trinket("macbeths",5,"Bühnendolch");
		
		PurchaseItem p1 = new PurchaseItem(b1, 10);
		PurchaseItem p2 = new PurchaseItem(b2 ,20);
		PurchaseItem p3 = new PurchaseItem(b3, 5);
		PurchaseItem p4 = new PurchaseItem(b4, 7);
		PurchaseItem p5 = new PurchaseItem(t1, 3);
		PurchaseItem p6 = new PurchaseItem(t2, 3);
		PurchaseItem p7 = new PurchaseItem(b6, 7);
		c1.addPurchaseItem(p1);
		c1.addPurchaseItem(p2);
		c1.addPurchaseItem(p3);
		c2.addPurchaseItem(p5);
		c3.addPurchaseItem(p6);
		c4.addPurchaseItem(p7);
		c1.printPurchase();
		c3.rechnungErstellen();
		c4.printPurchase();
		
		
	}
}
