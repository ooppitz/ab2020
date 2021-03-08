package de.die_gfi.felix.interfaces_uebungen;

public class DreieckGleichschaenklig extends Dreieck{
	
	static int counter2;
	
	public DreieckGleichschaenklig(double a, double c) {
		super(a, a, c);
		counter2++;
		counter--;
	}

}
