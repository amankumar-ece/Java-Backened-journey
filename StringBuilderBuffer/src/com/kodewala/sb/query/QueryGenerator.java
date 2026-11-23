package com.kodewala.sb.query;

public class QueryGenerator 
{
	public 	StringBuilder generateQuery(int salary, String empID)
	{
		StringBuilder query = new StringBuilder("Select * from employee ");
		
		if(Salary >0)
		{
			query.append(" Where salary = " + salary);
		}
		else if(empID != null)
		{
			
		}
	}
	

}
