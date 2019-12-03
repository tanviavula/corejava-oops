package com.nubes.cj.scart;

public class Product{
	
	private int pid;
	private String name;
	private String brand;
	private double price;
	
	
	public Product(String name, double price) {
		this(name,"N/A",price);
	}
	
    public Product(String name, String brand, double price) {
    	this.pid = IDGenerator.getNewId();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
    
    public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
	
    

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	
	

	

	

    



}
