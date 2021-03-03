package de.die_gfi.franziska.shop;

import java.util.ArrayList;

public class ProductCollection {

	ArrayList<Product> productCollection;

	public ProductCollection(ArrayList<Product> arrList) {

		this.productCollection = arrList;

	}

	public static void main(String[] args) {

	}

	/**
	 * @param ProductCollection c
	 * @return Product[] from ArrayList<Product>
	 */
	public Product[] toArray(ProductCollection c) {

		Product[] arr = new Product[this.productCollection.size()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = productCollection.get(i);

		}

		return arr;
	}

	/**
	 * 
	 * @param Product[] arr
	 * @return length of the Product[]
	 */
	public int laenge(ProductCollection collection) {

		int counter = 0;

		for (int i = 0; i < collection.toArray(collection).length; i++) {

			counter = counter + 1;

		}

		return counter;
	}

}
