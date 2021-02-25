package de.die_gfi.robin.arrays;
import java.util.Arrays;

//1. Write a Java program to sort a numeric array and a string array.
public class Exercise1 {
	public static void main(String[] args) {
		
		int[] intArr = new int[] {3,2,4,2,3,7};
		String[] stringArr = new String[] {"Peter","Olga","Heinz","Friedrich"}; 
		
		Arrays.sort(intArr);
		de.die_gfi.util.Print.printArray(intArr);
		
		
		sortStringArray(stringArr);
		
		for (String eintrag : stringArr) {
			System.out.println(eintrag);
		}
		
		
	}
	
	
	
	
	private static String[] sortStringArray(String[] stringArr) {
		String zwischenSpeicher = "";
		
		for (int j = 0; j < stringArr.length - 1; j++) {
			for (int i = 0; i < stringArr.length - 1; i++) {
				if (stringArr[i].charAt(0) > stringArr[i + 1].charAt(0)) {
					zwischenSpeicher = stringArr[i];
					stringArr[i] = stringArr[i + 1];
					stringArr[i + 1] = zwischenSpeicher;
				}
		
			}
		}
		return stringArr;
		
	}
	
	
	
	
}
