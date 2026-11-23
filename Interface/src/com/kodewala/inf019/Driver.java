package com.kodewala.inf019;

public class Driver {
	public static void main(String[] args) {
		
		IFactorial obj = (number) -> { 
			
			long fact =1;
			
			for(int i=1; i<= number; i++) {
				
				fact = fact * i;
				
			}
			return fact;
		
	};

	long result = obj.calculate(5);
	System.out.println("Factorial "+ result);
	
}
}  