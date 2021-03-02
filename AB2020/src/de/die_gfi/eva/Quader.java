package de.die_gfi.eva;

public class Quader {

	double a;
	double b;
	double c;

	public static void main(String[] args) {

		Quader q1 = new Quader(5, 3, 2);

		System.out.println(q1.toString());
		System.out.println("Das Volumen beträgt: " + q1.calculateVolume());
		System.out.println("Die Summe der Kantenlänge beträgt: " + q1.calculateSumEdgeLength());
		System.out.println("Die Oberfläche beträgt: " + q1.calculateArea());
		System.out.println("Die Kürzeste Seite ist: " + q1.shortestEdgeLength());

	}

	public Quader(double laenge, double breite, double hoehe) {

		this.a = laenge;
		this.b = breite;
		this.c = hoehe;

	}

	public double calculateVolume() {

		return this.a * this.b * this.c;
	}

	public double calculateSumEdgeLength() {

		return (this.a * 4) + (this.b * 4) + (this.c * 4);
	}

	public double calculateArea() {

		return (2 * (this.a * this.b)) + (2 * (this.a * this.c)) + (2 * (this.b * this.c));
	}

	public double shortestEdgeLength() {

		double shortestEdge = 0;

		if (this.a < this.b) {
			shortestEdge = this.a;
		} else {
			shortestEdge = this.b;
		if (shortestEdge > this.c)	
			shortestEdge = this.c;
		}
		return shortestEdge;
	}

	public String toString() {

		String s = "Der Quader hat eine Länge von " + this.a + " eine Breite von " + this.b + " und eine Höhe von "
				+ this.c;
		return s;
	}
	public static double berechneMinimaleHoeheEinesStapels(Quader[] stapel) {
		
		double summe = 0;
		
		for (int i = 0; i < stapel.length; i++) {
		summe = summe + stapel[i].shortestEdgeLength();
		
		}
		return summe;
	}
}
