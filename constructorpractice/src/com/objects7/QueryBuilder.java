package com.objects7;

public class QueryBuilder {

	public static void main(String[] args) {

		String employeeId = null;
		String sal = "120000";
		QueryBuilder builder = new QueryBuilder();
		builder.generateSQL(employeeId, sal);
	}
	
	public void generateSQL(String empId, String salary)
	{
		StringBuilder query = new StringBuilder("Select firstName, String lastName from Employee where");
		
		if (empId != null)
		{
			query.append("employeeId= " + empId);
		}
		else if (salary != null)
		{
			query.append("Salary= " + salary);
		}
		else
		{
			query.append("Select firstName, String lastName from Employee");
		}
		query.append(";");
		
		System.out.println(" Final query is " + query);
	}

}

