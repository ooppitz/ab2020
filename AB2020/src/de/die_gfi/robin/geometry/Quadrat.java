package de.die_gfi.robin.geometry;

public class Quadrat extends Rechteck{
	
	public Quadrat(double k) {
		super(k,k);
	}
	
	
	public static void main(String[] args) {
		
		Quadrat q1 = new Quadrat(3);
		System.out.println("Flächeninhalt: " + q1.flaecheBerechnen() + "^2");
		System.out.println("Umfang: " + q1.umfangBerechnen());
		
		
	}
	
	
	public String toString() {
		return "Das Quadrat hat eine Kantenlänge von " + this.a;
	}
	
	
	
}
