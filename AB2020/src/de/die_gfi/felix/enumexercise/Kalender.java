package de.die_gfi.felix.enumexercise;

import de.die_gfi.felix.enumexercise.Monat;

public class Kalender {

	public static void main(String[] args) {

		int zaehler = berechneTageProMonat(2000, 2);
		System.out.println(zaehler);

	}

	public static int berechneTageProMonat(int jahr, Monat m) {

		boolean schaltjahr = (jahr % 4) == 0;
		if(jahr % 100 == 0 && jahr % 400 != 0) {
			schaltjahr = false;
		}
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
	
	public static int berechneTageProMonat(int jahr, int m) {

		boolean schaltjahr = (jahr % 4) == 0;
		if(jahr % 100 == 0 && jahr % 400 != 0) {
			schaltjahr = false;
		}
		int tage;

		switch (m) {

		case 1, 3, 5, 7, 8, 10, 12 -> {
			return 31;
		}

		case 2 -> {
			return 28 + (schaltjahr ? 1 : 0);
		}

		case 4, 6, 9, 11 -> {
			return 30;
		}

		default -> {
			return -1;
		}

		}
	}

}
