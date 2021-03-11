package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent a Beverage with all associated info.
 *
 * @see Food
 * @see ExpirableProduct
 * @see Product
 */
public class Beverage extends ExpirableProduct {

	protected int containerSizeInMl;
	protected int packagingUnit;

	/**
	 * @param articleNumber     Article number of this Beverage
	 * @param name              Name of this Beverage
	 * @param price             Price of this Beverage
	 * @param bestByDate        Best by Date of this Beverage
	 * @param containerSizeInMl Size of the container of the Beverage in ml
	 */
	public Beverage(long articleNumber, String name, String manufacturer, double price, String bestByDate,
			int containerSizeInMl) {
		super(articleNumber, name, manufacturer, price, bestByDate);
		this.containerSizeInMl = containerSizeInMl;
	}

	public Beverage(long articleNumber, String name, String manufacturer, double price, String bestByDate,
			int containerSizeInMl, int packagingUnit) {
		super(articleNumber, name, manufacturer, price, bestByDate);
		this.packagingUnit = packagingUnit;
		this.containerSizeInMl = containerSizeInMl;
	}

	public Beverage(long articleNumber, String name, String manufacturer, double price, String bestByDate,
			int containerSizeInMl, int packagingUnit, int maxDiscountablePercent) {
		super(articleNumber, name, manufacturer, price, bestByDate, maxDiscountablePercent);
		this.packagingUnit = packagingUnit;
		this.containerSizeInMl = containerSizeInMl;
	}

	public static Product parseString(String[] elements) {
		try {
			if (elements.length == 7)
				return new Beverage(Long.parseLong(elements[1]), elements[2], elements[3],
						Double.parseDouble(elements[4]), elements[5], Integer.parseInt(elements[6]));
			if (elements.length == 8)
				return new Beverage(Long.parseLong(elements[1]), elements[2], elements[3],
						Double.parseDouble(elements[4]), elements[5], Integer.parseInt(elements[6]),
						Integer.parseInt(elements[7]));
			if (elements.length == 9)
				return new Beverage(Long.parseLong(elements[1]), elements[2], elements[3],
						Double.parseDouble(elements[4]), elements[5], Integer.parseInt(elements[6]),
						Integer.parseInt(elements[7]), Integer.parseInt(elements[8]));
		} catch (Exception e) {
			System.out.println("Couldn't parse Beverage");
		}
		return null;
	}

	/**
	 * Sets the container size of this Beverage
	 *
	 * @param containerSizeInMl The new container size
	 */
	public void setContainerSizeInMl(int containerSizeInMl) {
		this.containerSizeInMl = containerSizeInMl;
	}

	@Override
	public String toString() {
		return "Beverage: " + articleNumber + "; " + manufacturer + " " + name + "; price: " + price
				+ "; container size: " + containerSizeInMl + " ml";
	}

	public int getContainerSizeInMl() {
		return containerSizeInMl;
	}
}
