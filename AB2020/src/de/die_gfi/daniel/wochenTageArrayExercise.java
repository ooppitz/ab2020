package de.die_gfi.daniel;

public class wochenTageArrayExercise
{

   public static void main(String[] args)
   {
      String wochenTage[] = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };

      
      for( int i = 0; i < wochenTage.length; i++ )
      {
         System.out.printf( "%d. Wochentag: %s\n", i+1, wochenTage[i] );
      }
      System.out.printf( "\n" );
      
      
      for( int i = wochenTage.length - 1; i >= 0; i-- )
      {
         System.out.printf( "%d. Wochentag: %s\n", i+1, wochenTage[i] );
      }
      System.out.printf( "\n" );
      
   }

}
