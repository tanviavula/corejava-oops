package com.nubes.cj.over;

public class Manager {

		public static void main(String[] args) {
			NumberOperations obj = new NumberOperations();
			System.out.println(obj.add(1,2,3));
			System.out.println(obj.add(1,2));
			System.out.println(obj.add(1,2,3,4,5,6));
			System.out.println(obj.add(10));
			System.out.println(obj.add(3.5f,9,7.5f));
			
			System.out.println(obj.add(3.5,9,7.5f));
		}
}
