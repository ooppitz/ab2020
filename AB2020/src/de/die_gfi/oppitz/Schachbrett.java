package de.die_gfi.oppitz;

public class Schachbrett {

	
	// Variante 1 : Felder breiter machen
	// Variante 2 : eine andere Darstellung für Zahlen benutzen
	
	// 3*10^3 = 3000 = 3E3
	// 5*10^3 = 5000 = 5E3
	public static void main(String[] args) {

		System.out.println("+------".repeat(8) + "+");

		double riceCounter = 1;
		for (int i = 0; i <= 7; i++) {
			
			System.out.println("|      ".repeat(8) + "|");

			for (int j = 0; j <= 7; j++) {
				System.out.print("|");
				
				String n;
				if (riceCounter < 1048576) {
					n = "" + (int)riceCounter;
				} else {
					n = String.format("%6.0e", riceCounter);
				}
				
				System.out.print(n);
				int length = n.length();
				int blankCount = 6 - length;
				System.out.print(" ".repeat(blankCount));

				riceCounter = riceCounter * 2; // Shift operator
			}
			System.out.println("|");
			System.out.println("|      ".repeat(8) + "|");
			System.out.println("+------".repeat(8) + "+");

		}
	
	}

}
