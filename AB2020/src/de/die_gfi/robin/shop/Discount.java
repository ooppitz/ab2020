package de.die_gfi.robin.shop;

public interface Discount {
	
	
	boolean isDiscountPossible();
	
	
	double getMaximumDiscount();
	
	
	int getDiscountForAmount(int menge);
	
	
}
