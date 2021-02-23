package de.die_gfi.franziska;

public class ArrayMin {

	public static void main(String[] args) {

		int[] ints = { 0, 2, 4, -6, 8, -10 };

		int smallNumber = Integer.MAX_VALUE;

		for (int i = 0; i < ints.length; i++) {

			if (ints[i] < smallNumber) {
				smallNumber = ints[i];
			}
		}
		System.out.println(smallNumber);
	}
}
