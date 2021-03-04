package de.die_gfi.daniel.shop;

public class App
{
   public static void main(String[] args)
   {
      
      /* Customer Test */
      Customer daniel = new Customer( "Daniel Schmidt", "Zuhause. 7, 8000 Muenchen", "daniel.schmidt@anbieter.de" );
      System.out.println( daniel );
      System.out.println();
      
      
      /* Product Test */
      Product wecker = new Product( "Analogwecker", 10.0, "Made in Germany", 4189325 );
      System.out.println( ":Product" );
      System.out.println( wecker.ausgabe() );
      System.out.println();
      
      Product nudeln = new Product( "Fusilli Nudeln", 0.49, "500 gramm", 7928195 );
      System.out.println( nudeln );
      System.out.println();
      
      
      /* Book Test */
      Book buch = new Book( "Javainsel", 49.90, "15. Auflage", 9783836377372L, "Rheinwerk Verlag", "Christian Ullenboom", "978-3-8362-7737-2" );
      System.out.println( buch );
      System.out.println();
      
      
      /* Lebensmittel Test */
      Lebensmittel brot = new Lebensmittel( "Vierkornbrot", 10.0, "Scheibenstaerke 12", 4803460, "5 Tage" );
      System.out.println( brot );
      System.out.println();
      
      
      /* PurchaseItem Test */
      PurchaseItem ware = new PurchaseItem( brot, 2 );
      System.out.println( ware );
      System.out.println();
      
      
      /* Zuweisungstest */
      Product zutat = new Lebensmittel( "Eier", 2.0, "Bodenhaltung", 4803465, "30. Februar" );
      System.out.println( zutat );
      System.out.println();

      
      
      Purchase cart = new Purchase();
      
      cart.add( ware ); /* Brot */
      cart.add( new PurchaseItem( wecker, 1 ) );
      cart.add( new PurchaseItem( nudeln, 3 ) );
      cart.add( new PurchaseItem( buch, 1 ) );
      cart.add( new PurchaseItem( zutat, 1 ) );
      
      System.out.println( cart.generateBill() );
      
      
      
      
   }
}
