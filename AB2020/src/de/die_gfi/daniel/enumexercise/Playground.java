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

      /*
      int tagesNummer = Kalender.berechneTagesNummer( 2000, 12, 31 );
      System.out.printf( "tagesNummer = %d\n", tagesNummer );
      
      tagesNummer = Kalender.berechneTagesNummer( 2021, 12, 31 );
      System.out.printf( "tagesNummer = %d\n", tagesNummer );
      */
      
      Wochentag wochentag;
/*      
      wochentag = Kalender.berechneWochentag( 2021, 4, 1 );
      System.out.println( wochentag );
      System.out.println();
      
      wochentag = Kalender.berechneWochentag( 2000, 4, 1 );
      System.out.println( wochentag );
      System.out.println();
      
      wochentag = Kalender.berechneWochentag( 2006, 6, 12 );
      System.out.println( wochentag );
      System.out.println();
      
      wochentag = Kalender.berechneWochentag( 2021, 12, 24 );
      System.out.println( wochentag );
      System.out.println();
*/      
      

      System.out.println( "Sonntag den 7. Dezember 1941" );
      wochentag = Kalender.berechneWochentag( 1941, 12, 7 );
      System.out.println( wochentag );
      System.out.println();
      
      
      System.out.println( "Sonntag den 13 August 1961" );
      wochentag = Kalender.berechneWochentag( 1961, 8, 13 );
      System.out.println( wochentag );
      System.out.println();
      
      
      System.out.println( "Donnerstag den 9. November 1989" );
      wochentag = Kalender.berechneWochentag( 1989, 11, 9 );
      System.out.println( wochentag );
      System.out.println();
      
      
      
      
   }

}
