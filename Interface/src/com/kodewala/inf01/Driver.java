package com.kodewala.inf01;
/*
 Default: Default is done to achieve backward compatibility(optional)
 
 Static : Avoiding code duplicacy between implementing classes.some of the common functionality
            everybody will be implementing
            
*/
interface EcoSystem {
	
	void placeOrder(); // public abstract void placeOrder
	
	void cancelOrder();
	
	void editOrder();
	
	void generateInvoice();
	
	public static void printInvoicePDF()  // common functionality 
	{  
		// 200 lines of code
		
	}
	

}
class Amazon implements EcoSystem {

	@Override
	public void placeOrder()
	{
		System.out.println("Amazon.placeOrder()");
		
	}

	@Override
	public void cancelOrder() 
	{
		
		System.out.println("Amazon.cancelOrder()");
		
	}

	@Override
	public void editOrder()
	{
		System.out.println("Amazon.editOrder()");
		
	}
	
	@Override
	public void generateInvoice()
	{
		System.out.println("Amazon.generateInvoice()");
		printInvoicePDF("path to store pdf file", "seller logo ");
	}
	
	private void printInvoicePDF(String path , String companyLogo) 
	{
	   EcoSystem.printInvoicePDF();
    }
	
}	
class Flipkart implements EcoSystem {

@Override
public void placeOrder() {
	System.out.println("Flipkart.placeOrder()");
	
}

@Override
public void cancelOrder() {
	System.out.println("Flipkart.cancelOrder()");
	
}

@Override
public void editOrder() {
      System.out.println("Flipkart.editOrder()");
	
}

@Override
public void generateInvoice() {
	printInvoicePDF("path to store pdf file", "seller logo");
  }

private void printInvoicePDF(String path , String companyLogo) {
	// System.out.println("Amazon.Flipkart.printInvoicePDF()"); code duplicacy 
	EcoSystem.printInvoicePDF();
  }

}
