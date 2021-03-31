package de.die_gfi.oppitz.interfaces.rechenmaschinenneu;

import de.die_gfi.oppitz.interfaces.rechenmaschine.Rechenmaschine;

public class RechenmaschineNeu extends Rechenmaschine {

	private static int product; 
	
	public static int calculateProduct(int x, int y) {
		
		Rechenmaschine.setA(x);
		Rechenmaschine.setB(y);
		calculateProduct();
		
		return product;
	}
	
	private static void calculateProduct() {
		
		product = Rechenmaschine.a * Rechenmaschine.b;
	}
	
}
