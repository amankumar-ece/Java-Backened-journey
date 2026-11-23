class AccountCreation
{
	int balance = 500; // Instance variable 
	
	static int interestRate = 10; // Static variable ( same for all Or we can say it belong to Class )
	
	public static void main(String args[])
	{
		// Creating an object of Account class
		
		AccountCreation acc = new AccountCreation();
		
		System.out.println(" Balance: "+ acc.balance); // dot(.) operator , for Instance 
		
		System.out.println(" Interest Rate: "+ AccountCreation.interestRate); //  dot(.)operator , for Static 
        
		AccountCreation.doSomething(); // Calling doSomething() Which is static 
		
		AccountCreation.doWork();
		
	
	}
	public static void doSomething()
	{
		System.out.println(" This is do something method...");
	}
	
	public static void doWork()
	{
		System.out.println(" This is do your Method...");
	}
	
		
}
