package de.die_gfi.jonathan.shop;

public class App {

	public static void main(String[] args) {
		Customer c1 = new Customer("Julius", "Octavian");
		c1.setAdress("Imperium Romanum", "Rom", "Palatin", 1);
		System.out.println(c1);
		Book b1 = new Book("Gaius", "Institutonen", "Latein", 0, 0);
		Book b2 = new Book("Gaius Julius Casar", "De Bello Gallico", "Latein", 0, 0);
		Book b3 = new Book("Gaius Plinius Secundus", "Naturae Historium", "Latein", 0, 0);
		c1.addPurchaseItem();
	}
}
