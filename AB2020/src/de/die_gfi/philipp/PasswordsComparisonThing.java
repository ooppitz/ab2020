package de.die_gfi.philipp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordsComparisonThing {
    public static void main(String[] args) {
        ArrayList<Integer> pwList = new ArrayList<>();

        System.out.print("Please enter a password: ");
        int firstHash = readPassword();
        pwList.add(firstHash);
        System.out.print("\n".repeat(800));

        System.out.print("Please enter another password: ");
        int secondHash = readPassword();
        pwList.add(secondHash);

        if (firstHash == secondHash) {
            System.out.println("The two entered passwords are the same.");
        } else {
            System.out.println("The two entered passwords are not the same.");
        }

        while (true) {
            System.out.print("Enter more passwords: ");
            int hashValue = readPassword();
            if (checkForPWExistance(pwList, hashValue)) {
                System.out.println("Password was previously entered.");
                break;
            } else {
                pwList.add(hashValue);
            }
        }

    }

    public static int readPassword() {
        return Arrays.hashCode((new Scanner(System.in)).nextLine().toCharArray());
    }

    public static boolean checkForPWExistance(ArrayList<Integer> passwordArrayList, int hash) {
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
