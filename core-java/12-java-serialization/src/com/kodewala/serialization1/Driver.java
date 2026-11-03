package com.kodewala.serialization1;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization = new MessageSerialization();
		Message message = new Message("MSG1", "Hello GD M9G", "USER7447");
		messageSerialization.serializeMessage(message);
		System.out.println("Serialization Done");

	}
}
