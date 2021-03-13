package de.die_gfi.franziska.shop;

//start implementing interfaces

public class Book extends Product implements InstanceCounter {

	int isbn;

	public static int counter = 0;

	public Book(String n, double p, int nr, int isbn) {

		super(n, p, nr);

		this.isbn = isbn;

		Book.counter++;

	}

	public static void main(String[] args) {

		Book book1 = new Book("ABC lernen mit Tom", 6.9, 12, 188);

		System.out.println(book1.toString());

	}

	public String toString() {

		return "Artikelnummer: " + artikelnummer + "\nBuch: " + name + " \nPreis: " + App.f.format(preis) + "€" + "\n";

	}

	public int getCount() {

		return Book.counter;

	}

	@Override
	public boolean isDiscountPossible() {

		return false;

	}

	@Override
	public int getMaximumDiscount() {

		return 0;
	}

	@Override
	public int getDiscountForAmount(int count) {

		int discount = 0;

		if (count >= 5) {

			discount = getMaximumDiscount() / 10;

		} else if (count >= 10) {

			discount = getMaximumDiscount() / 5;

		} else if (count >= 80) {

			discount = getMaximumDiscount();

		}

		return discount;
	}
}
