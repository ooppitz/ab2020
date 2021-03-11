package de.die_gfi.jonathan.shop;

public class Drink extends Product implements Discount {
	boolean Alcohol;
	String bestBefore;
	public Drink(String bezeicnbung, double preis ,String minstHalt) {
		super(bezeicnbung, preis);
		//Alcohol=Alkohol;
		bestBefore=minstHalt;
	}
	
	public String toString() {
		return "Name: " + name + " Produktnummer: " + produktnumber + " preis: " + price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isDiscountPossible() {
		return false;
	}
	
	public double getMaximumDiscount(int menge) {
		if (menge>20) {
			System.out.println(name+" gibt es nur Jetzt 20% billiger");
			return price-price/20;	
		}else {
			return price;
		}
		
	}

}
