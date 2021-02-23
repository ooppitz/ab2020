package de.die_gfi.jonathan;

public class WochentageArray {

	public static void main(String[] args) {
		String[] woche ={"Montag","Dienstag","Mittwoch",
		"Donnerstag","Freitag","Samstag","sonntag"};
		
		for (int i = 0; i < woche.length; i++) {
			System.out.println(woche[i]);
		}
		for (int i = woche.length-1; i <=0 ; i++) {
			System.out.println(woche[i]);
		}
		
		
	}

}
