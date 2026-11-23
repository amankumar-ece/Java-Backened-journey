class ORoperators
{
	public static void main(String args[])
	{
		int amountByUser = Integer.parseInt(args[0]);
		
		int minAmount = 1;
		int maxAmount = 2000;
		
		System.out.println("condition1:" + (amountByUser > minAmount));
		System.out.println("Condition2:" + (amountByUser < maxAmount));
		
		System.out.println(amountByUser > minAmount || amountByUser < maxAmount); 
		
		//  OR OPERATOR - At least one condition must be true for the final result to be true.
	}
}

class Oroperator
{
	public static void main(String args[])
	{
		int minAge = 18;
		int seniorAge =60;
		
		String name = args[0];
		int userAge = Integer.parseInt(args[0]);
		
		System.out.println("Condition1:" + ( userAge < minAge));
		System.out.println("Condition2:" + ( userAge > seniorAge));
		
		System.out.println(userAge < minAge || userAge > seniorAge);
	}
}

		