package de.die_gfi.robin.geometry;

public class Kugel {
	
	double radius;
	
	//Koordinaten des mittelpunkts der Kugel
	double x;
	double y;
	double z;
	
	
	public static void main(String[] args) {
		
		Kugel k1 = new Kugel(2, 4, 5, 1);
		Kugel k2 = new Kugel(2, 3, 6, 1);
		
		System.out.println(k1.berechneVolumen());
		
		
		
	}
	
	
	
	
	
	
	//Konstruktor
	public Kugel (double r, double x, double y, double z) {
		this.radius = r;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double berechneOberflaeche() {
		double ergebnis = 4 * Math.PI * Math.pow(radius, 2); 
		return ergebnis;
	}
	
	public double berechneDurchmesser() {
		return this.radius * this.radius;
	}
	
	public double berechneVolumen() {
		double ergebnis = (4.0/3.0) * Math.PI * Math.pow(this.radius, 3);
		return ergebnis;
	}
	
	public String toString() {
		String s = "Die Kugel hat den Radius: " + this.radius + " und die Koordinaten x: " + this.x + " y: " + this.y + " z: " + this.z;
		return s;
	}
	
	public double calculateDistance (double px, double py, double pz) {
		
		double dx = px - x;
		double dy = py - y;
		double dz = pz - z;
		
		double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
		
		return distance;
		
	}
	
	public boolean isTouching(Kugel k) {
		double distance = this.calculateDistance(k.x, k.y, k.z);
		
		if (distance <= (k.radius + this.radius)) {
			return true;
		}
		else
			return false;
		
		
	}
	
	
}
