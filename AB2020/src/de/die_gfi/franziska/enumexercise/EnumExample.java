package de.die_gfi.franziska.enumexercise;

public class EnumExample {

	public static void main(String[] args) {

		Wochentag gesuchterTag = Wochentag.MITTWOCH;

		System.out.println(druckeWochentag(gesuchterTag));
		System.out.println(druckeWochentagEnglisch(gesuchterTag));

	}

	public static String druckeWochentag(Wochentag tag) {

		String s = "";

		switch (tag) {
		case MONTAG:
			s = "Montag";
			break;

		case DIENSTAG:
			s = "Dienstag";
			break;

		case MITTWOCH:
			s = "Mittwoch";
			break;

		case DONNERSTAG:
			s = "Donnerstag";
			break;

		case FREITAG:
			s = "Freitag";
			break;

		case SAMSTAG:
			s = "Samstag";
			break;

		case SONNTAG:
			s = "Sonntag";
			break;

		default:
			s = "ungültiger Wochentag";
			break;
		}

		return s;

	}

	public static String druckeWochentagEnglisch(Wochentag tag) {

		String s = "";

		switch (tag) {
		case MONTAG:
			s = "Monday";
			break;

		case DIENSTAG:
			s = "Tuesday";
			break;

		case MITTWOCH:
			s = "Wednesday";
			break;

		case DONNERSTAG:
			s = "Thursday";
			break;

		case FREITAG:
			s = "Friday";
			break;

		case SAMSTAG:
			s = "Saturday";
			break;

		case SONNTAG:
			s = "Sunday";
			break;

		default:
			s = "Not-a-day";
			break;
		}

		return s;

	}
}
