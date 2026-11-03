package com.kodewala.serialization1;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = 1L;
	private String messageId;
	private String message;
	private transient String userId; // this field I don't want to expose
	
	public Message(String messageId, String message, String userId) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
