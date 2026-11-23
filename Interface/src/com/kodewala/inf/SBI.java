package com.kodewala.inf;

public class SBI implements IBanking{

	@Override
	public void pay() {
		System.out.println("SBI.Pay()");
		
		
	}

	@Override
	public void settle() {
		System.out.println("SBI.Settle()");
		
	}

	@Override
	public void addPayee() {
		System.out.println("SBI.addPayee()");
	}

	@Override
	public void modifyPayee() {
		System.out.println("SBI.modifyPayee()");
		
	}

	@Override
	public void doKYC() {
		// TODO Auto-generated method stub
		
	}

}
