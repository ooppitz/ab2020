package de.die_gfi.jonathan.objekt;

public class Wuerfel extends Quader {

	public Wuerfel(double a) {
		super(a, a, a);	}
	
	public String toString() {
		return "die Seiten des würfeles sind jeweils "+a; 
	}
	
	public static void main(String[] args) {
		Wuerfel d =new Wuerfel(6);
		System.out.println(d);
		
	}

}
