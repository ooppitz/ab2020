package de.die_gfi.felix.shop;

public class Food extends Product{

	int kalorien;
	boolean mussGekuehltWerden;
	
	
	public Food(String name, double preis, int nummer, int kalorien, boolean mussGekuehltWerden) {
		super(name, preis, nummer);
		this.kalorien = kalorien;
		this.mussGekuehltWerden = mussGekuehltWerden;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Preis: " + preis + ", Nummer: " + nummer + ", Kallorien: " + kalorien + ", Bedarf Kühlung?: " + mussGekuehltWerden);
		return result;
	}
	
}
