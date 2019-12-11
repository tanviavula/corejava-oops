package com.nubes.cj.inheritance;

public class Manager {

	public static void main(String[] args) {
		Account[] accounts = getAllAcounts();
		int scount = 0;
		int ccount = 0;
		
		for(Account acc:accounts){
			if(acc instanceof Savings){
				scount++;
			}else if(acc instanceof Current){
				ccount++;
			}
		}
		System.out.println("Total Savings accounts:"+scount);
		System.out.println("Total Current accounts:"+ccount);
		
		
		
		

	}
	
	private static Account[] getAllAcounts() {

		return new Account[] {
				new Savings("SB1001", "Krish", 5000, 1000),
				new Savings("SB1002", "Manoj", 8000, 1000),
				new Current("CS1003", "Aruna", 100000, 10000), 
				new Current("CS1004", "Anish", 500000, 10000),
				new Savings("SB1005", "Charan", 95000, 10000)
		};

	}
}
