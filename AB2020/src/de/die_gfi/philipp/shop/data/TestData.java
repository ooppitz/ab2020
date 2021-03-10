package de.die_gfi.philipp.shop.data;

import de.die_gfi.philipp.shop.Customer;
import de.die_gfi.philipp.shop.Shop;

public class TestData {

    public static Shop initializeTestShop() {
        Shop shop = new Shop("Hansi's Gemischtwarenladen",
                "Hansi Mueller",
                "Dorfstrasse 96, 28392 Dorf im Au",
                "info@hansi-gemischtwaren.de",
                "6038-683-3894");
        shop.readCustomersFromFile();
        shop.addCustomer("Johannes Mueller", "Muenchner Strasse 74", "80666", "Muenchen", "Germany","jom58@gmail.com");
        Customer c = new Customer("Maria Jonasson", "Salzberg 5", "7665", "Salzburg", "Austria", "maria.jo@yahoo.com", shop);
        shop.addCustomer(c);
        shop.addCustomer("Maximilian Mueller", "Hauptstrasse 3", "58394", "Dorf", "Germany","max.mueller10000@gmail.com");
        return shop;

    }
}
