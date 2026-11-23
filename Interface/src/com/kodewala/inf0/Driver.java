package com.kodewala.inf0;

// 2010(1.6) --> 2012(wanted new features 'printPassBook') 
interface IBanking {
	void pay(); //2010
	void settle(); //2010
	void cancelTxN(); //2010
	
	default void printPassBook() { // only rural Bank need this(2012)
		
		System.out.println("IBanking.printPassBook() - default functionality");
	}
	
	
}
class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
		
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
		
	}

	@Override
	public void cancelTxN() {
		System.out.println("HDFC.cancelTxN()");
	}
	
}

class RuralBank implements IBanking {

	@Override
	public void pay() {
	System.out.println("RuralBank.pay()");
	}

	@Override
	public void settle() {
		System.out.println("RuralBank.settle()");
		
	}

	@Override
	public void cancelTxN() {
		System.out.println("RuralBank.cancelTxN()");
		
	}
	
	
}
public class Driver {

}
