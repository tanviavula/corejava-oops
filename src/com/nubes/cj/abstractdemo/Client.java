package com.nubes.cj.abstractdemo;
class One{
	int i = 100;
	void m1(){
		System.out.println(1);
	}
}
class Two extends One{
	void m1(){
		System.out.println(2);
	}
	void m2(){
		System.out.println(i);
	}
}
class Three extends Two{
	int i = 999;
	void m1(){
		System.out.println(i);
	}
	
}
public class Client {
	public static void main(String[] args) {
		Two obj = new Three();
		obj.m1();
		obj.m2();
		
	}

}
