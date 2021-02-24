/*
 * Aufgabe:
 * 
 * Schreiben Sie ein Programm, welches ein Passwort von der Console einliest und den Hashwert abspeichert. Anschließend soll das Programm noch einmal ein Passwort einlesen und mit Hilfe des Hashwertes feststellen, ob das gleich Passwort eingegeben wurde.
 * Suchen Sie eine Methode, um für einen String ein ensprechendes char[] zu bekommen.
 * 
 * 
 * Geben Sie ein Passwort ein: Abcde1234
 * Geben Sie noch einmal ein Passwort ein: ...
 * Die Passwörter sind gleich
 * oder
 * Die Passwörter unterscheiden sich.
 *
 */


package de.die_gfi.daniel;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class passwordExercise
{

   public static void main(String[] args)
   {
      Scanner eingabe = new Scanner( System.in );
      
      
      System.out.printf( "Geben Sie ein Password ein:\n" );
      String puffer = eingabe.next();
      int oldHash = Arrays.hashCode( puffer.toCharArray() );
      
      
      System.out.printf( "Gegen Sie das Password erneut ein:\n" );
      puffer = eingabe.next();
      eingabe.close();
      int newHash = Arrays.hashCode( puffer.toCharArray() );
      
      
      if( oldHash == newHash )
      {
         System.out.printf( "Die Passwörter sind gleich\n" );
      }
      else
      {
         System.out.printf( "Die Passwörter unterscheiden sich\n" );
      }
      
      
      

   }

}
