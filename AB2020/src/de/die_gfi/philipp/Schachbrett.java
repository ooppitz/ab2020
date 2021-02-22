package de.die_gfi.philipp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Schachbrett {
    static DecimalFormat format = new DecimalFormat("#.###E0", DecimalFormatSymbols.getInstance(Locale.ROOT));

    public static void main(String[] args) {
        BigInteger bigNum = BigInteger.ONE;
        for (int count = 0; count < 64; count++) {
            if (count % 8 == 0) {
                if (count != 0) {
                    System.out.print("\n" + "|        ".repeat(8) + "|");
                }
                System.out.print("\n" + "+--------".repeat(8) + "+\n" + "|        ".repeat(8) + "|\n|");
            }
            System.out.printf("%8s|", format.format(bigNum));
            bigNum = bigNum.multiply(BigInteger.valueOf(2));
        }
        System.out.println("\n" + "|        ".repeat(8) + "|\n" + "+--------".repeat(8) + "+");
    }
}
