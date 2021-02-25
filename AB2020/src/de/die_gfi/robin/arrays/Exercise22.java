package de.die_gfi.robin.arrays;

//22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
public class Exercise22 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,7,45,11,5,6,11,5,100,4,2,8};
		int desiredSum = 10;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == desiredSum) {
					System.out.println(arr[i] + " and " + arr[j] + " = " + desiredSum);
				}
				
			}
			
			
			
		}
		
	}
}
