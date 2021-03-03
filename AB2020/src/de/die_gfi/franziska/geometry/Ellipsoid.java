package de.die_gfi.franziska.geometry;

public class Ellipsoid{
	
	double radius;
	double a;
	double b;
	double c;
	
	public static void main(String[] args) {

		
		
	}
	
	public Ellipsoid(double r, double a, double b, double c) {
		
		this.radius = r;
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double berechneVolumen(){
		
		return (4.0 / 3) * Math.PI * a * b *c;
		
	}
	
	
	public double berechneOberflaeche() {
		
		double oberflaeche = 0;
		
		double ersterTeil =  2*Math.PI * a * (a + (Math.pow(c , 2)) / (Math.sqrt((Math.pow(c , 2) - Math.pow(a , 2)))));
		
		if (a == b && a > c) {
			
		
			
		}
		
		
		return oberflaeche;
	}

}
