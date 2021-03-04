package de.die_gfi.felix.shop;

import java.util.ArrayList;

public class ProductCollection {
	
	ArrayList<Product> produktListe;
	
	public ProductCollection(ArrayList<Product> arrList) {
		this.produktListe = arrList;
	}
	
	public String toString() {
		String result = new String();
		for(int i = 0; i < produktListe.size(); i++) {
			result = result + produktListe.get(i).toString() + "\n";
		}
					
		return result;
	}
	
	public ArrayList<Product> returnProduktListe() {
		return produktListe;
	}
	
	public Product returnProduktListeAtIndex(int index) {
		return produktListe.get(index);
	}
	
	public int returnProduktIndexVonNummer(String nummer) {
		int index = -1;
		for(int i = 0; i < produktListe.size(); i++)
			if(produktListe.get(i).nummer.equals(nummer)) {
				index = i;
				break;
			}
		return index;
	}

}
