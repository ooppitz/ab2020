package de.die_gfi.felix_arrays;

//3. geben sie das Feld mit Hilfe eines Arrays aus

public class Aufgabe_3 {
	public static void main(String args[]) {
		char[][] feld = new char[10][10];
		for(int i = 0; i < feld.length; i++) {
			for(int j = 0; j < feld.length; j++) {
				feld[i][j] = '-';
				System.out.print(feld[i][j] + " ");
			}
			System.out.println();
		}
	}

}
