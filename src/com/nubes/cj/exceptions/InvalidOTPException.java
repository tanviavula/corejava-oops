package com.nubes.cj.exceptions;

public class InvalidOTPException extends RuntimeException{
	
	private static String message="You have entered invalid OTP, please check OTP or use resned service";

	public InvalidOTPException() {
		super(message);
	}
	public InvalidOTPException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "InvalidOTPException [message=" + message + "]";
	}
	
		
}
