package com.kodewala.oops.method.overridePractice2;

class FoodOrder {
	public void CalculateDeliveryCharge() {
		System.out.println("Delivery Charge:");
	}

}

class RegularOrder extends FoodOrder {
	@Override
	public void CalculateDeliveryCharge() {
		System.out.println("Delivery charge: 10");
	}
}

class PremiumOrder extends FoodOrder {
	public void CalculateDeliveryCharge() {
		System.out.println("Delivery Charge: 50");
	}
}

class ExpressOrder extends FoodOrder {
	public void CalculateDeliveryCharge() {
		System.out.println("Delivery Charge: 100");
	}
}

class DeliveryCharges {

	public static  void main(String[] args) {

		FoodOrder delivery = new FoodOrder();
		delivery.CalculateDeliveryCharge();
		
		RegularOrder regular = new RegularOrder();
		regular.CalculateDeliveryCharge();
		
		PremiumOrder premium = new PremiumOrder();
		premium.CalculateDeliveryCharge();
	}

}
