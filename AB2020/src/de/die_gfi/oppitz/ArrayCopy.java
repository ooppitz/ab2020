package de.die_gfi.oppitz;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
	
		//            0   1   2    3   4  5
		int[] arr = { 98, 33, 12, 11, 99, 11 };
		
		// int[] arrCopy = new int[arr.length + 10];
		
		// System.arraycopy(arr, 0, arrCopy, 5, arr.length);
		
		System.out.println(Arrays.toString(arr));

		arrayCopy(arr, 0, arr, 2, 3);
		System.out.println(Arrays.toString(arr));
	
	}
	
	
	/** Copies the elements specified by the parameters from the src to the dest array.
	 * Note that src must not equal dest, otherwise errors may occur.
	 * 
	 * @param src
	 * @param srcIndex
	 * @param dest
	 * @param destIndex
	 * @param count
	 * @return true if the copy succeeds, otherwise false
	 */
	public static boolean arrayCopy(int[] src, int srcIndex, int[] dest, int destIndex, int count) {
		
		if (src == dest) {
			return false;
		}
		for(int i = 0; i < count; i++) {
			dest[destIndex + i] = src[srcIndex + i];
		}
		
		return true;		
	}

}
