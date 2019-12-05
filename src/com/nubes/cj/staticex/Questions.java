package com.nubes.cj.staticex;

class One{
	public static String message = "Hello";
	 static int num = 100;
	One(){
		this(10);
		System.out.println("Default Constructor");
	}
	One(int i){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("IIB-1");
	}
	{
		System.out.println("IIB-2");
	}
	static{
		System.out.println("Static");
		int num = 999;
	}
}

public class Questions {
	
		public static void main(String[] args) {
			//One obj_1 = new One();
			System.out.println(One.num);
		}
}
