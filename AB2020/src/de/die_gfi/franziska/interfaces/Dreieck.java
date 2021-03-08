package de.die_gfi.franziska.interfaces;

public class Dreieck {

	double a;
	double b;
	double c;
	public static int counter;

	public Dreieck(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		Dreieck.counter++;
	}
	
}
