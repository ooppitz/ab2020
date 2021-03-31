package de.die_gfi.oppitz.interfaces;

public class Dreieck implements CounterInterface {

	public static int counter;
	
	double a, b, c; 
	
	public Dreieck(double a, double b, double c) {
		
		this.a = a;
		this.b = b; 
		this.c = c;
		
		Dreieck.counter++;
	}
	
	public int getCount() {
		
		return Dreieck.counter;
	}
	
	
	public int setCount(int newValue) {
		
		int oldValue = Dreieck.counter;
		Dreieck.counter = newValue;
		return oldValue;
	}
	
}
