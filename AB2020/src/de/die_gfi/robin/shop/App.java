package de.die_gfi.robin.shop;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("Heinz" ,"Gruber", "Trauberstrasse 33", "45657", "Muenchen", false);
		
		ArrayList<ProductCollection> collection1 = ProductCollection.createProductCollection();
		
		Purchase total = simulatePurchase(c1, collection1);
		
		
		System.out.println(collection1);
		
		
		
		
		
	}
	
	public static Purchase simulatePurchase(Customer c, ArrayList<ProductCollection> collection) {
		
		
		PurchaseItem pItem1 = new PurchaseItem(collection.get(6), 2);
		PurchaseItem pItem2 = new PurchaseItem(collection.get(2), 1);
		PurchaseItem pItem3 = new PurchaseItem(collection.get(4), 1);
		
		PurchaseItem[] arr = new PurchaseItem[] {pItem1,pItem2,pItem3};
		
		Purchase total = new Purchase(arr,c);
		
		
		
		return total;
		
	}
	
	
	
	
	
	
	
}
