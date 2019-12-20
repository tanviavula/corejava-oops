package com.nubes.cj.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionType {

	
		public static void main(String[] args) {
			
			Throwable t[] = new Throwable[]{
					new ArithmeticException(),new StringIndexOutOfBoundsException(),
					new IOException(),new NumberFormatException(),new NullPointerException(),
					new FileNotFoundException(), new InstantiationException(),
					new IllegalAccessException(), new IllegalAccessException()
			};
			
			for(Throwable obj:t){
				if(obj instanceof RuntimeException){
					System.out.println(obj + " is unchecked exception");
				}else if(obj instanceof Exception){
					System.out.println(obj + " is checked exception");
				}else{
					System.out.println("Error...");
				}
			}
			
		}
}
