package de.die_gfi.jonathan;
//schachbrett rätsel simulieren aufs erte ein  
//reiskorn auf nächste doppelt so viele bis zum ende
public class Schachbrett {
public static void main(String[] args) {
	double reis=1;
	double[] reiskorn = new double[64] ;
	for (int i = 0; i < 64; i++) {
		reiskorn[i]=reis;
		reis=reis*2;
		System.out.print(reis+"		");
		if (i%7==0) {
		System.out.print("\n");	
		}
	}
}
}
