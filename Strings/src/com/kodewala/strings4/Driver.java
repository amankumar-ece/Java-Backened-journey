package com.kodewala.strings4;

public class Driver {

	public static void main(String[] args)
	{
        String s = "HelloJava";
		
		String s3 = new String("Hello"); // SCP + Heap
		
		String s4 = s3.concat(" world"); // SCP(World)+ Heap(HelloWorld)
		
		System.out.println(s4);
	}

}
