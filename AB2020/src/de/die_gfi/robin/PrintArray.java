package de.die_gfi.robin;

public class PrintArray {
	public static void main(String[] args) {
		
		int[] arr = new int[241];
		
		int counter = 2;
		
		
		for (int i = 0; i < 241; i++) {
			arr[i] = counter;
			counter++;
		}
		
		de.die_gfi.util.Print.printArray(arr);
		
	}
}
