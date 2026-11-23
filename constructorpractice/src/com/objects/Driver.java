package com.objects;

class payment {
	int amount;
	String upiID;
	String note;
	String mobileNumber;
	String name;
	String bank;

	public payment(int _amount, String _upiID) {
		this.amount = _amount;
		this.upiID = _upiID;
	}

	public payment(int _amount, String _upiID, String _note) {
		this.amount = _amount;
		this.upiID = _upiID;
		this.note = _note;

	}

	public payment(int _amount, String _mobileNumber, String _name, String _bank) {
		this.amount = _amount;
		this.mobileNumber = _mobileNumber;
		this.name = _name;
		this.bank = _bank;

	}
}

public class Driver {
	public static void main(String args[])
	{
		
		payment payment = new payment(200, "abc@oksbi");
		
		payment payment1 = new payment(500 , "xyz@okicic" , "food bill");
		
		payment payment2 = new payment(1000, "5555555" , "kodewala" , "IDFC");
		
		System.out.println();
	}

}
