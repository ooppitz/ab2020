package de.die_gfi.philipp.shop.products;

/**
 * Objects of this class represent Food with all associated info
 *
 * @see Product
 */
public class Food extends ExpirableProduct {
	protected int weightInGramm;

	/**
	 * @param articleNumber Article number of this Food
	 * @param name          Name of this Food
	 * @param manufacturer  The name of the manufacturer of this Food
	 * @param price         Price of this Food
	 * @param bestByDate    Best by Date of this Food
	 * @param weight        Weight of this Food
	 */
	public Food(long articleNumber, String name, String manufacturer, double price, String bestByDate, int weight) {
		super(articleNumber, name, manufacturer, price, bestByDate);
		this.weightInGramm = weight;

	}

	/**
	 * @param articleNumber        Article number of this Food
	 * @param name                 Name of this Food
	 * @param manufacturer         The name of the manufacturer of this Food
	 * @param price                Price of this Food
	 * @param bestByDate           Best by Date of this Food
	 * @param weight               Weight of this Food
	 * @param maxDiscountInPercent The maximum amount this Food is discountable
	 *                             through amount
	 */
	public Food(long articleNumber, String name, String manufacturer, double price, String bestByDate, int weight,
			int maxDiscountInPercent) {
		super(articleNumber, name, manufacturer, price, bestByDate, maxDiscountInPercent);
		this.weightInGramm = weight;

	}

	public static Product parseString(String[] elements) {
		try {
			if (elements.length == 7)
				return new Food(Long.parseLong(elements[1]), elements[2], elements[3], Double.parseDouble(elements[4]),
						elements[5], Integer.parseInt(elements[6]));
			if (elements.length == 8)
				return new Food(Long.parseLong(elements[1]), elements[2], elements[3], Double.parseDouble(elements[4]),
						elements[5], Integer.parseInt(elements[6]), Integer.parseInt(elements[7]));
		} catch (Exception e) {
			System.out.println("Couldn't parse Food.");
		}
		return null;
	}

	/**
	 * Sets the weight of this Food
	 *
	 * @param weight New weight of the food product
	 */
	public void setWeight(int weight) {
		this.weightInGramm = weight;
	}

	public int getWeight() {
		return weightInGramm;
	}

	public String getBestByDate() {
		return bestByDate;
	}

	@Override
	public String toString() {
		return "Food: " + articleNumber + "; " + manufacturer + " " + name + "; price: " + price + "; weight: "
				+ weightInGramm + " g";
	}
}
