package de.die_gfi.eva;

public class Wochentage {

	public static void main(String[] args) {
		
		String[] woche = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };
		
		
		for (int i = 0; i < woche.length; i++) {
			System.out.print(woche[i] + " ");
		} 
		 System.out.println(" "); 
		 
		for (int i = woche.length - 1; i >= 0 ; i--) {
			System.out.print(woche[i] + " ");
		}
		
		
	}

}
