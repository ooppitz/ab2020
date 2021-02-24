package de.die_gfi.franziska;

public class Schachbrett {

	public static void main(String[] args) {

		double zahl = 0;
		
		boolean bigNumber = zahl>10000000000l;
		
		for (int i = 0; i < 64; i++) {
			
			zahl = Math.pow(2, i);
			
			if (bigNumber) {
			
			zahl = zahl/10000000000l;
			
		}
			System.out.println(zahl);
			
		}
		
		
		
		for (int i = 0; i < 9; i++) {
			
			System.out.println("|   " + zahl +"   |   " + zahl + "   |   " + zahl +"   |   " + zahl + "   |   " + zahl + "   |   " + zahl + "   |   " + zahl + "   |   " + zahl + "   |   ");
			System.out.println("+.......+.......+.......+.......+.......+.......+.......+.......+");
			
		}	
		
	}

}
