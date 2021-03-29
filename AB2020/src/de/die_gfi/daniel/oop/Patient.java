/*
 * Aufgabe zur Vererbung:
 * 
 * Leiten Sie eine Klasse "Patient" von der Klasse "Person" ab.
 * Die Klasse Patient soll ein Attribut "diagnose" bekommen, sowie die Möglichkeit, mehrere Symptome zu speichern.
 * Schreiben Sie einen oder mehrere Konstruktoren, um Patienten anzulegen. 
 *
 */

package de.die_gfi.daniel.oop;

import java.util.ArrayList;


public class Patient extends Person
{
   ArrayList<String> diagnose; 
   ArrayList<String> symptome;


/*   
   public Patient( String vorname, String nachname, int alter )
   {
      super( vorname, nachname, alter );
   }
   
   
   public Patient( String vorname, String nachname, int alter, double koerperGroesse, double gewicht )
   {
      super( vorname, nachname, alter, koerperGroesse, gewicht );
   }
*/   
   
   
   public Patient( String vorname, String nachname, int alter, double koerperGroesse, double gewicht, String diagnose, String symptome  )
   {
      super( vorname, nachname, alter, koerperGroesse, gewicht );
      this.diagnose = new ArrayList<String>();
      this.symptome = new ArrayList<String>();
   }
   
   
   public Patient()
   {
      this.diagnose = new ArrayList<String>();
      this.symptome = new ArrayList<String>();
   }
   
   
   
   public Patient( String diagnose, String symptome )
   {
      this();
      
      this.diagnose.add(diagnose);
      this.symptome.add(symptome);
   }
   
   
   public void addSymptom( String symptome )
   {
      this.symptome.add(symptome);
   }
   
   
   public void addDiagnosis( String diagnose )
   {
      this.symptome.add( diagnose );
   }
   
   
   public String toString()
   {
      String rueckgabe = "";
      
      rueckgabe += ":Patient" + "\n";
      rueckgabe += ausgabe();
      
      
      /* Ausgabe Diagnose */
      
      rueckgabe += String.format( "%-8s : ", "Diagnose" );
      if( this.diagnose.size() > 0 )
      {
         for( int i = 0; i < diagnose.size(); i++ )
         {
            rueckgabe += diagnose.get(i) + " ";
         }
         rueckgabe += "\n";
      }
      else
      {
         rueckgabe += "nicht vorhanden\n";
      }

      
      /* Ausgabe Symptome */
      
      rueckgabe += String.format( "%-8s : ", "Symptome" );
      if( this.symptome.size() > 0 )
      {
         for( int i = 0; i < symptome.size(); i++ )
         {
            rueckgabe += symptome.get(i) + " ";
         }
         rueckgabe += "\n";
      }
      else
      {
         rueckgabe += "nicht vorhanden\n";
      }
      
      
      return rueckgabe;
   }
}
