package de.die_gfi.robin.interfaces;

public class Dreieck {
	double a;
	double b;
	double c;
	static int count;
	
	
	public Dreieck(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		count++;
	}
	
	
	public static void main(String[] args) {
		Dreieck d1 = new Dreieck(3,5,2);
		DreieckGleichschenklig d2 = new DreieckGleichschenklig(3,3,5);
		
		
		System.out.println(count);
	}
	
	
	
}
