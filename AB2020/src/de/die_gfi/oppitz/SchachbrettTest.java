package de.die_gfi.oppitz;

public class SchachbrettTest {

	/** Width of one field in characters, including boundaries */
	static int boxWidth = 20; 
	/** Height of one field in characters, including boundaries */
	static int boxHeight = 4; 
	
	public static void main(String[] args) {
		
		String charAnnotation = ""; 
		for(char c  = 'A'; c <= 'H'; c++) {
			 charAnnotation += centerText(Character.toString(c), boxWidth, "|");
		}
		
		String hor = centerText("-".repeat(boxWidth-1), boxWidth, "+");
		String horLine = hor.repeat(8);
		
		System.out.println(charAnnotation);
		System.out.println(horLine);
		
		double riceCount = 1; 
		
		
		
		for(int i = 0; i < 64; i++) {
			
			// System.out.print("1234567.".repeat(8));
			
			String numberEE = String.format("%6.3e",riceCount);
			String numberDigits = Double.toString(riceCount);
			
			String number = numberDigits.length() > 12 ? numberEE : numberDigits;
			
			System.out.print(centerText("" + number, boxWidth, "|"));
			if (i % 8 == 7) {
				System.out.println();
				System.out.println(horLine);

			}
			
			riceCount *= 2;
			
		}
		
		System.out.println(charAnnotation);


	}
	
	/** Creates a string of length width placing the String t in the middle, padded by spaces */
	static String centerText(String t, int widthWithBorder, String leftBorder) {
		
		int innerWidth = widthWithBorder - leftBorder.length();
		int paddingCount = innerWidth - t.length();
		String padding = " ".repeat(paddingCount / 2);
		String r = leftBorder + padding + t + padding + ((paddingCount % 2 == 1) ? " " : "");
		return r;
	}

}
