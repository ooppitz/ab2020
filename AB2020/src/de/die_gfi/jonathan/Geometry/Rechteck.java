package de.die_gfi.jonathan.Geometry;

public class Rechteck {
	double laenge;
	double breite;

	public Rechteck(double l, double b) {
		laenge = l;
		breite = b;
	}

	public double Flaeche() {
		return laenge * breite;
	}

	public double Umfang() {
		return (laenge + breite) * 2;
	}

	public String toString() {
		return "Das Rechteck hat eine Länge von " + laenge + " und eine Breite von " + breite + " der"
				+ " Umpfang beträgt " + this.Umfang() + " die Fläche ist " + this.Flaeche();
	}

	public static void main(String[] args) {
		Rechteck r1 = new Rechteck(5, 2);
		System.out.println(r1);
	}

}
