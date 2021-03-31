package de.die_gfi.oppitz.oop.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		int zaehler = berechneTageProMonat(1985, Monat.FEBRUAR);
		System.out.println(zaehler);

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
