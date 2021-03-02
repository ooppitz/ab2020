package de.die_gfi.felix;

public class Kugel {
	
	double radius;
	double x;
	double y;
	double z;

	public static void main(String args[]) {
		
		Kugel kugel1 = new Kugel(5, 0, 0, 0);
		Kugel kugel2 = new Kugel(5, 10, 0, 0);
		Kugel kugel3 = new Kugel(5, 20, 0, 0);
		
		System.out.println(kugel1);
		System.out.println("Durchmesser: " + kugel1.rechneDurchmesser());
		System.out.println("Oberflaeche: " + kugel1.rechneOberflaeche());
		System.out.println("Volumen: " + kugel1.rechneVolumen());
		System.out.println("Kugeln berühren sich?: " + kugel1.kugelnBerührenSich(kugel2));
		System.out.println("Kugeln berühren sich?: " + kugel1.kugelnBerührenSich(kugel3));
	}
	
	public String toString() {
		String result = new String("{ Radius: " + this.radius + ", Mittelpunkt Koordinaten: " + this.x + "/" + this.y + "/" + this.z + " }");
		return result;
	}
	
	public double rechneVolumen() {
		return ((this.radius * this.radius * this.radius) * (4.0/3.0)) * Math.PI;
	}
	
	public double rechneOberflaeche() {
		return (4 *(this.radius * this.radius)) * Math.PI;
	}
	
	public double rechneUmfang() {
		return this.rechneDurchmesser() * Math.PI;
	}
	
	public double rechneDurchmesser() {
		return this.radius * 2;
	}
	
	public Kugel(double radius, double x, double y, double z) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean kugelnBerührenSich(Kugel kugel2) {
		double distanz = this.rechneDistanz(kugel2.x, kugel2.y, kugel2.z);
		return distanz <= this.radius + kugel2.radius;
		
	} 
	
	public double rechneDistanz(double xPunkt, double yPunkt, double zPunkt) {
		double a = xPunkt - this.x;
		double b = yPunkt -this.y;
		double bNew = zPunkt - this.z;
		a = ifNegativMakePositiv(a);
		b = ifNegativMakePositiv(b);
		bNew = ifNegativMakePositiv(bNew);
		double aNew = Math.sqrt(a*a + b*b);
		double result = Math.sqrt(aNew * aNew + bNew * bNew);
		return result;
	}

	private double ifNegativMakePositiv(double a) {
		if(a < 0) {
			a = a * -1;
		}
		return a;
	}

}
