package com.kodewala.serialization1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization {
	public void serializeMessage(Message message) throws IOException {
		FileOutputStream fio = new FileOutputStream("message.ser"); // to this file will be written
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		oos.writeObject(message); // writing
		
		oos.close(); // close the connection
;	}
}
