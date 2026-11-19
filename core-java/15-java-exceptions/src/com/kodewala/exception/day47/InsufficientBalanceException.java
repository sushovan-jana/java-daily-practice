package com.kodewala.exception.day47;

public class InsufficientBalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
