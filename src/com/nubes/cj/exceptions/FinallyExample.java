package com.nubes.cj.exceptions;

public class FinallyExample {

		public static void main(String[] args) {
			
			System.out.println("Main Starts");
			try{
				System.out.println("Exception");
				int res = 100 / 0;
			}catch (Exception e) {
				System.out.println("Catch");
			}finally{
				System.out.println("Finally");
			}
			System.out.println("Main ends");
			
		}
}
