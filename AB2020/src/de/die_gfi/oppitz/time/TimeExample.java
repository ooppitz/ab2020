package de.die_gfi.oppitz.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeExample {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(today.toString(), formatter);
			System.out.printf("%s%n", date);
		} catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable!%n", today.toString());
			throw exc; // Rethrow the exception.
		}

	}

}
