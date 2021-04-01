package de.die_gfi.robin.enumexercise;

public class Kalender {

	public static void main(String[] args) {
		int jahr = 2021;
		int monat = 4;
		
		monatAusgeben(jahr, monat);
	}

	public static void monatAusgeben(int jahr, int monat) {
		int tag = 1;
		int wievielteTag = berechneTagNummer(jahr, monat, tag);
		kalenderFormatAusgeben(monat);
		String s = wochentagAusgeben(wievielteTag);

		int wievieleSteps = 1;
		switch (s) {

		case "Sonntag" -> wievieleSteps = 1;
		case "Montag" -> wievieleSteps = 5;
		case "Dienstag" -> wievieleSteps = 9;
		case "Mittwoch" -> wievieleSteps = 13;
		case "Donnerstag" -> wievieleSteps = 17;
		case "Freitag" -> wievieleSteps = 21;
		case "Samstag" -> wievieleSteps = 25;
		}

		int uebrigeTage = berechneTageProMonat(jahr, monat);
		int counterUp = 2;
		System.out.print(String.format("%" + wievieleSteps + "d", 1));
		uebrigeTage--;

		int timesToRepeat = 0;

		switch (wievieleSteps) {
		case 1 -> timesToRepeat = 6;
		case 5 -> timesToRepeat = 5;
		case 9 -> timesToRepeat = 4;
		case 13 -> timesToRepeat = 3;
		case 17 -> timesToRepeat = 2;
		case 21 -> timesToRepeat = 1;
		case 25 -> timesToRepeat = 0;
		}

		while (timesToRepeat > 0) {
			System.out.print(String.format("%4d", counterUp));
			uebrigeTage--;
			counterUp++;
			timesToRepeat--;

		}
		System.out.println("");
		int counterUmbruch = 0;
		while (uebrigeTage > 0) {
			if (counterUmbruch == 7) {
				System.out.println("");
				counterUmbruch = 0;
			}
			System.out.print(String.format("%-4d", counterUp));
			counterUp++;
			counterUmbruch++;
			uebrigeTage--;
		
		}
	}

	public static void kalenderAusgeben(int jahr) {
		int monat = 1;
		int tag = 1;
		
		while (monat <= 12) {
			int wievielteTag = berechneTagNummer(jahr, monat, tag);
			kalenderFormatAusgeben(monat);
			String s = wochentagAusgeben(wievielteTag);

			int wievieleSteps = 1;
			switch (s) {

			case "Sonntag" -> wievieleSteps = 1;
			case "Montag" -> wievieleSteps = 5;
			case "Dienstag" -> wievieleSteps = 9;
			case "Mittwoch" -> wievieleSteps = 13;
			case "Donnerstag" -> wievieleSteps = 17;
			case "Freitag" -> wievieleSteps = 21;
			case "Samstag" -> wievieleSteps = 25;
			}

			int uebrigeTage = berechneTageProMonat(jahr, monat);
			int counterUp = 2;
			System.out.print(String.format("%" + wievieleSteps + "d", 1));
			uebrigeTage--;

			int timesToRepeat = 0;

			switch (wievieleSteps) {
			case 1 -> timesToRepeat = 6;
			case 5 -> timesToRepeat = 5;
			case 9 -> timesToRepeat = 4;
			case 13 -> timesToRepeat = 3;
			case 17 -> timesToRepeat = 2;
			case 21 -> timesToRepeat = 1;
			case 25 -> timesToRepeat = 0;
			}

			while (timesToRepeat > 0) {
				System.out.print(String.format("%4d", counterUp));
				uebrigeTage--;
				counterUp++;
				timesToRepeat--;

			}
			System.out.println("");
			int counterUmbruch = 0;
			while (uebrigeTage > 0) {
				if (counterUmbruch == 7) {
					System.out.println("");
					counterUmbruch = 0;
				}
				System.out.print(String.format("%-4d", counterUp));
				counterUp++;
				counterUmbruch++;
				uebrigeTage--;
			
			}
		
		
			monat++;
			System.out.println("\n");
			
		
		
		
		
		}
	}

