package de.die_gfi.oppitz.geometry;

public class Ellipsoid {

	double a;
	double b;
	double c;

	public Ellipsoid(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double berechneVolumen() {

		return 4.0 / 3.0 * Math.PI * a * b * c;

	}

	public double berechneOberflaeche() {

		double oberflaeche;

		if (c < a) {

			// https://en.wikipedia.org/wiki/Ellipsoid#Surface_area
			double expr = 1 - c * c / a * a;
			oberflaeche = 2 * Math.PI * a * a + Math.PI * c * c / expr * Math.log((1.0 + expr) * (1 - expr));

		}

		return 0;
	}

}
