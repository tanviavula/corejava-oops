package com.nubes.cj.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryInsideTry {

	public static void main(String[] args) {

		File file = new File("one.txt");
		File file_w = new File("two.txt");
		BufferedReader br;

		
			try {
				br = new BufferedReader(new FileReader(file));
				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
					try{
					System.out.println(line.substring(0, 3));
					}catch (StringIndexOutOfBoundsException e) {
						
						System.out.println(e);
					}catch (NullPointerException e) {
						System.out.println(e);
					}catch (Exception e) {
						System.out.println(e);
					}
				}
				
				
				
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
		

		
	}
}
