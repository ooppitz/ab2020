package de.die_gfi.felix;

public class Schachbrett {
	public static void main(String[] args) {
		double zaehler = 1;
		char[] buchstabe = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		System.out.println("  1 2 3 4 5 6 7 8");
		for(int i = 0; i <= 7; i++) {
			System.out.print(buchstabe[i] + " ");
			for(int j = 0; j <= 7; j++) {
				System.out.print(zaehler + " ");
				zaehler = zaehler * 2;
			}
			System.out.println();
		}
		
		
	}

}
