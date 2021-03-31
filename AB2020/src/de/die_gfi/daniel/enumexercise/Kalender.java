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
29 




Aufgabe 5:

Erweitern Sie das Programm Kalender. Führen Sie eine Methode berechneTageProMonat() ein, welche als Parameter ein Jahr bekommt und einen int von 1 bis 12, welcher den Monat angibt. Die Methode soll dasselbe Ergebnis wie die vorhandene Methode liefern.

    public static int berechneTageProMonat(int jahr, Monat monat);
    public static int berechneTageProMonat(int jahr, int monat );

*/

package de.die_gfi.daniel.enumexercise;


public class Kalender
{
   public static int berechneTageProMonat( int jahr, Monat m )
   {
      int anzahlTage = 0;
      
      switch( m )
      {
        case JANUAR:    anzahlTage = 31; break;
        case FEBRUAR:   anzahlTage = schaltJahr(jahr) ? 29 : 28; break;
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

      return anzahlTage;
   }
   
   
   public static int berechneTageProMonat(int jahr, int monat )
   {
      Monat kalenderMonat = Monat.JANUAR;
      
      switch( monat )
      {
         case  1: kalenderMonat = Monat.JANUAR; break;
         case  2: kalenderMonat = Monat.FEBRUAR; break;
         case  3: kalenderMonat = Monat.MÄRZ; break;
         case  4: kalenderMonat = Monat.APRIL; break;
         case  5: kalenderMonat = Monat.MAI; break;
         case  6: kalenderMonat = Monat.JUNI; break;
         case  7: kalenderMonat = Monat.JULI; break;
         case  8: kalenderMonat = Monat.AUGUST; break;
         case  9: kalenderMonat = Monat.SEPTEMBER; break;
         case 10: kalenderMonat = Monat.OKTOBER; break;
         case 11: kalenderMonat = Monat.NOVEMBER; break;
         case 12: kalenderMonat = Monat.DEZEMBER; break;
         
         default: System.err.println( "Fuer die Monate sind nur Zahlen von 1 bis 12 erlaubt" );
                  System.err.println( "Benuzte 'Januar' als Monat" );
                  break;
      }
      
      
      return berechneTageProMonat( jahr, kalenderMonat );
   }
   
   
   /**
    * Ueberprueft ob es sich bei einem bestimmten Jahr um ein Schaltjahr handelt
    * 
    * @param jahr Das Jahr welches ueberprueft werden soll
    * @return true wenn es sich um ein Schaltjahr handelt ansonsten false
    */
   private static boolean schaltJahr( int jahr )
   {
      return ((jahr % 4 == 0)  &&  (jahr % 100 != 0)) || (jahr % 400 == 0);
   }
}

