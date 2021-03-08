package de.die_gfi.jonathan.interfaces;

public class Punkt3d extends Punkt {
	double x=0;
	double y=0;
	private int anzahld;
	double z =0;
	public Punkt3d(double x,double y,double z) {
super(x, y);
this.z=z;
anzahld++;
	}
	
	public static void main(String[] args) {
		// Punkt p = new Punkt(9);  // x = 9;
		// Punkt q = new Punkt(3, 7);
		// Punkt3d a = new Punkt3d(9,3,2);
	//	 Punkt3d b = new Punkt3d(7);
	//	 Punkt3d c = new Punkt3d(7,4);
	}

}


