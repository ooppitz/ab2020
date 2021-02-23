/* Schreiben Sie ein Programm, welches mit Hilfe einer ArrayList vom Type String alle Wochentage speichert. Geben Sie die Wochentage einmal in der normalen Reihenfolge aus und einmal in umgekehrter Reihenfolge. */

package de.die_gfi.daniel;

import java.util.ArrayList;

public class arrayExample
{
   public static void main(String[] args)
   {
      ArrayList<String> wochenTage = new ArrayList<String>();

      wochenTage.add( "Montag" );
      wochenTage.add( "Dienstag" );
      wochenTage.add( "Mittwoch" );
      wochenTage.add( "Donnerstag" );
      wochenTage.add( "Freitag" );
      wochenTage.add( "Samstag" );
      wochenTage.add( "Sonntag" );


      System.out.printf( "wochenTage.size() = %d\n\n", wochenTage.size() );
      
      
      
      for( int i = 0; i < wochenTage.size(); i++ )
      {
         System.out.printf( "%d. Wochentag: %s\n", i+1, wochenTage.get(i) );
      }
      System.out.printf( "\n" );


      for( int i = wochenTage.size() - 1; i >= 0; i-- )
      {
         System.out.printf( "%d. Wochentag: %s\n", i+1, wochenTage.get(i) );
      }
      System.out.printf( "\n" );
      
   }

}
