package de.die_gfi.daniel.geouebung;


public class Application
{
   public static void main( String[] args )
   {
      Rechteck rechteck = new Rechteck( 1, 1, 4, 3 );
      double flaeche;
      double umfang;
            
      flaeche = rechteck.berechneOberflaeche();
      umfang = rechteck.berechneUmfang();
      
      System.out.printf( "flaeche = %f\n", flaeche );
      System.out.printf( "umfang = %f\n", umfang );
      
      
      double laenge = rechteck.getLaenge();
      System.out.printf( "laenge = %f\n", laenge );
      
      
      
      
      Quadrat quadrat = new Quadrat( 2, 2, 6 );
      System.out.printf( "Quadrat:\n" );
      System.out.printf( "Laenge = %.2f\n", quadrat.getLaenge() );
      System.out.printf( "Punkt(%.2f/%.2f)\n", quadrat.x, quadrat.y );
      
   }

}
