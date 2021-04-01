package de.die_gfi.philipp.shop.data;

import de.die_gfi.philipp.shop.Admin;
import de.die_gfi.philipp.shop.Shop;

public class ShopInit {

	public static Shop initializeTestShop() {
		Shop shop = new Shop("Hansi's Gemischtwarenladen", "Hansi Mueller", "Dorfstrasse 96, 28392 Dorf im Au",
				"info@hansi-gemischtwaren.de", "6038-683-3894");
		Admin admin = new Admin(shop, 92668751);
		shop.addAdmin(admin);
		shop.readCustomersFromFile();
		return shop;

	}
}