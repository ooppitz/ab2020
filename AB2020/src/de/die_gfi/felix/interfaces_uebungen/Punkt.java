package de.die_gfi.felix.interfaces_uebungen;

public class Punkt { 

	double x;
	double y;
	static int counter;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
		this.counter++;
	}
	
	public Punkt(double x) {
		this.x = 0;
		this.counter++;
	}
	
	public Punkt() {
		this.counter++;
	}
	
	public static void main(String args[]) {
		Punkt punkt1 = new Punkt();
		Punkt punkt2 = new Punkt(1);
		Punkt punkt3 = new Punkt(1 , 2);
		Punkt3D punkt3D1 = new Punkt3D();
		Punkt3D punkt3D2 = new Punkt3D(1);
		Punkt3D punkt3D3 = new Punkt3D(2, 1);
		Punkt3D punkt3D4 = new Punkt3D(3, 2, 1);
		Punkt3D punkt3D5 = new Punkt3D();
		System.out.println(Punkt.counter + " " + Punkt3D.counter3D);
	}
	
}
