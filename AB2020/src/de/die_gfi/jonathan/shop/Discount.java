package de.die_gfi.jonathan.shop;

public interface Discount {
	/** An interface for adding the possibility to query a product for discounts */
	    /** Checks if a discount is possible for the product 
	     * 
	     * @return true, if a discount can be given, otherwise false
	     */
	    boolean isDiscountPossible();
	    
	    
	    /** Returns the maximum possible discount for a product in percent
	     * 
	     * @return maximum possible discount in percent
	     */
	    double getMaximumDiscount(int menge);
	    
	    /** Returns the discount when purchasing multiple products 
	     * 
	     * @param number of items to purchase
	     * @return possible discount in percent
	     */
	   // int getDiscountForAmount(int count);
	
}
