package de.die_gfi.jonathan.enumexercise;


/**
 * Das Programm berechnet die tage pro monat unter berücksichtigung von schaltjahren
 * @author Jonathan Göth
 *
 */
public class Kalender {
	/**
	 * 
	 */
	public static final int FEHLER=-1;
	
	public static void main(String[] args) {
		//System.out.println(berechneTageProMonat(900, Monat.DEZEMBER));
		System.out.println(berechneTagesNummer(900, 12, 24));
	}
	
	public static int berchneFeb(int jahr) {
		if (jahr%4==0) {
			return 28;
		} else {
			return 29;
		}
	}
	
	public static int berechneTageProMonat(int jahr, int monat ) {
		int x;
		switch (monat) {
		case 1 ->x=31;
		case 2 ->x=berchneFeb(jahr);
		case 3 ->x=31;
		case 4 ->x=30;
		case 5 ->x=31;
		case 6 ->x=30;
		case 7 ->x=31;
		case 8 ->x=31;
		case 9 ->x=30;
		case 10 ->x=31;
		case 11 ->x=30;
		case 12 ->x=31;
		default ->x=FEHLER;
		}
		//System.out.println("programm 2");
		 return x;
		 
	 }
	
	 static int berechneTagesNummer(int jahr, int m, int tag) {
		 int x=tag;
		 for (int i = 1; i < m; i++) {
			x=x+berechneTageProMonat(jahr, i);
		}
		 return x;
	 }
	
	
	 public static int berechneTageProMonat(int jahr, Monat m) {
		int x;
		switch (m) {
		case JANUAR ->x=31;
		case FEBRUAR ->x=berchneFeb(jahr);
		case MÄRZ ->x=31;
		case APRIL ->x=30;
		case MAI ->x=31;
		case JUNI ->x=30;
		case JULI ->x=31;
		case AUGUST ->x=31;
		case SEPTEMBER ->x=30;
		case OCTOBER ->x=31;
		case NOVEMBER ->x=30;
		case DEZEMBER ->x=31;
		default ->x=FEHLER;
		}
		//System.out.println("programm 1");
		 return x;
		 
	 }

}
