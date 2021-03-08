package de.die_gfi.felix.interfaces_uebungen;

public class Punkt3D extends Punkt{
	
	static int counter3D;
	double z;
	
	public Punkt3D(double x, double y, double z) {
		super(x, y);
		this.counter3D++;
		this.counter--;
		this.z = z;
	}
	
	public Punkt3D(double x) {
		this(x ,0 , 0);
	}
	
	public Punkt3D(double x, double y) {
		this(x, y, 0);
	}
	
	public Punkt3D() {
		counter3D++;
		counter--;
	}
}
