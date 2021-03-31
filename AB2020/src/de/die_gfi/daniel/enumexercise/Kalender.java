/* Aufgabe 4:

Implementieren Sie einen enum Monat für die Monate Januar bis Dezember. 
Implementieren Sie eine class Kalender mit einer Methode 

    public static int berechneTageProMonat(int jahr, Monat m);

Die Methode soll Schaltjahre berücksichtigen. Jedes vierte Jahr (2004, 2008, 2012, … ) ist ein Schaltjahr. Entwerfen Sie einen entsprechenden Algorithmus, sodass für den Februar eine korrekte Anzahl der Tage errechnet wird. Wenn Sie möchten, können Sie einen Algorithmus implementieren, der auch Sonderfälle bzgl. Schaltjahren berücksichtigt.
Bzgl. Des switch-case Statements können Sie sich entscheiden, ob Sie die Variante mit „break“ oder mit "->" benützen.

Jan 31 
Februar 28/29. ß Schaltjahr
März 31
April 30
Mai 31
Juni 30 
Juli 31
August 31
September 30
Oktober 31
November 30
Dezember 31

Beispielausgabe:
int zaehler = berechneTageProMonat(1984, FEBRUAR);
System.out.println(zaehler); 
29 */

package de.die_gfi.daniel.enumexercise;


public class Kalender
{
   public static int berechneTageProMonat( int jahr, Monat m )
   {
      int anzahlTage = 0;
      
      if( Monat.FEBRUAR == m )
      {
         if( schaltJahr(jahr) )
         {
            anzahlTage = 29;
         }
         else
         {
            anzahlTage = 28;
         }
      }
      else
      {
         switch( m )
         {
            case JANUAR:    anzahlTage = 31; break;
            case MÄRZ:      anzahlTage = 31; break;
            case APRIL:     anzahlTage = 30; break;
            case MAI:       anzahlTage = 31; break;
            case JUNI:      anzahlTage = 30; break;
            case JULI:      anzahlTage = 31; break;
            case AUGUST:    anzahlTage = 31; break;
            case SEPTEMBER: anzahlTage = 30; break;
            case OKTOBER:   anzahlTage = 31; break;
            case NOVEMBER:  anzahlTage = 30; break;
            case DEZEMBER:  anzahlTage = 31; break;
            
            default:        System.err.println( "Das haette nicht passieren duerfen" );
                            break;
         }
      }
      
      return anzahlTage;
   }
   
   
   private static boolean schaltJahr( int jahr )
   {
      return ( jahr % 4 == 0 );
   }
}

