package de.die_gfi.felix.geometry;

public class Quadrat extends Rechteck{
	
	public Quadrat(double seitenlaenge) {
		super(seitenlaenge, seitenlaenge);
	}
	
	public static void main(String args[]) {
		
		Rechteck rechteck1 = new Rechteck(2 , 3);
		Quadrat quadrat1 = new Quadrat(2);
		
		System.out.println(rechteck1);
		System.out.println("Umfang: " + rechteck1.rechneUmfang());
		System.out.println("Flaecheninhalt: " + rechteck1.rechneFlaeche()); 
		
		System.out.println(quadrat1);
		System.out.println("Umfang: " + quadrat1.rechneUmfang());
		System.out.println("Flaecheninhalt: " + quadrat1.rechneFlaeche()); 
		
	}
	
	public String toString() {
		String result = new String("{ Seitenlaenge: " + this.laenge +  " }");
		return result;
	}
}
