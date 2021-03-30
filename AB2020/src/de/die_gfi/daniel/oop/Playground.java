package de.die_gfi.daniel.oop;

import java.util.Scanner;

public class Playground
{
   public static void main( String[] args )
   {
/*      
      Patient hans = new Patient();
      
      hans.vorName = "Hans";
      hans.nachName = "Neumann";
      hans.alter = 17;
      hans.gewicht = 75;
      hans.koerperGroesse = 1.8;
    
      hans.addDiagnosis( "Spieleentzug" );
      
      System.out.println( hans );
      
      
//---------------------------------------------------------------------
      
      Laborpatient daniel = new Laborpatient();
      daniel.vorName = "Daniel";
      daniel.nachName = "Smith";

      
      
      daniel.setVitaminA( 140E-6 );
      daniel.vitaminC = 2.5;
      System.out.println( daniel );
      Labor.ueberpruefeLaborwerte(daniel);
      System.out.println();
      
      
//--------------------------------------------------------------------
      
      Person tom = new Patient();
      tom.alter = 25;
      
      System.out.println( tom );


*/
      Scanner scanner = new Scanner(System.in);
      
      
      Laborpatient laborpatient = new Laborpatient();
      

      laborpatient.vorName = "Daniel";
      laborpatient.nachName = "Smith";
      
      
      System.out.println( "Geben Sie den Vitamin A Wert in μg/l ein:" );
      laborpatient.setVitaminA( scanner.nextDouble() * (1*10E-6) );
      System.out.printf( "Vitamin A = %E\n", laborpatient.vitaminA );
      
//    laborpatient.setVitaminA(100E-6);
      laborpatient.setVitaminC(1.7E-3);
      laborpatient.setVitaminD(40E-6);
      
      
      
      Labor.ueberpruefeLaborwerte(laborpatient);
   }

}
