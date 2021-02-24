package de.die_gfi.franziska;


public class PrintArray {

	public static void main(String[] args) {

		int[] arr = new int[243];
		
		for (int i = 2; i < arr.length; i++) {
			
			arr[i] = i;
		}
		
		de.die_gfi.util.Print.printArray(arr);
		
		
		
	}

}
