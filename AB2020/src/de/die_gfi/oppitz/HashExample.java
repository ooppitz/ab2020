package de.die_gfi.oppitz;

import java.util.Arrays;

public class HashExample {

	public static void main(String[] args) {
				
		int[] array = { 8, 3, 13, 1, 4, 9, 10, 12, 11, 1, 2, 5 };
		
		int hashcode = Arrays.hashCode(array);
		System.out.println(hashcode);
		
		array[3] = 99;
		
		System.out.println(Arrays.hashCode(array));
		
		array[array.length - 1] = 0;
		
		System.out.println(Arrays.hashCode(array));

		array[array.length - 1] = 1;
	
		System.out.println(Arrays.hashCode(array));

		array[0] = 9; // 8 ... %1000   9... %1001

		System.out.println(Arrays.hashCode(array));
		
		array[0] = 11;
		
		System.out.println(Arrays.hashCode(array));
		
		
		String password;
		
		password = "Abcdef1234";
		
		char[] chars = password.toCharArray();
		char[] chars2 = password.toCharArray();
		
		System.out.println("chars equals chars2 " + chars2.equals(chars2));

		
		System.out.println("Hashcode for password '" + password + "' = " + chars.hashCode());
		System.out.println("Hashcode for password '" + password + "' = " + chars2.hashCode());
	
	}

}
