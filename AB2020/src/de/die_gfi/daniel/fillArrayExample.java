package de.die_gfi.daniel;

import java.util.Arrays;

public class fillArrayExample
{

   public static void main(String[] args)
   {
      int[] a = { 1, 10, 100, 1000, 10000 };
      int[] b = { 1, 10, 100, 1000, 10000 };


      Arrays.fill(b, 1, 3, 99);

      for( int i = 0; i < b.length; i++ )
      {
         System.out.printf( "b[%d] = %d\n", i, b[i] );
      }
      System.out.printf( "\n" );

   }

   
   
}
