/*
 * Aufgabe:
 *
 * Teil 1:
 * Schreiben Sie ein Programm, welches ein Passwort von der Console einliest und den Hashwert abspeichert. Anschließend soll das Programm noch einmal ein Passwort einlesen und mit Hilfe des Hashwertes feststellen, ob das gleich Passwort eingegeben wurde.
 * Suchen Sie eine Methode, um für einen String ein ensprechendes char[] zu bekommen.
 *
 *
 * Geben Sie ein Passwort ein: Abcde1234
 * Geben Sie noch einmal ein Passwort ein: ...
 * Die Passwörter sind gleich
 * oder
 * Die Passwörter unterscheiden sich.
 *
 *
 * Teil 2:
 * Bauen Sie Ihr Programm so um, dass sie eine „Methode“
 *
 *      int readPassword()
 *
 * haben, welche das Passwort liest und den Hashwert zurückgibt.
 *
 */

package de.die_gfi.daniel;

import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.lang.String;

public class PasswordExercise {
	
	static Scanner eingabe = new Scanner(System.in);
	
	public static void main(String[] args) {

		int oldHash = readPassword();
		System.out.printf("oldHash = %d\n", oldHash);

		int newHash = readPassword();
		System.out.printf("newHash = %d\n", newHash);

		if (oldHash == newHash) {
			System.out.printf("Die Passwörter sind gleich\n");
		} else {
			System.out.printf("Die Passwörter unterscheiden sich\n");
		}
		
		eingabe.close();
	}

	public static int readPassword() {

		System.out.printf("Geben Sie ein Password ein:\n");
		String puffer = eingabe.nextLine();
		int hash = Arrays.hashCode(puffer.toCharArray());

		return hash;
	}
}
