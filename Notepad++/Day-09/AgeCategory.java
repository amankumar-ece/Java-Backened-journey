class AgeCategory
{
	public static void main(String args[])
	{
		System.out.println(" Starting main function () ");
		
		String number = args[0];
		
		
		int numberInt = Integer.parseInt(number);
	
		String result = ageCategory(numberInt);
		
		System.out.println("Age Category: " + result);
	}
	static String ageCategory(int number)
	{
		System.out.println("Entered Number: " + number);
		{
			if (number < 13)
			{
				return "child";
			}
			else if (number <19)
			{
				return "teenager";
			}
			else if ( number < 59)
			{
				return "adult";
			}
			else 
			{
				return "seniorCitizen";
			}
		}
	}
}


		
