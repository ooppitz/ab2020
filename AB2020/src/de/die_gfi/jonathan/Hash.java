package de.die_gfi.jonathan;

import de.die_gfi.util.Print;
import java.util.Arrays;

@SuppressWarnings("unused")
public class Hash {

	public static void main(String[] args) {

		int b[] = new int[30];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 1000) - 1000;
		}

		Print.printArray(b);
		// int hash=b.hashCode();
		System.out.println(b.hashCode());

		Print.printArray(b);

		b[10] = 90;
		System.out.println(b.hashCode());
	}

}
