package de.die_gfi.eva.interfaces;

public class Punkt3D extends Punkt {

	double z;

	public Punkt3D(double x, double y, double z) {

		super(x, y);

		this.z = z;
	}

	public Punkt3D(double x, double y) {

		this(x, y, 0);
	}

	public Punkt3D(double x) {

		this(x, 0, 0);
	}

	public String toString() {

		return super.toString() + " z: " + this.z;
	}
	
	public static int punkt3DCounter(Punkt[] arr) {
		
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] instanceof Punkt3D) {
				counter++;
			}
		}
		return counter;
	}
}
