package de.die_gfi.robin.geometry;

public class Wuerfel extends Quader {
	
	
	
	public Wuerfel(int k) {
		super(k, k, k);
	}
	
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel(4);
		System.out.println(w);
		
		System.out.println(w.sumEdges());
		
	}
	
	
	public String toString() {
		return "Der Würfel hat Kantenlänge von: " + this.a;
	}
	
	
	
	
}
