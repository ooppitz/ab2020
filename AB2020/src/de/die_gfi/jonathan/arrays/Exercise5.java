package de.die_gfi.jonathan.arrays;

//Write a Java program to test if an array contains a specific value. 
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stringArray = { "Montag", "Array", "Dienstag", "Java", "Variante", "tippen", "lesen", "Monat",
				"Programm" };
		System.out.println("Bitte den Vergleichs Wert angeben");
		String value = sc.next();
		boolean contains = false;

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(value)) {
				contains = true;
			}
			if (contains == true) {
				System.out.println("Der angebene Wert ist enthalten");
			} else {
				System.out.println("Der angebene Wert ist nicht enthalten");

			}

		}
	}

}
