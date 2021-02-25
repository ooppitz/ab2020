package de.die_gfi.felix_arrays;

import java.util.Arrays;



public class Aufgabe1_2_4to9_11 { 
	public static void main(String args[]) {
		String[] staedte = {"Berlin", "Wien", "Hamburg", "Zürich", "Salzburg", "Luxemburg", "Straßburg", "Frankfurt", "Danzig", "Koeln", "Bozen", "Breslau"};
		int[] zahlen = {45, 4, 65, 789, 0, -45, 87, 257, 99};
		
		//2. sum up values of an array
		
		int summe = 0;
		for(int i = 0; i < zahlen.length; i++) {
			summe = summe + zahlen[i];
		}
		System.out.println("Summe: " + summe);
			
		//4. calculate the average value of an Array
		
		int durchschnitt = summe / zahlen.length;
		System.out.println("durchscnitt: " + durchschnitt);
	
		
		//1. write a java program to sort a numeric array and a string array
		
		Arrays.sort(zahlen);
		Arrays.sort(staedte);
		
		System.out.println("Sortierte Städte: " + Arrays.toString(staedte));
		System.out.println("Sortierte Ints: " + Arrays.toString(zahlen));
		
		//5. find out if the array contains a value
		int gesuchteZahl = 87;
		if(Arrays.binarySearch(zahlen, gesuchteZahl) >= 0) {
			System.out.println("Wert Existiert");
		} else {
			System.out.println("Wert Exisitert nicht");
		}
		
		//6. finde den Index zu einem Gesuchten Element
		
		int index = Arrays.binarySearch(zahlen, gesuchteZahl);
		System.out.println("Index: " + index);
		
		//7. remove a specific element from an array
		//8. copy an array by itarating over it
		//9. add a specific element to an array
		
		int laengeZahlen2 = zahlen.length;
		if(index >= 0) {
			laengeZahlen2 = laengeZahlen2 - 1;
		} else {
			laengeZahlen2 = laengeZahlen2 + 1;
		}
		int[] zahlen2 = new int[laengeZahlen2];
		int k = 0;
		
		for(int i = 0; i < zahlen.length; i++) {
			if(i != index) {
				zahlen2[k] = zahlen[i];
				k++;
			}
		}
		
		if(index < 0) {
			zahlen2[zahlen2.length - 1] = gesuchteZahl;
			Arrays.sort(zahlen2);
		}
		
		System.out.println("Sortierte Ints 2: " + Arrays.toString(zahlen2));
		
		
		//11. reverse an array of intager values
		
		int[] zahlen3 = new int[zahlen.length];
		int a = 0;
		int b = zahlen.length - 1;
		
		while(a < zahlen.length) {
			zahlen3[a] = zahlen[b];
			a++;
			b--;
		}
		
		System.out.println("Sortierte Ints umgedreht: " + Arrays.toString(zahlen3));
	}
}
