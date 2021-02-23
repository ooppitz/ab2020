package de.die_gfi.jonathan;
//schachbrett rätsel simulieren aufs erte ein reiskorn 
//auf nächste doppelt so viele bis zum ende
public class Schachbrett {
public static void main(String[] args) {
	double reis=1;
	for (int i = 1; i <= 64; i++) {
		reis=reis*2;
		System.out.print(reis+"		");
		if (i%8==0) {
		System.out.print("\n");	
		}
	}
}
}
