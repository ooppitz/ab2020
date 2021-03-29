package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.PathGetter;
import de.die_gfi.philipp.shop.products.Beverage;
import de.die_gfi.philipp.shop.products.ExpirableProduct;
import de.die_gfi.philipp.shop.products.Food;
import de.die_gfi.philipp.shop.products.Product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductCollection {
	private final ArrayList<Product> products;

	public ProductCollection() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product prod) {
		this.products.add(prod);
	}

	public Product[] getProducts() {
		return products.toArray(Product[]::new);
	}

	public static ProductCollection createProductCollection() {
		File file = new File(PathGetter.getDataPath() + "products.inv");
		try (Scanner fileScanner = new Scanner(
				new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

			ProductCollection productCollection = new ProductCollection();

			while (fileScanner.hasNextLine()) {

				String str = fileScanner.nextLine();
				String[] elements = str.split("\\|");

				Product prod = null;

				prod = parseProduct(elements);

				if (prod != null) {
					productCollection.addProduct(prod);
				}
			}
			return productCollection;
		} catch (FileNotFoundException e) {
			System.out.println("File products.inv couldn't be accessed, it may be deleted or moved.");
		}
		return new ProductCollection();
	}

	public static Product parseProduct(String[] elements) {
		String type = elements[0].toLowerCase();
		switch (type) {
		case "product":
			return Product.parseString(elements);
		case "expirableproduct":
			return ExpirableProduct.parseString(elements);
		case "beverage":
			return Beverage.parseString(elements);
		case "food":
			return Food.parseString(elements);
		default:
			return null;
		}
	}

	/**
	 *
	 * @param articleNumber Article number of the product which is to be returned
	 * @return {@link Product} object with the specified article number, null if
	 *         product couldn't be found
	 */
	public Product getProduct(long articleNumber) {
		for (Product prod : products) {
			if (prod.getArticleNumber() == articleNumber) {
				return prod;
			}
		}

		return null;
	}

	/**
	 * @return A pretty String
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Product prod : products) {
			builder.append(prod).append("\n");
		}
		return builder.toString();
	}
}
