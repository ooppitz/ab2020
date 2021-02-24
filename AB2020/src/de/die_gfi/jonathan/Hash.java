package de.die_gfi.jonathan;

import java.util.Arrays;

public class Hash {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 1000) - 1000;
		}
		// int hash=b.hashCode();
		System.out.println(Arrays.hashCode(b));
		b[30] = 90;
		System.out.println(Arrays.hashCode(b));
		b[30]= -90;
		System.out.println(Arrays.hashCode(b));

		
	}
}
