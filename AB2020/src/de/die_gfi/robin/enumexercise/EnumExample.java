package de.die_gfi.robin.enumexercise;

public class EnumExample {
	
	
		
	public static String druckeWochentag(Wochentag tag) {
		String tagString;
		switch (tag) {
		case MONTAG -> tagString = "Montag";
		case DIENSTAG -> tagString = "Dienstag";
		case MITTWOCH -> tagString = "Mittwoch";
		case DONNERSTAG -> tagString = "Donnerstag";
		case FREITAG -> tagString = "Freitag";
		case SAMSTAG -> tagString = "Samstag";
		case SONNTAG -> tagString = "Sonntag";
		default -> tagString = null;
		}
		return tagString;
		
		
	}
		
	
	public static void wochentagUebersetzen(Wochentag tag) {
		
		switch (tag) {
		case MONTAG: {
			System.out.println("Monday");
			break;
		}
		case DIENSTAG: {
			System.out.println("Tuesday");
			break;
		}
		case MITTWOCH: {
			System.out.println("Wednesday");
			break;
		}
		case DONNERSTAG: {
			System.out.println("Thursday");
			break;
		}
		case FREITAG: {
			System.out.println("Friday");
			break;
		}
		case SAMSTAG: {
			System.out.println("Saturday");
			break;
		}
		case SONNTAG: {
			System.out.println("Sunday");
		}
		
		
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(druckeWochentag(Wochentag.DIENSTAG));
		wochentagUebersetzen(Wochentag.MITTWOCH);
		
		
		
		
	}
	
	
}
