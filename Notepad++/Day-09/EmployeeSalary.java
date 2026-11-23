class EmployeeSalary
{
	public static void main(String args [])
	{
		String salary = args[0];
		
		int salaryInt = Integer.parseInt(salary);
		
		int result = employeeSalary(salaryInt);
		
		System.out.println("Employee salary : "+ result);
	}
	static int employeeSalary(int salary)
	{
		System.out.println("Entered Salary : "+ salary);
		if ( salary >= 50000)
		{
			return salary* 20/100;
		}
		else if ( salary >30000)
		{
            return salary* 15/100;
		}
        else if (salary > 20000)
		{
			return salary* 10/100;
		}
		else 
		{
			return salary* 5/100;
		}
	}
}
