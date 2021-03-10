package de.die_gfi.daniel.shop;

public class Lebensmittel extends Product implements CounterInterface, Discount
{
   private String ablaufDatum;
   static int anzahlLebensmittel = 0;
   
   
   public Lebensmittel( String name, double preis, String beschreibung, long artikelNummer, String ablaufDatum )
   {
      super( name, preis, beschreibung, artikelNummer );
      
      this.ablaufDatum = ablaufDatum;
      
      Lebensmittel.anzahlLebensmittel++;
   }
   
   
   public String toString()
   {
      return
            ":Lebensmittel" + "\n" +
            this.ausgabe() + "\n" + 
            "Ablaufdatum   : " + this.ablaufDatum + "\n";
   }
   
   
   public int getCount()
   {
      return Lebensmittel.anzahlLebensmittel;
   }
}
