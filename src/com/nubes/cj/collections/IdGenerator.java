package com.nubes.cj.collections;

public final class IdGenerator {

		private static int newId=1000;
		
		public static int getNewId(){
			return newId++;
		}
}
