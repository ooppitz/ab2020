package de.die_gfi.robin;

public class ArrayUebung {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
