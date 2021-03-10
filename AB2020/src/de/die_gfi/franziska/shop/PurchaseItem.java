package de.die_gfi.franziska.shop;

public class PurchaseItem {

	double preis;
	int menge;
	Product p;

	public static void main(String[] args) {
		
		Book proG = new Book("Gulaschsuppe für Fortgeschrittene", 9.99, 1, 347);
		PurchaseItem p1 = new PurchaseItem(proG, 13, proG.preis);
		System.out.println(p1);
		
		Getraenke eLimo = new Getraenke("Erdbeerlimo", 1.00, 3, "22.08.2023");
		PurchaseItem p2 = new PurchaseItem(eLimo, 2, eLimo.preis);
		System.out.println(p2);
		
		
	}


	public PurchaseItem(Product p, int m, double preis) {
		this.preis = p.preis;
		this.p = p;
		this.menge = m;
	}

	public static int mengenAbfrage() {

		System.out.println("Bitte Menge eingeben: ");

		int anzahl = App.scannerApp.nextInt();

		return anzahl;
		
	}

	public String toString() {

		String mengeP = String.format("%-4s", menge +"x");
		
		String nameP = String.format("%s", p.name );
	
		String preisP = String.format("%f", p.preis);
		
		
//		return menge + " x " + p.name + " " + (preis * menge) + "€";

		return mengeP + nameP + preisP;
	}
	
	public static PurchaseItem productToPurchaseItem(Product p) {

		PurchaseItem item = new PurchaseItem(p, PurchaseItem.mengenAbfrage(), p.preis);

		return item;
	}
}
