package de.die_gfi.oppitz.interfaces.anwender;

import de.die_gfi.oppitz.interfaces.rechenmaschine.Rechenmaschine;
import de.die_gfi.oppitz.interfaces.rechenmaschinenneu.RechenmaschineNeu;

public class Anwender {

	public static void main(String[] args) {

		int sum = Rechenmaschine.calculateSum(12, 200);
		System.out.println("Die Summe ist " + sum);

		int product = RechenmaschineNeu.calculateProduct(4, 5);
		System.out.println("Das Produkt ist " + product);
	}

}
