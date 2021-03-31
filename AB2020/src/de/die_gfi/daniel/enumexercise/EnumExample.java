/*
 * Legen Sie ein Package <name>.enumexercise an.
 * Definieren Sie ein Enumeration "enum Wochtentag", welche für alle Wochentage eine Konstante enthält.
 * Schreiben Sie eine class EnumExample mit einer Methode
 * 
 *     public static String druckeWochentag(Wochentag tag);
 *     
 * Welche für jeden Wochentag den Namen des Wochentags ausgibt.
 * 
 */

package de.die_gfi.daniel.enumexercise;


public class EnumExample
{
   public static String druckeWochentag( Wochentag tag )
   {
      String rueckgabe = "";
      
      
      switch( tag )
      {
         case MONTAG:
         {
            rueckgabe = "Montag";
            break;
         }
         
         case DIENSTAG:
         {
            rueckgabe = "Dienstag";
            break;
         }
         
         case MITTWOCH:
         {
            rueckgabe = "Mittwoch";
            break;
         }
         
         case DONNERSTAG:
         {
            rueckgabe = "Donnerstag";
            break;
         }
         
         case FREITAG:
         {
            rueckgabe = "Freitag";
            break;
         }
         
         case SAMSTAG:
         {
            rueckgabe = "Samstag";
            break;
         }
         
         case SONNTAG:
         {
            rueckgabe = "Sonntag";
            break;
         }
         
         default:
         {
            rueckgabe = "1. April";
            break;
         }
         
      }
      
      
      
      return rueckgabe;
   }


}
