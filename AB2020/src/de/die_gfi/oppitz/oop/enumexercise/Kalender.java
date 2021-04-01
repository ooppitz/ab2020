package de.die_gfi.oppitz.oop.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		testeBerechneTagesNummer();

		
	}

	private static void testeBerechneTagesNummer() {
		// 18.1.1990
		int count = berechneTagesNummer(1990, 1, 18);

		if (count == 18) {
			System.out.println("OK");
		} else {
			System.out.println("Fehler! Erwartet: 18, tatsächlich " + count);
		}

		// 18.6.2021 = 31 + 28 +31 + 30 + 31 + 18
		int count2 = berechneTagesNummer(2021, 6, 18);
		int erwartet2 = 31 + 28 + 31 + 30 + 31 + 18;
		if (count2 == erwartet2) {
			System.out.println("OK");
		} else {
			System.out.println("Fehler! Erwartet: " + erwartet2 +", tatsächlich " + count2);
		}

		// 18.6.1990 = 31 + 28 +31 + 30 + 31 + 18
		int count3 = berechneTagesNummer(2004, 6, 18); 
		int erwartet3 = 31 + 29 + 31 + 30 + 31 + 18;
		if (count3 == erwartet3) {
			System.out.println("OK");
		} else {
			System.out.println("Fehler! Erwartet: " + erwartet3 + ", tatsächlich " + count3);
		}
	}

	/**
	 * 
	 * @param jahr
	 * @param monat der Montag, gezählt von 1 ... 12 (Januar - Dezember)
	 * @param tag
	 * @return
	 */
	static int berechneTagesNummer(int jahr, int monat, int tag) {

		int tagesNummer = 0;
		
		for (int i = 1; i < monat; i++) {
			tagesNummer = tagesNummer + berechneTageProMonat(jahr, i);
		}

		tagesNummer = tagesNummer + tag;

		return tagesNummer;
	}

	public static int berechneTageProMonat(int jahr, int m) {

		Monat monat = Monat.JANUAR;

		switch (m) {
		case 1 -> monat = Monat.JANUAR;
		case 2 -> monat = Monat.FEBRUAR;
		case 3 -> monat = Monat.MAERZ;
		case 4 -> monat = Monat.APRIL;
		case 5 -> monat = Monat.MAI;
		case 6 -> monat = Monat.JUNI;
		case 7 -> monat = Monat.JULI;
		case 8 -> monat = Monat.AUGUST;
		case 9 -> monat = Monat.SEPTEMBER;
		case 10 -> monat = Monat.OKTOBER;
		case 11 -> monat = Monat.NOVEMBER;
		case 12 -> monat = Monat.DEZEMBER;
		}

		return berechneTageProMonat(jahr, monat);

	}

	public static int berechneTageProMonat(int jahr, Monat m) {

		boolean schaltjahr = (jahr % 4) == 0;

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

}
