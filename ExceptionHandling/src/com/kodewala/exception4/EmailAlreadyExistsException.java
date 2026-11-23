package com.kodewala.exception4;

public class EmailAlreadyExistsException extends RuntimeException{

	EmailAlreadyExistsException(String _message)
	{
		super(_message);
	}
}
