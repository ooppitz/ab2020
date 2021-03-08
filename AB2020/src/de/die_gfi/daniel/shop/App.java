package de.die_gfi.daniel.shop;

import java.util.ArrayList;

public class App
{
   public static void main( String[] args )
   {

      /* Customer Test */
      Customer daniel = new Customer( "Daniel Schmidt", "Zuhause. 7, 8000 Muenchen", "daniel.schmidt@anbieter.de" );
      System.out.println( daniel );

      /* Shop Test */
      Shop shop = new Shop( "The red Hotel", "Schlossalle 2, Monopoly 8000", 2000, "Badstraße 4, Monopoly 1000" );
      System.out.println( shop );

      System.out.println();
      System.out.println( "Das Warenlager enthält die folgenden Produkte:" );
      ArrayList<Product> produkte = shop.warenlager;
      for( Product p : produkte )
      {
         System.out.println( p );
      }
      System.out.println();

      /* PurchaseItem Test */
      PurchaseItem ware = new PurchaseItem( shop.warenlager.get( 3 ), 2 );
      System.out.println( ware );

      Purchase cart = new Purchase( shop );

      cart.add( ware ); /* Brot */
      cart.add( new PurchaseItem( shop.warenlager.get( 0 ), 1 ) );
      cart.add( new PurchaseItem( shop.warenlager.get( 1 ), 3 ) );
      cart.add( new PurchaseItem( shop.warenlager.get( 2 ), 1 ) );
      cart.add( new PurchaseItem( shop.warenlager.get( 3 ), 1 ) );

      System.out.println( cart.generateBill() );


      System.out.println(
            "-----------------------------------------------------------------------------------------------" );

      /* Customoer ArrayList<Purchase> Test */
      daniel.addPurchase( cart );
      System.out.println( daniel.listPurchase() );


      System.out.printf( "Anzahl Produkte: %d\n", Product.anzahlProduct );
   }



}
