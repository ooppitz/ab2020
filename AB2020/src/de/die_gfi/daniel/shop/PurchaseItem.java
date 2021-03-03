package de.die_gfi.daniel.shop;

public class PurchaseItem
{
   Product artikel;
   long anzahl;
   
   
   
   
   public PurchaseItem( Product artikel, long anzahl )
   {
      this.artikel = artikel;
      this.anzahl = anzahl;
   }
   
   
   public String toString()
   {
      return
            ":PurchaseItem" + "\n" +
            artikel.ausgabe() + "\n" +
            "Anzahl        : " + this.anzahl;
   }
}
