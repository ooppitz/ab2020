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
      
      
      Person daniel = new Patient( "Spieleentzug", "wahnsinn" );
      daniel.vorName = "Daniel";
      daniel.nachName = "Smith";
      
      System.out.println( daniel );
   }

}
