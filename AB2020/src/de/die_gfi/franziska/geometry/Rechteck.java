package de.die_gfi.franziska.geometry;

	
public class Rechteck {

	double a;
	double b;

	public Rechteck(double laenge, double breite) {

		this.a = laenge;
		this.b = breite;

	}

	public static void main(String[] args) {

		Rechteck r = new Rechteck(2,3);
		
		System.out.println("Die Fläche beträgt: " + r.berechneFlaeche());
		
		System.out.println("Der Umfang beträgt: " + r.berechneUmfang());
		
		System.out.println(r.toString());
		
	}

	public double berechneFlaeche() {

		return a * b;

	}

	public double berechneUmfang() {

		return 2 * (a + b);

	}

	public String toString() {

		return "Das Rechteck hat eine Länge von " + a + " und eine Breite von " + b;

	}

}
