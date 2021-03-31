package de.die_gfi.eva.enumexercise;

public class Kalender {

	public static void main(String[] args) {

		int zaehler = berechneTageProMonat(2000, Monat.FEBRUAR);
		int zaehler2 = berechneTageProMonat(2000, 2);
		System.out.println(zaehler);
		System.out.println(zaehler2);
	}

	public static int berechneTageProMonat(int jahr, Monat m) {

		int i = 0;

		switch (m) {

		case JANUAR:
			return 31;
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
			return i;
		case MAERZ:
			return 31;
		case APRIL:
			return 30;
		case MAI:
			return 31;
		case JUNI:
			return 30;
		case JULI:
			return 31;
		case AUGUST:
			return 31;
		case SEPTEMBER:
			return 30;
		case OKTOBER:
			return 31;
		case NOVEMBER:
			return 30;
		case DEZEMBER:
			return 31;
		default:
			return 0;

		}
	}
	
	public static int berechneTageProMonat(int jahr, int m) {
		
		int i = 0;

		switch (m) {

		case 1:
			return 31;
		case 2:
			if (jahr % 400 == 0) {
				i = 29;

			} else if (jahr % 100 == 0) {
				i = 28;

			} else if (jahr % 4 == 0) {
				i = 29;

			} else {
				i = 28;
			}
			return i;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
	}
	
	}
	
	
}
