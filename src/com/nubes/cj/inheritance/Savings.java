package com.nubes.cj.inheritance;

public class Savings extends Account{
	
		private float minBalance;

		public Savings(String accNumber, String name, float balance, float minBalance) {
			super(accNumber, name, balance);
			this.minBalance = minBalance;
		}
		
		@Override
		public void withDraw(float amount) {
			if(amount <= (balance - minBalance)){
				this.balance -= amount;
			}else{
				System.out.println("Sorry! insufficiet funds...");
			}
		}
		
		@Override
		public void showInfo() {
			System.out.println("Accnumber:"+accNumber+"\nName:"+name+"\nMinBalance:"+minBalance+"\nBalance:"+balance);
		}
		
		
}
