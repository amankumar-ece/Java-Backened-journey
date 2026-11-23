package com.whats.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
FileInputStream fis = new FileInputStream("C:\\Users\\onlin\\OneDrive\\kodewala\\25thAug2026\\Serialization\\message.ser");
ObjectInputStream ois = new ObjectInputStream(fis);

Message message = (Message)ois.readObject();

System.out.println("De Ser : "+message.getMessage()+"and user id"+message.getUserId());
	}

}
