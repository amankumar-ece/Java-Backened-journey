class Operators
{
	public static void main(String args[])
	{
		int minAge = 18;
		int maxAge = 60;
		
		String name = args[0];
		int userAge = Integer.parseInt(args[1]);
		
		System.out.println("Appling for DL :" + name);
		System.out.println("condition1:"+(minAge < userAge));
		System.out.println("Condition2:"+(maxAge > userAge));
		
		System.out.println("Allowed to Apply for DL: "+(minAge < userAge));
		
		String message = minAge < userAge ? "Allowed" : "Not Allowed";
		
		System.out.println(message);
		
	}
}

class AndOperator
{
	public static void main(String args[])
	{
		int minAge = 25;
		int maxAge = 60;
		
		String name = args[0];
		int userAge= Integer.parseInt(args[1]);
		
		System.out.println("Applying for: " + name);
		
		System.out.println("Condition1: " + (userAge > minAge));
		System.out.println("Condition2: " + (userAge < maxAge));
		
		System.out.println("Eligible: " + (userAge > minAge && userAge < maxAge));
		
		// AND(&&)OPERATOR - Both conditions must be true for the final result to be true.
	}
}

		
