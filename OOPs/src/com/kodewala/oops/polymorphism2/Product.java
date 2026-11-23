package com.kodewala.oops.polymorphism2;

public class Product {
	
	public void displayProductDetails()
	{
		System.out.println("Product Details: ");
	}

}

class ElectronicProduct extends Product
{
	public boolean checkWarranty()
	{
		System.out.println("Check Warrantry:");
		return true;
	}
}

class ProductDetails
{
	public static void main(String[] args) {
		
/*
 *  Step-1 (ObjectCreation)
 *  reference type: Product
 *  Actual Object type: ElectronicProduct
 *  
 */
		ElectronicProduct ep = new ElectronicProduct();
		
		/*
		 * Step-2(Method Call)
		 * this compiles because displayProductDetails() is declared in Product 
		 */
		ep.displayProductDetails();
	
		/*
		 * Step-3 (DownCasting)
		 */
	ElectronicProduct electronicProduct =  (ElectronicProduct)ep;
	electronicProduct.checkWarranty();
				
	}
}