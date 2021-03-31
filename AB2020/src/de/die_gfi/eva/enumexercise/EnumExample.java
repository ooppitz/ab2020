package de.die_gfi.eva.enumexercise;

public class EnumExample {

	public static void main(String[] args) {
		
		Wochentag tag = Wochentag.SONNTAG;
		System.out.println(druckeWochentag(tag));
	}

	public static String druckeWochentag(Wochentag tag) {
		
		switch (tag) {

		case MONTAG:
			return "Montag";
		case DIENSTAG:
			return "Dienstag";
		case MITTWOCH:
			return "Mittwoch";
		case DONNERSTAG:
			return "Donnerstag";
		case FREITAG:
			return "Freitag";
		case SAMSTAG:
			return "Samstag";
		case SONNTAG:
			return "Sonntag";
		default:
			return "kein Wochentag";
		}

	}
}
