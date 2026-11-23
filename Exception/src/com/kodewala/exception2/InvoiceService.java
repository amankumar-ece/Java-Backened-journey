package com.kodewala.exception2;

public class InvoiceService {

	public void generateInvoice()
	{
		// Get customers and order details from database
		// [connect with datdabase --> Create db connection] +
		//[get details from db]
	try {
		connectDatabase(); // creating connection
		String name = "Aman ";
		name.lastIndexOf("a");
		System.out.println(" Generating an Invoice...");
		// closing 
		closeDbConnection();
		
	}
	catch (Exception e)
	{
		System.out.println(" Some Exception ");
		e.printStackTrace();
	}
	finally // mandatory executable block (Exception OR No Exception
	/*
	 * when JVM is no more , in that case it cannot be executable
	 */
	{ 
		System.out.println(" I  am Inside finally Block..");
	}
	}

	private void closeDbConnection() {
		// TODO Auto-generated method stub
		
	}

	private void connectDatabase() {
		// TODO Auto-generated method stub
		
	}

}
class Driver2
{
	public static void main(String[] args) {
		
		InvoiceService service = new InvoiceService();
		service.generateInvoice();
	}
}