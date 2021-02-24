package de.die_gfi.felix;

import java.util.Arrays;

public class HashExample {
	public static void main(String args[]) {
		int[] array = { 8, 3, 13, 1, 4, 9, 10, 12, 11, 1, 2, 5};
		
		int hashcode2 = Arrays.hashCode(array);
		System.out.println(hashcode2);
		
		array[array.length-1] = 4;
		
		int hashcode = Arrays.hashCode(array);
		System.out.println(hashcode);
		
		array[array.length-2] = 3;
		
		hashcode = Arrays.hashCode(array);
		System.out.println(hashcode);
		
		array[array.length-1] = -26;
		
		hashcode = Arrays.hashCode(array);
		System.out.println(hashcode);
		
		if(hashcode == hashcode2) {
			System.out.println("YES!");
		}
	}
}
