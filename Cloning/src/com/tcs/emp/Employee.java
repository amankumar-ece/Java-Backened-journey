package com.tcs.emp;
/*
 * 
 * 
 */
public class Employee implements Cloneable { // Level -1 (Shallow Copy)
	String name; // copy
	String empCode; // copy
	Address address; // HAS-A // Copy Only reference not the actual Object
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
