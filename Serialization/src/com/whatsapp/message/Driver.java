package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message  = new Message("MSG1" , " MUJHE MT  KRO MSG ","User1234");
		
		messageSerialization.serializeMsg(message );
		
	}

}
