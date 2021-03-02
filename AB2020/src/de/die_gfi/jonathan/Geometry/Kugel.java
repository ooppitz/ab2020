package de.die_gfi.jonathan.Geometry;

public class Kugel {
	double radius;
	double x;
	double y;
	double z;

	public double berechneOberflaeche() {
		return 4 * Math.PI * radius * radius;
	}

	public double berechneDurchmesser() {
		return radius * 2;
	}

	public double berechneVolumen() {
		return (4.0 / 3) * Math.PI * radius * radius * radius;
	}

	public String toString() {
		return "Radiu s" + this.radius + " Kordinaten " + this.x + this.y + this.z;
	}

}
