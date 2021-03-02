package de.die_gfi.franziska.geometry;

public class Wuerfel extends Quader {

	public Wuerfel(double k){
		
		super(k, k, k);
		
	}
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel(2);
		
		System.out.println(w.calculateArea());
		
		System.out.println(w.toString());
		
	}
	
	public String toString() {
		
		return "{ k = " + this.b + " }";
		
	}
	
}
