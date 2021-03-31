package de.die_gfi.franziska.enumexercise;

public class EnumExample {

	public static void main(String[] args) {

		Wochentag gesuchterTag = Wochentag.MITTWOCH;

		System.out.println(druckeWochentagVariante(gesuchterTag));

	}

	public static String druckeWochentagVariante(Wochentag tag) {

		String s = "";

		switch (tag) {
		case MONTAG -> s = "Montag";

		case DIENSTAG -> s = "Dienstag";

		case MITTWOCH -> s = "Mittwoch";

		case DONNERSTAG -> s = "Donnerstag";

		case FREITAG -> s = "Freitag";

		case SAMSTAG -> s = "Samstag";

		case SONNTAG -> s = "Sonntag";

		default -> s = "ungültiger Wochentag";
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

	public static String druckeWochentagFranzoesisch(Wochentag tag) {

		String s = "";

		switch (tag) {
		case MONTAG:
			s = "Lundi";
			break;

		case DIENSTAG:
			s = "Mardi";
			break;

		case MITTWOCH:
			s = "Mercredi";
			break;

		case DONNERSTAG:
			s = "Jeudi";
			break;

		case FREITAG:
			s = "Vendredi";
			break;

		case SAMSTAG:
			s = "Samedi";
			break;

		case SONNTAG:
			s = "Dimanche";
			break;

		default:
			s = "C'est-pas-un-jour";
			break;
		}

		return s;

	}
}
