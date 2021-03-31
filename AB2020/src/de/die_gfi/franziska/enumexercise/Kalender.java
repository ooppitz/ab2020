package de.die_gfi.franziska.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		int zaehler = berechneTageProMonat(1988, Monat.FEBRUAR);

		System.out.println(zaehler);

	}

	public static int berechneTageProMonat(int jahr, Monat m) {

		int i = 0;

		switch (m) {
		case JANUAR:
			i = 31;

			break;

		case FEBRUAR:
			if (jahr % 400 == 0) {
				i = 29;

			} else if (jahr % 100 == 0) {
				i = 28;

			} else if (jahr % 4 == 0) {
				i = 29;

			} else {
				i = 28;

			}
			break;

		case MAERZ:
			i = 31;
			break;

		case APRIL:
			i = 30;
			break;

		case MAI:
			i = 31;
			break;

		case JUNI:
			i = 30;
			break;

		case JULI:
			i = 31;
			break;

		case AUGUST:
			i = 31;
			break;

		case SEPTEMBER:
			i = 30;
			break;

		case OKTOBER:
			i = 31;
			break;

		case NOVEMBER:
			i = 30;
			break;

		case DEZEMBER:
			i = 31;
			break;

		default:

			break;
		}

		return i;

	}

}
