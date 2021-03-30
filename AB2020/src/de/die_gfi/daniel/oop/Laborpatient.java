/*
 * Aufgabe zu Interfaces (für diejenigen, die schon fertig sind)
 *
 * 1. Implementieren Sie eine Subklasse “Laborpatient“, die von Patient abgeleitet ist,
 * welche Attribute für die Laborwerte von Vitamin A, Vitamin C, Vitamin D enthält.
 * Recherchieren Sie, welche Einheit hier verwendet wird (Mögliche Lösung: mg/ml).
 * 
 * 2. Implementieren Sie ein Interface „VitaminSpiegel“, welche Methoden enthält,
 * um die Attribute für Vitamin A, C, D zu setzen und zu lesen. Verwenden Sie hierzu Getter und Setter.
 * Die Klasse Laborpatient soll das Interface VitaminSpiegel implementieren.
 * 
 * 3. Implementieren Sie ein Klasse Labor, mit einer Methode ueberpruefeLaborwerte(),
 * welche für den Laborpatienten die Werte ausliest und überprüft, ob die Werte in einem guten Bereich liegen.
 * Recherchieren Sie, welche Werte empfohlen werden.
 * 
 * class Labor
 * {
 *   static void ueberpruefeLaborwerte(VitaminSpiegel laborpatient);
 * }
 * 
 * 
 */

package de.die_gfi.daniel.oop;

public class Laborpatient extends Patient implements VitaminSpiegel
{
   double vitaminA;
   double vitaminC;
   double vitaminD;


   public final double VITAMIN_A = 0;
   public final double VITAMIN_C = 0;
   public final double VITAMIN_D = 0;
   
   
   public Laborpatient()
   {
      this.vitaminA = VITAMIN_A;
      this.vitaminC = VITAMIN_C;
      this.vitaminD = VITAMIN_D;
   }
   
   
   public double getVitaminA()
   {
      return this.vitaminA;
   }
   
   public void setVitaminA( double wert )
   {
      this.vitaminA = wert;
   }
   
   
   public double getVitaminC()
   {
      return this.vitaminC;
   }
   
   public void setVitaminC( double wert )
   {
      this.vitaminC = wert;
   }
   
   
   public double getVitaminD()
   {
      return this.vitaminD;
   }
   
   public void setVitaminD( double wert )
   {
      this.vitaminD = wert;
   }
   
   
   public String toString()
   {
      return
            "A = " + this.vitaminA + "\n" +
            "C = " + this.vitaminC + "\n" +
            "D = " + this.vitaminD + "\n";
   }
}
