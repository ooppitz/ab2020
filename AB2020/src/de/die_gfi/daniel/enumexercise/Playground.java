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
      
      int tage = Kalender.berechneTageProMonat( 2024, Monat.FEBRUAR );
      System.out.println( "tage = " + tage );
   }

}
