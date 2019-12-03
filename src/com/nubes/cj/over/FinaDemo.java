package com.nubes.cj.over;

import java.util.Scanner;

final class Calc {

	private Calc() {

	}

	public final static int perform(int a, int b, String ope) {
		int res = 0;
		switch (ope) {
		case "+":
			res = a + b;
			break;
		case "*":
			res = a * b;
			break;
		case "-":
			res = a - b;
			break;
		case "/":
			res = a / b;
			break;
		case "%":
			res = a % b;
			break;
		default:
			throw new IllegalArgumentException("Please provide valid operator");
		}
		return res;
	}
}

public class FinaDemo {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1 vlaue:");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2 value:");
			int num2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the operator");
			String ope = sc.nextLine();
			int res = Calc.perform(num1, num2, ope);
			System.out.println(num1 + " " + ope + " " + num2 + " is :" + res);
			System.out.println("Do you want to continue.... yes/ no");
			String choice = sc.nextLine();
			if(!choice.equals("yes")){
				break;
			}
		}
	}
}
