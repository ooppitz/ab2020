package de.die_gfi.oppitz.oop.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		int zaehler = berechneTageProMonat(1985, Monat.FEBRUAR);
		System.out.println(zaehler);

	}

	public static int berechneTageProMonat(int jahr, int m) {
		
		Monat monat;

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
