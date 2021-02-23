package de.die_gfi.daniel;

public class Schachbrett {
	
	public static void main(String[] args) {
		
		double koerner = 1; /* Anzahl der Koerner */

		System.out.printf(
				"+---+------------+------------+------------+------------+------------+------------+------------+------------+---+\n");
		System.out.printf(
				"|   |     AA     |     BB     |     CC     |     DD     |     EE     |     FF     |     GG     |     HH     |   |\n");
		System.out.printf(
				"+---+------------+------------+------------+------------+------------+------------+------------+------------+---+\n");

		for (int zeilen = 0; zeilen < 8; zeilen++) {
			System.out.printf("| %d |", zeilen + 1);

			for (int spalten = 0; spalten < 8; spalten++) {
				System.out.printf(" %.4E |", koerner);

				koerner = koerner * 2;
			}

			System.out.printf(" %d |", zeilen + 1);
			System.out.printf("\n");
			System.out.printf(
					"+---+------------+------------+------------+------------+------------+------------+------------+------------+---+\n");

		}

		System.out.printf(
				"|   |     AA     |     BB     |     CC     |     DD     |     EE     |     FF     |     GG     |     HH     |   |\n");
		System.out.printf(
				"+---+------------+------------+------------+------------+------------+------------+------------+------------+---+\n");

	}
}
