package com.nubes.cj.staticex;

public final class TaxCalculator {

		private TaxCalculator(){
			
		}
		
		public static float calculate(float amount){
			float taxAmount = 0;
			if(amount > 500000 && amount <= 1000000){
				taxAmount = amount * 0.1f - 200;
			}else if(amount >1000000){
				taxAmount = amount * 0.2f - 200;
			}
			return taxAmount;
		}
}
