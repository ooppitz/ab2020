package de.die_gfi.franziska.shop;

public class Product implements Discount {

	String name;
	double preis;
	int artikelnummer;

	public static int counter = 0;

	public static void main(String[] args) {

	}

	public Product(String n, double p, int nr) {

		this.name = n;
		this.preis = p;
		this.artikelnummer = nr;

		App.f.format(preis);

		Product.counter++;

	}

	public String toString() {

		return "Name: " + name + "\nPreis: " + preis + "\nArtikelnummer: " + artikelnummer;

	}	
	
	public static Product purchaseItemToProduct(PurchaseItem purchaseItem) {
		
		Product produkt = new Product(purchaseItem.p.name, purchaseItem.p.preis, purchaseItem.p.artikelnummer);
		
		return produkt;
		
	}


	public int getCount() {

		return Product.counter;

	}

	@Override
	public boolean isDiscountPossible() {

		return true;
	}

	@Override
	public int getMaximumDiscount() {

		return 30;
	}

	@Override
	public int getDiscountForAmount(int count) {

		return 10;

	}
}
