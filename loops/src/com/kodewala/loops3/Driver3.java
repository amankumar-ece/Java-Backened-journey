package com.kodewala.loops3;

public class Driver3 {

	public static void main(String[] args) {
    
		int[] numbers = { 10, -25, 35, -40, 55, -60, 75, -80, 95, -100, 15, -30, 45, -50};
		
		// Multiply +ve number by 10
		
		for(int index =0; index < numbers.length; index++)
		{
			int currentNumber = numbers[index];
			
			if(currentNumber <0)
			{
				continue; // Skip the current iteration
			}
			System.out.println(currentNumber*10); // biz --> 100 lines
		}
	}

}
