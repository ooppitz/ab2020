package de.die_gfi.oppitz.geometry;

public class Quader {

	double breite;
	double hoehe;
	double laenge;

	public Quader(double l, double b, double h) {

		this.breite = l;
		this.hoehe = b;
		this.laenge = h;

	}

	public static void main(String[] args) {

		Quader q = new Quader(2, 3, 4);
		Quader q2 = new Quader(8, 1, 9);


		System.out.println("Der Quader " + q + " hat die Oberfläche " + q.berechneOberflaeche() + " und das Volumen "
				+ q.berechneVolumen() + " und die Kantenlänge " + q.berechneKantenlaenge());
		
		Quader[] qArr = new Quader[2];
		qArr[0] = q;
		qArr[1] = q2;
		
		System.out.println("Die kleinste Höhe des Stapels ist " + berechneMinimaleHoeheEinesStapels(qArr));

	}

	public static double berechneMinimaleHoeheEinesStapels(Quader[] stapel) {
		
		double summe = 0;

		for (int i = 0; i < stapel.length; i++) {
			summe = summe + stapel[i].kuerzesteSeite();
		}

		return summe;
	}

	public double kuerzesteSeite() {

		double min;

		min = this.breite;

		if (this.hoehe < min) {
			min = this.hoehe;
		}
		if (this.laenge < min) {
			min = this.laenge;
		}
		return min;
	}

	public double berechneOberflaeche() {

		return (2 * (breite * hoehe + breite * laenge + hoehe * laenge));
	}

	public double berechneVolumen() {

		return this.breite * this.hoehe * this.laenge;
	}

	public double berechneKantenlaenge() {

		return 4 * (breite + hoehe + laenge);
	}

	@Override
	public String toString() {

		return "{" + this.breite + "/" + this.hoehe + "/" + this.laenge + " (b/h/l)}";

	}

}
