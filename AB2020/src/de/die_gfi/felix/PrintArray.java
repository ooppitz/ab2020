package de.die_gfi.felix;

import de.die_gfi.util.Print;

public class PrintArray {
	public static void main(String args[]) {
		int[] intArr = new int[242 - 2 + 1]; 
		int zaehler = 2;
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = zaehler;
			zaehler++;
		}
	Print.printArray(intArr);	
	}
	

}
