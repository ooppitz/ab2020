package de.die_gfi.oppitz.geometry;

public class Kugel extends Object {

	double radius; 
	
	double x, y, z;
	
	
	public Kugel(double r) {
		
		this.radius = r;
		x = y = z = 0;
	}
	
	
	public Kugel(double r, double x, double y, double z) {
		
		this.radius =r;
		this.x = x; 
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		
		Kugel k = new Kugel(8);
		System.out.println("Die Oberfläche ist " + k.berechneOberflaeche());
		
		Kugel l = new Kugel(8, 5, 5, 5);
		System.out.println("Die Oberfläche ist " + l.berechneOberflaeche());

	}
	
	public double berechneOberflaeche() {
		
		return (4 *(this.radius * this.radius)) * Math.PI;
		
	}
	
	public double berechneVolumen() {
		
		return (4.0 / 3.0) * Math.PI * (Math.pow(radius, 3));
		
	}
	
	public double berechneDurchmesser() {
		
		return 2 * radius;
	}
	
	
	public String toString() {
		return "Die Kugel hat den Radius = " + this.radius + " und die Koordinaten x = " + this.x 
				+ " y = " + this.y + " z = " + this.z ;
	}
	

	
}
