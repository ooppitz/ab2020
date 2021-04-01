package de.die_gfi.daniel.enumexercise;

import java.util.Scanner;

public class Playground
{

   public static void main( String[] args )
   {
/*
      Wochentag wochentag;

      try
      {
         System.out.println("Sonntag den 7. Dezember 1941");
         wochentag = Kalender.berechneWochentag(1941, 12, 7);
         System.out.println(wochentag);
         System.out.println();

         System.out.println("Sonntag den 13 August 1961");
         wochentag = Kalender.berechneWochentag(1961, 8, 13);
         System.out.println(wochentag);
         System.out.println();

         System.out.println("Donnerstag den 9. November 1989");
         wochentag = Kalender.berechneWochentag(1989, 11, 9);
         System.out.println(wochentag);
         System.out.println();

         wochentag = Kalender.berechneWochentag(2001, 12, 31);
         System.out.println(wochentag);
         System.out.println();

      }
      catch (IllegalArgumentException exception)
      {
         System.err.println("Falsche Eingabe " + exception.getMessage());
         exception.printStackTrace();

      }

      boolean erfolg = false;
      do
      {
         try
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Geben Sie ein Datum ein:");
            System.out.println("Jahr:");
            int jahr = sc.nextInt();
            System.out.println("Monat:");
            int monat = sc.nextInt();
            System.out.println("Tag:");
            int tag = sc.nextInt();

            wochentag = Kalender.berechneWochentag(jahr, monat, tag);

            erfolg = true;

            System.out.println(wochentag);
            System.out.println();

         }
         catch (IllegalArgumentException exception)
         {

            System.err.println("Falsche Eingabe.");
            System.err.println(exception.getMessage());

            System.out.println("Bitte geben Sie ein korrektes Datum ein");

         }
      }
      while(erfolg == false);
*/
      
      
      Kalender.druckeMonat( 2021, 4 );
   }

}
