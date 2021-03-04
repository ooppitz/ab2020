package de.die_gfi.jonathan.shop;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	public ProductCollection storage = new ProductCollection();
	ArrayList<Customer> user = new ArrayList<>();
	
	public void buy(int index,Customer kunde) {
		kunde.addPurchaseItem(index, storage);
	}
	
	public void output() {
		Scanner sc=new Scanner(System.in);
		boolean running=true;
		do {
			
		
		Customer c;
		String account=sc.next();
		if (account=="Admin") {
		System.out.println("coming soon");
		}else {
			
			c=find(account);
			boolean login=true;
			do {
			
				
			
			String input=sc.next();
			if (input.equalsIgnoreCase("index")) {
				storage.giveIndex();			
			}else if (input.equalsIgnoreCase("buy")) {
				
				buy(sc.nextInt(), c);
			}else if (input.equalsIgnoreCase("logout")) {
				login=false;
			}else if (input.equalsIgnoreCase("search")) {
				storage.search(sc.next());
			}else if (input.equalsIgnoreCase("print")) {
				c.printPurchase();
			}else if (input.equalsIgnoreCase("bill")) {
				c.createBill();
			}
			else if (input.equalsIgnoreCase("exit")) {
			login=false;
			running=false;
			break;
			}
			} while (login==true);
		}
			
		
		
		} while (running==true);
	}
	
	public void demo() {
		//hinzufügen kunden
		initilizeCustomer();
		initilizeProducts();
		
		// einkauf
		storage.giveIndex();
		
		
		buy(0,user.get(0));
		buy(1,user.get(0));
		buy(2,user.get(0));
		buy(4,user.get(1));
		buy(5,user.get(2));
		buy(6,user.get(3));
		user.get(0).printPurchase();
		user.get(0).createBill();
		user.get(2).printPurchase();
		user.get(2).createBill();
		user.get(3).printPurchase();
		user.get(1).printPurchase();
		
	}
	public void initilizeCustomer() {
		user.add(new Customer("Julius", "Octavian")) ;
		user.add(new Customer("Claudius", "Nero"));
		user.get(0).setAdress("Imperium Romanum", "Rom", "Palatin", 1);
		user.get(1).setAdress("Imperium Romanum", "Rom", "Domus Aurea", 1);
		user.add(new Customer("Shakespear", "William"));
		user.get(2).setAdress("England", "Stratford-upon-Avon", "Heneley Street", 12);
		user.add(new Customer("Stuart", "James"));
		user.get(3).setAdress("England", "London", "St. James Palace", 1);
		user.add(new Customer("Plinius", "Gaius"));
		user.get(4).setAdress("Imperium Romanum", "Misenum", "Naval Docks", 5);
	}
	
	public void initilizeProducts() {
		Book b1 = new Book("Gaius", "Institutonen", "Latein", 20);
		Book b2 = new Book("Gaius Julius Casar", "De Bello Gallico", "Latein", 15);
		Book b3 = new Book("Gaius Plinius Secundus", "Naturae Historium", "Latein", 50);
		Book b4 = new Book("Homer", "Odysee", "Grichisch", 45);
		Book b5 = new Book("Justinian", "Corpus iuris civilis", "Latein", 60);
		Book b6 = new Book("William I.", "Domesday Book", "Englisch", 55.5);
		Trinket t1 = new Trinket("feurio 500", 7, "Feuerzeug");
		Trinket t2 = new Trinket("macbeths", 5, "Bühnendolch");
		// aufnahme der Produkte ins Sortiment
		storage.addToCollection(b1, 10);
		storage.addToCollection(b2, 20);
		storage.addToCollection(b3, 5);
		storage.addToCollection(b4, 7);
		storage.addToCollection(t1, 3);
		storage.addToCollection(t2, 3);
		storage.addToCollection(b6, 7);
	}
	
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
