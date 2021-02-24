package de.die_gfi.philipp;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordsComparisonThing {
    public static void main(String[] args) {

        System.out.print("Please enter a password: ");
        int firstHash = readPassword();
        System.out.print("\n".repeat(800));

        System.out.print("Please enter another password: ");
        int secondHash = readPassword();

        if (firstHash == secondHash) {
            System.out.println("The two entered passwords are the same.");
        } else {
            System.out.println("The two entered passwords are not the same.");
        }
    }

    public static int readPassword() {
        return Arrays.hashCode((new Scanner(System.in)).nextLine().toCharArray());
    }
}
