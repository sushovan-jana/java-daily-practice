package com.sushovan.oops.polymorphism.day32;

class Logger {
//	method to be overriden
	void log() {
		System.out.println("Logs message to generic system...");
	}
}

class ConsoleLogger extends Logger {
	@Override
	void log() {
		System.out.println("Logs message to the console...");
	}
}

class FileLogger extends Logger {
	@Override
	void log() {
		System.out.println("Logs message to the files...");
	}
}

class DatabaseLogger extends Logger {
	@Override
	void log() {
		System.out.println("Logs message to the database...");
	}
}

public class LoggingSystem {
	public static void main(String[] args) {
		Logger logger; // Parent class reference pointing to different child objects
		
		logger = new ConsoleLogger();
		logger.log(); // ConsoleLogger class method will be invoked
		
		logger = new FileLogger();
		logger.log(); // FileLogger class method will be invoked
		
		logger = new DatabaseLogger();
		logger.log(); // DatabaseLogger class method will be invoked
	}
}
