package com.nubes.cj.scart;

public class Manager {

		public static void main(String[] args) {
			Product p1= new Product("iPhone 10","Apple",89000);
			Product p2 = new Product("OnePlus 7 T","OnePlus",69000);
			Product p3= new Product("Nokia 8","Nokia",19000);
			Product p4 = new Product("Reno 2Z","OPPO",23000);
			Product p5= new Product("Moto G5 Plus","Motorola",13000);
			Product p6 = new Product("OnePlus6 ","OnePlus",39000);
			
			
			Product cartItems[] = new Product[3];
			cartItems[0] = p1;
			cartItems[1] = p2;
			cartItems[2] = p5;
			
			System.out.println("Hello Ram,");
			int total = 0;
			System.out.println("-------------------------------------");
			for(Product p:cartItems){
				System.out.println(p.getPid()+" "+p.getName()+" "+p.getBrand()+" "+p.getPrice());
				total += p.getPrice();
			}
			System.out.println("-------------------------------------");
			System.out.println("You are total bill amount is :"+total);
			
			
	
			
			
			
		}
}
