package de.die_gfi.daniel.oop;

public class Playground
{
   public static void main( String[] args )
   {
      
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


      
   }

}
