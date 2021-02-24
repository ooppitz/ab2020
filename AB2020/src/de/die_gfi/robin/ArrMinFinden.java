package de.die_gfi.robin;

public class ArrMinFinden {
	public static void main(String[] args) {
		
		int[] arr = new int[] {0,2,4,-6,8,-10};
		int min = Integer.MAX_VALUE;
		
		for (int eintrag : arr) {
			if (eintrag < min) {
				min = eintrag;
			}
		}
		
		System.out.println(min);
		
		
		
		
	}
}
