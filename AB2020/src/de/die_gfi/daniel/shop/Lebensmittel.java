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
            super.toString() + "\n" + 
            "Ablaufdatum   : " + this.ablaufDatum;
   }
}
