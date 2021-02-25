/*
 * Aufgabe:
 *
 * Schreiben Sie ein Programm HashExample, welches ein integer-Array erzeugt und den Hashwert davon berechnet.
 * Verändern Sie das Array und berechnen Sie den neuen Hashwert.
 * Versuchen Sie, eine Änderung vorzunehmen, welche den Hashwert nicht verändert.
 *
 */


package de.die_gfi.daniel;

import java.util.Arrays;

public class HashExample
{

   public static void main(String[] args)
   {
      int altHash;
      int neuHash;


      /* Array erzeugen */
      int array[] = new int[1];
      int kopie[] = new int[1];


      /* Array initialisieren */
      for( int i = 0; i < array.length; i++ )
      {
         array[i] = 0;
         kopie[i] = 0;
      }


      altHash = Arrays.hashCode( array );




      for( int i = 0xFFFFFFFF; i <= 0x0FFFFFFF; i++ )
      {
         array[0] = i;
         if( !(Arrays.equals( array, kopie )) )
         {
            neuHash = Arrays.hashCode( array );
            if( altHash == neuHash )
            {
               System.out.printf( "Die beiden Hashwerte stimmen überein\n" );
               System.out.printf( "altHash: %d\n", altHash );
               System.out.printf( "neuHash: %d\n", neuHash );
               System.out.printf( "\n" );
               break;
            }
            else
            {
               System.out.printf( "Die beiden Hashwerte stimmen nicht überein\n" );
               System.out.printf( "altHash: %d\n", altHash );
               System.out.printf( "neuHash: %d\n", neuHash );
               System.out.printf( "\n" );
            }
         }
      }

      System.out.printf( "Programmende\n" );
   }


   public static void druckeArray( int[] array, String name )
   {
      for( int i = 0; i < array.length; i++ )
      {
         System.out.printf( "%s[%d] = %d\n", name, i, array[i] );
      }
      System.out.printf( "\n" );
   }
}
