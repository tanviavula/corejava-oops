package com.nubes.cj.inheritance;

public class Current extends Account {
	
		private float overDraft;

		public Current(String accNumber, String name, float balance, float overDraft) {
			super(accNumber, name, balance);
			this.overDraft = overDraft;
		}
		
		@Override
		public void withDraw(float amount) {
			if(amount <= balance + overDraft){
				this.balance -= amount;
			}else{
				System.out.println("Sorry! Insufficient funds...");
			}
		}
		@Override
		public void showInfo() {
			System.out.println("Accnumber:"+accNumber+"\nName:"+name+"\nOverDraft Amount:"+overDraft+"\nBalance:"+balance);
		}
		
}
