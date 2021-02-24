/*
 * Aufgabe:
 *
 * class PrintArray : Legen Sie ein int-Array an mit den Zahlen von 2 bis 242 (2, 3, 4, … 242)
 * Drucken Sie den Inhalt des Array mit Hilfe der Methode Print.printArray( int[] b ) aus.
 * Denken Sie daran, dass man ein Array auch mit den Operator new anlegen kann.
 *
 *   Int[] arr = new int[100]   // Legt ein Array mit 100 elementen an
 *
 */

package de.die_gfi.daniel;

import de.die_gfi.util.Print;


public class PrintArray
{

   public static void main(String[] args)
   {
      int zahlen[] = new int[242-2+1];  /* Array deklarieren */

      
      /* Array initialisieren */
      for( int i = 0; i < zahlen.length; i++ )
      {
         zahlen[i] = i + 2;
      }

      Print.printArray( zahlen );
      
   }

}
