package com.kodewala.oops.method.override2;
/*
 *  Covariant: means whenever you are overriding, 
 *             the return type can be child of super method.
 * 
 */
public class GenericResponse {
	
	GenericResponse(String message)
	{
		super();
	}

}
 class UPIResponse extends GenericResponse 
 {
	 UPIResponse(String message, String code) 
	 {
		 super(message);
	 }
	 
 }