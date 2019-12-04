package com.nubes.cj.finalkeyword;

class Product{
	private String pname;
	private double price;
	public Product(String pname, double price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", price=" + price + "]";
	}
	
}

public class FinalReference {

	public static void main(String[] args) {
		int sum = getSum(new int[]{1,2,3,4,5,6,7,8,9,10});
		System.out.println(sum);
		Product product = new Product("Lenvo K20",8000);
		showProduct(product);
		System.out.println(product);
	}
	
	
	private static void showProduct(final Product product){
		product.setPrice(7999);
		System.out.println(product);
	}
	private static int getSum(final int[] arr){
		
		int res = 0;
		for(int i:arr){
			res += i;
		}
		return res;
	}
}
