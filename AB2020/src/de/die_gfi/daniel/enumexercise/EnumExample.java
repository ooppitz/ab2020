/*
 * Legen Sie ein Package <name>.enumexercise an.
 * Definieren Sie ein Enumeration "enum Wochtentag", welche für alle Wochentage eine Konstante enthält.
 * Schreiben Sie eine class EnumExample mit einer Methode
 * 
 *     public static String druckeWochentag(Wochentag tag);
 *     
 * Welche für jeden Wochentag den Namen des Wochentags ausgibt.
 * 
 */

package de.die_gfi.daniel.enumexercise;

public class EnumExample {

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
			return "1. April";

		}

	}

}
