package de.die_gfi.felix_arrays;

import java.util.Arrays;
import de.die_gfi.util.Print;


public class Aufgabe1_2_4to9_11 { 
	public static void main(String args[]) {
		String[] staedte = {"Berlin", "Bern", "Dortmund", "Stutgart", "Wien", "Reichenberg", "Hamburg", "Zürich", "Salzburg", "Luxemburg", "Straßburg", "Frankfurt", "Danzig", "Koeln", "Bozen", "Breslau", "Dresden", "Königsberg", "Oedenburg"};
		int[] zahlen = {45, 4, 65, 789, 0, -45, 87, 257, 99};
		
		//2. sum up values of an array
		
		int summe = summeArray(zahlen);
		System.out.println("Summe: " + summe);
			
		//4. calculate the average value of an Array
		
		int durchschnitt = summe / zahlen.length;
		System.out.println("durchscnitt: " + durchschnitt);
	
		
		//1. write a java program to sort a numeric array and a string array
		
		Arrays.sort(zahlen);
		Arrays.sort(staedte);
		
		System.out.print("Sortierte Städte: ");
		Print.printArray(staedte);
		System.out.print("Sortierte Ints: ");
		Print.printArray(zahlen);
		
		//5. find out if the array contains a value
		int gesuchteZahl = 87;
		existenzPruefen(zahlen, gesuchteZahl);
		
		//6. finde den Index zu einem Gesuchten Element
		
		int indexGesuchtesElement = Arrays.binarySearch(zahlen, gesuchteZahl);
		System.out.println("Index: " + indexGesuchtesElement);
		
		//7. remove a specific element from an array
		//8. copy an array by itarating over it
		//9. add a specific element to an array
		
		int wertHinzufuegen = 12;
		
		int[] zahlen2 = gesuchtesElementLöschen(zahlen, gesuchteZahl, indexGesuchtesElement);
		
		int[] zahlen4 = arrayKopieren(zahlen);
		
		int[] zahlen5 = arrayWertHinzufuegen(zahlen, wertHinzufuegen);
		
		System.out.println("Sortierte Ints 2: ");
		Print.printArray(zahlen2);
		System.out.println("Koppiertes Array");
		Print.printArray(zahlen4);
		System.out.println("Sortierte Ints mit hinzugefuegtem Wert: ");
		Print.printArray(zahlen5);
		
		
		
		//11. reverse an array of intager values
		
		int[] zahlen3 = arrayUmdrehen(zahlen);
		
		System.out.println("Sortierte Ints umgedreht: ");
		Print.printArray(zahlen3);
	}

	private static int[] arrayWertHinzufuegen(int[] zahlen, int wertHinzufuegen) {
		int[] zahlen5 = new int[zahlen.length + 1];		
		for(int i = 0; i < zahlen.length; i++) {
				zahlen5[i] = zahlen[i];
				}
		zahlen5[zahlen5.length - 1] = wertHinzufuegen;
		Arrays.sort(zahlen5);
		return zahlen5;
	}

	private static int[] arrayKopieren(int[] zahlen) {
		int[] zahlen4 = new int[zahlen.length];		
		for(int i = 0; i < zahlen.length; i++) {
				zahlen4[i] = zahlen[i];
		}
		return zahlen4;
	}

	private static int[] gesuchtesElementLöschen(int[] zahlen, int gesuchteZahl, int indexGesuchtesElement) {
		int laengeZahlen2 = zahlen.length;
		boolean elementExistiert = existenzPruefen(zahlen,gesuchteZahl);
		if(elementExistiert) {
			laengeZahlen2 = laengeZahlen2 - 1;
		} 
		int[] zahlen2 = new int[laengeZahlen2];
		int k = 0;
		
		for(int i = 0; i < zahlen.length; i++) {
			if(i != indexGesuchtesElement) {
				zahlen2[k] = zahlen[i];
				k++;
			}
		}
		return zahlen2;
	}

	private static int[] arrayUmdrehen(int[] zahlen) {
		int[] zahlen3 = new int[zahlen.length];
		int a = 0;
		int b = zahlen.length - 1;
		
		while(a < zahlen.length) {
			zahlen3[a] = zahlen[b];
			a++;
			b--;
		}
		return zahlen3;
	}

	private static boolean existenzPruefen(int[] zahlen, int gesuchteZahl) {
		boolean schalter = false;
		if(Arrays.binarySearch(zahlen, gesuchteZahl) >= 0) {
			System.out.println("Wert Existiert");
			schalter = true;
		} else {
			System.out.println("Wert Exisitert nicht");
		}
		return schalter;
	}

	private static int summeArray(int[] zahlen) {
		int summe = 0;
		for(int i = 0; i < zahlen.length; i++) {
			summe = summe + zahlen[i];
		}
		return summe;
	}
}
