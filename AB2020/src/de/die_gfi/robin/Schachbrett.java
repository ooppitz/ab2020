package de.die_gfi.robin;

import java.math.BigInteger;

public class Schachbrett {

	public static void main(String[] args) {
		BigInteger startZahl = new BigInteger("1");
		String stringZahl = "";
		int spaltenZaehler = 0;

		for (int i = 0; i < 64; i++) {

			//die selbe Zahl als String speichern
			stringZahl = startZahl.toString();
			int laenge = stringZahl.length();


			if (startZahl.doubleValue() > 100000) {
				if (laenge < 13) {
					System.out.print("!");
				}

				//Abk�rzung f�r gro�e Zahlen ausgeben anstatt der gesamten Zahlen
				System.out.print(stringZahl.substring(0, 3));
				System.out.print("+" + (laenge-3) + "x0");

				//Abtrennung der einzelnen Zahlen
				System.out.print(" | ");
			}
			else {
				//kleine Zahlen werden weiter nach rechts geschoben
				System.out.print(" ".repeat(8-laenge));
				System.out.print(stringZahl + " | ");
			}

			spaltenZaehler++;
			
			//wenn 8 mal eine Zahl ausgegeben wurde springt man in die n�chste Zeile
			if (spaltenZaehler > 7) {
				System.out.println("");
				spaltenZaehler = 0;

				//Rahmen/Raster erstellen
				System.out.print("+--------+");
				System.out.print("----------+".repeat(7));
				
				System.out.println("");
			}
			
			startZahl = startZahl.add(startZahl);


		}
	}


}
