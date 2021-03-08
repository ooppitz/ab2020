package de.die_gfi.felix.shop;

public class Food extends Product implements CounterTest{

	int kalorien;
	boolean mussGekuehltWerden;
	static int counterFood;
	
	public Food(String name, double preis, String nummer, int kalorien, boolean mussGekuehltWerden) {
		super(name, preis, nummer);
		counterProduct--;
		counterFood++;
		this.kalorien = kalorien;
		this.mussGekuehltWerden = mussGekuehltWerden;
	}
	
	public String toString() {
		String result = new String("Name: " + name + ", Preis: " + preis + ", Nummer: " + nummer + ", Kallorien: " + kalorien + ", Bedarf Kühlung?: " + mussGekuehltWerden);
		return result;
	}
	
	public int getCounter() {
		return counterFood;
	}
	
}
