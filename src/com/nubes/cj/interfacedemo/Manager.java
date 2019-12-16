package com.nubes.cj.interfacedemo;


interface Calc{
	int sum(int... args);
	int max(int... args);
	int min(int... args);
	int size(int... args);
	
	default float average(int... args){
		return sum(args) / (float)size(args);
	}
}

class MyCalc implements Calc{

	@Override
	public int sum(int... args) {
		int s = 0;
		for(int ele:args){
			s += ele;
		}
		return s;
	}

	@Override
	public int max(int... args) {
		int m = args[0];
		for(int i = 1;i<args.length;i++){
			if(m < args[i]){
				m = args[i];
			}
		}
		return m;
	}

	@Override
	public int min(int... args) {
		int m = args[0];
		for(int i = 1;i<args.length;i++){
			if(m > args[i]){
				m = args[i];
			}
		}
		return m;
	}

	@Override
	public int size(int... args) {
		return args.length;
	}
	
}



public class Manager {
	public static void main(String[] args) {
		Calc c = new MyCalc();
		int[] arr = new int[]{2,3,4,5,1,5,7,8,9,4};
		
		System.out.println(c.sum(arr));
		System.out.println(c.max(arr));
		System.out.println(c.min(arr));
		System.out.println(c.size(arr));
		System.out.println(c.average(arr));
		
	}
}
