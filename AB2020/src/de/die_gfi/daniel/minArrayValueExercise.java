/*
 * Aufgabe:
 * Schreiben Sie ein Programm, welches die kleinste Zahl in dem Array ints findet und ausgibt
 *
 * int[] ints = { 0, 2, 4, -6, 8, -10 };
 */

package de.die_gfi.daniel;

public class minArrayValueExercise
{

   public static void main(String[] args)
   {
      int[] ints = { 0, 2, 4, -6, 8, -10 };
      int min;                                  /* enhaelt zum Schluss den Wert der kleinsten Variable */


      min = ints[0];
      for( int i = 1; i < ints.length; i++ )
      {
         if( ints[i] < min )
         {
            min = ints[i];
         }
      }

      System.out.printf( "Minimum = %d\n", min );

   }

}
