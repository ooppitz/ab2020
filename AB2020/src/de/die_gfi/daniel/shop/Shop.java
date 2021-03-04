package de.die_gfi.daniel.shop;

public class Shop
{
   /* Shopdaten */
   String name;
   String adresse;

   
   /* Inhaberdaten */
   long steuerNummer;
   String adresseInhaber;
   
   
   public Shop( String name, String adresse, long steuerNummer, String adresseInhaber )
   {
      this.name = name;
      this.adresse = adresse;
      this.steuerNummer = steuerNummer;
      this.adresseInhaber = adresseInhaber;      
   }
   
   
   public String ausgabe()
   {
      return
            String.format( "%-15s: %s", "Name", this.name ) + "\n" +
            String.format( "%-15s: %s", "Adresse", this.adresse ) + "\n" +
            String.format( "%-15s: %d", "Steuernummer", this.steuerNummer ) + "\n" +
            String.format( "%-15s: %s", "Inhaberadresse", this.adresseInhaber );
   }
   
   
   public String toString()
   {
      return
            ":Shop" + "\n" +
            ausgabe() + "\n";
   }
}
