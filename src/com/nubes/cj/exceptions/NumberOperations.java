package com.nubes.cj.exceptions;

public class NumberOperations {

		public static int divide(int a, int b){
			if(b == 0)
				throw new ArithmeticException("B value can't be zero");
			
			return a / b;
		}
}
