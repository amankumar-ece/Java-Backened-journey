package com.kodewala.inf8;

public class Laptop implements WarrantyEligible {
	String brand;
	int price;
	int warrantyYears;
	public Laptop(String brand, int price, int warrantyYears) {
		super();
		this.brand = brand;
		this.price = price;
		this.warrantyYears = warrantyYears;
	}
	
}

class Mobile implements WarrantyEligible {
	String brand;
	int  price;
	int warrantyYears;
	public Mobile(String brand, int price, int warrantyYears) {
		super();
		this.brand = brand;
		this.price = price;
		this.warrantyYears = warrantyYears;
	}
	
}
class Grocery {
	String productName;
	int price;
	public Grocery(String productName, int price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
}

class WarrantyProcessor
{
	public void registerWarranty(Object obj)
	{
		if (obj instanceof WarrantyEligible)
		{
			if(obj instanceof Laptop)
			{
				// Downcasting Laptop
				Laptop l = (Laptop) obj;
				System.out.println("Laptop Warranty: ");
				System.out.println("Brand: "+l.brand);
				System.out.println("Price: "+l.price);
				System.out.println("Warranty: "+l.warrantyYears);
			}

				else if (obj instanceof Mobile )
				{
					Mobile m = (Mobile)obj;
					System.out.println("Mobile Warranty: ");
					System.out.println("Brand: "+m.brand);
					System.out.println("Price: "+m.price);
					System.out.println("Warranty: "+m.warrantyYears);
				}
		}
					else if(obj instanceof Grocery )
					{
						Grocery g = (Grocery)obj;
						System.out.println("Grocery : ");
						System.out.println("Product Name: "+ g.productName);
						System.out.println("Price: "+g.price);
						System.out.println("Warranty Not available for Grocery procucts.");
						
					}
					else {
						System.out.println("Unknown Product Type.");
					}
	}
}
class Driver
{
	public static void main(String[] args) {
		
		Laptop laptop  = new Laptop("DELL" ,65000 ,2);
		
		Mobile mobile = new Mobile("SAMSUNG",30000,1);
		
		Grocery grocery = new Grocery("Rice",12000);
		
		WarrantyProcessor processor = new WarrantyProcessor();
		
		processor.registerWarranty(laptop);
		
		System.out.println("--------------");
		
		processor.registerWarranty(mobile);
		
		System.out.println("---------------");
		
		processor.registerWarranty(grocery);
		
	}
}

	

