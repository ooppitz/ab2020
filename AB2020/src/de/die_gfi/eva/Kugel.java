package de.die_gfi.eva;

public class Kugel {

	double r;
	double x;
	double y;
	double z;

	public static void main(String[] args) {
		
		Kugel k1 = new Kugel (4,1,1,1);
		
		System.out.println(k1.toString());
		System.out.println("Die Kugel hat einen Durchmesser von " + k1.berechnungDurchmesser() + ", sowie einen Oberflächeninhalt von " + k1.berechnungOberfläche() 
		+ " und ein Volumen von " + k1.berechnungVolumen());

	}
	public Kugel(double radius, double xValue, double yValue, double zValue) {
		
		this.r = radius;
		this.x = xValue;
		this.y = yValue;
		this.z = zValue;
	}

	public double berechnungOberfläche() {

		return Math.PI * 4 * Math.pow(this.r, 2);
	}

	public double berechnungDurchmesser() {

		return this.r * 2;
	}

	public double berechnungVolumen() {

		return Math.PI * Math.pow(this.r, 3) * 4.0 / 3;
	}

	public String toString() {
		
		String s = "Die Kugel hat einen Radius von " + this.r + " und die Koordinaten ( " + this.x + " / " + this.y + " / " + this.z + " )";
		
		return s;
	}
}
