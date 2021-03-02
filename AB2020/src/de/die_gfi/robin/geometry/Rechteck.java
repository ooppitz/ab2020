package de.die_gfi.robin.geometry;

public class Rechteck {
	
	double a;
	double b;
	
	
	public static void main(String[] args) {
		
		Rechteck re1 = new Rechteck(2, 4);
		System.out.println(re1);
		System.out.println("Die Fläche ist " + re1.flaecheBerechnen() + "^2");
		System.out.println("Der Umfang beträgt: " + re1.umfangBerechnen());
	}
	
	
	public Rechteck(double laenge, double breite) {
		this.a = laenge;
		this.b = breite;
		
	}
	
	public String toString() {
		return "Das Rechteck hat die Länge: " + this.a + " Die Breite: " + this.b;   
	}
	
	public double flaecheBerechnen() {
		return this.a * this.b;
	}
	
	public double umfangBerechnen() {
		return (2 * this.a) + (2 * this.b); 
	}
	
}
