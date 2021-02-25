/*
 * Aufgabe:
 * Schreiben Sie ein Programm, welches die kleinste Zahl in dem Array ints findet und ausgibt
 *
 * int[] ints = { 0, 2, 4, -6, 8, -10 };
 *
 * Aufgabe
 * Bitte schreiben Sie jetzt ein Programm, welches das Array sortiert. Sie können das mit Hilfe eines eigenen Algorithmus oder über eine Library machen, z. B. mit Hilfe der Methode Array.sort().
 */

package de.die_gfi.daniel;

public class sortArrayExercise
{
   public static void main(String[] args)
   {
      int[] ints = { 0, 2, 4, -6, 8, -10 };

      sortieren( ints );

      for( int i = 0; i < ints.length; i++ )
      {
         System.out.printf( "ints[%d] = %d\n", i, ints[i] );
      }

   }


   public static void sortieren( int zahlen[] )
   {
      for( int i = 0; i < zahlen.length-1; i++ )
      {
         for( int j = zahlen.length-1; j > i; j-- )
         {
            if( zahlen[j] < zahlen[i] )
            {
               int puffer = zahlen[i];
               zahlen[i] = zahlen[j];
               zahlen[j] = puffer;
            }
         }
      }
   }
   
}
