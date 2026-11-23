package com.whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable
{
	/**
	 * What is NotSerializableException?
	 * During Serialization, if the owner of the class has not given permission,
	 * and if you are trying to serialize it
	 * it will give you NotSerializableException.
	 * 
	 */
	private static final long serialVersionUID = 1L; // Serial version UID is a unique ID given by JVM to the class.
	private String messageId;
	private String message;
	private transient String UserId; // will skipped during serialization
	
	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public Message(String messageId, String message, String userID) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.UserId =  userID;
		
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
