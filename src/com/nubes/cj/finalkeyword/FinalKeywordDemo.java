package com.nubes.cj.finalkeyword;


class Payment{
	private static int count = 0;
	private final int DAYS_IN_WEEK = 7;
	private int noHours;
	private int amount;
	
	public Payment(int amount) {
		this(amount,8);
	}
	public Payment(int amount,int noHours){
		this.amount = amount;
		this.noHours = noHours;
	}
	public int calAmount(){
		return this.amount * this.noHours;
	}
	
	{
		System.out.println("IIB Block");
		count++;
	}
	public static int getCount(){
		return count;
	}
	
}


public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		Payment obj1 = new Payment(960);
		System.out.println(obj1.calAmount());
		
		Payment obj2 = new Payment(1500,6);
		System.out.println(obj2.calAmount());
		
		System.out.println(Payment.getCount());
		
		 
		 
		 
	}
	
		
}
