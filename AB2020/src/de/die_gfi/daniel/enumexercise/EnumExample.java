/*
 * Aufgabe 1:
 * 
 * Legen Sie ein Package <name>.enumexercise an.
 * Definieren Sie ein Enumeration "enum Wochtentag", welche für alle Wochentage eine Konstante enthält.
 * Schreiben Sie eine class EnumExample mit einer Methode
 * 
 *     public static String druckeWochentag(Wochentag tag);
 *     
 * Welche für jeden Wochentag den Namen des Wochentags ausgibt.
 * 
 * 
 * 
 * Aufgabe 2:
 * 
 * Implementieren Sie eine Methode, welche die Wochentage auf Englisch ausgibt
 * und wenn Sie möchten eine dritte Methode, welche die Ausgabe in einer weiteren Sprache vornimmt.
 * 
 * 
 * 
 * Aufgabe 3: Switch-case mit dem -> Operator
 * 
 * Implementieren Sie eine Variante der Methode druckeWochentag()
 * welche die switch-case Syntax mit "->" verwendet. Nennen Sie die neue Methode
 * 
 *     public static String druckeWochentagVariante(Wochentag tag);
 * 
 * 
 * 
 */

package de.die_gfi.daniel.enumexercise;

public class EnumExample
{
   public static String druckeWochentag( Wochentag tag )
   {
       switch (tag)
       {
          case MONTAG:      return "Montag";
          case DIENSTAG:    return "Dienstag";
          case MITTWOCH:    return "Mittwoch";
          case DONNERSTAG:  return "Donnerstag";
          case FREITAG:     return "Freitag";
          case SAMSTAG:     return "Samstag";
          case SONNTAG:     return "Sonntag";
          
          default:          return "1. April";
       }
    }
   
   

   public static String druckeWochentagEN( Wochentag tag )
   {
       switch (tag)
       {
          case MONTAG:      return "monday";
          case DIENSTAG:    return "tuesday";
          case MITTWOCH:    return "wednesday";
          case DONNERSTAG:  return "thursday";
          case FREITAG:     return "friday";
          case SAMSTAG:     return "saturday";
          case SONNTAG:     return "sunday";
          
          default:          return "1st april";
       }
    }
   
   
   
   public static String druckeWochentagVariante(Wochentag tag)
   {
      /*
      return switch( tag )
      {
         case MONTAG -> "Montag";
         case DIENSTAG -> "Dienstag";
         case MITTWOCH -> "Mittwoch";
         case DONNERSTAG -> "Donnerstag";
         case FREITAG -> "Freitag";
         case SAMSTAG -> "Samstag";
         case SONNTAG -> "Sonntag";
      };
      */
      
      String rueckgabe;
      switch(tag)
      {
         case MONTAG ->     rueckgabe = "Montag";
         case DIENSTAG ->   rueckgabe = "Dienstag";
         case MITTWOCH ->   rueckgabe = "Mittwoch";
         case DONNERSTAG -> rueckgabe = "Donnerstag";
         case FREITAG ->    rueckgabe = "Freitag";
         case SAMSTAG ->    rueckgabe = "Samstag";
         case SONNTAG ->    rueckgabe = "Sonntag";
         default ->         rueckgabe = null;
      }
      
      return rueckgabe;
   }
   
   
}
