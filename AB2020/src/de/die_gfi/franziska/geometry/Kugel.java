package de.die_gfi.franziska.geometry;

public class Kugel {
	
	double radius;
	double x;
	double y;

	public static void main(String[] args) {

		Kugel kugel1 = new Kugel(4,0,0);
		System.out.println("Die Oberfläche der Kugel beträgt: " + kugel1.berechneOberflache());
		System.out.println("Der Durchmesser beträgt: " + kugel1.berechneDurchmesser());
		System.out.println("Das Volumen beträgt: " + kugel1.berechneVolumen());
		System.out.println(kugel1.toString());
				
	}
	
	public Kugel(double r, double x, double y) {

		this.radius = r;
		this.x = x;
		this.y = y;

	}

	public double berechneOberflache() {

		return 4 * (Math.PI * Math.pow(radius, 2));
	}

	public double berechneDurchmesser() {

		return 2 * radius;
	}

	public double berechneVolumen() {

		return (4.0 / 3) * Math.PI * (Math.pow(radius, 3));
	}

	public String toString() {

		String s = "Die Kugel hat den Radius " + radius + " die x.Koordinate " + x + " und die y-Koordinate " + y;

		return s;
	}

}
