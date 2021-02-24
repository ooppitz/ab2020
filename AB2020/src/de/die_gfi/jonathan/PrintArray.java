package de.die_gfi.jonathan;

import de.die_gfi.util.Print;

public class PrintArray {

	public static void main(String[] args) {
		
		// 2 ... 242
		// 2 .. 3   ...   3-2 = 1 
		
		int upperBound = 242;
		int lowerBound = 2;
		int count = upperBound - lowerBound + 1;
		
		int[] b = new int[count];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = i + 2;
		}
		Print.printArray(b);
	}

}
