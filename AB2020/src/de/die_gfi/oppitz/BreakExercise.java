package de.die_gfi.oppitz;

public class BreakExercise {

	public static void main(String[] args) {

		int[] arr = { 8, 4, 3, 1, 10, 9 };

		int searchForValue = 8;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchForValue) {
				System.out.println("The index of " + searchForValue + " is " + i);
				break;
			}
		}
		// <---- break jumps here

		int excludeIndex = 4;
		for (int i = 0; i < arr.length; i++) {

			if (i == excludeIndex) {
				continue;
			}
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				System.out.println(i + " - " + j);
				if (i == 4 && j == 4) {
					break;
				}
			}
			if (i == 4) {
				break;
			}
		}

	}

}
