package com.nubes.cj.staticex;

public class MathOperations {
	
	{
		System.out.println("Instance  Block");
	}
	static{
		System.out.println("Static Block -1");
	}
	static{
		System.out.println("Static Block -2");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		int num = 16;
		System.out.println(Math.sqrt(num));
		System.out.println(Math.pow(num, 2));
		MathOperations obj_1 = new MathOperations();
		MathOperations obj_2 = new MathOperations();
	}
}
