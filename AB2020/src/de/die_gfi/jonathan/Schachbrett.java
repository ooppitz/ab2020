package de.die_gfi.jonathan;
//schachbrett rätsel simulieren aufs erte ein  
//reiskorn auf nächste doppelt so viele bis zum ende
public class Schachbrett {public static void main(String[] args) {
	double reis=1;
	double[] reiskorn = new double[64] ;
	String[] rice = new String [64];
	for (int i = 0; i < 64; i++) {
		reiskorn[i]=reis;

		reis=reis*2;
		
}
	int mazziff=zifferAnzahl(reiskorn[64]);
	for (int j = 0; j < reiskorn.length; j++) {
		rice[j]=Double.toString(reiskorn[j]); 
		
	}
}
public static int zifferAnzahl(double z) {
	String t=Double.toString(z); 
	int a= t.toCharArray().length;
	return a;
}

}
