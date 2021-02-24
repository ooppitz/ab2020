package de.die_gfi.oppitz;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Playground {

	public static void main(String[] args) {
		
		double d = Math.pow(2, 63);
		System.out.println(d);

		String numberEE = String.format("%6.0e",d);
		System.out.println(numberEE);
		
	}

}
