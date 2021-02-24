package de.die_gfi.jonathan;

import java.util.Arrays;

public class Spielwiese {

	public static void main(String[] args) {
		int[] a = { 1, 10, 100, 1000, 10000 };
        int[] b = { 1, 10, 100, 1000, 10000 };
        Arrays.fill(b, 1, 3, 99);
        for (int i : b) {
			System.out.println(i+" "+b);
		}
	}

}
