class FundTransfer
{
	public static void main (String args[])
	{
		System.out.println("starting main()");
		
		// calling the method and passing the values (input)
		boolean result = FundTransfer.doTransaction(10, "6202325955" , "123456789");
		
		System.out.println("Is txn successful ? " + result);
		System.out.println("Ending main () ");
	}
static boolean doTransaction (int amountToBetxn, String  senderAccNo , String  recAccNo)
{
System.out.println("Entered  doTransaction() ");
System.out.println("Input Received " +	amountToBetxn + " "+senderAccNo + " "+recAccNo);
 // some biz logic which will perform the transaction
 
System.out.println("Exit doTransaction()");
return true;
}
}


