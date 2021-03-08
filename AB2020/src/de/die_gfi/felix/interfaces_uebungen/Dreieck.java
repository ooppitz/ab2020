package de.die_gfi.felix.interfaces_uebungen;

public class Dreieck {
	
	static int counter;
	double a;
	double b;
	double c;
	
	public Dreieck(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		counter++;
	}
	public String toString() {
		String result = new String("Seite a: " + this.a + ", Seite b: " + this.b + ", Seite c: " + this.c);
		return result;
	}

}
