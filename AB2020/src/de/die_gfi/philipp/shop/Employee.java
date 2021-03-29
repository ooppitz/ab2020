package de.die_gfi.philipp.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import de.die_gfi.philipp.shop.data.PathGetter;
import de.die_gfi.philipp.shop.products.Product;

public class Employee {
	Shop shop;
	String userName;
	int userPasswordHash;
	
	private Employee(Shop shop, String userName) {
		this.shop = shop;
		this.userName = userName;
	}
	
	public Employee(Shop shop, String userName, String userPassword) {
		this(shop, userName);
		this.userPasswordHash = userPassword.hashCode();
	}
	
	public Employee(Shop shop, String userName, int userPasswordHash) {
		this(shop, userName);
		this.userPasswordHash = userPasswordHash;
	}
	
	public boolean login(String password) {
		if (password.hashCode() == userPasswordHash) {
			return true;
		}
		return false;
		
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
