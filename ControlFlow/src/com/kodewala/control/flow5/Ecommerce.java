/*
 * Task Time: 
 * As part of e-commerce application, you need to discount Api(method) 
 * which will calculate the discount based on customer type. 
 * Customer type - 1. Gold -> 20% 2. Silver -> 10%  3. Regular -> 5%  
 * Max discount: 2500.  Minimum purchase is 1000.
 * Follow java naming conventions and single responsibility(part of SOLID).  
 * 
 */
package com.kodewala.control.flow5;

public class Ecommerce {
	
	public static void main(String[] args) {
	
	Ecommerce ecommerce = new Ecommerce();
	String customerType = args[0];
	double purchaseAmount = Double.parseDouble(args[1]);

	ecommerce.calculateDiscount(customerType, purchaseAmount);
}
	
		public void calculateDiscount(String customerType, double purchaseAmount) {

			if (purchaseAmount < 1000) {
				System.out.println("Minimum purchase amount should be 1000");
				return;
			}

			double discount = 0;

			switch (customerType.toLowerCase()) {

			case "gold":
				discount = purchaseAmount * 20 / 100;
				break;

			case "silver":
				discount = purchaseAmount * 10 / 100;
				break;

			case "regular":
				discount = purchaseAmount * 5 / 100;
				break;

			default:
				System.out.println("Invalid customer type");
				return;
			}

			if (discount > 2500) {
				discount = 2500;
			}

			System.out.println("Customer Type: " + customerType);
			System.out.println("Purchase Amount: " + purchaseAmount);
			System.out.println("Discount: " + discount);
			System.out.println("Final Amount: " + (purchaseAmount - discount));
		}
	}
