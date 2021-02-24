package de.die_gfi.jonathan;

import java.util.Arrays;

public class SearchInt {

	public static void main(String[] args) {
		
		int[] ints = { 0, 2, 4, -6, -8, -10 };
		int min = ints[0];
		// int min = Integer.MAX_VALUE;
		
		for (int i = 1; i < ints.length; i++) {
			if (ints[i] < min)
				min = ints[i];
		}
		System.out.println("der kleinste wert ist:" + min);

		Arrays.sort(ints);
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i] + " ");
		}
	}

}
