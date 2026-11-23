package com.kodewala.oops.polymorphism2;

public class EmployeeDwncasting {
	public void DisplayDetails()
	
	{
		System.out.println("Employee meeting..");
	}
}

class Manager extends EmployeeDwncasting
{
	public void ConductMeeting()
	{
		System.out.println("Manager Meeting...");
	}
}

class Meeting{
	public static void main(String[] args) {
		
		// upcasting 
     	EmployeeDwncasting emp = new Manager();
           emp.DisplayDetails();      
		
        // DownCasting          
		Manager manager = (Manager) emp;
		manager.ConductMeeting();
	}
}