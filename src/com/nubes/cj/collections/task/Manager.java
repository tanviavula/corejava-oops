package com.nubes.cj.collections.task;

import java.util.List;
import java.util.Scanner;

public class Manager {
		public static void main(String[] args) {
			ProductService ps = new ProductServiceInMemoryImpl();
			
			while(true){
				Scanner sc = new Scanner(System.in);
				System.out.println("1.Add 2.Price in Range 3.Show All 4. exit\n");
				int ch = sc.nextInt();
				if(ch == 1){
					Product product = getProductDetailsFromUser(); 
					product = ps.addProduct(product);
					System.out.println(product.getPid()+" is added");
				}else if(ch == 2){
					System.out.println("Enter the lower price:");
					float lp = sc.nextFloat();
					System.out.println("Enter the higher price:");
					float up = sc.nextFloat();
					List<Product> products = ps.getProductPriceInRange(lp, up);
					System.out.println("Product price in the given range:");
					showProduct(products);
				}else if (ch == 3){
					List<Product> products = ps.getProducts();
					System.out.println("All products Details:");
					showProduct(products);
				}else if(ch == 4){
					System.exit(0);
				}
			}
		}

		private static void showProduct(List<Product> products) {
			for(Product p:products){
				System.out.println(p.getPid() +" "+p.getPname()+" "+p.getPrice());
			}
			
		}

		private static Product getProductDetailsFromUser() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product name :");
			String pname = sc.nextLine();
			System.out.println("Enter the price:");
			float price = sc.nextFloat();
			return new Product(pname, price);
		}
}
