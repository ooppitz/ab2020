package de.die_gfi.robin.interfaces;

public class Punkt3D extends Punkt {
	double z;
	static int count;
	
	public Punkt3D (double x, double y, double z) {
		super(x,y);
		this.z = z;
		count++;
		
	}
	
	
	public Punkt3D(double x) {
		super(x);
		count++;
		
	}


	public Punkt3D(double x, double y) {
		super(x,y);
		count++;
	}


	public String toString() {
		return "x: " + this.x + " y: " + this.y + " z: " + this.z;
	}
	
}
