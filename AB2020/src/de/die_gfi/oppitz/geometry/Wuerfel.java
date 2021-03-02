package de.die_gfi.oppitz.geometry;

public class Wuerfel extends Quader {

	
	public Wuerfel(double k) {
		
		super(k, k, k);
		
	}
	
	public String toString() {
		
		return "{ k = " + this.breite + "} ";
		
	}

}
