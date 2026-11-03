package com.kodewala.deserialization1;
import com.kodewala.serialization1.Message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\java-learning\\core-java\\12-java-serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message messageObject = (Message) ois.readObject();
		System.out.println("De ser message : " 
								+ messageObject.getMessage() 
								+ " || message id : " + messageObject.getMessageId()
								+ " || user id : " + messageObject.getUserId());

		ois.close();
	}
}
