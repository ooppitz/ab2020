package de.die_gfi.felix.geometry;

public class Rechteck {
	
	double laenge;
	double breite;

	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	public static void main(String Args[]) {
		
	}
	
	public String toString() {
		String result = new String("{ Laenge: " + this.laenge + ", Breite: " + this.breite + " }");
		return result;
	}
	
	public double rechneUmfang() {
		return (this.laenge + this.breite) * 2;
	}
	
	public double rechneFlaeche() {
		return this.laenge * this.breite;
	}
}
