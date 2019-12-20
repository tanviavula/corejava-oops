package com.nubes.cj.exceptions;

class Account{
	
	public boolean checkOTP(int input){
		if(input == 1111){
			return true;
		}
		throw new InvalidOTPException();
	}
}
public class OTPManager {
	public static void main(String[] args) {
		Account acc = new Account();
		try{
		if(acc.checkOTP(1112)){
			System.out.println("valid");
		}
		}catch (InvalidOTPException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
