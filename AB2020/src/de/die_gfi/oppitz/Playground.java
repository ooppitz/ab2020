package de.die_gfi.oppitz;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;


public class Playground {

	public static void main(String[] args) {
		
		int[] b = { 1, 10, 100, 1000, 10000 };

		de.die_gfi.util.Print.printArray(b);

		Arrays.fill(b, 1, 3, 99);

		de.die_gfi.util.Print.printArray(b);
		
		
	}

}
