/* Aufgabe
 * 
 * Legen Sie ein Package <name>.oop an.
 * Legen Sie eine Klasse an "Person", welche Attribute für Alter, Körpergröße, Gewicht, Vorname, Nachname.
 * Programmieren Sie mehrere Konstruktoren, mit denen ein Objekt erzeugt werden kann, sogar dann, wenn nicht alle Daten bekannt sind.
 * 
 */

package de.die_gfi.daniel.oop;

public class Person
{
   int alter;
   double koerperGroesse;
   double gewicht;
   String vorName;
   String nachName;


   public Person()
   {
      /* default constructor */
   }
   
   
   public Person( int alter, String vorname, String nachname )
   {
      this.alter = alter;
      this.vorName = vorname;
      this.nachName = nachname;
   }
   
   
   public Person( int alter, double koerperGroesse, double gewicht, String vorname, String nachname )
   {
      this( alter, vorname, nachname );
      
      this.koerperGroesse = koerperGroesse;
      this.gewicht = gewicht;
   }
   
   
   public String toString()
   {
      return
            String.format( "%-8s : %s", "Vorname", this.vorName ) + "\n" +
            String.format( "%-8s : %s", "Nachname", this.nachName ) + "\n" +
            String.format( "%-8s : %d", "Alter", this.alter ) + "\n" +
            String.format( "%-8s : %.2f kg", "Gewicht", this.gewicht ) + "\n" +
            String.format( "%-8s : %.2f m", "Groesse", this.koerperGroesse ) + "\n";
   }
}
