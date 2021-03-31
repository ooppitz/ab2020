package de.die_gfi.robin.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		System.out.println(berechneTageProMonat(2000, Monat.FEBRUAR));
		System.out.println(berechneTageProMonat(2001, 1));
	}
	/**
	 * Berechnet die Anzahl der Tage vorhanden in dem spezifizierten Monat und gibt diese als Integer zurueck.
	 * @param jahr Jahr in dem der Monat betrachtet werden soll
	 * @param m Der zu betrachtende Monat als enum Konstante
	 * @return Anzahl der Tage des angegebenen Monats
	 */
	public static int berechneTageProMonat(int jahr, Monat m) {
		boolean istSchaltjahr = istSchaltjahr(jahr);
		int tage = 0;

		switch (m) {
		case JANUAR -> tage = 31;
		case FEBRUAR -> tage = istSchaltjahr ? 29 : 28;
		case MAERZ -> tage = 31;
		case APRIL -> tage = 30;
		case MAI -> tage = 31;
		case JUNI -> tage = 30;
		case JULI -> tage = 31;
		case AUGUST -> tage = 31;
		case SEPTEMBER -> tage = 30;
		case OKTOBER -> tage = 31;
		case NOVEMBER -> tage = 30;
		case DEZEMBER -> tage = 31;
		
		}

		return tage;

	}
	/**
	 * Berechnet die Anzahl der Tage vorhanden in dem spezifizierten Monat und gibt diese als Integer zurueck.
	 * @param jahr Jahr in dem der Monat betrachtet werden soll
	 * @param m Der zu betrachtende Monat als Integer
	 * @return Anzahl der Tage des angegebenen Monats
	 */
	public static int berechneTageProMonat(int jahr, int m) {
		boolean istSchaltjahr = istSchaltjahr(jahr);
		int tage = 0;

		switch (m) {
		case 1 -> tage = 31;
		case 2 -> tage = istSchaltjahr ? 29 : 28;
		case 3 -> tage = 31;
		case 4 -> tage = 30;
		case 5 -> tage = 31;
		case 6 -> tage = 30;
		case 7 -> tage = 31;
		case 8 -> tage = 31;
		case 9 -> tage = 30;
		case 10 -> tage = 31;
		case 11 -> tage = 30;
		case 12 -> tage = 31;
		
		}

		return tage;

	}
	/**
	 * Prueft ob das angegebene Jahr ein Schaltjahr ist. Gibt einen boolschen Wert zurueck
	 * @param jahr
	 * @return
	 */
	public static boolean istSchaltjahr(int jahr) {
		boolean istSchaltjahr = false;
		if (jahr % 4 == 0) {
			istSchaltjahr = true;
			if (jahr % 100 == 0) {
				istSchaltjahr = false;
				if (jahr % 400 == 0) {
					istSchaltjahr = true;
				}
			}
		}
		return istSchaltjahr;

	}

}
