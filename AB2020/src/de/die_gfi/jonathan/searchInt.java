package de.die_gfi.jonathan;

public class searchInt {

	public static void main(String[] args) {
    int [] ints= {0,2,4,-6,-8,-10};
    int min=ints[0];
    for (int i = 0; i < ints.length; i++) {
		if (ints[i]<min)
			min =ints[i];
	}
    System.out.println(min);
	}

}
