package de.die_gfi.robin.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		System.out.println(berechneTageProMonat(2000, Monat.FEBRUAR));

	}

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
		default -> tage = 0;
		}

		return tage;

	}

	public static boolean istSchaltjahr(int jahr) {
		boolean istSchaltjahr = false;
		if (jahr % 4 == 0) {
			istSchaltjahr = true;
			if (jahr % 100 == 0) {
				istSchaltjahr = false;
				if (jahr % 100 == 0) {
					istSchaltjahr = true;
				}
			}
		}
		return istSchaltjahr;

	}

}
