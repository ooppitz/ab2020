package de.die_gfi.philipp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordsComparisonThing {
    public static void main(String[] args) {
        ArrayList<Integer> pwList = new ArrayList<>();

        int firstHash = readPassword("Please enter a password: ");
        pwList.add(firstHash);
        System.out.print("\n".repeat(800));

        int secondHash = readPassword("Please enter another password: ");
        pwList.add(secondHash);

        if (firstHash == secondHash) {
            System.out.println("The two entered passwords are the same.");
        } else {
            System.out.println("The two entered passwords are not the same.");
        }

        while (true) {
            int hashValue = readPassword("Enter one more password: ");
            if (checkForPWExistence(pwList, hashValue)) {
                System.out.println("Password was previously entered.");
                break;
            } else {
                pwList.add(hashValue);
            }
        }

    }

    @SuppressWarnings("resource")
	public static int readPassword(String pwMessage) {
        System.out.print(pwMessage);
        return Arrays.hashCode((new Scanner(System.in)).nextLine().toCharArray());
    }

    public static boolean checkForPWExistence(ArrayList<Integer> passwordArrayList, int hash) {
        boolean flag = false;
            for (int otherHash : passwordArrayList) {
                if (otherHash == hash) {
                    flag = true;
                    break;
                }
            }
        return flag;
    }
}