	public static void kalenderFormatAusgeben(int m) {
		String monatAlsString = "";

		switch (m) {
		case 1 -> monatAlsString = "Januar";
		case 2 -> monatAlsString = "Februar";
		case 3 -> monatAlsString = "März";
		case 4 -> monatAlsString = "April";
		case 5 -> monatAlsString = "Mai";
		case 6 -> monatAlsString = "Juni";
		case 7 -> monatAlsString = "Juli";
		case 8 -> monatAlsString = "August";
		case 9 -> monatAlsString = "September";
		case 10 -> monatAlsString = "Oktober";
		case 11 -> monatAlsString = "November";
		case 12 -> monatAlsString = "Dezember";
		}

		System.out.println(String.format("%15s", monatAlsString));
		System.out.println("S   M   D   M   D   F   S");
	}

	/**
	 * funktioniert nur fuer das Jahr 2021
	 */
	public static String wochentagAusgeben(int wievielterTag) {
		String s = "";
		int volleWochen = 1;
		int tageVomFreitag = 0;

		while (volleWochen < (wievielterTag - 7)) {
			volleWochen += 7;
		}
		tageVomFreitag = wievielterTag - volleWochen;

		switch (tageVomFreitag) {

		case 0 -> s = "Freitag";
		case 1 -> s = "Samstag";
		case 2 -> s = "Sonntag";
		case 3 -> s = "Montag";
		case 4 -> s = "Dienstag";
		case 5 -> s = "Mittwoch";
		case 6 -> s = "Donnerstag";
		case 7 -> s = "Freitag";
		}
		return s;
	}

	/**
	 * Berechnet der der wievielte Tag im Jahr angegeben wurde anhand des
	 * eingegebenen Datums
	 * 
	 * @param jahr
	 * @param m    Monat
	 * @param tag
	 * @return der wievielte Tag im Jahr
	 */
	public static int berechneTagNummer(int jahr, int m, int tag) {
		int tagCounter = 0;
		int i = 0;
		try {
			gueltigkeitPruefen(jahr, m, tag);

			do {

				tagCounter += berechneTageProMonat(jahr, i);
				i++;
			} while (i < m);

			tagCounter += tag;

		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		return tagCounter;
	}

	private static void gueltigkeitPruefen(int jahr, int m, int tag) throws IllegalArgumentException {
		if (m > 12 || m < 1) {
			throw new IllegalArgumentException("Ungültige Eingabe des Monats");
		}
		if (tag == 31 && m == 4 || tag == 31 && m == 6 || tag == 31 && m == 9 || tag == 31 && m == 11) {
			throw new IllegalArgumentException("Dieser Monat darf nicht mehr als 30 Tage haben");
		} else {
			if (m == 2) {
				if (istSchaltjahr(jahr) && tag > 29) {
					throw new IllegalArgumentException("Dieser Monat darf nicht mehr als 29 Tage haben");
				} else if (tag > 28) {
					throw new IllegalArgumentException("Dieser Monat darf nicht mehr als 28 Tage haben");
				}
			} else {
				if (tag > 31) {
					throw new IllegalArgumentException("Dieser Monat darf nicht mehr als 31 Tage haben");
				}
			}
		}

	}

	/**
	 * Berechnet die Anzahl der Tage vorhanden in dem spezifizierten Monat und gibt
	 * diese als Integer zurueck.
	 * 
	 * @param jahr Jahr in dem der Monat betrachtet werden soll
	 * @param m    Der zu betrachtende Monat als enum Konstante
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
	 * Berechnet die Anzahl der Tage vorhanden in dem spezifizierten Monat und gibt
	 * diese als Integer zurueck.
	 * 
	 * @param jahr Jahr in dem der Monat betrachtet werden soll
	 * @param m    Der zu betrachtende Monat als Integer
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
	 * Prueft ob das angegebene Jahr ein Schaltjahr ist. Gibt einen boolschen Wert
	 * zurueck
	 * 
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
