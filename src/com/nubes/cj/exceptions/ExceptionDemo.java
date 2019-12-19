package com.nubes.cj.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Main starts");
		String names = "Rajesh,Mani,CV,Rajani,Gajani";

		try {

			try {
				for (String name : names.split(",")) {
					System.out.println(name.substring(0, 3));
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.err.print(e);
			}

			int a = 10;
			int b = 2;
			int res = a / b;
			System.out.println("Res :" + res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}
}
