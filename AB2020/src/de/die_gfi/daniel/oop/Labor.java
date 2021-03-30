/*
 * Ein optimaler Vitamin-D-Spiegel liegt bei 25-OH-Vitamin-D-Spiegeln zwischen 30 – 50 µg/l vor.
 * Das Vitamin A ist fettlöslich und wird vor allem durch Sauerstoff, aber auch durch UV-Licht inaktiviert.  100-1.000    Wert in μg/l
 * Vitamin C . Werte unterhalb 1,7 mg/l kennzeichnen einen Vitamin C - Mangel
 * 
 * Vitamin A in μg/l
 * > mangel:    < 100 
 * > normal:    100 - 1000 
 * > erhöht:    > 1000 
 * 
 * Vitamin C in mg/l
 * > mangel:    < 1,7
 * > normal:    1,7
 * > erhöht:    > 1,7
 * 
 * Vitamin D in μg/l
 * > mangel:    < 30
 * > normal:    30 - 50
 * > erhöht:    > 50
 */

package de.die_gfi.daniel.oop;


public class Labor
{
   public static void ueberpruefeLaborwerte( Laborpatient patient )
   {
      /* Vitamin A */
      double vitaminA = patient.getVitaminA();
      
      if( vitaminA < 100E-6 )
      {
         System.out.println( "Vitamin A Mangel" );
      }
      else
      {
         if( vitaminA > 1000E-6 )
         {
            System.out.println( "Vitamin A Ueberdosis" );
         }
         else
         {
            System.out.println( "Der Vitamin A Wert ist normal" );
         }
      }
      
      
      /* Vitamin C */
      double vitaminC = patient.getVitaminC();
      
      if( vitaminC < 17E-3 )
      {
         System.out.println( "Vitamin C Mangel" );
      }
      else
      {
         if( vitaminC > 17E-3 )
         {
            System.out.println( "Vitamin C Ueberdosis" );
         }
         else
         {
            System.out.println( "Der Vitamin C Wert ist normal" );
         }
      }
      
      
      /* Vitamin D */
      double vitaminD = patient.getVitaminD();
      
      if( vitaminD < 30E-6 )
      {
         System.out.println( "Vitamin D Mangel" );
      }
      else
      {
         if( vitaminD > 50E-6 )
         {
            System.out.println( "Vitamin D Ueberdosis" );
         }
         else
         {
            System.out.println( "Der Vitamin D Wert ist normal" );
         }
      }
      
      
   }


}
