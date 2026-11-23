class SumTwo
{
	public static void main(String args[])
	{
		int number1 = Integer.parseInt(args[0]);
	    int number2 = Integer.parseInt(args[1]);
		
		int total = number1 + number2;
		
		System.out.println("First Number: " + number1);
		System.out.println("Second Number: " + number2);
		System.out.println("Total: " + total);
	}
}

class AddNumber
{
	public static void main(String args[])
	{
		String firstNumber = args[0];
		String secondNumber = args[1];
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int secondNumberInt = Integer.parseInt(secondNumber);
		
		System.out.println(firstNumberInt + secondNumberInt);
	}
}
