package de.die_gfi.felix;

public class PrintArray {
	public static void main(String args[]) {
		int[] intArr = new int[242 - 2 + 1]; 
		int zähler = 2;
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = zähler;
			zähler++;
		}
	de.die_gfi.util.Print.printArray(intArr);	
	}
	

}
