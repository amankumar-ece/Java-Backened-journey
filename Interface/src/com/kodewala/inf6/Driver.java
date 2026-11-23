package com.kodewala.inf6;

class Electronics implements DiscountEligible {
	int electronics = 20000;

	public Electronics(int electronics) {
		super();
		this.electronics = electronics;
	}

}

class Furniture implements DiscountEligible {
	int furniture = 10000;

	public Furniture(int furniture) {
		super();
		this.furniture = furniture;
	}

}

class Grocery {
	int grocery = 2000;

	public Grocery(int grocery) {
		super();
		this.grocery = grocery;
	}
}

class DataProcessor {

	public void applyDiscount(Object obj) {
		if (obj instanceof DiscountEligible) {

			if (obj instanceof Electronics) {

				Electronics e = (Electronics) obj;

				double discount = e.electronics * 0.10;
				double finalPrice = e.electronics - discount;

				System.out.println("Electronics price: " + e.electronics);
				System.out.println("Discount: " + discount);
				System.out.println("Final price: " + finalPrice);
			}
		} else if (obj instanceof Furniture) {
			Furniture f = (Furniture) obj;
			System.out.println("Furniture: " + f.furniture);

		} else {
			System.out.println("Not eligible for Discount");
		}
	}
}

class Driver {
	public static void main(String[] args) {

		Electronics e = new Electronics(20000);
		Furniture f = new Furniture(10000);
		Grocery g = new Grocery(2000);

		DataProcessor processor = new DataProcessor();

		processor.applyDiscount(e);
		processor.applyDiscount(f);
		processor.applyDiscount(g);
	}
}
