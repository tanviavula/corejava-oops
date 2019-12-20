package com.nubes.cj.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowAndThrows {

	public static void main(String[] args) {
		System.out.println("Main starts");

		try {
			showDataFromFile("one.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			int res = getResult(10, 0);
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Main ends...");
	}

	static void showDataFromFile(String filePath) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
	}

	static int getResult(int a, int b) {

		if (b == 0)
			throw new ArithmeticException("B value can not be zero");

		return a / b;
	}
}
