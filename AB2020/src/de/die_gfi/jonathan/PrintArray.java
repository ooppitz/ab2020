package de.die_gfi.jonathan;

import de.die_gfi.util.Print;

public class PrintArray {

	public static void main(String[] args) {
		int[] b = new int[241];
		for (int i = 0; i < b.length; i++) {
			b[i] = i + 2;
		}
		Print.printArray(b);
	}

}
