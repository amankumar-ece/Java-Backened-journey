package com.tcs.emp;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address  address = new Address("16th main","27th cross" ,"Banglore");
		
		Employee emp1 = new Employee("Kodewala","KW1234",address);
		
		Employee cloneEmp = (Employee) emp1.clone();
		
		emp1.address.city = "Hyd";
		
		System.out.println(emp1.address.city);
		System.out.println(cloneEmp.address.city);
	}

}
