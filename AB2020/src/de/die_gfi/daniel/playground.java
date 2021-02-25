package de.die_gfi.daniel;

public class playground
{

   public static void main(String[] args)
   {
      int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      String wochenTage[] = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };



      for( int i = 0; i < array.length; i++ )
      {
         System.out.printf( "array[%d] = %d\n", i, array[i] );
      }
      System.out.printf( "\n" );


      for( int i = 0; i < wochenTage.length; i++ )
      {
         System.out.printf( "wochenTage[%d] = %s\n", i, wochenTage[i] );
      }


   }

}

