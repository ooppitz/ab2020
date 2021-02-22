package de.die_gfi.daniel;

public class Schachbrett
{
   public static void main( String[] args )
   {
      long koerner = 1;     /* Anzahl der Koerner */
                        /* Formel: 1*2^(feld-1) */
      int feld = 1;
                        
      int zeilen;       /* Laufvariable fuer die Zeilen vom Schachbrett     */
      int spalten;      /* Laufvariable fuer die Spalten vom Schachbrett    */
      
      
      
      
      for( zeilen = 0; zeilen < 8; zeilen++ )
      {
         for( spalten = 0; spalten < 8; spalten++ )
         {
            System.out.printf( "feld %2d: %19d\n", feld, koerner );
            feld++;
            koerner = koerner << 1;
         }
         
         System.out.printf( "\n" );
      }
      
      
   }
}
