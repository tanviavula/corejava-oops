package com.nubes.cj.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingWithResourceHandling {

		public static void main(String[] args) {
			
			File file = new File("one.txt");
			// Java 7
			try(BufferedReader br = new BufferedReader(new FileReader(file))) {
					String line = br.readLine();
				while(line!=null){
					System.out.println(line);
					System.out.println(line.toUpperCase());
					line = br.readLine();
					System.out.println(line.substring(0, 3));
				}
			} catch (StringIndexOutOfBoundsException | IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println("End of main");
		}
}
