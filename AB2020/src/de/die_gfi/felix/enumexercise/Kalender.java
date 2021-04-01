package de.die_gfi.felix.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		System.out.println(wochentagBerechnen(1598, 1, 1));

	}

	public static Wochentag wochentagBerechnen(int jahr, int monat, int tag) {
		int anzahlTage = 0;
		if (jahr >= 1600) {
			for (int i = 1600; i < jahr; i++) {
				if (jahrIstSchaltjahr(i)) {
					anzahlTage += 366;
				} else {
					anzahlTage += 365;
				}
			}
			anzahlTage += berechneAnzahlTage(jahr, monat, tag);
			anzahlTage--;
			int gesuchterTag = anzahlTage % 7;
			switch (gesuchterTag) {
			case 0: return Wochentag.SAMSTAG;
			case 1: return Wochentag.HEILIGERSONNTAG;
			case 2: return Wochentag.MONTAG;
			case 3: return Wochentag.DIENSTAG;
			case 4: return Wochentag.MITTWOCH;
			case 5: return Wochentag.DONNERSTAG;
			case 6: return Wochentag.FREITAG;
			default: return Wochentag.ERROR;
			}
		} else {
			System.out.println("WARNUNG: Das gwählte Datum liegt nicht Innerhalb des Gregorianischen Kalenders! Die Angebane sind Inkorrekt!");
			for (int i = jahr + 1; i <= 1600; i++) {
				if (jahrIstSchaltjahr(i)) {
					anzahlTage += 366;
				} else {
					anzahlTage += 365;
				}
			}
			if(jahrIstSchaltjahr(jahr)) {
				anzahlTage += (366 - berechneAnzahlTage(jahr, monat, tag));
			} else {
				anzahlTage += (365 - berechneAnzahlTage(jahr, monat, tag));
			}
			
			anzahlTage--;
			int gesuchterTag = anzahlTage % 7;
			switch (gesuchterTag) {
			case 0: return Wochentag.SAMSTAG;
			case 1: return Wochentag.HEILIGERSONNTAG;
			case 2: return Wochentag.MONTAG;
			case 3: return Wochentag.DIENSTAG;
			case 4: return Wochentag.MITTWOCH;
			case 5: return Wochentag.DONNERSTAG;
			case 6: return Wochentag.FREITAG;
			default: return Wochentag.ERROR;
			}
		}
	}
	
	
	
	/**
	 * die Methode errechnet der wie vielte Tag auf das Ganze Jahr gerechnet der tag des eingegebenen Datums ist
	 * Das ergebis wird als Int zurück gegeben
	 * @param jahr Das Jahr in dem der Tag liegt als int
	 * @param monat der Monat in dem der Tag liegt als int
	 * @param tag der gesuchte Tag des Monats als int
	 * @return der wieveilte Tag das gegebene datum nach Jahresbeginn liegt als int
	 */
	public static int berechneAnzahlTage(int jahr, int monat, int tag) {
		int anzahlTage = 0;
		if(tag < 1 || tag > berechneTageProMonat(jahr, monat)) {
			 System.out.println("ERROR! ungültige Anzahl Tage pro Monat. Die Ausgegebene Zahl ist nicht korrekt.");
		}
		for(int i = 1; i < monat; i++) {
			anzahlTage = anzahlTage + berechneTageProMonat(jahr, monat);
		}
		anzahlTage = anzahlTage + tag;
		return anzahlTage;
	}
	
/**
 * Die Methode ermittelt ermittelt die Anzahl von Tagen eines Gewähtlen Monats im Gewählten Jahr
 * @param jahr Jahr für das der Monat ausgegeben werden soll
 * @param m gewünschter Monat für den die anzahl der Tage ausgegeben werden soll
 * @return anzahl an Tagen es gwählten Monats des gewählten Jahres als integer
 */
	public static int berechneTageProMonat(int jahr, Monat m) {

		boolean schaltjahr = jahrIstSchaltjahr(jahr);
		int tage;

		switch (m) {

		case JANUAR, MAERZ, MAI, JULI, AUGUST, OKTOBER, DEZEMBER -> {
			return 31;
		}

		case FEBRUAR -> {
			return 28 + (schaltjahr ? 1 : 0);
		}

		case APRIL, JUNI, SEPTEMBER, NOVEMBER -> {
			return 30;
		}

		default -> {
			return -1;
		}

		}
	}
/**
 * Ermittelt ob ein angegebenes Jahr ein Schaltjahr ist und gibt darauf einen Boolean zurück
 * @param jahr das Jahr das überprüft wreden soll
 * @return schaltjahr boolean. wenn das Jahr ein schaltjahr ist gibt er true zurück wenn nicht false
 */
	private static boolean jahrIstSchaltjahr(int jahr) {
		boolean schaltjahr = (jahr % 4) == 0;
		if(jahr % 100 == 0 && jahr % 400 != 0) {
			schaltjahr = false;
		}
		return schaltjahr;
	}
	/**
	 * Ruft mehrer Methoden auf um die anzahl der Tage in einem anhand eines INtegers von 1 - 12 definierten Monats in einem Gewählten Jahr als Integer zurück
	 * @param jahr das Jahr in dem der Monat liegt der gemeint ist
	 * @param m Integer der den Monat definiert
	 * @return
	 */
	public static int berechneTageProMonat(int jahr, int m) {
		return berechneTageProMonat(jahr, Monat.xyz(m));
	}

}
