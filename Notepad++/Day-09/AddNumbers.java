
/*Write a program to add two number. 
User will provide the number from command line args.
Method should return the sum.
*/

class AddNumbers

{
     static int add(int firstNumber ,int secondNumber)
	{
		return firstNumber + secondNumber;
		
	}
	
	public static void main (String args [])
	{
	String firstNumber = args[0];
	String secondNumber = args[1];
	
	
	int firstNumberInt = Integer.parseInt(firstNumber);
	int secondNumberInt = Integer.parseInt(secondNumber);
		
		int sum = firstNumberInt + secondNumberInt;
		
		System.out.println("sum: " + sum);
		
	}
}

class SubtractNumbers
{
	public static void main(String args[])
	{
	   System.out.println("Starting main()");
	   
	   String firstNumber = args[0];
	   String secondNumber = args[1];
	   
	   int firstNumberInt = Integer.parseInt(firstNumber);
	   int secondNumberInt = Integer.parseInt(secondNumber);
		
		int result = SubtractNumbers(firstNumberInt, secondNumberInt);
		
		System.out.println("sub = " + result);
		
		System.out.println( "Ending main()");
	}
	static int SubtractNumbers(int firstNumber, int secondNumber)
	{
		System.out.println("Enter SubtractNumbers()");
		
		System.out.println("Input Received: " + firstNumber + " " + secondNumber);
		
		int sub = firstNumber -secondNumber;
		
		System.out.println("Exit SubNumbers()");
		return sub;
	}
}

class Multiplynumbers
{
	public static void main(String args[])
	{
		System.out.println("Starting main ()");
		
		String firstNumber = args[0];
		String secondNumber = args[1];
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int secondNumberInt = Integer.parseInt(secondNumber);
		
		int result = MultiplyNumbers(firstNumberInt ,secondNumberInt);
		
		System.out.println("Mult = " + result);
		System.out.println("Ending main () ");
	}
	
	static int MultiplyNumbers(int firstNumber , int secondNumber)
	{
		System.out.println("Enter MultiplyNumbers ()");
		System.out.println("Input Received : " + firstNumber + " " + secondNumber);
		
		int mult = firstNumber * secondNumber;
		
		System.out.println("Exit MultiplyNumbers()");
	return 	mult;
	}
}

class Dividenumbers
{ 
public static void main(String args [])
{
System.out.println("starting main ()");
	
	String firstNumber = args[0];
	String secondNumber = args[1];
	
	int firstNumberInt = Integer.parseInt(firstNumber);
	int secondNumberInt = Integer.parseInt(secondNumber);
	
	int result = dividenumbers(firstNumberInt , secondNumberInt);
	
	System.out.println("Divd:" + result);
	System.out.println("Ending main ()" );
}
 static int dividenumbers(int firstNumber,int secondNumber)
 {
	 System.out.println("Enter Number :" );
	 System.out.println("INPUT Received :" + firstNumber + " " + secondNumber);
	 
	 int divd = firstNumber / secondNumber;
	 System.out.println("EXIT Divide Numbers");
	 return divd;
 }
}

class Remainder
{
	public static void main (String args[])
	{
		System.out.println("Starting main()");
		
		String  firstNumber = args[0];
		String  secondNumber = args [1];
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int secondNumberInt = Integer.parseInt(secondNumber);
		
		int result = remainder(firstNumberInt , secondNumberInt);
		
		System.out.println("Remainder:" + result);
	}
	static int remainder(int firstNumber , int secondNumber)
	{
		System.out.println("Entered Number : "  + firstNumber + " " + secondNumber);
		
		int remainder = firstNumber % secondNumber;
		return remainder;
	}
}

class LargerNumber
{
	public static void main(String args[])
	{
		String firstNumber = args[0];
		String secondNumber = args[1];
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int secondNumberInt = Integer.parseInt(secondNumber);
		
		int result = largerNumber(firstNumberInt ,secondNumberInt);
		
		System.out.println("Larger Number:"+ result);
	}
	static int largerNumber(int firstNumber ,int secondNumber)
	{
		System.out.println("Entered Number:" + firstNumber + " " + secondNumber);
	if (firstNumber > secondNumber)
	{
		return firstNumber;
	}
	else
	{
		return secondNumber;
	}
}
}

class EvenOdd
{
	public static void main(String args[])
	{
		System.out.println("Starting main function ()");
		
		String number = args[0];
		
		
		int numberInt = Integer.parseInt(number);
		
		
		String result = CheckEvenOdd(numberInt);
		
		System.out.println("Number is  : " + result);
	}
	static String CheckEvenOdd(int number)
	{
		System.out.println("Entered Number : " + number);
		
		if ( number % 2 == 0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
}

class CheckNumber
{
	public static void main(String args [])
	{
		System.out.println("Starting the main function");
		
		String number = args[0];
		
		int numberInt = Integer.parseInt(number);
		
		String result = checkNumber(numberInt);
		
		System.out.println("Check Number is : " + result);
	}
	 static String checkNumber(int number)
	 {
		 System.out.println("Entered Number: " + number);
		 System.out.println("Input Received: " + number);
		 
		 if (number > 0)
		 {
			 System.out.println("Exit checkNumber()");
			 
			 return "positive";
		 }
		 else if (number < 0)
		 {
			 System.out.println("Exit checkNumber()");
			 
			 return "negative";
		 }
		 else
		 {
			 System.out.println("Exit checkNumber()");
	
			 return "zero";
		 }
	 }
}

class SmallerNumber
{
	public static void main(String args[])
	{
		String firstNumber = args[0];
		String secondNumber = args[1];
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int secondNumberInt = Integer.parseInt(secondNumber);
		
		int result= smallerNumber(firstNumberInt, secondNumberInt);
		
		System.out.println("Smaller Number is :" + result);
	}
	static int  smallerNumber(int firstNumber , int secondNumber)
	{
		System.out.println("Entered Number: " + firstNumber + " " + secondNumber);
		if(firstNumber > secondNumber)
		{
			return secondNumber;
		}
		else
		{
			return firstNumber;
		}
	}
}

		
	