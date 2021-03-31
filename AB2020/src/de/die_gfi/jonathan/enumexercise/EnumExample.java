package de.die_gfi.jonathan.enumexercise;

public class EnumExample {
	Wochentag tag;
public static void main(String[] args) {
	
}

public static String druckeWochentag(Wochentag tag) {
	switch (tag) {
	case MONTAG:
		return "Montag";
		break;
	case DIENSTAG:
		return "Dienstag";
		break;
	case MITTWOCH:
		return "Mittwoch";
		break;
	case DONNERSTAG:
		return "Donnerstag";
		break;
	case FREITAG:
		return "Freitag";
		break;

	default:
		return "Error";
		break;
	}
	return tag.name();
}

public static String druckeWochentagVariante(Wochentag tag) {
	switch (tag) {
	case MONTAG -> "Montag";
	
	
	
	default ->
	throw new IllegalArgumentException("Unexpected value: " + tag);
	}
}

}
