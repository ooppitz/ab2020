package de.die_gfi.jonathan.enumexercise;

/**
 * Das Programm berechnet die tage pro monat unter berücksichtigung von
 * schaltjahren
 * 
 * @author Jonathan Göth
 *
 */
public class Kalender {
	/**
	 * 
	 */
	public static final int FEHLER = -1;
	static String[] tage= {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"
			,"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag","Fehler"};

	public static void main(String[] args) throws Exception {
		// System.out.println(berechneTageProMonat(900, Monat.DEZEMBER));
		System.out.println(berechneTagesNummer(2020, 3, 1));
		System.out.println(berechneTagesNummer(2021, 3, 1));
		System.out.println(berechneWochentag(199, 15, 9));


	}
public static String berechneWochentag(int jahr,int m,int tag) throws Exception {
	m=checkMonth(m);

	int diff=additonalDays(jahr, m, tag);
	int beginn=eins(jahr);
	//beginn=beginn-7;
	return tage[beginn+diff];

	
}

@SuppressWarnings("null")
public static int checkMonth(int m) throws Exception {
	Exception IllegalArgumentException = ;
	if (m<12) {
		throw IllegalArgumentException;
	}
	return m;
}
public static int eins(int jahr) {
	int wochentag=11;
	for (int i = 2021; i <= jahr; i--) {
		int x= additonalDays(i, 12, 31);
		wochentag=wochentag-x;
		if (wochentag>=6) {
			wochentag=wochentag-7;
		}
	}
	System.out.println(wochentag);
	return wochentag;
}


	
	public static int wochen(int jahr,int m,int tag) {
	int d=	berechneTagesNummer(jahr, m, tag);
	int wochen=d/7;
	return wochen;		
	}
	
	public static int additonalDays(int jahr,int m,int tag) {
	int wochen	=wochen(jahr, m, tag);
	int days=berechneTagesNummer(jahr, m, tag);
	int diferenz=days-(wochen*7);
	return diferenz;
	}
	
	public static int berchneFeb(int jahr) {	
		if (jahr%400==0) {
			return 29;}
		else if(jahr%100==0&&jahr%4==0){
			return 28;
		}
		else if (jahr%4==0) {
			return 29;
		}
		 else {
			return 28;
		}
	}

	public static int berechneTageProMonat(int jahr, int monat) {
		int x;
		switch (monat) {
		case 1 -> x = 31;
		case 2 -> x = berchneFeb(jahr);
		case 3 -> x = 31;
		case 4 -> x = 30;
		case 5 -> x = 31;
		case 6 -> x = 30;
		case 7 -> x = 31;
		case 8 -> x = 31;
		case 9 -> x = 30;
		case 10 -> x = 31;
		case 11 -> x = 30;
		case 12 -> x = 31;
		default -> x = FEHLER;
		}
		// System.out.println("programm 2");
		return x;

	}

	static int berechneTagesNummer(int jahr, int m, int tag) {
		int x = tag;
		for (int i = 1; i < m; i++) {
			x = x + berechneTageProMonat(jahr, i);
		}
		return x;
	}

	public static int berechneTageProMonat(int jahr, Monat m) {
		int x;
		switch (m) {
		case JANUAR -> x = 31;
		case FEBRUAR -> x = berchneFeb(jahr);
		case MÄRZ -> x = 31;
		case APRIL -> x = 30;
		case MAI -> x = 31;
		case JUNI -> x = 30;
		case JULI -> x = 31;
		case AUGUST -> x = 31;
		case SEPTEMBER -> x = 30;
		case OCTOBER -> x = 31;
		case NOVEMBER -> x = 30;
		case DEZEMBER -> x = 31;
		default -> x = FEHLER;
		}
		// System.out.println("programm 1");
		return x;

	}

}
