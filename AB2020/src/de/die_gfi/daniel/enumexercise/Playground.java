package de.die_gfi.daniel.enumexercise;

public class Playground
{

   public static void main( String[] args )
   {
      /*
      String tag;
      
      
      tag = EnumExample.druckeWochentag(Wochentag.DONNERSTAG);
      System.out.println(tag);
      System.out.println(Wochentag.DONNERSTAG);
      System.out.println();
      
      
      tag = EnumExample.druckeWochentagEN(Wochentag.MONTAG);
      System.out.println(tag);
      System.out.println();
      */
/*      
      int tage = Kalender.berechneTageProMonat( 1900, 12 );
      System.out.println( "tage = " + tage );
*/

      int tagesNummer = Kalender.berechneTagesNummer( 2000, 12, 31 );
      System.out.printf( "tagesNummer = %d\n", tagesNummer );
   }

}
