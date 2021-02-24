package de.die_gfi.franziska;

public class PrintArray {

	public static void main(String[] args) {

		int[] arr = new int[241];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 2;
		}

		de.die_gfi.util.Print.printArray(arr);

	}

}
