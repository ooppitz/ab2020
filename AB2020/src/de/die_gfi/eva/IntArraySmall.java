package de.die_gfi.eva;

import java.util.Arrays;

public class IntArraySmall {

	public static void main(String[] args) {
		
		 int[] ints = {0,2,4,-6,8,-10};
		 
		 int minVal = Integer.MAX_VALUE;
		 
		 for(int i=0; i < ints.length; i++){
			 
		 if(ints[i] < minVal){
		         minVal = ints[i]; }
		 }
		 System.out.println("kleinste Zahl = " + minVal);
		 
		 Arrays.sort(ints);

	        for (int i = 0; i < ints.length; i++) {

	            System.out.print(ints[i]+" ");

	        }
				
	}

}
