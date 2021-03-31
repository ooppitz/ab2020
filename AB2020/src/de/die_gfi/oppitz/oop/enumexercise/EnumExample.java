package de.die_gfi.oppitz.oop.enumexercise;

/* 
 * 
 * Aufgabe
 * 
 * Legen Sie ein Package <name>.enumexercise an.
 * Definieren Sie ein Enumeration „enum Wochentag“, welche für alle Wochentage eine Konstante enthält.
 * Schreiben Sie eine class EnumExample mit einer Methode
 * 
 * public static String druckeWochentag(Wochentag tag);
 * 
 * welche für jeden Wochentag den Namen des Wochentags ausgibt.
 */

public class EnumExample {

	public static void main(String[] args) {

		
		Wochentag tag = Wochentag.MITTWOCH;
		
		String name = druckeWochentag(tag);
		System.out.println(name);
		
	}

	public static String druckeWochentag(Wochentag tag) {

		switch (tag) {

		case MONTAG:
			return "Montag";

		case DIENSTAG:
			return "Dienstag";

		case MITTWOCH:
			return "Mittwoch";

		case DONNERSTAG:
			return "Donnerstag";

		case FREITAG:
			return "Freitag";

		case SAMSTAG:
			return "Samstag";

		case SONNTAG:
			return "Sonntag";

		default:
			return "Unbekannter Wochentag";
		}
	}

}
