package de.die_gfi.felix.geometry;

public class Wuerfel extends Quader {
	
	public Wuerfel(double kante) {
		super(kante, kante, kante );
	}

	public static void main(String args[]) {
		Wuerfel wuerfel1 = new Wuerfel(5);
		System.out.println(wuerfel1.rechneOberflaeche());
		System.out.println(wuerfel1);
		
	}
	
	public String toString() {
		
		String result = new String("{ Kantenlänge: " + this.tiefe + " }");
		return result;
	}
}
