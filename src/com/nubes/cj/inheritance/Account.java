package com.nubes.cj.inheritance;

public abstract class Account {
		
		String accNumber;
		String name;
		float balance;
			
		public Account(String accNumber,String name, float balance) {
			this.accNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}
		public void deposite(float amount){
			this.balance += amount;
		}
		public abstract  void withDraw(float amount);
		
		public void showInfo(){
			System.out.println("Account Number :"+accNumber);
			System.out.println("Name :"+name);
			System.out.println("Balance :"+balance);
		}
		
}
