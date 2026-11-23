class Discount
{
	public static void main (String args [])
	{
		String user = args[0];
		int userInt = Integer.parseInt(user);
		
		int result = discount( userInt);
		System.out.println("Discount:" + result);
		
				
	}
	
	static int discount( int user)
	{
		System.out.println("Entered value:" + user);
		
		if (user >= 5000)
		{
			return user* 20 /100;
		}
	    else if (user>= 3000)
		{
			return user* 15 /100;
		}
		else if( user >= 1000)
		{
			return user* 10 /100;
		}
		else
		{
			return 0;
		}
	}
}

			
		