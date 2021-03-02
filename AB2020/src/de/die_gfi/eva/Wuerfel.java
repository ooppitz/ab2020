package de.die_gfi.eva;

public class Wuerfel extends Quader {

	public Wuerfel (double k) {
		super (k,k,k);
	}
	
	public static void main(String[] args) {
		
		Wuerfel w = new Wuerfel(4);
		
		System.out.println("Der Würfel hat das Volumen: " + w.calculateVolume());
		System.out.println();
	}
	public String toString() {
		
		 return "( k = " + this.a + " )";
	}
}
