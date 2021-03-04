package de.die_gfi.philipp.shop.data;

import de.die_gfi.philipp.shop.Shop;

public class TestData {

    public static Shop initializeTestShop() {
        return new Shop("Hansi's Gemischtwarenladen",
                "Hansi Mueller",
                "Dorfstrasse 96, 28392 Dorf im Au");

    }
}
