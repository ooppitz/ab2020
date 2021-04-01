package de.die_gfi.felix.enumexercise;

public enum Monat {

	
	JANUAR, FEBRUAR, MAERZ, APRIL, MAI, JUNI, JULI, AUGUST, SEPTEMBER, OKTOBER, NOVEMBER, DEZEMBER, ERROR;
	/**
	 * Die Methode gibt für eine eingegebene Zahl von 1 bis 12 die Dazugehörige Montats Konstante der Enumeration zurück.
	 * wenn eine Zahl die nicht zwischen eins und Zwölf liegt gibt die Methode Error zurück
	 * @param x die als Monat zu suchende Zahl
	 * @return der Monat zur gegebenen Zahl
	 */
	public static Monat xyz(int x) {
		switch(x) {
		case 1: return Monat.JANUAR;
		case 2: return Monat.FEBRUAR;
		case 3: return Monat.MAERZ;
		case 4: return Monat.APRIL;
		case 5: return Monat.MAI;
		case 6: return Monat.JUNI;
		case 7: return Monat.JULI;
		case 8: return Monat.AUGUST;
		case 9: return Monat.SEPTEMBER;
		case 10: return Monat.OKTOBER;
		case 11: return Monat.NOVEMBER;
		case 12: return Monat.DEZEMBER;
		default: return ERROR;
		}
		
	}
}
