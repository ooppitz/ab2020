package de.die_gfi.robin;

import java.math.BigInteger;

public class Schachbrett {

	public static void main(String[] args) {
		BigInteger startZahl = new BigInteger("1");
		String stringZahl = "";
		int spaltenZaehler = 0;

		for (int i = 0; i < 64; i++) {

			startZahl = startZahl.add(startZahl);

			//die selbe Zahl als String speichern
			stringZahl = startZahl.toString();
			int laenge = stringZahl.length();


			if (startZahl.doubleValue() > 100000) {
				if (laenge < 10) {
					System.out.print(" ");
				}

				//Abkürzung für große Zahlen ausgeben anstatt der gesamten Zahlen
				System.out.print(stringZahl.substring(0, 3));
				System.out.print("+" + laenge + "x0");

				//Abtrennung der einzelnen Zahlen
				System.out.print(" | ");
			}
			else {
				//kleine Zahlen werden weiter nach rechts geschoben
				for (int j = laenge; j < 8; j++) {
					System.out.print(" ");
				}
				System.out.print(stringZahl + " | ");
			}


			//wenn 8 mal eine Zahl ausgegeben wurde springt man in die nächste Zeile
			spaltenZaehler++;
			if (spaltenZaehler > 7) {
				System.out.println("");
				spaltenZaehler = 0;

				//Rahmen/Raster erstellen
				System.out.print("+--------+");
				for (int j = 0; j < 7; j++) {
					System.out.print("----------+");
				}
				System.out.println("");
			}


		}
	}


}
