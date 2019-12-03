package com.nubes.cj.over;

public class NumberOperations {

		public int add(int a, int b){
			return a + b;
		}
		public int add(int a,int b,int c){
			return a + b + c;
		}
		public int add(int... arr){
			int sum = 0;
			for(int ele:arr){
				sum += ele;
			}
			return sum;
		}
		public float add(float a, int b,float c){
			return a + b + c;
		}
		public double add(double a, double b,double c){
			System.out.println("Message double");
			return a + b + c;
		}
		
	
}
