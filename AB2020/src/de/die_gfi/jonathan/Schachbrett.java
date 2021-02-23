package de.die_gfi.jonathan;
//schachbrett rätsel simulieren aufs erte ein reiskorn 
//auf naechste doppelt so viele bis zum ende
public class Schachbrett {
public static void main(String[] args) {
	double reis=1;
	for (int i = 0; i < 64; i++) {
		reis=reis*2;
		System.out.println(reis);
	}
}
}
