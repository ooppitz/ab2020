package de.die_gfi.daniel.interfaces;

public class App
{
   public static void main( String[] args )
   {
      int wert = 0;
      
      
      /* Punkt Test */
      Punkt[] koordinaten = new Punkt[10];
      
      for( int i = 0; i < koordinaten.length; i++ )
      {
         koordinaten[i] = new Punkt( wert, wert+1 );
         wert = wert + 2;
      }
      System.out.printf( "Es wurden %d zweidimensionale Punkte erzeugt\n", Punkt.anzahl2dPunkte );
      
      
      /* Punkt3D Test */
      Punkt3D[] raumKoordinaten = new Punkt3D[20];
      for( int i = 0; i < raumKoordinaten.length; i++ )
      {
         raumKoordinaten[i] = new Punkt3D( wert, wert+1, wert+2 );
         wert = wert + 3;
      }
      System.out.printf( "Es wurden %d dreidimensionale Punkte erzeugt\n", Punkt3D.anzahl3dPunkte );
      
      
      /* Dreieck Test */
      Dreieck dreieck = new Dreieck( 2.0, 3.0, 5.0 );
   }
}
