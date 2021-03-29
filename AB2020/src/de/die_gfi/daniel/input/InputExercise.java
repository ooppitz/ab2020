/* 
 * Aufgabe:
 * 
 * Schreiben Sie ein Programm, das von der Konsole 4 Tokens einliest, von denen der dritte eine Zahl ist.
 * Geben Sie nur die Zahl auf der Konsole aus.
 * 
 * Beispiel:
 * 
 * Eingabe: Berg Haus 8 Afrika
 * Ausgabe: 8
 * 
 */

package de.die_gfi.daniel.input;

import java.util.Scanner;

public class InputExercise
{

   public static void main( String[] args )
   {
      Scanner scanner = new Scanner(System.in);
      
      scanner.next();
      scanner.next();
      System.out.printf( "%s\n", scanner.next() );

      scanner.close();
   }

}
