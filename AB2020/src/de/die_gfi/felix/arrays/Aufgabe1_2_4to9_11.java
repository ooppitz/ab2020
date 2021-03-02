package de.die_gfi.felix.arrays;

import java.util.Arrays;
import de.die_gfi.util.Print;


public class Aufgabe1_2_4to9_11 { 
	public static void main(String args[]) {
		
		String[] staedte = {"Berlin", "Bern", "Dortmund", "Stutgart", "Wien", "Reichenberg", "Hamburg", "Z�rich", "Salzburg", "Luxemburg", "Stra�burg", "Frankfurt", "Danzig", "Koeln", "Bozen", "Breslau", "Dresden", "K�nigsberg", "Oedenburg"};
		
		int[] zahlen = {45, 4, 65, 789, 0, -45, 87, 257, 99};
		
		int gesuchterWert = 87;
		
		int hinzuzufuegenderWert = 12;
		
		
		
		Arrays.sort(zahlen);
		
		Arrays.sort(staedte);
		
		int summe = summeArray(zahlen);
		
		int durchschnitt = durchschnittBerechnen(zahlen, summe);
			
		String wertExistiert = ausgabeWertExistiert(zahlen, gesuchterWert);
				
		int indexGesuchtesElement = Arrays.binarySearch(zahlen, gesuchterWert);
		
		int[] zahlen2 = gesuchtesElementLoeschen(zahlen, gesuchterWert, indexGesuchtesElement);
		
		int[] zahlen4 = arrayKopieren(zahlen);
		
		int[] zahlen5 = arrayWertHinzufuegen(zahlen, hinzuzufuegenderWert);
		
		int[] zahlen3 = arrayUmdrehen(zahlen);
		
		
		
		System.out.print("Sortiertes Intarray: ");
		Print.printArray(zahlen);
		
		System.out.println("Summe aller werte im Intarray: " + summe);
		
		System.out.println("durchscnitt aller Werte im Intarray: " + durchschnitt);
		
		System.out.println("Kopiertes Array: ");
		Print.printArray(zahlen4);
		
		System.out.println("Sortiertes Int Array mit Gel�schtem Element: ");
		Print.printArray(zahlen2);
		
		System.out.println("Sortierte Ints mit hinzugefuegtem Wert: ");
		Print.printArray(zahlen5);
		
		System.out.println("Sortiertes Intarray umgedreht: ");
		Print.printArray(zahlen3);
		
		System.out.println("Staatus des gesuchten Elements: " + wertExistiert);
		
		System.out.println("Index des gesuchten Elements: " + indexGesuchtesElement);
		
		System.out.print("Sortiertes String Array: ");
		Print.printArray(staedte);
				
	}

	private static String ausgabeWertExistiert(int[] zahlen, int gesuchteZahl) {
		boolean wertExistiert = existenzPruefen(zahlen, gesuchteZahl);
		String rueckgabe = "";
		if(wertExistiert = true) {
			rueckgabe = "Wert Existiert";
		} else {
			rueckgabe ="Wert Existiert Nicht";
		}
		return rueckgabe;
	}

	private static int durchschnittBerechnen(int[] zahlen, int summe) {
		int durchschnitt = summe / zahlen.length;
		return durchschnitt;
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

	private static int[] gesuchtesElementLoeschen(int[] zahlen, int gesuchteZahl, int indexGesuchtesElement) {
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
			schalter = true;
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
