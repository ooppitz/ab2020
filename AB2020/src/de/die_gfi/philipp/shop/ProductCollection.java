package de.die_gfi.philipp.shop;


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
        File file = new File("AB2020/src/de/die_gfi/philipp/shop/data/products.inv");
        try {
            InputStreamReader fileReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
            ProductCollection productCollection = new ProductCollection();

            Scanner fileScanner = new Scanner(fileReader);

            while (fileScanner.hasNextLine()) {

                String str = fileScanner.nextLine();
                String[] elements = str.split("\\|");
                String type = elements[0];

                Product prod = null;

                if (type.equalsIgnoreCase("beverage")) {
                    prod = Beverage.parseString(elements);
                }
                if (type.equalsIgnoreCase("food")) {
                    prod = Food.parseString(elements);
                }
                if (type.equalsIgnoreCase("expirableproduct")) {
                    prod = ExpirableProduct.parseString(elements);
                }
                if (type.equalsIgnoreCase("product")) {
                    prod = Product.parseString(elements);
                }

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

    /**
     *
     * @param articleNumber Article number of the product which is to be returned
     * @return {@link Product} object with the specified article number, null if product couldn't be found
     */
    public Product getProduct(long articleNumber) {
        for (Product prod : products) {
            if (prod.getArticleNumber() == articleNumber) {
                return prod;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product prod : products) {
            builder.append(prod).append("\n");
        }
        return builder.toString();
    }
}
