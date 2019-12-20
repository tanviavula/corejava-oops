package com.nubes.cj.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

		public static void main(String[] args) {
			
			File file = new File("one.txt");
			BufferedReader br=null;
			
			try {
				br = new BufferedReader(new FileReader(file));
				String line = br.readLine();
				while(line!=null){
					System.out.println(line);
					System.out.println(line.toUpperCase());
					line = br.readLine();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				System.out.println("Finally...");
				if(br!=null){
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				System.out.println("End of Finally...");
			}
			
			System.out.println("End of main");
		}
}
