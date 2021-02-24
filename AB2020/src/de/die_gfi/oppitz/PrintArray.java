package de.die_gfi.oppitz;

public class PrintArray {

	public static void main(String[] args) {
	
		int count = 242 - 2 + 1;
		
		int[] arr = new int[count];
		
		int value = 2; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value++;
		}
		
		de.die_gfi.util.Print.printArray(arr);

	}

}
