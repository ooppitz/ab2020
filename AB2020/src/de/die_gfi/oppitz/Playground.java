package de.die_gfi.oppitz;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

import de.die_gfi.util.Print;

public class Playground {

	public static void main(String[] args) {
		
		int[] b = { 1, 10, 100, 1000, 10000 };

		Arrays.fill(b, 1, 3, 99);

		Print.printArray(b);
		
		
	}

}
