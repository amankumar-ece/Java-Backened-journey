package com.kodewala.inf06;
/*
 * Marker Interface: Empty Interface
 * 
 */
class PermanentEmployee implements Exportable 
{
	String name;
	int salary;
	String position;
	public PermanentEmployee(String name, int salary, String position) {
		super();
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
}
class ContractEmployee implements Exportable
{
	String name;
	String position;
	int salary;
	public ContractEmployee(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
}
public class DataExporter {
	public void exportData(Object obj)
	{
		if(obj instanceof Exportable)
		{
		 if(obj instanceof PermanentEmployee)	
		
		{
			PermanentEmployee emp = (PermanentEmployee)obj;
			
			System.out.println("Permanent Employee Details: ");
			System.out.println("Name: "+ emp.name);
			System.out.println("Salary "+emp.salary);
			System.out.println("Position: "+ emp.position);
		}
		 else 
			 if(obj instanceof ContractEmployee)
			 {
				 ContractEmployee emp = (ContractEmployee) obj;
				 
				 System.out.println("Contract Employee Details:");
				 System.out.println("Name:"+emp.name);
				 System.out.println("Position:"+emp.position);
				 System.out.println("Salary:"+emp.salary);
			 }
			 else
			 {
				 System.out.println("This employee is not eligible for Export");
			 }
		}
	}
}

class Driver
{
	public static void main(String[] args) {
		
		PermanentEmployee permanent = new PermanentEmployee("Aman",300000,"java developer");
		
		ContractEmployee contract = new ContractEmployee("Minu","Tester", 20000);
		
		DataExporter exporter = new DataExporter();
		exporter.exportData(permanent);
		
		System.out.println("---------");
		
		exporter.exportData(contract);
	}
}

