package de.die_gfi.franziska.interfaces;

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

	@Override
	public String toString() {

		return super.toString() + "z: " + this.z;

	}

public static int countPunkt3D(Punkt[] punkte) {
		
		int counter = 0;
		
		for (int i = 0; i < punkte.length; i++) {
			
			if (punkte[i] instanceof Punkt3D) {
				
				counter = counter + 1;
				
			}
		}
		
		return counter;
	}

	
}
