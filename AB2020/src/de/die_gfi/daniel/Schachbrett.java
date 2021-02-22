package de.die_gfi.daniel;

public class Schachbrett
{
   public static void main( String[] args )
   {
      double koerner = 1;     /* Anzahl der Koerner */
      int feld = 1;
                        
      int zeilen;             /* Laufvariable fuer die Zeilen vom Schachbrett     */
      int spalten;            /* Laufvariable fuer die Spalten vom Schachbrett    */
      
      
      
      
      for( zeilen = 0; zeilen < 8; zeilen++ )
      {
         for( spalten = 0; spalten < 8; spalten++ )
         {
            System.out.printf( "feld %2d: %.2E\n", feld, koerner );
            feld++;
            koerner = koerner * 2;
         }
         
         System.out.printf( "\n" );
      }
      
      
   }
}
