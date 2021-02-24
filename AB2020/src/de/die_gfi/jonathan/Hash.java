package de.die_gfi.jonathan;

public class Hash {

	public static void main(String[] args) {
		int b[] = new int[100];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 1000) - 1000;
		}
		// int hash=b.hashCode();
		System.out.println(b.hashCode());
		b[30] = 90;
		System.out.println(b.hashCode());
	}
}
