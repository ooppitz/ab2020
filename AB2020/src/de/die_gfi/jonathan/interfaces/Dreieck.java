package de.die_gfi.jonathan.interfaces;

public class Dreieck {
	double a;
	double b;
	double c;
	static int anzahl;
	
	public Dreieck(double a, double b, double c) {
  anzahl++;
	}
	
	public static void main(String[] args) {
		Dreieck d= new Dreieck(3, 5, 3);
		Dreieck d0= new Dreieck(3, 5, 3);
		System.out.println(Dreieck.anzahl);
	}

}
