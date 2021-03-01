package de.die_gfi.oppitz;

import java.util.Arrays;

public class HashExample2 {

	public static void main(String[] args) {
		
		
        String password = "Abcdef1234";
		
		char[] chars = password.toCharArray();
		char[] chars2 = password.toCharArray();

		System.out.println("Hashcode for password '" + password + "' = " + Arrays.hashCode(chars));
		
		chars2[2] = 20;
		System.out.println("Hashcode for password '" + password + "' = " + Arrays.hashCode(chars2));

	}

}
