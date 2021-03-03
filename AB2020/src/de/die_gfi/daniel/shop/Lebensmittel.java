package de.die_gfi.daniel.shop;

public class Lebensmittel extends Product
{
   String ablaufDatum;
   
   public Lebensmittel( String name, double preis, String beschreibung, long artikelNummer, String ablaufDatum )
   {
      super( name, preis, beschreibung, artikelNummer );
      
      this.ablaufDatum = ablaufDatum;
   }
   
   
   public String toString()
   {
      return
            ":Lebensmittel" + "\n" +
            this.ausgabe() + "\n" + 
            "Ablaufdatum   : " + this.ablaufDatum;
   }
}
