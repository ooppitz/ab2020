package de.die_gfi.jonathan.shop;

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("Julius", "Octavian");
		Customer c2 = new Customer("Claudius", "Nero");
		c1.setAdress("Imperium Romanum", "Rom", "Palatin", 1);
		c2.setAdress("Imperium Romanum", "Rom", "Domus Aurea", 1);
		
		System.out.println(c1);
		Book b1 = new Book("Gaius", "Institutonen", "Latein", 20);
		Book b2 = new Book("Gaius Julius Casar", "De Bello Gallico", "Latein", 15);
		Book b3 = new Book("Gaius Plinius Secundus", "Naturae Historium", "Latein", 50);
		Book b4 = new Book("Homer", "Odysee", "Grichisch", 45);
		Book b5 = new Book("Justinian","Corpus iuris civilis","Latein", 60);
		
		PurchaseItem p1 = new PurchaseItem(b1, 10);
		PurchaseItem p2 = new PurchaseItem(b2 ,20);
		PurchaseItem p3 = new PurchaseItem(b3, 5);
		PurchaseItem p4 = new PurchaseItem(b4, 7);
		c1.addPurchaseItem(p1);
		c1.addPurchaseItem(p2);
		c1.addPurchaseItem(p3);
		
	}
}
