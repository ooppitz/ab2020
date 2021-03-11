package de.die_gfi.oppitz.playarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Afrika Europa Asien<Return>
		Scanner sc = new Scanner(System.in);

		System.out.println(sc.nextLine());  // Vorname  : Simona Barbara
		System.out.println(sc.nextLine());  // Nachnamen : Francheschetti s
	
		System.out.println(sc.nextLine());   // Adresse mit Hausnummer : "Augustenstrasse 64"
		
		System.out.println(sc.nextLine());  // Ort

		System.out.println("Das Programm ist fertig");
	}

}
