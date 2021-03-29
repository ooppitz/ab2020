package de.die_gfi.oppitz.shop;

public class Computer extends Product {

	
	int screenSize; 
	int memoryGB;
	int storageGB;
	
	public Computer(String name, String description, double price) {
		super(name, description, price);
	}

	public Computer(String name, String description, double price, int screenSize, int memoryGB, int storageGB) {
		super(name, description, price);
		
		this.screenSize = screenSize;
		this.memoryGB = memoryGB;
		this.storageGB = storageGB;
		
	}
	
	@Override
	public String toString() {
		return "Computer '" + name + "': " + description + ", " + memoryGB + " GB RAM " + storageGB + " Storage";
	}

	@Override
	public int caculateDiscount(int numberOfItems) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
