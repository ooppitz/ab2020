package de.die_gfi.franziska;

public class Wochentage2 {

	public static void main(String[] args) {

		String[] week = { "montag", "dienstag", "mittwoch", "donnerstag", "freitag", "samstag", "sonntag" };

		for (int i = 0; i < week.length; i++) {

			System.out.print(week[i] + " ");

		}

		System.out.println();

		for (int i = week.length - 1; i >= 0; i--) {

			System.out.print(week[i] + " ");

		}

	}

}
