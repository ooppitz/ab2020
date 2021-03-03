package de.die_gfi.daniel.shop;

public class PurchaseItem
{
   Product product;
   int count;
   
   
   
   
   public PurchaseItem( Product product, int count )
   {
      this.product = product;
      this.count = count;
   }
   
   
   public String toString()
   {
      return
            ":PurchaseItem" + "\n" +
            product.ausgabe() + "\n" +
            "Anzahl        : " + this.count;
   }
}
