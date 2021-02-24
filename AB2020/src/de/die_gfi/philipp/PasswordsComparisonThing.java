package de.die_gfi.philipp;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordsComparisonThing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a password: ");
        int firstHash = Arrays.hashCode(input.nextLine().toCharArray());
        System.out.print("\n".repeat(800));

        System.out.print("Please enter another password: ");
        int secondHash = Arrays.hashCode(input.nextLine().toCharArray());

        if (firstHash == secondHash) {
            System.out.println("The two entered passwords are the same.");
        } else {
            System.out.println("The two entered passwords are not the same.");
        }
    }
}
