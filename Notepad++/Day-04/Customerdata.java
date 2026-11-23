class Customerdata
{
	public static void main(String args[])
	{
		String fileName= args[0];
		System.out.println("We are analyzing your file "+ fileName);
		System.out.println(" Your file processed Successfully "+ fileName);
	}
}

class CustomerEntry
{
	public static void main(String args[])
	{
		String fileName = args[0];
		System.out.println(" We are Analyzing Your Profile.." +fileName);
		System.out.println(" File Processing Started..."+ fileName);
		System.out.println(" File Processing Completed Sucessfully." +fileName);
	}
}

class CustomerAman
{
	public static void main(String args[])
	{
			String fileName = args[0];
			String fileType = args[1];
			
			System.out.println("File Name: "+ fileName);
            System.out.println("File Type: "+ fileType);
            System.out.println("Processing " + fileName + "file");
			System.out.println("Under Process "+ fileName);
			System.out.println( fileName +"file processed Successfully.");
	}
}

class CustomerInfo
{
	public static void main(String args[])
	{
		String customerName = args[0];
		String city = args[1];
		String customerType = args[2];
		
		System.out.println( "Customer Name: " + customerName);
		System.out.println( "City: " + city);
		System.out.println( "Customer Type: " + customerType);
	}
}

class CustomerInfoAman
{
	public static void main(String args[])
	{
		String customerName =args[0];
		String city = args[1];
		int age = Integer.parseInt(args[2]);
		
		System.out.println("Customer Name: " + customerName);
		System.out.println("City: " + city);
		System.out.println("Age: " + age);
		System.out.println(customerName + " is " + age + " Years old and lives in " + city + ".");
	}
}

class CustomerBill
{
	public static void main(String args[])
	{
		String customerName = args[0];
		int itemPrice = Integer.parseInt(args[1]);
		int deliveryCharge = Integer.parseInt(args[2]);
		int discount = Integer.parseInt(args[3]);
		
		int totalAmount = itemPrice + deliveryCharge - discount;
		
		System.out.println("Customer Name: " + customerName);
		System.out.println("Item Price: " + itemPrice);
		System.out.println("Delivery Charge: " + deliveryCharge);
		System.out.println("Discount: " + discount);
		System.out.println("Total Amount: " + totalAmount);
	}
}

class StudentResult
{
	public static void main(String args[])
	{
		String studentName = args[0];
		int mark1 = Integer.parseInt(args[1]);
		int mark2 = Integer.parseInt(args[2]);
		int mark3 = Integer.parseInt(args[3]);
		
		int total = mark1 + mark2 + mark3;
		int percentage = total / 3;
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Mark1: " + mark1);
		System.out.println("Mark2: " + mark2);
		System.out.println("Mark3: " + mark3);
		
		System.out.println("total " + total);
		System.out.println("percentage " + percentage);
	}
}

class StudentGrade
{
	public static void main(String args[])
	{
		String studentName = args[0];
		
		int mark1 = Integer.parseInt(args[1]);
		int mark2 = Integer.parseInt(args[2]);
		int mark3 = Integer.parseInt(args[3]);
		
		int total = mark1 +	mark2 + mark3;
		int percentage = total / 3;
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage);
		
		
		if (percentage >=90)
		{
			
          System.out.println("Grade: A");
	    }
		else if (percentage >=75)
		{
			System.out.println("Grade: B");
		}
		else if (percentage >=60)
		{
			System.out.println("Grade: C");
		}
		else if (percentage >=40)
		{
			System.out.println("Grade: D");
		}
	}
}

class EmployeeSalary
{
  public static void main(String args[])
  {
	  String employeeName = args[0];
	  int basicSalary =Integer.parseInt (args[1]);
	  int bonus = Integer.parseInt (args[2]);
	  
	  int total = basicSalary + bonus;
	  
	 
	  
	  System.out.println("Employee Name: " + employeeName);
	  System.out.println("Basic salary: " + basicSalary);
	  System.out.println("Bonus: " + bonus);
	  System.out.println("Total Salary: " + total);
  }
}

