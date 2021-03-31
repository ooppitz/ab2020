package de.die_gfi.oppitz.interfaces;

public class Punkt3D extends Punkt implements CounterInterface{

	double z;
	
	static int counterPunkt3D = 0;
	
	public Punkt3D(double x, double y, double z) {
		
		super(x,y);
		
		Punkt3D.counterPunkt3D++;
		Punkt.counterPunkt--; // 3D - Punkte zählen nicht als 2D-Punkte
		
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
	
	public int getCount() {

		return Punkt3D.counterPunkt3D;
	}
	
	public int setCount(int newValue) {
		int oldValue = Punkt3D.counterPunkt3D;
		Punkt3D.counterPunkt3D = newValue;
		return oldValue;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " z: " + this.z;
	}

}
