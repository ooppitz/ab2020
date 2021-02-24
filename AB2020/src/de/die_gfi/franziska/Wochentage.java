package de.die_gfi.franziska;

import java.util.ArrayList;
import java.util.Collections;

public class Wochentage {

	public static void main(String[] args) {

		ArrayList<String> week = new ArrayList<String>();

		week.add("montag");
		week.add("dienstag");
		week.add("mittwoch");
		week.add("donnerstag");
		week.add("freitag");
		week.add("samstag");
		week.add("sonntag");

		System.out.println(week);

		Collections.reverse(week);

		System.out.println(week);
	}

}
