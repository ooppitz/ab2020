package de.die_gfi.robin.shop;


public class Purchase {
	
	String bezeichnung;
	
	
	
	
	
	
	public Purchase(PurchaseItem[] arr, Customer c) {
		bezeichnung = c + "\n";
		for (int i = 0; i < arr.length; i++)  {
			bezeichnung += arr[i].menge + " x " + String.format("%-60s", arr[i].bezeichnung) + String.format("%14.2f", arr[i].preis) + " €\n";
		}
		
		
	}
	
	public String toString() {
		
		return this.bezeichnung;
	}
	
}
