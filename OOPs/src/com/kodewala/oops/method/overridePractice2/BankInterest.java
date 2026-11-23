package com.kodewala.oops.method.overridePractice2;

public class BankInterest {
	public void getInterestRate()
	{
		System.out.println("Interest Rate:");
	}

}
class SBI extends BankInterest
{
	public void getInterestRate()
	{
		System.out.println("SBI Interest Rate: 5%");
	}
}

class HDFC extends BankInterest
{
	public void getInterestRate()
	{
		System.out.println("HDFC interest Rate: 8");
	}
}

class ICICI extends BankInterest
{
	public void getInterestRate()
	{
		System.out.println("ICICI interest Rate: 9%");
	}
}

class InterestRate{
	public static void main(String[] args) {
		BankInterest bi = new BankInterest();
		bi.getInterestRate();
				
		SBI si = new SBI();
		si.getInterestRate();
		
		ICICI ir =new ICICI();
		ir.getInterestRate();
	}
}