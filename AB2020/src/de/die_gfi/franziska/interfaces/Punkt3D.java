package de.die_gfi.franziska.interfaces;

public class Punkt3D extends Punkt{

	double z;
	
	public Punkt3D(double x, double y, double z) {
		
		super(x,y);
		
		this.z = z;	
	}
	
	
	public Punkt3D(double x, double y) {
		
		this(x, y, 0);
		
	}
	
	
	public Punkt3D(double x) {
		
		// super(x);
		// super(x, 0);
		
		this(x, 0, 0);
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " z: " + this.z;
	}

}
