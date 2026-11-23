package com.kodewala.inf02;

public interface Payment {
	
	void pay();
	void refund();
	void cancelPayment();
	default  void applyCashback() { // java-8 Default method 
		
	}

}
