package de.die_gfi.philipp.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import de.die_gfi.philipp.shop.data.PathGetter;
import de.die_gfi.philipp.shop.products.Product;

public class Admin {
	Shop shop;
	String adminName;
	String adminPassword;
	
	public Admin(Shop shop, String adminName, String adminPassword) {
		this.shop = shop;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}
	
	public void addProductToInventory(String str) {
		File file = new File(PathGetter.getDataPath() + "products.inv");
		try (OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(file, true))) {
			fileWriter.write(str);
			fileWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] elements = str.split("\\|");
		Product prod = ProductCollection.parseProduct(elements);
		shop.products.addProduct(prod);
	}

}
