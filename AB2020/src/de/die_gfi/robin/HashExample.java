package de.die_gfi.robin;

import java.util.Arrays;

public class HashExample {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		int hash = Arrays.hashCode(arr);
		
		System.out.println(hash);
		
		
		int counter = -1;
		for (int i = 0; i < 5; i++) {
			arr[i] = counter;
			counter--;
			
		}
		
		hash = Arrays.hashCode(arr);
		
		System.out.println(hash);
	}
	
	
	
}
