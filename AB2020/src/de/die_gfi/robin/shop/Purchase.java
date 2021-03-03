package de.die_gfi.robin.shop;


public class Purchase {
	
	String bezeichnung;
	
	
	
	
	
	
	public Purchase(PurchaseItem[] arr, Customer c) {
		bezeichnung = c + "\n";
		double gesamt = 0;
		for (int i = 0; i < arr.length; i++)  {
			bezeichnung += arr[i].menge + " x " + String.format("%-60s", arr[i].bezeichnung) + String.format("%14.2f", arr[i].preis) + " €\n";
			gesamt += arr[i].preis;
		}
		bezeichnung += "-".repeat(80);
		bezeichnung += "\nSumme: " + String.format("%71.2f €", gesamt);
		bezeichnung += "\n\nVielen Dank für Ihren Einkauf";
		
	}
	
	public String toString() {
		
		return this.bezeichnung;
	}
	
}
