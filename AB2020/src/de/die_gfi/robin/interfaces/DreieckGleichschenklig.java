package de.die_gfi.robin.interfaces;

public class DreieckGleichschenklig extends Dreieck {
	
	static int count;
	
	
	public DreieckGleichschenklig(double a,double b, double c) {
		super(a, b, c);
		count++;
	}
	
	
}
