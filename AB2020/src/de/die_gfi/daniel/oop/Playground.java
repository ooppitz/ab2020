package de.die_gfi.daniel.oop;

public class Playground
{
   public static void main( String[] args )
   {
      Person daniel = new Person( 17, "Daniel", "Neumann" );
      
//    david.gewicht = 70.0;
      daniel.koerperGroesse = 2.4;
      
      daniel.nachName = null;
      
      System.out.println( daniel );

   }

}
