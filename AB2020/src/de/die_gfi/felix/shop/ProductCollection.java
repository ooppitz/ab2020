package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class ProductCollection {
	
	ArrayList<Product> arrList;
	
	public ProductCollection(ArrayList<Product> arrList) {
		this.arrList = arrList;
	}
	
	public String toString() {
		String result = new String();
		for(int i = 0; i < arrList.size(); i++) {
			result = result + arrList.get(i).name + "\n";
		}
					
		return result;
	}
		

}
