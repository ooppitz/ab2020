package de.die_gfi.felix.enumexercise;

public class EnumExample {
	public static void main(String args[]) {
		int x = 3;
		EnumWochentag result = exampleMethod(x);
		System.out.println(result);
	}
	
	public static EnumWochentag exampleMethod(int x) {
		EnumWochentag result = EnumWochentag.ERROR;
		switch(x) {
		case 1:
			result = EnumWochentag.MONTAG;
			break;
		case 2:
			result = EnumWochentag.MONTAG;
			break;
		case 3:
			result = EnumWochentag.MONTAG;
			break;
		case 4:
			result = EnumWochentag.MONTAG;
			break;
		case 5:
			result = EnumWochentag.MONTAG;
			break;
		case 6:
			result = EnumWochentag.MONTAG;
			break;
		case 7:
			result = EnumWochentag.MONTAG;
			break;
		default:
			result = EnumWochentag.ERROR;
			break;
				
		}
		return result;
	}
}
