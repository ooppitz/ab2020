package de.die_gfi.eva.geometry;

public class Rechteck {

	double x;
	double y;

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(6,9);
		
		System.out.println(r1.toString());
		System.out.println("Das Rechteck hat die Fläche " + r1.berechneFlaeche() + " und den Umfang " + r1.berechneUmfang());
	}

	public Rechteck(double laenge, double breite) {

		this.x = laenge;
		this.y = breite;
	}

	public double berechneFlaeche() {

		return this.x * this.y;
	}

	public double berechneUmfang() {

		return 2 * this.x + 2 * this.y;
	}

	public String toString() {

		return "Das Rechteck hat die Länge " + this.x + " und die Breite " + this.y;

	}
}
